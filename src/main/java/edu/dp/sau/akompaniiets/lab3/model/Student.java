package edu.dp.sau.akompaniiets.lab3.model;

public class Student extends Human
{
    private String studentID;
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

}
