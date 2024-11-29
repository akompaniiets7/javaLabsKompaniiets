package edu.dp.sau.akompaniiets.lab5;

public class StudentBase {
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String studentBook;

    public StudentBase(int id, String firstName, String lastName, String birthDate, String studentBook) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.studentBook = studentBook;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getStudentBook() {
        return studentBook;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Surname: %s, Birth date: %s, Report number: %s",
                id, firstName, lastName, birthDate, studentBook);
    }
}
