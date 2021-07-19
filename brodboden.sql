#CREATE DATABASE brodboden;
#use brodboden;

#create user 'brodboden'@'%' identified by 'boden123';

#grant all on brodboden.* to 'brodboden'@'%';

#drop user brodboden;
#flush privileges;

CREATE TABLE drink(
	drink_id INT auto_increment,
    title VARCHAR(256),
    price INT NOT NULL,
    description VARCHAR(256),
    picture_data TEXT NOT NULL,
    PRIMARY KEY(drink_id)
);

CREATE TABLE food(
	food_id INT auto_increment,
    title VARCHAR(256),
    price INT NOT NULL,
    time VARCHAR(12),
    description VARCHAR(256),
	picture_data TEXT NOT NULL,
    PRIMARY KEY(food_id)
);

CREATE TABLE salad(
	salad_id INT auto_increment,
    title VARCHAR(256),
    price INT NOT NULL,
    description VARCHAR(256),
    picture_data TEXT NOT NULL,
    PRIMARY KEY(salad_id)
);

CREATE TABLE desert(
	desert_id INT auto_increment,
    title VARCHAR(256),
    price INT NOT NULL,
    description VARCHAR(256),
	picture_data TEXT NOT NULL,
    PRIMARY KEY(desert_id)
);

CREATE TABLE message(
	message_id INT auto_increment,
    name VARCHAR(30),
	email VARCHAR(50),
    message VARCHAR(256),
    PRIMARY KEY(message_id)
);

#DELETE FROM product;

#DELETE FROM food where food_id = 3;

INSERT INTO drink(title, price, description, picture_data)
VALUES("Coca cola", 29, "Coca Cola", "./images/cola.jpg");

INSERT INTO food(title, price, time, description, picture_data)
VALUES("Biff", 129, "12:00", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.", "./images/biff.jpg");

INSERT INTO food(title, price, time, description, picture_data)
VALUES("Ägg", 80, "9:00", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.", "./images/agg.jpg");

INSERT INTO salad(title, price, description, picture_data)
VALUES("Räk sallad", 129, "Mixsallad, paprika, majsgurka, tomater, oliver, ägg, hand skalade räkor med island dressing",  "./images/raksallad.jpg");

INSERT INTO salad(title, price, description)
VALUES("Ceasar sallad", 129, "Romansallad, kyckling, parmesan, bacon, krutonger, ceasardressing");

INSERT INTO desert(title, price, description, picture_data)
VALUES("Våffla", 50, "Våffla med jordgubbsylt och grädde", "./images/vaffla.jpg");

