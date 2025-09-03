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
