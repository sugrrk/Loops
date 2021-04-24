public class ElseIfLadder {
    public static void main(String[] args) {
        int mark = 85;
        if(mark >90){
            System.out.println("Average");
        }
        else if(mark<=90&&mark>80){
            System.out.println("good");
        }
        else if(mark<=80&&mark>70){
            System.out.println("bad");
        }
    }
}
