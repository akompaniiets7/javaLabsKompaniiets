package edu.dp.sau.akompaniiets.lab3.controller;

import edu.dp.sau.akompaniiets.lab3.model.Student;
import edu.dp.sau.akompaniiets.lab3.model.Sex;

public class StudentCreator
{
    public static Student createStudent(String firstName, String lastName, String middleName, Sex sex, String studentID) {
        return new Student(firstName, lastName, middleName, sex, studentID);
    }
}
