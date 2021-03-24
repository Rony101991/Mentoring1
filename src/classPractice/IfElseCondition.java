package classPractice;

public class IfElseCondition {
    public static void main(String[] args) {
        int a,b,c;
        a=5;
        b=4;
        c=7;
        if(a+b<c && b+c>a && c+a>b){
            System.out.println("It is a right triangle");
        }
        else{
            System.out.println("It is not a right triangle");
        }
    }
}
