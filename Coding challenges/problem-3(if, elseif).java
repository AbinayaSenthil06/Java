// What is the score in a game?
// if the score is lesser than 50, print you need to improve
// if the score is between 50 and 70, print good job
// if the score is greater than 70, print excellent performance

class q10{
    public static void main(String args[])
    {
        int score = 62;
        if(score<50)
        {
            System.out.println("you need to improve");
        }
        else if(score>=50 && score<=70)  // else if
        {
            System.out.println("Good job");
        }
        else{
            System.out.print("Excellent performance");
        }
    }
}

output:
Good job

// Get input for five subjects marks. Add all of it, and find average.
// If average mark is less than 35. Print Additional class is required, else print you are good to go.

    import java.util.Scanner;
class q11{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      int s1= scan.nextInt();
      int s2= scan.nextInt();
      int s3= scan.nextInt();
      int s4= scan.nextInt();
      int s5= scan.nextInt();

      int totalmark = s1+s2+s3+s4+s5;
      int avg = totalmark/5;

      if(avg<35)
      {
        System.out.println("Additional class is required");
      }
      else{
        System.out.print("You are good to go");
      }
      
    }
}

Get input:
89
78
69
72
88
Output:
You are good to go

// What is the color of the traffic light?
// if the answer is "red", print "stop"
// if the answer is "yellow", print "get ready"
// if the answer is "green", print "Go"

import java.util.Scanner;
class q12{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      String color = scan.nextLine();
        if(color.equals("red"))
        {
            System.out.println("stop");
        }
        else if(color.equals("yelow"))
        {
            System.out.println("Get ready");
        }
        else if(color.equals("green"))
        {
            System.out.print("Go");
        }
    }
}

Get input:
green
output:
Go
