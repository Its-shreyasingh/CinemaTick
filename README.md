# 🎬 CinemaTick Backend System

A professional-grade Movie Ticket Booking System backend built using **Java** and the **Spring Boot** ecosystem. This project follows industry-standard design patterns including **SOLID principles**, **DTO Pattern**, and **Layered Architecture**.

---

##  Features

* ✅ **Movie Management**: Create and fetch movie details with support for multi-language and 2D/3D features.
* ✅ **Show Orchestration**: Seamlessly link Movies to Halls with specific timing and language configurations.
* ✅ **JPA Persistence**: Robust data handling with **PostgreSQL** using Hibernate's Entity relationships.
* ✅ **Data Security**: Use of **DTOs** (Data Transfer Objects) to isolate the database layer from the client.
* ✅ **Custom Error Handling**: Specific exceptions (like `MovieNotFoundException`) for clean API responses.

---

##  Tech Stack

* **Language:** Java 17+
* **Framework:** Spring Boot 3.x
* **Database:** PostgreSQL
* **ORM:** Spring Data JPA
* **Utilities:** Lombok (Getter, Setter, Builder, AllArgsConstructor)
* **Testing:** Postman

---

##  System Architecture

The project follows a **Layered Architecture** to ensure separation of concerns:

1.  **Controller Layer**: Handles HTTP requests and maps them to DTOs.
2.  **Service Layer**: Contains the core "business logic" (e.g., mapping DTOs to Entities).
3.  **Repository Layer**: Communicates with PostgreSQL using Spring Data JPA.
4.  **Model Layer**: Represents the database schema via Java Entities.



---

##  Project Structure

```text
src/main/java/bms/system/
 ├── 🎮 Controllers/    # ShowController, MovieController, HallController, UserController
 ├── 🧠 Services/       # ShowService, MovieService, HallService, UserService(Mapping Logic)
 ├── 🗄️ Repositories/   # JpaRepository Interfaces
 ├── 📦 Models/         # Movie, Show, Hall, BaseModel, User
 ├── 📝 DTOs/           # CreateMovieRequest, CreateShowRequest,CreateHallRequest,CraeteShowRequest,GetUserRequest
 └── 🏷️ Enums/          # Language, MovieFeature, ShowSeatStatus
```
 ##  Configuration & Setup

### 1. Database Setup
Ensure **PostgreSQL** is running and create a database named `CinemaTick_db`. Update your `src/main/resources/application.properties` with your credentials:

```properties
server.port=9090
# Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/CinemaTick_db
spring.datasource.username=your_postgres_username
spring.datasource.password=your_postgres_password
spring.datasource.driver-class-name=org.postgresql.Driver

# JPA / Hibernate Properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl.auto=update
spring.jpa.properties.hibernate.show.psql=true

logging.level.root=INFO
logging.level.org.springframework.orm.jpa=DEBUG
logging.level.org.springframework.transaction=DEBUG

server.port=9090

server.servlet.context-path=/api/v1
```

### 2. Run the Application

Open your terminal (**Git Bash** preferred) and execute the following commands to get the project up and running:

```bash
# 1. Clone the repository to your local machine
git clone [https://github.com/Its-shreyasingh/CinemaTick.git](https://github.com/Its-shreyasingh/CinemaTick.git)

# 2. Navigate into the project directory
cd CINEMATICK

# 3. Build the project and start the Spring Boot server
mvn spring-boot:run
```

## 📡 API Reference

### 🎞 Movies
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/v1/movie` | Add a new movie to the system |
| `GET` | `/api/v1/movie/{id}` | Fetch details of a specific movie |
| `GET` | `/api/v1/movies` | Get a list of all movies |



### 🎭 Shows
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/v1/show` | Create a show in a specific Hall |
| `GET` | `/api/v1/show/{id}` | Get show details by ID |



## Roadmap

- [ ] **Seat Management**: Implement automatic `ShowSeat` generation upon Show creation.
- [ ] **Booking Logic**: Concurrency control for seat selection (Pessimistic Locking).
- [ ] **UI Integration**: Connect the backend to the Java Swing frontend.
- [ ] **Auth**: Add Spring Security for Admin vs User roles.



---

## 👤 Author

Developed with ❤️ by **[Shreya Singh](https://github.com/Its-shreyasingh)**

---