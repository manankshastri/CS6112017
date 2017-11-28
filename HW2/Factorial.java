import java.util.Scanner;

public class Factorial {

    public static int fact (int n) {
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = number.nextInt();
        int fact = fact(n);
        System.out.println("Factorial of "+n+": " + fact);
    }
}
