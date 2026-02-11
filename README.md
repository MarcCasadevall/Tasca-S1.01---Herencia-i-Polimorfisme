Musical Instruments OOP Exercises

Description: In this module, you will dive into two of the most important concepts in object-oriented programming: inheritance and polymorphism. Through practical exercises, you will learn to reuse code efficiently, build class hierarchies, and use polymorphic methods to achieve dynamic behavior depending on the specific object type.

📌 Exercise Statement

In this module, you will:

Design class hierarchies with shared methods and attributes.

Use abstract methods and overrides (@Override) to adapt behavior.

Apply static and final members.

Implement interfaces and practice multiple inheritance via interfaces.

Build a system with multiple objects and functionalities to test everything you've learned.

Level 1 – Exercise 1: Musical Instruments

Objective:
Work on inheritance and polymorphism, two key pieces of OOP. Learn how class loading works in Java and understand static blocks, which are useful to see how classes are initialized at runtime. The goal is to share common characteristics between different objects while allowing each one to behave specifically.

Exercise Statement:

We are designing a program to manage musical instruments in a music band. There are three types of instruments:

Wind instruments

String instruments

Percussion instruments

All instruments share two properties: name and price. Each can be played, but in different ways.

Steps to follow:

Make an explanatory commit for each step, following the Conventional Commits standard.

Create an abstract class Instrument with:

Two attributes: name and price

An abstract method play()

Create three subclasses that inherit from Instrument:

WindInstrument

StringInstrument

PercussionInstrument

In each subclass, implement play() to print a specific message:

"A wind instrument is playing" for WindInstrument

"A string instrument is playing" for StringInstrument

"A percussion instrument is playing" for PercussionInstrument

Add a Main class with a main() method where:

You create one object of each instrument type

Call play() on each to demonstrate polymorphic behavior

Class Loading and Static Blocks:

Java class loading happens only once during program execution.

Demonstrate that loading can occur in two ways:

When creating the first instance of the class

When accessing a static member (method or attribute)

Add a static block in the class and observe when it runs

Research and document:

What is an instance initializer block (non-static)?

When does it run?

How is it different from a static block?

✨ Functionalities

Demonstrates inheritance and polymorphism

Uses abstract classes and method overriding

Illustrates class loading and static block behavior

Allows creation of multiple types of instruments and polymorphic play behavior

🛠 Technologies

Backend: Java

🚀 Installation and Running

Clone the repository: git clone ...

Environment variables: Create .env if needed

Run the application: java Main.java (or via IntelliJ/Maven/Gradle)

Tests: Follow the provided instructions for testing the program

📸 Demo

[Link to Vercel/Netlify] or screenshots (if applicable)

🧩 Diagrams and Technical Decisions

Class hierarchy diagram showing Instrument and subclasses

Use of abstract methods to enforce play() in all subclasses

Static blocks to demonstrate class loading

Decisions to use inheritance for shared behavior and polymorphism for dynamic behavior
