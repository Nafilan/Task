import java.util.Locale;
import java.util.Scanner;

public class twosix {
    public static double oppositeHouse(double a, double b){//1
        if (a%2==0){
            double n = a/2;
            return 2*b-(2*n-1);
        }

        else {double n = a/2-0.5;return 2*b-2*n;}
    }
    public static String nameShuffle(String a){//2
        String[] b = a.split(" ");
        String c = (""+b[1]+" "+b[0]);
        return c;
    }
    public static double discount(double a, double b){//3
        double total = a*(1-b/100);
        return total;
    }
    public static int differenceMaxMin(String a){//4
        String [] value = a.split(", ");
        int [] intValue = new int [value.length];
        for (int i=0; i< value.length; i++){
        intValue[i]  = Integer.parseInt(value[i]);
        }
        int max = intValue[0];
        for (int i =0 ; i< value.length; i++){//max

            if (max < intValue[i]) { max = intValue[i];}
        }
        int min = intValue[0];
        for (int i =0 ; i< value.length; i++){//min

            if (min > intValue[i]) { min = intValue[i];}
        }
        return Math.abs(max-min);
    }
    public static int equal(int a, int b, int c){//5
        if ((a==b)&&(a==c)&&(b==c)){
            return 3;
        }
        else if ((a==b)||(a==c)||(b==c)){
            return 2;
        }
        else    return 0;
    }
    public static StringBuilder reverse(String a){//6
        StringBuilder a1 = new StringBuilder();
        a1.append(a);

        return a1.reverse();
    }
    public static int programmers(int a, int b, int c){//7
        int[] intValue = new int[3];
        intValue[0]=a;
        intValue[1]=b;
        intValue[2]=c;
        int max = intValue[0];
        for (int i =0 ; i< intValue.length; i++){//max

            if (max < intValue[i]) { max = intValue[i];}
        }
        int min = intValue[0];
        for (int i =0 ; i< intValue.length; i++){//min

            if (min > intValue[i]) { min = intValue[i];}
        }
        return max-min;
    }
    public static boolean getXO(String a){//8
        int x = a.length() - a.replace("x","").length();
        int o = a.length() - a.replace("o","").length();
        int X = a.length() - a.replace("X","").length();
        int O = a.length() - a.replace("O","").length();
        x=x+X;
        o=o+O;

        if (x==o){return true;}
        else return false;
    }
    public static String bomb(String a){
        a=a.replace(".","");
        a=a.replace("?","");
        a=a.replace("!","");
        a=a.replace(",","");
        String[] b = a.split(" ");
        String result = "";
        for (int i = 0; i<b.length; i++){
            if (b[i].toLowerCase(Locale.ROOT).equals("bomb")){result = "DUCK!";break;}
            else result = "Relax, there's no bomb.";
        }
        return result;
    }
    public static boolean sameAscii(String a, String b){
        String[] aa = a.split("");
        String[] bb = b.split("");

        int resultA = 0;
        int resultB = 0;
        int ascii;
        for (int i = 0; i<aa.length; i++){
            char[] aaa = aa[i].toCharArray();
            ascii = aaa[0];
            resultA += ascii;
        }
        for (int i = 0; i<bb.length; i++){
            char[] bbb = bb[i].toCharArray();
            ascii = bbb[0];
            resultB += ascii;
        }
        if (resultA==resultB) return true;
        else return false;




    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a task from 1 to 10: ");
        int input = sc.nextInt();



        switch (input){
            case 1: System.out.print("Enter house number: ");
                double a = sc.nextInt();
                System.out.print("Enter amount of houses: ");
                double b = sc.nextInt();
                double x = oppositeHouse(a,b);
                System.out.print ("Opposite house number is "+x);
                break;
            case 2: System.out.print("Enter first name and last name\n");
                String a2  = sc.nextLine();
                a2 = sc.nextLine();
                System.out.print(""+nameShuffle(a2));
                break;
            case 3: System.out.print("Enter initial price: ");
                double price = sc.nextDouble();
                System.out.print("Enter discount: ");
                double discount = sc.nextDouble();
                double total = discount(price,discount);
                System.out.print ("Result is: "+total);
                break;
            case 4: System.out.print("Enter a number array: ");
                String a3 = sc.nextLine();
                a3 = sc.nextLine();
                System.out.print(""+differenceMaxMin(a3));
                break;
            case 5: System.out.print("Enter #1: ");
                int first = sc.nextInt();
                System.out.print("Enter #2: ");
                int second = sc.nextInt();
                System.out.print("Enter #3: ");
                int third = sc.nextInt();
                System.out.print(""+equal(first, second, third));
                break;
            case 6: System.out.print("Enter what you want to reverse: ");
                String reverse = sc.nextLine();
                reverse = sc.nextLine();
                System.out.print(""+reverse(reverse));
                break;
            case 7: System.out.print("Enter first programmers salary: ");
                int firstP = sc.nextInt();
                System.out.print("Enter second programmers salary: ");
                int secondP = sc.nextInt();
                System.out.print("Enter third programmers salary: ");
                int thirdP = sc.nextInt();
                System.out.print(""+programmers(firstP, secondP, thirdP));
                break;
            case 8: System.out.print("Enter a line: ");
                String xo = sc.nextLine();
                xo = sc.nextLine();
                System.out.print(""+getXO(xo));
                break;
            case 9: System.out.print("Enter a line: ");
                String bomb = sc.nextLine();
                bomb = sc.nextLine();
                System.out.print(""+bomb(bomb));
                break;
            case 10: System.out.print("Enter first line: ");
                String firstA = sc.nextLine();
                firstA = sc.nextLine();
                System.out.print("Enter second line: ");
                String secondA = sc.nextLine();
                System.out.print(""+sameAscii(firstA,secondA));
                break;
        }
    }
}
