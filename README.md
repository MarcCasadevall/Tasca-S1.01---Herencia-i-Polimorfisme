Musical Instruments Management
Description: A Java-based project designed to practice Object-Oriented Programming (OOP) fundamentals, specifically focusing on inheritance, polymorphism, and the JVM class loading lifecycle.

📌 Exercise Statement
The goal is to manage different types of musical instruments (Wind, String, and Percussion) for a music group. All instruments share common attributes like name and price, but each reacts differently when played.

Additionally, the project explores how Java loads classes into memory using static blocks and demonstrates the differences between static and instance initialization blocks.

✨ Features
Abstract Base Class: Implementation of an abstract Instrument class to enforce a common contract.

Polymorphism: Overriding the play() method across different subclasses to provide specific behaviors.

JVM Class Loading: Demonstration of class initialization through static members and object instantiation.

Initialization Logic: Comparison between static {} blocks and instance {} blocks.

🛠 Technologies
Backend: Java (JDK 17+ recommended)

Build Tool: Maven (as seen in the project structure)

🚀 Installation and Execution
Clone the repository:

Bash
git clone <your-repository-link>
Navigate to the project directory:

Bash
cd S1.01-Herencia_i_Polimorfisme
Compile the project:

Bash
mvn compile
Run the application:
Locate the Main.java file in src/main/java/lvl1/Ex1/ and run the main method.

🧩 Technical Decisions & Research
Static vs. Instance Initialization Blocks
As part of the exercise requirements, here is the documentation regarding Java initialization blocks:

Static Block (static {}):

Execution: Runs only once when the class is first loaded into memory by the JVM (either by creating the first instance or accessing a static member).

Purpose: Used to initialize static variables or perform setup that only needs to happen once.

Initialization Block ({}):

Execution: Runs every time a new instance (object) of the class is created.

Sequence: It executes after the static blocks but before the class constructor.

Purpose: Used to share code between multiple constructors or initialize instance variables.
