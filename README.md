# Java Swing Rectangle Animation Game

## 📌 Overview

This is a beginner-friendly desktop application developed in **Java** using **Swing** for GUI rendering. The project demonstrates the core concepts of Java graphics programming, real-time animation, user interaction through keyboard and mouse events, and object-oriented design patterns. The main feature of this project is a colored rectangle that moves within a defined window, bouncing off the edges, changing its color randomly on collision, and reacting to user inputs.

This project is ideal for students or early-stage developers who are learning about GUI application development and animation in Java. It’s simple enough to understand quickly but rich enough to explore deeper enhancements such as collision detection, shape rendering, game logic, and custom controls.

## ✨ Features

- 🎞️ **Real-Time Animation**: The rectangle moves smoothly across the window, updating its position with every frame using a timer-driven repaint cycle.
- 🎨 **Color Randomization**: On collision with the window boundary, the rectangle changes to a randomly generated color using the `java.util.Random` class.
- 🧱 **Edge Collision Handling**: The rectangle’s movement is bounded by the frame’s dimensions to ensure it doesn’t move outside the visible area.
- ⌨️ **Keyboard Inputs**: You can control the rectangle's position using arrow keys or custom key mappings.
- 🖱️ **Mouse Interaction**: Click and drag functionalities are handled using event listeners to update the rectangle's position in real time.
- 📈 **FPS Monitoring**: Frames per second (FPS) are printed to the console for performance tracking and optimization.

## 🛠️ Technologies Used

- Java SE 21+
- Java Swing (`JFrame`, `JPanel`)
- AWT (`Graphics`, `KeyEvent`, `MouseEvent`)
- Object-Oriented Programming (OOP)
- IntelliJ IDEA / Eclipse (recommended IDE)

## 🗂️ Project Structure

- `MainClass.java` – Entry point of the application.
- `Game.java` – Core controller that wires the window and panel together.
- `GameWindow.java` – Initializes and configures the main window.
- `GamePanel.java` – The custom panel where the game logic, animation, and rendering occur.
- `KeyboardInputs.java` – Handles key press events to modify the rectangle's position.
- `MouseInputs.java` – Manages mouse click and drag events for dynamic interactivity.

## ▶️ How to Run

1. Clone the repository or copy the source files into your IDE.
2. Ensure your Java SDK is installed and set up correctly.
3. Compile and run the `MainClass.java` file.
4. Watch the rectangle move, bounce, and change color as it interacts with the window borders.

## 🚀 Future Enhancements

- Add multiple shapes with independent movement.
- Add scoring, timers, or basic gameplay mechanics.
- Introduce sound effects on collision.
- Convert it to a basic 2D game engine framework.
- Add a start/pause button and difficulty levels.
