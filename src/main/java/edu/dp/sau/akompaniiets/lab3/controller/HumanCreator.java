package edu.dp.sau.akompaniiets.lab3.controller;

import edu.dp.sau.akompaniiets.lab3.model.Human;
import edu.dp.sau.akompaniiets.lab3.model.Student;
import edu.dp.sau.akompaniiets.lab3.model.Sex;

public class HumanCreator {
    public static Human createHuman(String firstName, String lastName, String middleName, Sex sex) {
        return new Human(firstName, lastName, middleName, sex) {};
    }
}
