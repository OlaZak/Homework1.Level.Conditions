
import java.util.Scanner;

public class Task5 {
    public  void getToyId(){
        Scanner sc = new Scanner(System.in);;
        System.out.println("Enter toys name:");
        String s = sc.nextLine();
        int numb;
        switch(s) {
            case "Car" :
                numb = 0;
                System.out.println("Number of toy: " + numb);
                break;
            case "Lego" :
                numb = 1;
                System.out.println("Number of toy: " + numb);
                break;
            case "Doll" :
                numb = 2;
                System.out.println("Number of toy: " + numb);
                break;
            case "Puzzle" :
                numb = 3;
                System.out.println("Number of toy: " + numb);
                break;
                default:
                    throw new IllegalArgumentException("Incorrect value");

        }
    }
}
