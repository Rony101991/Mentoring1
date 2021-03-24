package classPractice;

public class SwitchCase {
    public static void main(String[] args) {
        int day =6;
        switch(day){
            case 1:
                System.out.println("it is Sunday");
                break;
            case 2:
                System.out.println("It is Monday");
                break;
            case 3:
                System.out.println("It is Tuesday");
                break;
            case 4:
                System.out.println("It is Wednesday");
                break;
            case 5:
                System.out.println("It is thursday");
                break;
            case 6:
                System.out.println("It is friday");
                break;
            case 7:
                System.out.println("It is Saturday");
            default:
                System.out.println(" please enter valid Day");
        }
    }
}
