// 1. Get input for variable: Name and Age. print it.

import java.lang.System;
import java.util.Scanner;

class q1
{
    public static void main(String args[])
    {
     Scanner scan = new Scanner(System.in);
     String name= scan.nextLine();
     int age= scan.nextInt();
     System.out.println("My name is:"+name);
     System.out.print("My age is:"+age);
      
    }
}

Get input from user:
Abi
24

output:
My name is:Abi
My age is:24

// 2. Get input for variable: Name, Age and Address. Print it.

import java.lang.System;
import java.util.Scanner;

class q2
{
    public static void main(String args[])
    {
     Scanner scan = new Scanner(System.in);
     String name= scan.nextLine();
     int age= scan.nextInt();
     scan.nextLine();
     String address= scan.nextLine();
     System.out.println("My name is:"+name);
     System.out.println("My age is:"+age);
     System.out.print("My address is:"+address);
     
    }
}

Get input from user:
Abi
24
MYD

Output:
My name is:Abi
My age is:24
My address is:MYD

// 3. Get input for 3 integer variables: A,B, and C. Now multiply all variables and store it in D. Now add all variables and store it in E. Now divide D by E.

import java.lang.System;
import java.util.Scanner;

class q3
{
    public static void main(String args[])
    {
     Scanner scan = new Scanner(System.in);
     int a=scan.nextInt();
     int b=scan.nextInt();
     int c=scan.nextInt();
     int d=a*b*c;
     int e=a+b+c;
     System.out.println(d/e);

    }
}

Get input from user:
10
20
10

Output:
50

// 4. Get input for 3 variables: Name, Score, Department. Let the user enter the score for 100 Marks, You convert it for 10 and print it.

import java.lang.System;
import java.util.Scanner;

class q4
{
    public static void main(String args[])
    {
     Scanner scan = new Scanner(System.in);
     String name= scan.nextLine();
     double score= scan.nextDouble();
     scan.nextLine();
     String department= scan.nextLine();

     System.out.println("My name is:"+name);
     System.out.println("My score is:"+ score/10 +"/10");
     System.out.print("My department is:"+department);

    }
}

Get input from user:
Abi
56
Cse

Output:
My name is:Abi
My score is:5.6/10
My department is:Cse
