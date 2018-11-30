import java.util.*;

public class calc {

    public static void main (String[] args){

        int num1=0;  // eerste nummer
        int num2=0;  // tweede nummer
        char operator;  // berekent de twee nummers
        double answer=0.0;   //antwoord met een decimaal

        Scanner scanObject = new Scanner(System.in);

        System.out.println("+ Voor optellen\n- Voor aftrekken\n* Voor vermedigvuldigen\n/ Voor delen\n% Voor modulen\n");
        System.out.println("Vul jouw eerste nummer in:");
        num1 = scanObject.nextInt(); // scant de eerste nummer
        System.out.println("Vul jouw tweede nummer in:");
        num2 = scanObject.nextInt(); // scant de tweede nummer

        System.out.println("Welke berekening?");
        operator = scanObject.next().charAt(0);

        // operators
        switch (operator) {
            case '+': answer = plus(num1, num2);
            System.out.println(answer);
            break;
            case '-': answer = min(num1, num2);
            System.out.println(answer);
            break;
            case '*': answer = vermedigvuldig(num1, num2);
            System.out.println(answer);
            case '/': answer = delen(num1, num2);
            System.out.println(answer);
            break;
            case '%': answer = modulo(num1, num2);
            System.out.println(answer);
            break;

        }
    }
    private static int plus(int num1, int num2){
        return num1 + num2;
    }
    private static int min(int num1, int num2){
        return num1 - num2;
    }
    private static int vermedigvuldig(int num1, int num2) {
        return num1 * num2;
    }
    private static int delen(int num1, int num2){
        return num1 / num2;
    }
    private static int modulo(int num1, int num2){
        return num1 % num2;
    }
}
