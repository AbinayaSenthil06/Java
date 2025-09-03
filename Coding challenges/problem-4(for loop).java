// Get a input for variable a and b and print the number from a to b
import java.util.Scanner;
class forloop{
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("Number 1");
       int a = scan.nextInt();
       System.out.println("Number 2");
       int b = scan.nextInt();
       for(int i=a; i<=b; i++)
       System.out.println(i);
    }
}

// Get Input:
Number 1
5
Number 2
10
// output:
5
6
7
8
9
10
