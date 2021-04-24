import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
//        int mark = 89;
//        if (mark> 90){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }
    Scanner scan = new Scanner(System.in);
    System.out.println("Your score is");
    int mark = scan.nextInt();
    if (mark>100) {
        boolean yes;
        System.out.println("You are smart");
    }
        else{
            System.out.println("You are not smart");
        }
    }

    }


