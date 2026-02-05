import java.util.Scanner;

public class Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and width:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        double area = length * width;

        System.out.println("Area of rectangle = " + area);
        
        sc.close();
    }
}

