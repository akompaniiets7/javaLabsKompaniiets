package edu.dp.sau.akompaniiets.lab3.model;

import java.util.ArrayList;
import java.util.List;

public class Group
{
    private String name;
    private Human head;
    private List<Student> students;

    public Group(String name, Human head) {
        this.name = name;
        this.head = head;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("      Group: " + name + ", Head: " + head + "\n      Students:\n");
        for (Student student : students) {
            result.append("        ").append(student).append("\n");
        }
        return result.toString();
    }

}
