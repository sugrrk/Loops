public class Operators {
    public static void main(String[] args) {

// arithmetic operators
        int a = 45;
        int b = 25;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);//reminder
        System.out.println(a*b);
        System.out.println(a%b);//quotient

        //Relational operators
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        System.out.println(a==b);

        //Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println(x&&y);//false
        System.out.println(x||y);//true
        System.out.println(!x);//false
        System.out.println(!y);//true

        //Assignment operators
        int c;
        c=a;
        System.out.println(c);
        c=b;
        System.out.println(c);
        c+=5;
        c-=5;
        System.out.println(c);

    }

}
