import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Number: ");
        int num = take.nextInt();
        double sum = 0;
        for(double i = 1; i <= num;i++)
        {
            sum+= (1.0/i);
        }
        System.out.println("Sum of harmony: " + sum);
    }
}
