# SwimWorld
Web application

# How web application work:
After registration you can login to the SwimWorld website as a common user.
If you are admin you can also see list of users, add new admin, upgrade common users to the admin and delete other users.(CRUD)

# Technologies used:
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
- Thymeleaf in "templates" folder (Apache Tiles for train in others folders)
- Configuration of the dispatcher service with the use of classes 
   - Extend the AbstractAnnotationConfigDispatcherServletInitializer class and override the required methods
   - Add maven-war-plugin configurations to pom.xml file, in order to don't need web.xml file
- Connection to Database using Hibernate
