package com.techelevator.projects.dao;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date " +
				"FROM employee ;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT first_name, last_name " +
				"FROM employee ; +" +
				"WHERE first_name iLike '%?%' AND  last_name iLike '%?%';";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return List.of(new Employee());
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		List<Employee> employees = new ArrayList<>();            // HAVE TO DO JOIN HERE <<<<<<<<<<<
		String sql = "SELECT project_id " +
				"FROM employee ;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return new ArrayList<>();
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {

	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		return new ArrayList<>();
	}

	private Employee mapRowToEmployee(SqlRowSet rowSet) {
			LocalDate birthConv = null;
			LocalDate hireConv = null;
			Date dateBirth = (rowSet.getDate("birth_date"));
			if (dateBirth != null) {
				birthConv = dateBirth.toLocalDate();
			}
			Date dateHire = (rowSet.getDate("hire_date"));
			if (dateHire != null) {
				hireConv = dateHire.toLocalDate();
			}
			Employee employee = new Employee();
			employee.setId(rowSet.getLong("employee_id"));
			employee.setDepartmentId(rowSet.getLong("department_id"));
			employee.setFirstName(rowSet.getString("first_name"));
			employee.setLastName(rowSet.getString("last_name"));
			employee.setBirthDate(birthConv);
			employee.setHireDate(hireConv);
			return employee;
		}
	}
