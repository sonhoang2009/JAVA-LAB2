package ss5;

public class VD13 {
    public static void main(String[] args) {
        int i;
        outer:
        for (i=0;i<5;i++){
            if (i == 2){
                System.out.println("hello");
                break outer;
            }
            System.out.println("this is outer loop");
        }
        System.out.println("good bye");
    }
}
