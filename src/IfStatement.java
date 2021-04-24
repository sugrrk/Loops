import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
//        if(mark>85){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }
//        int x = 25;
//        if (x>95){
//            System.out.println(true);
//        }
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter you age");
//        int age = scan.nextInt();


if(age>=18){
    System.out.println("eligible to vote");

}


        else{
            System.out.println("not eligible");
}

    }
}
