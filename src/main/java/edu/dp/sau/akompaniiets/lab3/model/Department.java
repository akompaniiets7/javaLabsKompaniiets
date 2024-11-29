package edu.dp.sau.akompaniiets.lab3.model;

import java.util.ArrayList;
import java.util.List;

public class Department
{
    private String name;
    private Human head;
    private List<Group> groups;

    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("    Department: " + name + ", Head: " + head + "\n    Groups:\n");
        for (Group group : groups) {
            result.append(group).append("\n");
        }
        return result.toString();
    }
}
