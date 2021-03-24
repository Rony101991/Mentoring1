package classPractice;

public class Pyramid {
    public static void main(String[] args) {
        int a = 6;  //rows
        for (int b = 1; b <= a; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print(" ");
            }
            for (int c =b; c<=a; c++){
                System.out.print(c +" ");
            }
            System.out.println();
        }

    }
}