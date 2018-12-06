# SwimWorld
Web application

# How web application work:
Create an account as a common user or simply log in using user or admin credentials and see for yourself :)
 
  a) Common user:
    
    - username: user
    - password: testowy
 
  If you are a common user you can go to the SwimWorld
  
  b) Admin:
    
    - username: admin
    - password: testowy
 
  If you are an admin you can also (CRUD): 
    
- see the list of users
 
- add new admin
    
- grant common users admin status (default password "firmowe") 
    
- delete users

# The technologies used:
- Java
- Spring Framework/MVC/Security
- Hibernate ORM
- HTML
- CSS
- SQL
- Thymeleaf
- Apache Tiles
- Bootstrap
- Maven
- Tomcat
- MySQL

# Details:
- Database has two tables:
   - Users
   - Role
- Tables have OneToMany relation
- Full CRUD for Admin
- Data validation
- Thymeleaf in "templates" folder (Apache Tiles for self-study in other folders)
- Configuration of the dispatcher service with the use of classes 
   - Extend the AbstractAnnotationConfigDispatcherServletInitializer class and override the required methods
   - Add maven-war-plugin configurations to pom.xml file, in order to not require web.xml file
- Connection to Database using Hibernate


# Configuration
1. Create mysql database and run SQL code in databaseInitialScript.sql file
2. In /SpringHibernate/src/main/resources/persistence-mysql.properties class set url JDBC database, username and access password.

# Build project with Maven console
1. Open terminal
2. Go to localization of project's pom.xml file
3. Run the command:
    ```
    mvn package
    ```
4. If Maven configuration is correct (all necessarily (zmienne środowiskowe) are set) then the file *.war should appear in 'target' catalog, which you may put in Tomcat servlet container or in app server.

# How to run application using Tomcat servlet container

1. Put the file *.war which was built previously in %folderZProgramemTomcat%/webapps
2. Afterwards, depending on your operating system, from Tomcat's bin catalog run the correct "startup" script
3. Finally, if Tomcat is correctly configured, application should be available in server localization under this address:
    ```
    localhost:8080/[nameOfWarFile]/
    np. http://localhost:8080/SpringHibernate/
    ```
    Given that Tomcat is configured using default settings. 
