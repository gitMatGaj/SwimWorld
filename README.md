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


# Opis konfiguracji

1. Utworzyć bazę danych postgresql oraz uruchomić ze wskazaniem utworzenej bazy plik databaseInitialScript.sql
2. W klasie pl.bb166.contracts.administrator.configuration.PersistenceConfiguration należy ustawić parametry połączenia: Adres JDBC bazy danych, nazwę użytkownika, hasło dostępu.

# Przebieg budowy projektu przy pomocy konsoli Maven
1. Otworzyć terminal
2. Przejść do lokalizacji pliku pom.xml projektu
3. Wywołać polecenie:
    ```
    mvn package
    ```
4. Jeśli Maven jest poprawnie skonfigurowany (tj. Ustawione są wszystkie niezbędne zmienne środowiskowe) w katalogu target powinien się pojawić zbudowany plik *.war, który można umieścić w kontenerze serwletów lub serwerze aplikacji.

# Opis uruchomienia aplikacji z użyciem kontenera servletów Tomcat

1. Plik *.war zbudowany w poprzedmin punkcie, należy umieścić w lokalizacji %folderZProgramemTomcat%/webapps
2. Następnie w zależności od systemu, z katalogu bin Tomcat'a uruchomić odpowiedni skrypt "startup"
3. Jeśli Tomcat jest poprawnie skonfigurowany, aplikacja powinna być dostępna w lokalizacji serwera pod adresem:
    ```
    localhost:8080/[nazwaPlikuWar]/
    np. http://localhost:8080/SpringHibernate/
    ```
    O ile Tomcat jest domyślnie skonfigurowany

