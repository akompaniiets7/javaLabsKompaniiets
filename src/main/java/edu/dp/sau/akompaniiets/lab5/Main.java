package edu.dp.sau.akompaniiets.lab5;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseManager dbManager = new DatabaseManager();

        System.out.print("Enter month to search students (from 1 to 12): ");
        int month = scanner.nextInt();

        List<StudentBase> students = dbManager.getStudentsByBirthMonth(month);

        if (students.isEmpty()) {
            System.out.println("Students not found");
        } else {
            System.out.println("List of students who were born this month " + month + ":");
            for (StudentBase student : students) {
                System.out.println(student);
            }
        }
    }
}

