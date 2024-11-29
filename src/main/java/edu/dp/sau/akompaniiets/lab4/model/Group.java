package edu.dp.sau.akompaniiets.lab4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Group group = (Group) obj;
        return Objects.equals(name, group.name) &&
                Objects.equals(head, group.head) &&
                Objects.equals(students, group.students);
    }
}
