# Test Automation BootCamp 2016 base folders layout

NOTE: This document is tentative and has being based on the one used for the JAVA bootcamp. Just used its structure and some usefull links which were compatible for the automation bootcamp. It is incomplete and probably with errors. Hopefully this document may be used as base for the final one.

Please, use this repository as a base for you training phase. The idea is to fork this project so everyone use the same folder structure for the exercises.

It's extremely important to keep the key points easy to be verified by the reviewers, so don't mix the key points with the rest of the exercises.

# Material

# Test Automation Boot Camp

###Are you ready for it?

####Index


1. [Objective](#objective)

2. [Who Should Attend](#who-should-attend)

3. [Duration](#duration)

4. [Technical Assistance](#technical-assistance)

5. [Performance Measurement](#performance-measurement)

6. [Handling advanced Developers](#handling-advanced-developers)

7. [Materials](#materials)

8. [General Guidelines](general-guidelines)

9. [Proposed Test Application](#proposed-test-application)

10. [Learning Days](#learning-days)

     Topic 0: Basic programing knowledge 

     Topic 1: Environment setup

     Topic 2: Testing

     Topic 3: Selenium

     Topic 4: Framework

     Topic 5: REST services testing

11. Your First Automation Project Starts Now!

###Objective

This course teaches the basics knowledge a Test Automation Engineer should have.

→ [index](#index)

###Who Should Attend

The training will start at a low level and does not require in depth knowledge of the platform in question. Desirable participant profile: trainees and developers wanting to learn test automation. A basic knowledge on a object oriented programming (OOP) language and basic OOP concepts is desired.

→ [index](#index)

###Duration

Four weeks total.

Three weeks for guided learning and one week for practice project.

→ [index](#index)

###Technical Assistance

You can contact other bootcamp participants or any available tutor if you need technical assistance. We will create one chat for boot camp members only, and another one for boot camp members and tutors when boot camp starts.

→ [index](#index)

###Performance Measurement

1. Code review after each practice.

2. Checkpoint completion after Learning stage with your assigned tutor.

→ [index](#index)

###Handling Advanced Developers

Developers that move faster than average can go ahead and complete as much exercises as wanted, but do not jump ahead if previous exercises aren’t finished.

→ [index](#index)

###Materials

1. Install [Java SDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

2. The IDE to use is [Eclipse for Java Developers](http://www.eclipse.org/downloads/). [JEE version Recommended](http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/mars1).

3. Skype Account + headset (audio calls)

4. Create your own [GitHub](https://github.com/) account. Follow this [guideline](https://help.github.com/articles/set-up-git) to setup your account. Also you can read further about Git in [Try Git](https://try.github.io/levels/1/challenges/1) or [Learn Git Branching](http://pcottle.github.io/learnGitBranching/)

5. Fork this repo [https://github.com/](https://github.com/elopezechaniz/test-automation-bootcamp-2016) to use as a base to host the project code. Read [this](https://help.github.com/articles/fork-a-repo/) for instructions.

→ [index](#index)

###General Guidelines

The boot camp is organized in the following way:

1. The first three weeks will be used for intensive self learning. Each topic will have reading and practices parts. Tutors will be available to answer technical questions on a given chat room.

2. The next week will be used to develop a base test application following a life process.

3. One boot camp chat will be created for feedback and technical assistance:

4. Bootcamp TEST AUTOMATION 2016 Every person participating in the bootcamp is present here (students and tutors). Here is the place to ask for technical assistance!

5. [Team play](http://www.dummies.com/how-to/content/ten-qualities-of-an-effective-team-player.html) is encouraged but the work will be evaluated per person.

6. The instructions will be vague as they generally are in real life projects. You must look for support and guidance from your tutor and teammates.

7. All code and documentation must be in English.

8. Code must adhere to this eclipse code formatter. See importing instructions in this [link](http://www.avajava.com/tutorials/lessons/how-do-i-share-my-code-formatting-settings-with-another-user.html?page=2).

→ [index](#index)

###Proposed Test Application

Add a description of the application to be tested here….

→ [index](#index)

###Learning Days

Each day you will grab the fundamentals of the key test automation project and implementation processes.

On each learning day you will have to:

1. Read:

We will provide you with documentation related with current sprint content so you can have a background reference, guide and examples to complete the following practice.

2. Practice:

You will implement the previously gathered knowledge in simple coding activities. Most important task numbers are listed in the "Key Points" section for each day and they should get most of your attention; if you feel you don’t have enough time to complete all tasks, start with these ones when possible.

3. Commit:

You will commit all your code on a daily basis, when you finish your practice.

→ [index](#index)

####Topic 0: Introduction to Object Oriented Programming Concepts (2 days)####

#####Reading:#####

1. Beginners: Java Concepts [basic tutorial](http://docs.oracle.com/javase/tutorial/java/concepts/) (in case you need it!)

2. Beginners: Have fun with [Introduction to Java Programming](http://www.ibm.com/developerworks/java/tutorials/j-introtojava1/). Do as much you can.

3. Explore [Design Patterns](http://www.avajava.com/tutorials/categories/design-patterns). Minimum scope: singleton, template method, factory, decorator.

#####Extra documentation:#####

 [Design Patterns Card](http://www.mcdonaldland.info/files/designpatterns/designpatternscard.pdf)

#####Practice:#####

Note that you don't need to create real database connections, [just mock it](https://en.wikipedia.org/wiki/Mock_object) (create a simulation of them).

1. Create a singleton example for a database connection.

2. Create a abstract factory example for diferent type of SQL connections. See [this](http://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm) example.

3. Create a proxy example for database accesor clases.

4. Create a builder example for database connection.

#####Key Points:#####

3

#####Commit:#####

Commit your practice code.

→ [index](#index)

####Topic 1: Environment setup (1 day)

#####Reading:#####

1. [What is Maven?](http://maven.apache.org/what-is-maven.html)

2. Have fun with [Maven in 5 minutes](http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html).

3. Basic used commands

    1. mvn clean install -DskipTests

    2. mvn eclipse:eclipse

    3. Import maven project to eclipse    

#####Practice:#####

(It is assumed that Maven is already installed and working).

1. Build the project:

#####Key Points:#####

3

→ [index](#index)

####Topic 3: Testing (3 days)####

#####Reading:#####

[Testing theory](https://en.wikipedia.org/wiki/Software_testing)
[Test case](https://wiki.openoffice.org/wiki/QA/Testcase/How_to_write_test_case)

#####Practice:#####

 1. Write x test cases for smoke suite
 2. 
 
#####Key Points:#####

→ [index](#index)

####Topic 4: Selenium (3 days)####

#####Reading:#####

#####Practice:#####

#####Key Points:#####

#####Commit:#####

Commit your practice code.

→ [index](#index)

####Topic 5: Framework####

#####Reading:#####

#####Practice:#####

#####Key Points:#####

#####Commit:#####

Commit your practice code.

→ [index](#index)

####Topic 6: REST testing (2 days)####

#####Reading:#####

1. [Introduction to REST](https://www.youtube.com/watch?v=YCcAE2SCQ6k)

#####Practice:#####

#####Key Points:#####

#####Commit:#####

Commit your practice code.

→ [index](#index)

###Your First Project Starts Now!

####Final Project (3 days)

→ [index](#index)

Thanks for reading!

test
