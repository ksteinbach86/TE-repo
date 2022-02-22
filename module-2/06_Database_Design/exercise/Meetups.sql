BEGIN TRANSACTION;

DROP TABLE IF EXISTS member, interest_group, event, event_member CASCADE;

CREATE TABLE IF NOT EXISTS public.member
(
    member_number_id serial,
	last_name character varying(20) NOT NULL,
    first_name character varying(20)  NOT NULL,
    email_address character varying(30) NOT NULL,
    phone_number integer NOT NULL,
    date_of_birth date NOT NULL,
    flag_email boolean NOT NULL,
    CONSTRAINT member_pkey PRIMARY KEY (member_number_id),
	CONSTRAINT interest_group_fkey FOREIGN KEY (member_number_id) REFERENCES interst_group (group_number)
);


CREATE TABLE IF NOT EXISTS public.interest_group
(
    group_number serial,
    Name character varying(50),
    CONSTRAINT interest_group_pkey PRIMARY KEY (group_number),
	CONSTRAINT member_fkey FOREIGN KEY (group_number)REFERENCES member (member_number)
);


CREATE TABLE IF NOT EXISTS public.event
(
    event_number serial,
    name character varying(30) NOT NULL,
    description text COLLATE pg_catalog."default" NOT NULL,
    state_date_time time(6) without time zone NOT NULL,
    duration time(6) without time zone NOT NULL,
    group_running_event character varying(30) NOT NULL,
    CONSTRAINT event_pkey PRIMARY KEY (event_number),
	CONSTRAINT event_fkey FOREIGN KEY (event_number)REFERENCES event_member (event_number)
);


CREATE TABLE IF NOT EXISTS public.event_member
(
    event_number integer NOT NULL,
    person_number integer  NOT NULL,
    CONSTRAINT event_member_pkey PRIMARY KEY (event_number, person_number),
	CONSTRAINT event_member_fkey FOREIGN KEY (person_number)REFERENCES member (member_number_id),
	CONSTRAINT event_member_fkey FOREIGN KEY (event_number)REFERENCES event (event_number)
);

-- INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, flag_email)
-- 					VALUES ('Steinbach', 'Kevin', 'kevin@gmail.com', '(330)123-3322', '08/05/1986', 'Y')
					
-- INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, flag_email)
-- 					VALUES ('Kohr', 'Kate', 'kate@gmail.com', '(330)113-3312', '01/11/1986', 'Y')

-- INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, flag_email)
-- 					VALUES ('Gatson', 'Kieta', 'kieta@gmail.com', '(216)143-3002', '04/03/1983', 'Y')
					
-- INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, flag_email)
-- 					VALUES ('Nelson', 'Cedric', 'cedric@aol.com', '(440)123-3312', '12/25/1986', 'N')
				
-- INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, flag_email)
-- 					VALUES ('Hill', 'Jay', 'jay@yahoo.com', '(216)113-3311', '11/21/1986', 'Y')
					
-- INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, flag_email)
-- 					VALUES ('Hayes', 'Patti', 'patti@aol.com', '(216)123-3111', '05/12/1980', 'N')
					
-- INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, flag_email)
-- 					VALUES ('Long', 'Brandon', 'brandon@gmail.com', '(330)333-3322', '03/09/1986', 'Y')
					
-- INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, flag_email)
-- 					VALUES ('Evans', 'Jenna', 'jenna@gmail.com', '(330)647-3392', '09/10/1987', 'N')

-- INSERT INTO event (event_number, name, description, start_date_time, duration, group_running_event)
-- 					VALUES (001, 'Board Game Meetup', 'Awesome people just playing awesome board games!', '04/22/2022', 180, 'Kevin Steinbach')
							
-- INSERT INTO event (event_number, name, description, start_date_time, duration, group_running_event)
-- 					VALUES (002, 'Sports Watch Party', 'Fanatics getting together watching their favorite sports teams!', '02/20/2022', 180, 'Greater Cleveland Sports Commission')
					
-- INSERT INTO event (event_number, name, description, start_date_time, duration, group_running_event)
-- 					VALUES (003, 'Nature Walks', 'Bi-monthly meetups for walking tours of a Cleveland Metro Park!', '05/29/2022', 120, 'Clevaland Metro Parks')
					
-- INSERT INTO event (event_number, name, description, start_date_time, duration, group_running_event)
-- 					VALUES (004, 'Trivia Night', 'Join us for a fun-filled night of trivia!', '04/04/2022', 120, 'Trivia Geeks')

-- INSERT INTO interest_group (group_name, name)
-- 					VALUES ('Pets', 'Jenna', 'Patti', 'Kate','Kevin')

-- INSERT INTO interest_group (group_name, name)
-- 					VALUES ('Travel', 'Kevin', 'Jenna', 'Brandon','Cedric')

-- INSERT INTO interest_group (group_name, name)
-- 					VALUES ('Bookworms', 'Kate', 'Jay', 'Kieta','Kevin')
	

COMMIT TRANSACTION;