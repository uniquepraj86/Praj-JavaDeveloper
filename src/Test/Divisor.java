package Test;
import java.util.*;
public class Divisor {
    public static void main(String[] args)
    {
                int sum = 0;
                System.out.println("Enter the number:");

                Scanner s = new Scanner(System.in);

                int n = s.nextInt();
                for (int i = 1; i <= n; i++)
                {
                    if (n % i == 0) {
                        sum = sum+i;
                        System.out.print(i + " ");
                    }
                }
                System.out.println("are divisors of " + n);
                System.out.println("Sum is :"+sum);
            }
        }
