package Lesson5;

import javax.print.attribute.standard.PrinterInfo;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void PrintInfo() {
        System.out.println(String.format("Сотрудник %s, на позиции %s, Email %s, телефон %s, зарплата %s, возраст %s", name, position, email, phoneNumber, salary, age));

    }

    public int getAge() {
        return age;

    }


}


