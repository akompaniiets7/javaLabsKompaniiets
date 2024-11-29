package edu.dp.sau.akompaniiets.lab4.model;

import java.util.Objects;

public class Student extends Human
{
    private final String studentID;
    public Student(String firstName, String lastName, String middleName, Sex sex, String studentID) {
        super(firstName, lastName, middleName, sex);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + ", ID: " + studentID;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                getSex() == student.getSex() &&
                Objects.equals(studentID, student.studentID);
    }
    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getMiddleName(), getSex(), studentID);
    }

}
