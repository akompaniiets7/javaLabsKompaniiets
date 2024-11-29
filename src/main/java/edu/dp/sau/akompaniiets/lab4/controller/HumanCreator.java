package edu.dp.sau.akompaniiets.lab4.controller;

import edu.dp.sau.akompaniiets.lab4.model.Human;
import edu.dp.sau.akompaniiets.lab4.model.Sex;

public class HumanCreator {
    public static Human createHuman(String firstName, String lastName, String middleName, Sex sex) {
        return new Human(firstName, lastName, middleName, sex) {};
    }
}
