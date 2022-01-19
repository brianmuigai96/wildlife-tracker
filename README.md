# WILDLIFE TRACKER

The app facilities easy tracking of wildlife animals and the state they are in, inorder to take care of them .


##Author
Brian Muigai

##Contact
muigaibrian@gmail.com
brian.muigai@student.moringaschool.com

## Description

Wildlife tacker is An application that allows Rangers to track wildlife sightings from a nearby forest of Douglas Fir to keep track on the animals and their location, age and health.

## Prerequisites

- Basic Git knowledge, including an installed version of Git.
- Your application must run on the OpenJDK version 6, 7 or 8.

## Technologies Used 

- Java v9
- Gradle
- Spark Framework
- CSS (Bootstrap)
- JUnit v4.12
- Jacoco Plugin
- Velocity Templating Engine



## Setup Installations Requirements
   * To run the application, in your terminal:

    1. Clone or download the Repository
    2. cd into directory then run `cd wildlife-tracker`
    3. Rebuild the Project Using Intellij IDEA or ...
    4. Open terminal command line then navigate to the root folder of the application.
    5.open psql
    6. Run the folling commands
        -CREATE DATABASE wildlife_tracker;
        -\c wildlife_tracker
        -CREATE TABLE animals (id serial PRIMARY KEY, name text, danger text, health text, age text, location text);
        -CREATE TABLE sightings (id serial PRIMARY KEY, animal id int, location text, rangername text, lastsighting timestamp);
        -CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;
        -\q
    5. Run `gradle run` command.
    6. Navigate to `http://localhost:4567/` in your browser.
  

### Development

Want to contribute? Great!

To fix a bug or enhance an existing module, follow these steps:

- Fork the repo
- Create a new branch (`git checkout -b improve-feature`)
- Make the appropriate changes in the files
- Add changes to reflect the changes made
- Commit your changes (`git commit -am 'Improve feature'`)
- Push to the branch (`git push origin improve-feature`)
- Create a Pull Request 

## Known Bugs

If you find a bug (the website couldn't handle the query and / or gave undesired results), kindly open an issue [here](https://github.com/brianmuigai96/wildlife-tracker/issues/new) by including your search query and the expected result.

If you'd like to request a new function, feel free to do so by opening an issue [here](https://github.com/brianmuigai96/wildlife-tracker/issues/new). Please include sample queries and their corresponding results.

### License

*MIT*
Copyright (c) 2022 **Brian Muigai**

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.