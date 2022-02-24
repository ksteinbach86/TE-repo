package com.techelevator.projects.dao;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
		public Project getProject(Long projectId) {
			Project project = null;
			String sql = "SELECT project_id, name, from_date, to_date " +
					"FROM project " +
					"WHERE project_id = ?;";
			SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
			if (results.next()) {
				project = mapRowToProject(results);
			}
			return project;

//		return new Project(0L, "Not Implemented Yet", null, null);
	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> projects = new ArrayList<>();
		String sql = "SELECT project_id, name, from_date, to_date " +
				"FROM project ;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			projects.add(mapRowToProject(results));
		}
		return projects;
	}

	@Override
	public Project createProject(Project project) {
		String sql = "INSERT INTO project (project_id, name, from_date, to_date) " +
				"VALUES (?, ?, ?, ?) RETURNING project_id;";
		Long newId = jdbcTemplate.queryForObject(sql, Long.class, project.getId(), project.getName(), project.getFromDate(), project.getToDate());

		return getProject(project.getId());
	}

	@Override
	public void deleteProject(Long projectId) {
		String sql = "DELETE FROM project_employee WHERE project_id = ?; DELETE FROM project WHERE project_id = ?;";
		jdbcTemplate.update(sql, projectId, projectId);
	}

	private Project mapRowToProject(SqlRowSet rowSet) {
		Project project = new Project();
		project.setId(rowSet.getLong("project_id"));
		project.setName(rowSet.getString("name"));
		LocalDate a1 = null;
		LocalDate a2 = null;
		Date datefrom = (rowSet.getDate("from_date"));
		if (datefrom != null) {
			a1 = datefrom.toLocalDate();
		}
		Date dateto = (rowSet.getDate("to_date"));
		if (dateto !=null) {
			a2 = dateto.toLocalDate();
		}
		project.setFromDate(a1);
		project.setToDate(a2);
		return project;
	}
	

}
