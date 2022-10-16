package Lesson5;

import javax.print.attribute.standard.PrinterInfo;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee ("Андрей Андреев", "Инженер", "andreev@mail.com", "123456789", 1000, 25);
        Employee employee2 = new Employee ("Алексей Алексеев", "Директор", "alekseev@mail.com", "456748768", 2000, 42);
        Employee employee3 = new Employee ("Иван Иванов", "Бухгалтер", "ivanov@mail.com", "4465734646", 1500, 32);
        Employee employee4 = new Employee ("Петр Петров", "Программист", "petrov@mail.com", "465457848", 2500, 45);
        Employee employee5 = new Employee ("Сидор Сидоров", "Тестировщик", "sidorov@mail.com", "654546454", 3000, 30);

        Employee[] empArray = {employee1, employee2, employee3, employee4, employee5};

        for (Employee employee : empArray) {
            if (employee.getAge() > 40) {
                employee.PrintInfo();
            }
        }

    }
}
