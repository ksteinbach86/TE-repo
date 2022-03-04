BEGIN TRANSACTION;

DROP TABLE IF EXISTS reservation, hotel CASCADE;

CREATE TABLE hotel (
	id serial,
	name varchar(50) NOT NULL,
	address varchar(50),
	address2 varchar(50),
	city     varchar(32),
	state    varchar(32),
	zip      varchar(10),
	stars    int NOT NULL,
	rooms_available int NOT NULL,
	cost_per_night numeric(5,2) NOT NULL,
    CONSTRAINT PK_hotel PRIMARY KEY (id)
);

CREATE TABLE reservation (
	id serial,
	hotel_id int NOT NULL,
	full_name varchar(50) NOT NULL,
	checkin_date date NOT NULL,
	checkout_date date NOT NULL,
	guests int NOT NULL CHECK (guests >= 1 AND guests <= 5),
    CONSTRAINT PK_reservation PRIMARY KEY (id),
    CONSTRAINT FK_hotel_reservation FOREIGN KEY (hotel_id) REFERENCES hotel(id)
);


 -- Fill the hotel table first, as reservations have a foreign key dependency

INSERT INTO hotel (name, address, address2, city, state, zip, stars, rooms_available, cost_per_night) 
VALUES ('Aloft Cleveland',           '1111 W 10th St',     '', 'Cleveland',  'Ohio',         '44115', 4, 48, 274),
       ('Hilton Cleveland Downtown', '100 Lakeside Ave',   '', 'Cleveland',  'Ohio',         '44114', 4, 12, 287),
	   ('Metropolitan at the 9',     '2017 E 9th St',      '', 'Cleveland',  'Ohio',         '48226', 5, 22, 319),
       ('The Westin Pittsburgh',     '1000 Penn Ave',      '', 'Pittsburgh', 'Pennsylvania', '15222', 4, 60, 131),
	   ('Hilton Columbus Downtown',  '401 N High St',      '', 'Columbus',   'Ohio',         '43215', 4, 34, 190),
	   ('The Summit A Dolce Hotel',  '5345 Medpace Way',   '', 'Cincinnati', 'Ohio',         '43215', 4, 43, 218),
	   ('Greektown Detroit',         '1200 St Antoine St', '', 'Detroit',    'Michigan',     '48226', 4, 75, 185);

-- Fill in a few sample reservations
INSERT INTO reservation (hotel_id, full_name, checkin_date, checkout_date, guests) 
VALUES (1, 'John Smith', CURRENT_DATE, CURRENT_DATE + 3, 2),
       (1, 'Sam Turner', CURRENT_DATE, CURRENT_DATE + 5, 4),
	   (1, 'Mark Johnson', CURRENT_DATE + 7, CURRENT_DATE + 10, 2);	   

COMMIT;
-- ROLLBACK;

-- SELECT * FROM hotel;
-- SELECT * FROM reservation;