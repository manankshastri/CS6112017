import java.util.Scanner;
public class RecursivePowerOf2 {
    public static void main(String[] args) {
        int base = 2;
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the power of 2: ");
        int n = sc.nextInt();
        result = recPow(base,n);
        if (result != 0)
            System.out.println("2 ^ "+ n + " = " + result);
    }
    public static double recPow (int base, int n) {
        if (n > 23) {
            System.out.println("Value of Power greater than 23");
            return 0;
        }
        else
        if(n > 0 && n < 24)
            return (base*recPow(base,n -1));
        else
        if (n<0)
            return 1/ (base *recPow(base,-n-1));
        else
            return 1;
    }
}