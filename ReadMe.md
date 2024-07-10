# Web Table Automation Framework

## Introduction

This project is a test automation framework for automating interactions with a web table at [Way2Automation](https://www.way2automation.com/angularjs-protractor/webtables/). The framework is built using Java, Selenium WebDriver, and TestNG, following the Page Object Model (POM) design pattern for maintainability and readability.

## Features

- Navigates to the User List Table page.
- Validates the presence of the User List Table.
- Adds a new user with unique details for each run.
- Ensures the added user is listed in the table.

## Prerequisites

- Java JDK 8 or higher
- Maven
- Chrome browser


## Setup

1. **Clone the repository**
    ```sh
    git clone https://github.com/Brandon-Chawane/Way2assessement.git
  
    ```

2. **Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).**

3. **Install dependencies**
    ```sh
    mvn clean install
    ```

## Running the Tests

To execute the test, use the following Maven command:
```sh
mvn test


