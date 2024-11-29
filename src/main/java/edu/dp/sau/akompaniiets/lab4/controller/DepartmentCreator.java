package edu.dp.sau.akompaniiets.lab4.controller;

import edu.dp.sau.akompaniiets.lab4.model.Department;
import edu.dp.sau.akompaniiets.lab4.model.Human;
public class DepartmentCreator {
    public static Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
}
