package ss5;

public class VD12 {
    public static void main(String[] args) {
        int cnt,squre,cube;
        for (cnt = 1;cnt < 300 ; cnt++){
            if (cnt % 3 ==0){
                continue;
            }
            squre = cnt * cnt;
            cube = cnt * cnt *cnt;
            System.out.printf("\nSquare of %d is %d and Cube is %d ",cnt,squre,cube);
        }
    }
}
