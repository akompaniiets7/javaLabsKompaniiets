import edu.dp.sau.akompaniiets.lab4.controller.*;
import edu.dp.sau.akompaniiets.lab4.json.JsonManager;
import edu.dp.sau.akompaniiets.lab4.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class UniversityJsonTest {
    @Test
    public void testJsonSerialization() {
        University oldUniversity = createSampleUniversity();
        String filePath = "university.json";

        JsonManager.saveToJsonFile(oldUniversity, filePath);

        University newUniversity = JsonManager.loadFromJsonFile(filePath);
        System.out.println("Old University: " + oldUniversity);
        System.out.println("New University: " + newUniversity);

        assertEquals(oldUniversity, newUniversity);
    }

    private University createSampleUniversity() {
        Human rector = new Rector("Bill", "Smith", "Black", Sex.MALE);

        University university = UniversityCreator.createUniversity("National University", rector);

        Human dean1 = new Dean("Jill", "Bond", "Smith", Sex.FEMALE);
        Faculty faculty1 = FacultyCreator.createFaculty("Engineering Faculty", dean1);

        Human dean2 = new Dean("Alice", "Johnson", "Brown", Sex.FEMALE);
        Faculty faculty2 = FacultyCreator.createFaculty("Computer Science Faculty", dean2);

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        Human headOfDepartment1 = new DepartmentHead("Robert", "Brown", "Lee", Sex.MALE);
        Department department1 = DepartmentCreator.createDepartment("Mechanical Engineering", headOfDepartment1);

        Human headOfDepartment2 = new DepartmentHead("Emily", "Collins", "Taylor", Sex.FEMALE);
        Department department2 = DepartmentCreator.createDepartment("Information Technology", headOfDepartment2);

        faculty1.addDepartment(department1);
        faculty2.addDepartment(department2);

        Human groupLeader1 = new GroupHead("Tina", "Walker", "Old", Sex.FEMALE);
        Group group1 = GroupCreator.createGroup("ME-1001", groupLeader1);

        Human groupLeader2 = new GroupHead("Don", "White", "Carter", Sex.MALE);
        Group group2 = GroupCreator.createGroup("ME-1002", groupLeader2);

        department1.addGroup(group1);
        department1.addGroup(group2);

        Student student1 = StudentCreator.createStudent("Michael", "Scott", "Wayne", Sex.MALE, "S001");
        Student student2 = StudentCreator.createStudent("Laura", "Smith", "Parker", Sex.FEMALE, "S002");

        group1.addStudent(student1);
        group1.addStudent(student2);

        Student student3 = StudentCreator.createStudent("Ethan", "Taylor", "Swift", Sex.MALE, "S003");
        Student student4 = StudentCreator.createStudent("Valery", "Smith", "Jonson", Sex.FEMALE, "S004");
        group2.addStudent(student3);
        group2.addStudent(student4);

        Human groupLeader3 = new GroupHead("Sophia", "Walker", "Young", Sex.FEMALE);
        Group group3 = GroupCreator.createGroup("CS-1001", groupLeader3);

        Human groupLeader4 = new GroupHead("James", "Wright", "Carter", Sex.MALE);
        Group group4 = GroupCreator.createGroup("CS-1002", groupLeader4);

        department2.addGroup(group3);
        department2.addGroup(group4);

        Student student5 = StudentCreator.createStudent("Michael", "Scott", "Wayne", Sex.MALE, "S005");
        Student student6 = StudentCreator.createStudent("Laura", "Bond", "Parker", Sex.FEMALE, "S006");

        group3.addStudent(student5);
        group3.addStudent(student6);

        Student student7 = StudentCreator.createStudent("Ethan", "Talbot", "Morgan", Sex.MALE, "S007");
        Student student8 = StudentCreator.createStudent("Ciara", "Smith", "Jonson", Sex.FEMALE, "S008");
        group4.addStudent(student7);
        group4.addStudent(student8);

        return university;
    }
}