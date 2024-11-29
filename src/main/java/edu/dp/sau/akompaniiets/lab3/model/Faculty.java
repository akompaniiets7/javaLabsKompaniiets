package edu.dp.sau.akompaniiets.lab3.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty
{
    private String name;
    private Human dean;
    private List<Department> departments;

    public Faculty(String name, Human dean) {
        this.name = name;
        this.dean = dean;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("  Faculty: " + name + ", Dean: " + dean + "\n  Departments:\n");
        for (Department department : departments) {
            result.append(department).append("\n");
        }
        return result.toString();
    }
}
