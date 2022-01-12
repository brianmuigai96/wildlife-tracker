# Wildlife Tracker
#### An application that allows Rangers to track wildlife sightings.
#### By **Brian Muigai**
## Description
The Forest Service is considering a proposal from a timber company to clearcut a nearby forest of Douglas Fir. Before this proposal may be approved, they must complete an environmental impact study. You have been asked to build an application that allows Rangers to track wildlife sightings in the area.
## Setup/Installation Requirements
* git clone https://github.com/brianmuigai96/Wildlife-Tracker.git
* cd your/path/to/Wildlife-Tracker
* open with Intellij or editor of choice eg. Eclipse
* Launch Postgres via terminal with the command: psql

##### DATABASE SETUP
* CREATE DATABASE wildlife_tracker;
* CREATE TABLE animals (id serial PRIMARY KEY, name text, danger text, health text, age text, location text);
* CREATE TABLE animals (id serial PRIMARY KEY, animal id int, location text, rangername text, lastsighting timestamp);

##### TEST DATABASE SETUP
* CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;

Make sure you have gradle, spark and PostgreSQL installed.
## Known Bugs
There are no known bugs at the moment
## Technologies Used
Java, Spark, Handlebars, PostgreSQL Bootstrap, CSS
## Support and contact details
muigaibrian@gmail.com
### License
*[MIT](license.txt)*
Copyright (c) 2021 **Brian Muigai**
