import java.util.Scanner;

public class Task4 {
    public   void getToyName(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter toys number:");
        int i = sc.nextInt();
        String toyName ;

        if(i ==0)
            toyName = "Car";
        else if (i==1)
            toyName = "Lego";
        else if (i ==2)
            toyName = "Doll";
        else if (i ==3)
            toyName = "Puzzle";
        else
            throw new IllegalArgumentException("Incorrect value");
        System.out.println(toyName);
    }
}
