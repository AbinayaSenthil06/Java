// 5.Get input for variable mark. If mark>=35 print pass. Else print fail.

import java.util.Scanner;
class q5{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int mark=scan.nextInt();
        if(mark>=35)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}

Get input:
35
Output:
Pass

// 6. Get input for variable income. If income is greater than 7000 scholarship is available. Else not eligible for scholarship.
import java.util.Scanner;
class q5{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int income = scan.nextInt();
        if(income>7000)
        {
            System.out.println("Schlorship is eligible");
        }
        else{
            System.out.print("Not eligible for scholarship");
        }
    }
}

Get input:                                  
7000
Output:
Not eligible for scholarship

Get input:
7500
Output:
Not eligible for scholarship

Get input:
7000
Output:
Schlorship is eligible

// 7. Get input for a number and check whether it is divisible by both 3 and 5 or not. 
// If yes then print print, the number is divisible by 3 and 5 print the number is not divisible by 3 and 5.

import java.util.Scanner;
class q7{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%3 == 0 && num%5 == 0)
        {
            System.out.println("Number is divisible by 3 and 5");
        }
        else{
            System.out.print("Number is not divisible by 3 and 5");
        }
    }
}

Get input:
15
Output:
Number is divisible by 3 and 5

Get input:
12
Output:
Number is not divisible by 3 and 5
