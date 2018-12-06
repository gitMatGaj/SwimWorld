# SwimWorld
Web application

# How web application work:
After registration you can:
 - login to the SwimWorld website as a common user.
 - If you are admin you can also(CRUD): 
    - see list of users
    - add new admin
    - upgrade common users to the admin(default password "firmowe") 
    - delete users

# The technologies that I used:
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


# Configuration
1. Create database mysql and run SQL which is in databaseInitialScript.sql file
1. Utworzyć bazę danych mysql oraz uruchomić kod w języku SQL z pliku databaseInitialScript.sql
2. In /SpringHibernate/src/main/resources/persistence-mysql.properties class go to set: url JDBC database, username, access password.
2. W klasie /SpringHibernate/src/main/resources/persistence-mysql.properties należy ustawić parametry połączenia: Adres JDBC bazy danych, nazwę użytkownika, hasło dostępu.

# Build project with Maven console
# Przebieg budowy projektu przy pomocy konsoli Maven
1. Open terminal
1. Otworzyć terminal
2. Go to localization pom.xml file our project
2. Przejść do lokalizacji pliku pom.xml projektu
3. Call the command:
    ```
    mvn package
    ```
3. Wywołać polecenie:
    ```
    mvn package
    ```
4. If Maven configuration is correct (all necessarily settings are set) then build file *.war should be in target catalog, which you must put in Tomcat servlet container or in app server.  
4. Jeśli Maven jest poprawnie skonfigurowany (tj. Ustawione są wszystkie niezbędne zmienne środowiskowe) w katalogu target powinien się pojawić zbudowany plik *.war, który można umieścić w kontenerze serwletów lub serwerze aplikacji.

# Describe how to run application use Tomcat servlet container
# Opis uruchomienia aplikacji z użyciem kontenera servletów Tomcat

1. File *.war which was build in previous point, put in %folderZProgramemTomcat%/webapps localization
1. Plik *.war zbudowany w poprzedmin punkcie, należy umieścić w lokalizacji %folderZProgramemTomcat%/webapps
2. Afterwards according of system which you have, from bin Tomcat catalog run correct "startup" script
2. Następnie w zależności od systemu, z katalogu bin Tomcat'a uruchomić odpowiedni skrypt "startup"
3. If Tomcat is correctly configured, application should be available in server localization under this addres:
    ```
    localhost:8080/[nazwaPlikuWar]/
    np. http://localhost:8080/SpringHibernate/
    ```
    Ofcourse Tomcat must be deafoult configurated 
3. Jeśli Tomcat jest poprawnie skonfigurowany, aplikacja powinna być dostępna w lokalizacji serwera pod adresem:
    ```
    localhost:8080/[nazwaPlikuWar]/
    np. http://localhost:8080/SpringHibernate/
    ```
    O ile Tomcat jest domyślnie skonfigurowany
# Login option
 a) Admin:
  - username: admin
  - password: testowy
 b) Common user:
  - username: user
  - password: testowy
