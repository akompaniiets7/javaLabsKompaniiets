package edu.dp.sau.akompaniiets.lab3.controller;

import edu.dp.sau.akompaniiets.lab3.model.Faculty;
import edu.dp.sau.akompaniiets.lab3.model.Human;

public class FacultyCreator
{
    public static Faculty createFaculty(String name, Human dean) {
        return new Faculty(name, dean);
    }
}
