package Class;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;

    public Person(int id, String fn, String ln, String gender) {
        this.id = id;
        this.firstName = fn;
        this.lastName = ln;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstname(String fn) {
        this.firstName = fn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String ln) {
        this.lastName = ln;
    }

}

class Lecturer extends Person {
    private String position;
    private int yearOfEmploy;
    private double salary;

    public Lecturer(int id, String fn, String In, String gender, int y) {
        super(id, fn, In, gender);
        this.yearOfEmploy = y;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String pos) {
        this.position = pos;
    }

    public int getYeatOfEmploy() {
        return yearOfEmploy;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Course {
    private String id;
    private String title;
    private Lecturer lecturer;

    public Course(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Course(String id, String title, Lecturer lecturer) {
        this.id = id;
        this.title = title;
        this.lecturer = lecturer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

public class LecturerTester {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();

        Scanner sc = new Scanner(System.in);
        int countL = sc.nextInt();
        for (int i = 0; i < countL; i++) {
            int lid = sc.nextInt();
            String fn = sc.next();
            String ln = sc.next();
            String gender = sc.next();
            int year = sc.nextInt();
            String pos = sc.next();
            int salary = sc.nextInt();
            lecturers.add(new Lecturer(lid, fn, ln, gender, year));
            lecturers.get(i).setPosition(pos);
            lecturers.get(i).setSalary(salary);
            ;
        }

        for (int i = 0; i < countL; i++) {
            String cid = sc.next();
            String title = sc.next();
            if (i % 2 == 0) {
                courses.add(new Course(cid, title, lecturers.get(i)));
            } else {
                courses.add(new Course(cid, title));
            }
        }
        System.out.println("---Lecturer List---");
        for (int i = 0; i < countL; i++) {
            printLecturerInfo(lecturers.get(i));
        }

        System.out.println("---Course List---");
        for (int i = 0; i < countL; i++) {
            printCourseInfo(courses.get(i));
        }
    }

    public static void printLecturerInfo(Lecturer l) {
        System.out.println(l.getId() + ": " + l.getPosition() + " " + l.getFirstName() + " " + l.getLastName() + " "
                + l.getSalary());

    }

    public static void printCourseInfo(Course c) {
        System.out.println(c.getId());
        System.out.println("Title: " + c.getTitle());
        if (c.getLecturer() != null) {
            System.out.println("Lecturer: " + c.getLecturer().getPosition() + " " + c.getLecturer().getFirstName());
        } else {
            System.out.println("Lecturer: None");
        }
    }
}
