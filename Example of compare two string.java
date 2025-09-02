// Get a input from user, for the variable called RCB.
import java.util.Scanner;
class comparisonstring
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
       String RCB=scan.nextLine();

       if(RCB.equals("Win"))
       {
        System.out.println("Ee sala cup namadhey");
       } 
       else{
        System.out.print("No cup");
       }
    }
}

Get input:
win

output:
Ee sala cup namadhey
