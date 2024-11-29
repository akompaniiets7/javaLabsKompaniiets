package edu.dp.sau.akompaniiets.lab3.controller;

import edu.dp.sau.akompaniiets.lab3.model.Group;
import edu.dp.sau.akompaniiets.lab3.model.Human;

public class GroupCreator
{
    public static Group createGroup(String name, Human head) {
        return new Group(name, head);
    }

}
