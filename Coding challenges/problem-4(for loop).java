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

// print even number between 1 to 10 Using for loop and if else
import java.util.Scanner;
class forloop{
    public static void main(String args[])
    {
    
       for(int i=1; i<=10; i=i+1)
       if(i%2==0)
       System.out.println("Even number:"+i);
    }
}

//output:
Even number:2
Even number:4
Even number:6
Even number:8
Even number:10

// count the number of odd number from 1 to 10
import java.util.Scanner;
class forloop{
    public static void main(String args[])
    {
       int oddcount = 0;
       for(int i=1; i<=10; i=i+1)
       {
        if(i%2==0)
       {
         oddcount= oddcount+1;
       }
    
       }
       System.out.print(oddcount);
     
    }
}
// output:
5

// print the number which are divisible by both 3 and 5 . range 1 to 100.

class forloop{
    public static void main(String args[])
    {
        int count = 0;
        for(int i=1;i<=100;i=i+1)
        {
            if(i%3==0 && i%5==0)
            {
                count = count+1;
                System.out.println(i);
            }
        }

        System.out.println("count is:"+count);
    }
}

// output:
15
30
45
60
75
90
count is:6
