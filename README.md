# 🎮 Number Guessing Tournament (Java)

A console-based Java game where multiple players compete to guess a randomly generated number within a limited number of attempts.

This project started as a simple guessing game and was gradually improved into a structured mini-project using Object-Oriented Programming (OOP) principles.

---

## 🚀 Features

- 🎯 Random number generation within a user-defined limit  
- 👥 Multiple players (1 to 3 players supported)  
- 🎚 Difficulty levels (Easy / Medium / Hard)  
- 🔢 Limited guesses based on **log₂(N)** concept  
- 🔁 Round-based gameplay  
- ✅ Input validation for better user experience  

---

## 🧠 Concepts Used

- Object-Oriented Programming (OOP)
- Class and Object design
- Separation of responsibilities
- Java `Random` class
- User input using `Scanner`
- Mathematical logic using `log₂(N)`

---

## 🏗 Project Structure

```text
Game2/
│
├── Start.java           # Entry point (main method)
├── Game.java            # Controls game flow and logic
├── Player.java          # Handles player input
├── NumberGenerator.java # Generates random number
├── GameJudge.java       # Evaluates guesses and decides winner

