// Get input for two integer number and find which number is greater using ternary operator.
import java.util.Scanner;
class ternary{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        String result = (a>b)? "A is greater" : "B is greater"; // ternary operator
        System.out.print(result);
    }
}

Get input:
  15
  20
output:
B is greater
