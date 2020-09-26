import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //считываем пару чисел
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Введите пара чисел:");
        System.out.print("1: ");
        a = in.nextInt();
        System.out.print("2: ");
        b = in.nextInt();
        //проверяем знаменателя на 0
        if (b == 0){
            System.out.println("0");
        }
        //проверка на отрицательность чисел
        else if(a<0 || b<0){
            System.out.println("Negative");
        }
        //проверка на равенста чисел
        else if(a == b){
            System.out.println("1");
        }
        else {
            //определяем разрядность числа b
            int digit = findDigit(b);
            //определяем сколько нам нужны 9 для знаменателя
            int countOfNine = kNine(digit);

            //чтобы найти минимальную пару чисел нам нужно найти нод и поделить оба чисел
            int nodAB = NOD(b, countOfNine);
            int numerator = b / nodAB;
            int denominator = countOfNine / nodAB;

            if (a >= 1) {
                numerator += denominator * a;
            }
            System.out.println("Numerator: " + numerator + " " + "Denominator: " + denominator);
        }
    }

    //функция для нахождения НОД(наибольший общий делитель)
    public static int NOD(int a, int b){
        while (a != 0 && b != 0) {
            if (a > b)
                a %= b;
            else b %= a;
        }
        return a+b;
    }

    //функция определяет из сколько разраядов состоит число
    public static int findDigit(int num) {
        int i = 0;
        while (num > 0) {
            i++;
            num /= 10;
        }
        return i;
    }

    //функция возвращает столько чисел 9 сколько разрядов имеет заданное число
    public static int kNine(int digit){
        StringBuilder nineSymbol = new StringBuilder("");
        while(digit>0){
            nineSymbol.append("9");
            digit--;
        }
        return Integer.parseInt(nineSymbol.toString());
    }
}
