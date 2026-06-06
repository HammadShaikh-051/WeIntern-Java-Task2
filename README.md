# Student Grade Management System (Console-Based)

A professional, menu-driven command-line application engineered in **Core Java** to process, track, and analyze student grades. This project focuses heavily on utilizing map-based structures for efficient key-value lookups and data manipulation.

This project was developed as part of the **Week 2 Assignment** for the **Java Developer Internship** at **WeIntern**.

---

## 📋 Table of Contents
- [Project Overview](#-project-overview)
- [Key Features](#-key-features)
- [Tech Stack](#-tech-stack)
- [Architecture & Design](#-architecture--design)
- [How to Run the Application](#-how-to-run-the-application)
- [About WeIntern Internship](#-about-weintern-internship)
- [License](#-license)

---

## 🚀 Project Overview

The objective of this assignment is to progress from sequential lists to map-based data structures in Java. The application enables teachers to log student grades, manipulate key-value associations efficiently, and generate performance-based reports by sorting grading metrics.

### Core Objectives:
* **Key-Value Mapping:** Implement data tracking with a `HashMap` mapping unique student references to their corresponding grades.
* **Data Transformation & Sorting:** Extract, structure, and sort collection data based on numeric values to build ranked reports.
* **Algorithmic Core:** Explore the complexities of custom sorting mechanisms on Java Collections.

---

## ✨ Key Features

The command-line dashboard includes the following modular options:

1.  **Input Grade Profiles:** Input student names alongside their associated grades into a persistent application session.
2.  **Lookup Specific Grades:** Retrieve a student's performance instantaneously via map-key lookups.
3.  **Update or Edit Grades:** Safely modify student grades by updating the mapped values for a given name.
4.  **Generate Ranked Reports:** Print a comprehensive grade book sorted dynamically from highest-to-lowest or lowest-to-highest performance markers.
5.  **Statistical Insights:** Calculate system analytics, including class averages, top-performing students, and failing criteria.

---

## 🛠️ Tech Stack

* **Language Environment:** Java Standard Edition (JDK 8 / 11 / 17 or higher)
* **Core Paradigms:** Map-Value Mappings, Custom Sorting Logic, Stream/Collection Manipulation
* **Collections Framework:** `java.util.HashMap`, `java.util.ArrayList`, `java.util.Collections`, `java.util.Scanner`

---

## 📁 Architecture & Design

To promote separation of concerns, the directory architecture isolates input parsing from business computation layers:

```text
src/
└── com/
    └── weintern/
        └── gms/
            ├── Main.java           # Command loop controller and user interface menus
            ├── GradeTracker.java   # Business logic manager containing the HashMap and filtering algorithms
            └── ReportGenerator.java# Utility class handling data conversion and custom sorting logic
