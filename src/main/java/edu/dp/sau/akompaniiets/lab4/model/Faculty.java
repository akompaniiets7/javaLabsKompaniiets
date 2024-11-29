package edu.dp.sau.akompaniiets.lab4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Faculty faculty = (Faculty) obj;
        return Objects.equals(name, faculty.name) &&
                Objects.equals(dean, faculty.dean) &&
                Objects.equals(departments, faculty.departments);
    }
}
