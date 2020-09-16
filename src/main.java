import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.println("Вводите пара чисел:");
        System.out.print("1: ");
        a = in.nextInt();
        System.out.print("2: ");
        b = in.nextInt();

        int digit = findDigit(b);
        int countOfNine = kNine(digit);

        int nodAB = NOD(b, countOfNine);
        int numerator = b / nodAB;
        int denominator = countOfNine / nodAB;

        if(a>0){
            denominator *=a;
            numerator+=denominator;
        }
        System.out.println("Numerator: " + numerator + " " + "Denominator: " + denominator);

    }

    public static int NOD(int a, int b){
        while (a != 0 && b != 0) {
            if (a > b)
                a %= b;
            else b %= a;
        }
        return a+b;
    }

    public static int findDigit(int num) {
        int i = 0;
        while (num > 0) {
            i++;
            num /= 10;
        }
        return i;
    }

    public static int kNine(int digit){
        StringBuilder nineSymbol = new StringBuilder("");
        while(digit>0){
            nineSymbol.append("9");
            digit--;
        }
        return Integer.parseInt(nineSymbol.toString());
    }
}
