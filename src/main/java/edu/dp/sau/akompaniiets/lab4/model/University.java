package edu.dp.sau.akompaniiets.lab4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University
{
    private String name;
    private Human rector;
    private List<Faculty> faculties;

    public University(String name, Human rector) {
        this.name = name;
        this.rector = rector;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("University: " + name + ", Rector: " + rector + "\nFaculties:\n");
        for (Faculty faculty : faculties) {
            result.append(faculty).append("\n");
        }
        return result.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        University university = (University) obj;
        return Objects.equals(name, university.name) &&
                Objects.equals(rector, university.rector) &&
                Objects.equals(faculties, university.faculties);
    }

}
