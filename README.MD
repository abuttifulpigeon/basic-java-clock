```markdown
Pigeon's Simple Digital CLock V1.1 - Readme.md
======================================

Table of Contents
-----------------

* [Introduction](#introduction)
* [Code Description](#code-description)
* [Usage Instructions](#usage-instructions)
* [Contributing](#contributing)
* [License](#license)

## Introduction
This project is an open source implementation of a simple digital clock written in Java using Swing graphics framework. It features a user interface that displays the current local date and time using either 12 hour or 24 hour format based on whether the "Switch" button is pressed or not. The project includes a main method which runs the application when executed.

<#code-description>
---

The `Main` class contains all the main functionality of the program. The constructor creates a `JFrame`, sets its size and background color, adds three panels as children (`timePanel`, `switchBtn`, and `titlePanel`), then initializes four labels: `militaryTime`, `switchBtn`, `title`, and `frame`. The `clock()` method updates the label text based on whether the system clock is set to 12-hour or 24-hour display mode. Finally, it starts a `Timer` object with an interval of one second to update the clock every second.

</code-description>

## Usage Instructions
To use this program, simply compile and run it with your preferred JVM. You can also add additional functionality by modifying the existing classes or adding new ones. 

## Contributing
If you would like to contribute to this project, please fork it, make changes to the code, commit them, and create a pull request to have them merged into the main branch. Just remember that this project is meant to be educational for new Java learners, so contribute with care.

## License
[MIT](https://choosealicense.com/licenses/mit/) license applies.