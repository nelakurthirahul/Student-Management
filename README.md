# Student Management System (Java)

A console-based Java application built to manage student records using clean Object-Oriented Programming principles.  
This project is designed with **placements and interviews** in mind and demonstrates core Java, collections, exception handling, file persistence, and Git usage.

---

## 📌 Project Overview

The Student Management System allows users to:
- Add student records
- View all students
- Search students by ID
- Delete students
- Persist data using file handling (data is retained after program exit)

The application is **menu-driven**, interactive, and handles invalid user inputs gracefully.

---

## 🛠️ Technologies Used

- Java (Core Java)
- OOP Concepts
- Java Collections (`HashMap`)
- Exception Handling
- File Handling (`BufferedReader`, `BufferedWriter`)
- Git & GitHub
- VS Code

---

## 🧠 Core Concepts Implemented

### 1. Object-Oriented Programming
- **Encapsulation** using private variables and getters/setters
- **Separation of Concerns**
  - `Student` → Data model
  - `StudentService` → Business logic
  - `Main` → Application flow

### 2. Collections Framework
- Used `HashMap<Integer, Student>` for data storage
- Enables **O(1)** time complexity for search and delete operations

### 3. CRUD Operations
- Create → Add student
- Read → Display & search students
- Delete → Remove student by ID

---

## ⚠️ Exception Handling & Validation

- Handles invalid user inputs using `try-catch`
- Prevents program crashes (`InputMismatchException`)
- Validates CGPA range (0–10)
- Ensures smooth user experience even with incorrect inputs

---

## 💾 File Handling (Data Persistence)

- Student data is saved in a text file (`students.txt`)
- Data is automatically:
  - Loaded at program start
  - Saved after add/delete operations
- Uses **try-with-resources** for safe file operations



