import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Problem 8");
        System.out.println("請輸入攝氏溫度:");
        float s = scn.nextFloat();
        float f = s * 9 / 5 + 32;
        System.out.println("華氏溫度為:" + f + "\n");

        Scanner mat = new Scanner(System.in);
        System.out.println("Problem 11");
        System.out.println("請輸入兩個整數數字做加,減,乘基本運算:");
        int p = mat.nextInt();
        int q = mat.nextInt();
        int r = p + q;
        int m = p - q;
        int d = p * q;
        System.out.println("兩數相加後得:" + r);
        System.out.println("兩數相減後得:" + m);
        System.out.println("兩數相乘後得:" + d + "\n");


        Scanner sor = new Scanner(System.in);
        System.out.println("Problem 12");
        System.out.println("請依序輸入您的 國文 英文 數學成績:");
        float chinese = sor.nextFloat();
        float english = sor.nextFloat();
        float math = sor.nextFloat();
        float total = chinese + english + math;
        float average = (chinese + english + math) / 3;
        System.out.println("總成績為:" + total);
        System.out.println("各科平均為:" + average + "\n");


        Scanner body = new Scanner(System.in);
        System.out.println("Problem 15");
        System.out.println("請依序輸入您的身高(cm)及體重(kg):");
        float cm = body.nextFloat();
        float kg = body.nextFloat();
        double inch = cm / 2.54;
        double pon = kg / 0.454;
        System.out.println("您的身高為:" + inch + "吋");
        System.out.println("您的體重為:" + pon + "磅" + "\n");


        Scanner tran = new Scanner(System.in);
        System.out.println("Problem 24");
        System.out.println("請輸入三角形之三邊長 a , b , c (a<=b<=c) :");
        float a = tran.nextFloat();
        float b = tran.nextFloat();
        float c = tran.nextFloat();
        if (a > b || b > c || a > c) {
            System.out.println("請依照( a <= b <= c )規則輸入");
        } else if (a + b < c || a + c < b || b + c < a || a - b > c || a - c > b || b - a > c || b - c > a || c - a > b || c - b > a) {
            System.out.println("此三邊長不可構成三角形");
        } else System.out.println("此三邊長可構成三角形" + "\n");


        Scanner year = new Scanner(System.in);
        System.out.println("Problem 27");
        System.out.println("請輸入欲判斷之西元年");
        int ans = year.nextInt();
        if (ans / 4 == 0) {
            System.out.println("此年為閏年");
        }
        if (ans / 100 == 0) {
            System.out.println("此年為閏年");
        }
        if (ans / 400 == 0) {
            System.out.println("此年為閏年");
        } else {
            System.out.println("此年非閏年");
        }
    }
}