       import java.util.*;

public class SortNames {
    public static void main(String args[]) {
        String names[] = {"Devank", "Tushar", "Nana", "Sherya", "Ananya", "Deepak", "Karan", "Khadija", "Yash", "Shahu"};
        
        Arrays.sort(names); 
        
        System.out.println("Sorted Names:");
        for(int i = 0; i < 10; i++) {
            System.out.println(names[i]);
        }
    }
}

