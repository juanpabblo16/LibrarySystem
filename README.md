# Bookstore Management System

This project is a simple Spring Boot application that implements a Bookstore Management System. The application allows users to manage books, including creating, retrieving, and deleting book records. The project is implemented using Java and Spring Boot.

## Project Details

- **Project Type**: Spring Boot Application
- **Languages**: Java
- **Collaborators**:
  - Juan Pablo Acevedo
  - Jesus Garces
  - Santiago

## Requirements

1. Java Development Kit (JDK) 17 or higher
2. Spring Boot (Version 3.0.10)
3. IDE (Eclipse, IntelliJ IDEA, etc.)
4. Maven (for managing dependencies)

## Features

- Adding a new book with details (name, publisher, author)
- Retrieving book information using the book's ID
- Deleting a book using the book's ID

## Getting Started

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE.
3. Build and run the application using the IDE's tools or the terminal.

## Usage

1. The application will automatically create and manage book records in memory.
2. Use the provided endpoints to interact with the book management system:
   - Create a book: POST request to `/books` with JSON payload
   - Retrieve a book: GET request to `/books/{id}`
   - Delete a book: DELETE request to `/books/{id}`

## Contributions

Contributions to this project are welcome! If you would like to contribute, please fork the repository and create a pull request with your changes.

## Issues

If you encounter any issues or have suggestions for improvements, please create an issue on this repository.

## License

This project is licensed under the [MIT License](LICENSE).
