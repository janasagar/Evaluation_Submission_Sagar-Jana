# |OrangeHRM| Automate Testing With Selenium
## Introduction
To build a Selenium script that automates the process of logging into an OrangeHRM website to handle dynamic dropdowns, dropdowns, and web tables.
## Scopes
### Setup Environment
Install Java, IDE(Eclipse)
### Create A maven project
Open your IDE and create a Maven Project. 
Your Project structure should look like this:
![image](https://github.com/janasagar/Evaluation_Submission_Sagar-Jana/assets/172262154/1048e7b8-9be9-4b5c-bf66-d65dcfe6aaf4)

Go to Your pom.xml and Maven dependencies.
TestNG, Selenium-Java, WebDriverManager
### Write Your Script
Go to your `src/test/java`

Create a Package and class. Write your script inside your package.
![image](https://github.com/janasagar/Evaluation_Submission_Sagar-Jana/assets/172262154/95fc2305-a202-4c7c-8031-4d8ee95332d3)

## Getting started with |OrangeHRM| Automate Testing With Selenium
Install [git](https://www.git-scm.com/)  in your system
Paste this command
```bash
git clone https://github.com/janasagar/Evaluation_Submission_Sagar-Jana
```
Open your IDE, click on `file` the click on  `Open projects from file system`

Go to `src/test/java` and the java file and run the file
Note: Please verify You have same browser which is mentioned in the script.
example:
```bash
WebDriverManager.chromedriver().setup();// setup our chrome driver
		driver = new ChromeDriver(); //set driver to chromedriver
```



