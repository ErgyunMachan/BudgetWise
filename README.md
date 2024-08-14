# BudgetWise

This project is a campaign media planning tool implemented in Java. The application helps optimize ad spend across various platforms like Google, Meta, and Amazon. It calculates the maximum budget for a specific ad, ensuring that the total campaign budget remains within the approved amount while accounting for various fees and costs.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
  - [Prerequisites](#prerequisites)
  - [Clone the Repository](#clone-the-repository)
  - [Build and Run](#build-and-run)
- [Usage](#usage)
- [Error Handling](#error-handling)
- [Running Tests](#running-tests)
- [Project Structure](#project-structure)



## Features

- **Calculate Specific Ad Budget Functionality**: Uses a custom algorithm to determine the optimal budget for a specific ad while considering various costs and fees.
- **Input Validation**: Ensures all inputs are within acceptable ranges and do not exceed logical limits.
- **Error Handling**: Provides informative error messages for incorrect inputs or budget-exceeding scenarios.
- **Unit Testing**: Includes comprehensive tests using JUnit to ensure the correctness of the implementation.

### Prerequisites

- **Java Development Kit (JDK)**: JDK 17 is required.
- **Maven**: Dependency management and running tests.
- **Git**: For cloning the repository.

### Clone the Repository

1. Open your terminal or command prompt.
2. Clone the repository using the following command:

   ```bash
   git clone https://github.com/ErgyunMachan/BudgetWise.git

  Navigate into the project directory:

 cd campaign-media-planner

 # Build and Run

 mvn clean install

 mvn exec:java -Dexec.mainClass="Application"

 # Usage
 
Once the application is running, it will prompt you to enter the following inputs:

Total Approved Budget (Z): The overall budget approved for the campaign.
Agency Fee Percentage (Y1): The percentage fee charged by the agency.
Third-Party Tool Fee Percentage (Y2): The percentage fee for ads created using third-party tools.
Fixed Costs for Agency Hours (HOURS): The fixed costs associated with agency hours.
Budget for Other Ads (otherBudgets): The sum of budgets for other ads in the campaign.

# Error Handling

The application includes robust error handling to ensure that inputs are valid and within logical constraints:

Positive Values: All inputs (Z, Y1, Y2, HOURS, otherBudgets) must be positive. The application will throw an error if a negative value or zero is entered.

Percentage Values: The fee percentages (Y1, Y2) must be between 0 and 1. Values outside this range will cause an error.

Budget Feasibility: The combination of Y1, Y2, and otherBudgets should not cause the calculated budget to exceed the total approved budget (Z). If they do, the application will throw an error and ask for correct input.

# Running Tests

Unit tests are provided to ensure that the code works as expected under different conditions. To run the tests:

mvn test

# Project Structure

BudgetWise/
├── src/
│   ├── main/
│   │   └── java/
           └── com.dentsu.budgetwise
│   │         └── Application.java  # Main application code
              └── Budget.java       # Data 
              └── Calculate.java    # where calculation operations done
              └── ConsoleMessages.java # handling console messages
              └── InputChecker.java # checking input operation
              └── ReadConsole.java # read console operations      
│   └── test/
│       └── java/
│           └── CalculateTest.java  # JUnit test cases
├── README.md  # Project documentation
├── pom.xml  # Maven configuration file







