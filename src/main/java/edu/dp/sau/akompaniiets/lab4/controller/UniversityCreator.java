package edu.dp.sau.akompaniiets.lab4.controller;

import edu.dp.sau.akompaniiets.lab4.model.Human;
import edu.dp.sau.akompaniiets.lab4.model.University;

public class UniversityCreator
{
    public static University createUniversity(String name, Human rector) {
        return new University(name, rector);
    }
}
