package edu.dp.sau.akompaniiets.lab4.controller;

import edu.dp.sau.akompaniiets.lab4.model.Sex;
import edu.dp.sau.akompaniiets.lab4.model.Student;
public class StudentCreator
{
    public static Student createStudent(String firstName, String lastName, String middleName, Sex sex, String studentID) {
        return new Student(firstName, lastName, middleName, sex, studentID);
    }
}
