package com.weintern.service;

import java.util.*;

public class GradeManager {
    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, Integer> gradeMap = new HashMap<>();

    public void manager() {
        while (true) {
            System.out.println("----- STUDENT GRADE MANAGEMENT -----");
            System.out.println("1 - Add/Update Student Grade");
            System.out.println("2 - View All Student Grades");
            System.out.println("3 - Generate Sorted Report (Highest to Lowest)");
            System.out.println("4 - Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addOrUpdateGrade();
                    break;
                case 2:
                    viewAllGrades();
                    break;
                case 3:
                    generateSortedReport();
                    break;
                case 4:
                    System.out.print("Exiting");
                    try {
                        for (int i=0; i<3; i++) {
                            Thread.sleep(500);
                            System.out.print(".");
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public void addOrUpdateGrade() {
        System.out.println("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter Student Grade/Marks: ");
        int studentGrade = scanner.nextInt();
        scanner.nextLine();
        gradeMap.put(studentName, studentGrade);
        System.out.println("Successfully saved grade for " + studentName + "!");
    }

    public void viewAllGrades() {
        if (gradeMap.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {
            System.out.println("Student: " + entry.getKey() + " | Grade: " + entry.getValue());
        }
    }

    public void generateSortedReport() {
        if (gradeMap.isEmpty()) {
            System.out.println("No records found.");
            return;
        }

        ArrayList<Map.Entry<String, Integer>> sortedList = new ArrayList<>(gradeMap.entrySet());
        Collections.sort(sortedList, (a, b) -> b.getValue() - a.getValue());

        System.out.println("Performance Report (Highest to Lowest): ");
        int rank = 1;
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(rank + ". " + entry.getKey() + " - Marks: " + entry.getValue());
            rank++;
        }
    }
}