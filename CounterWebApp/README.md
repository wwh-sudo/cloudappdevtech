# Counter Web Application

This example Java Web Application is based on this article:
[How to create a Web Application Project with Maven](https://www.mkyong.com/maven/how-to-create-a-web-application-project-with-maven/)

It is developed in JDK 8 + Tomcat 9.0 on Windows. It is OK to run under Tomcat 7 and Tomcat 8.


Here are some developer notes.

1. Create the web application.

```shell
# create the "CounterWebApp" web application.
mvn archetype:generate -DgroupId=com.example -DartifactId=CounterWebApp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

# navigate to "CounterWebApp" folder.
cd CounterWebApp

# generate Eclipse web project files.
mvn eclipse:eclipse -Dwtpversion=2.0
```


2. Import the project into eclipse ID. Add and update the source files according to the article. It is now ready to run or debug in eclipse.


3. Or to test run using Maven.

```shell
# clean up, compile and perform unit test.
mvn clean compile test

# launch in Tomcat (v7.0.47) container.
mvn tomcat7:run
```

Access the web application via link: <http://localhost:8080/CounterWebApp/>


4. Build release package, and generate static website with reports.

```shell
# build release file.
mvn package

# generate a site with reports.
mvn site
```
