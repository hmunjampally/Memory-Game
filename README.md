# Memory-Game

## Overview
The **Memory Game** is a Java-based CLI application designed to challenge users' memory skills by matching pairs of elements. The project follows **Object-Oriented Programming (OOP)** principles and is built using **Gradle** for dependency and build management.

## Features
- **Interactive Gameplay**: Engaging memory game experience.
- **OOP Design**: Implements Java principles such as encapsulation, inheritance, and polymorphism.
- **JUnit Testing**: Includes unit tests for core functionalities.
- **Dependency Management**: Uses **Gradle** for handling dependencies and builds.

## Installation & Setup
### Prerequisites
Ensure you have the following installed:
- **Java 20** (or the version defined in the Gradle toolchain)
- **Gradle 8.3+** (if not using the wrapper)
- **Git** (for cloning the repository)

### Clone the Repository
```bash
git clone https://github.com/hmunjampally/Memory-Game.git
cd Memory-Game
```

## Build and Run the Application
### 1. Build the Project
Run the following command to compile the project:
```bash
./gradlew build
```
For Windows:
```powershell
gradlew.bat build
```

### 2. Run the Game
To start the application:
```bash
./gradlew run
```
For Windows:
```powershell
gradlew.bat run
```

## Project Structure
```
Memory-Game/
├── app/
│   ├── src/
│   │   ├── main/java/memory/game/App.java
│   │   ├── main/java/memory/game/Game.java
│   │   ├── main/java/memory/game/Board.java
│   │   ├── main/java/memory/game/Card.java
│   │   └── ...
│   ├── test/java/memory/game/GameTest.java
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## Dependencies
The project uses the following dependencies:
- **JUnit 4.13.2** - Used for unit testing.
- **Google Guava 32.1.1-JRE** - Utility library for collections, caching, primitives, and concurrency.

To list all dependencies, run:
```bash
./gradlew dependencies
```

## Running Tests
To execute the unit tests, run:
```bash
./gradlew test
```

## Contribution Guidelines
Contributions are welcome! Follow these steps to contribute:
1. Fork the repository.
2. Create a new branch: `git checkout -b feature-name`
3. Make your changes and commit: `git commit -m "Add new feature"`
4. Push the branch: `git push origin feature-name`
5. Open a Pull Request.

## License
This project is licensed under the **MIT License**. See the `LICENSE` file for details.

---
*Developed by [Your Name / Team Name]*

