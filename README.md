
# To-Do List Application

A simple to-do list application built using **Java Spring Boot**. The app allows users to manage tasks by adding, marking as completed, deleting, and viewing all tasks.

## Features

- Add a task.
- Mark a task as completed.
- Delete a task.
- View a list of all tasks.

Tasks are stored in an **in-memory H2 database** for simplicity.

## Requirements

- **Java 11+** (Java 8 or below is not supported)
- **Maven** for build and dependency management

## Setup and Installation

### 1. Clone the repository:
```bash
git clone https://github.com/yourusername/todo-app.git
cd todo-app
```

### 2. Checkout the `master` branch:
```bash
git checkout master
```

### 3. Build the project using Maven:
```bash
mvn clean install
```

### 4. Run the application:
```bash
mvn spring-boot:run
```

The app will start running on `http://localhost:8080`.

---

## API Endpoints

### **1. Add a Task (POST)**
- **URL:** `http://localhost:8080/tasks`
- **Method:** `POST`
- **Body (JSON):**
  ```json
  {
      "title": "Buy groceries",
      "completed": false
  }
  ```
- **Response:**
  ```json
  {
      "id": 1,
      "title": "Buy groceries",
      "completed": false
  }
  ```

### **2. Get All Tasks (GET)**
- **URL:** `http://localhost:8080/tasks`
- **Method:** `GET`
- **Response:**
  ```json
  [
      {
          "id": 1,
          "title": "Buy groceries",
          "completed": false
      },
      {
          "id": 2,
          "title": "Walk the dog",
          "completed": true
      }
  ]
  ```

### **3. Mark Task as Completed (PUT)**
- **URL:** `http://localhost:8080/tasks/{id}/complete`
- **Method:** `PUT`
- **Example:** `http://localhost:8080/tasks/1/complete`
- **Response:**
  ```json
  {
      "id": 1,
      "title": "Buy groceries",
      "completed": true
  }
  ```

### **4. Delete a Task (DELETE)**
- **URL:** `http://localhost:8080/tasks/{id}`
- **Method:** `DELETE`
- **Example:** `http://localhost:8080/tasks/1`
- **Response:** `204 No Content`

---

## Testing with Postman

You can test the API using **Postman** by hitting the following endpoints:

1. **Add a Task:** `POST` request to `http://localhost:8080/tasks` with a JSON body containing `title` and `completed`.
2. **Get All Tasks:** `GET` request to `http://localhost:8080/tasks`.
3. **Mark Task as Completed:** `PUT` request to `http://localhost:8080/tasks/{id}/complete` (e.g., `http://localhost:8080/tasks/1/complete`).
4. **Delete Task:** `DELETE` request to `http://localhost:8080/tasks/{id}` (e.g., `http://localhost:8080/tasks/1`).

---

## Dependencies

- **Spring Boot** - Main framework
- **H2 Database** - In-memory database for task storage
- **Maven** - Build and dependency management

