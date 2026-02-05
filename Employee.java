import java.util.*;

class Employee {
    String first, last;
    double salary;

    // Constructor (Aapki image jaisa beginner style)
    public Employee(String f, String l, double s) {
        first = f;
        last = l;
        if (s > 0) salary = s; else salary = 0.0;
    }

    public void display() {
        System.out.println(first + " " + last + " Yearly: " + (salary * 12));
    }
}

public class Prob1 {
    public static void main(String args[]) {
        Employee e1 = new Employee("Amit", "Patil", 3000);
        Employee e2 = new Employee("Rahul", "Sutar", 4000);
        
        e1.display();
        e2.display();

        // 10% Raise
        e1.salary = e1.salary * 1.10;
        e2.salary = e2.salary * 1.10;
        
        System.out.println("After Raise:");
        e1.display();
        e2.display();
    }
}