class StaticExample {
    static int count = 0; // Static Variable

    static { // Static Block
        System.out.println("Static block runs first.");
        count = 100;
    }

    static void show() { // Static Method
        System.out.println("Count value: " + count);
    }
}

public class StaticTest {
    public static void main(String args[]) {
        StaticExample.show(); // Called without creating object
    }
}
