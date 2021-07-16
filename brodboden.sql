#CREATE DATABASE brodboden;
#use brodboden;

#create user 'brodboden'@'%' identified by 'boden123';

#grant all on brodboden.* to 'brodboden'@'%';

#drop user brodboden;
#flush privileges;

CREATE TABLE drink(
	drink_id INT auto_increment,
    drink_title VARCHAR(256),
    price INT NOT NULL,
    description VARCHAR(256),
    PRIMARY KEY(drink_id)
);

CREATE TABLE food(
	food_id INT auto_increment,
    food_title VARCHAR(256),
    price INT NOT NULL,
    time VARCHAR(12),
    description VARCHAR(256),
    PRIMARY KEY(food_id)
);

CREATE TABLE salad(
	salad_id INT auto_increment,
    salad_title VARCHAR(256),
    price INT NOT NULL,
    description VARCHAR(256),
    PRIMARY KEY(salad_id)
);

CREATE TABLE desert(
	desert_id INT auto_increment,
    desert_title VARCHAR(256),
    price INT NOT NULL,
    description VARCHAR(256),
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

INSERT INTO drink(drink_title, price, description)
VALUES("Coca cola", 29, "Läsk");

INSERT INTO salad(salad_title, price, description)
VALUES("Räk sallad", 129, "Mixsallad, paprika, majsgurka, tomater, oliver, ägg, hand skalade räkor med island dressing");

INSERT INTO salad(salad_title, price, description)
VALUES("Ceasar sallad", 129, "Romansallad, kyckling, parmesan, bacon, krutonger, ceasardressing");

INSERT INTO desert(desert_title, price, description)
VALUES("Våffla", 50, "Våffla med jordgubbsylt och grädde");

INSERT INTO food(food_title, price, time, description)
VALUES("Räk sallad", 129, "", "Mixsallad, paprika, majsgurka, tomater, oliver, ägg, hand skalade räkor med island dressing");