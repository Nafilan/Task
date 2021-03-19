import  java.lang.Math.*;
import java.util.Locale;
import  java.util.Scanner ;
import  java.sql.*;

import static java.lang.Math.max;
import static java.lang.Math.sqrt;

public class threesix {
    public static String millionsRounding(String a, String b){//1
        double number = Double.parseDouble(b);
        number = Math.round(number/1000000)*1000000;
        return ("["+a+", "+number+"]");
    }

    public static Double[] otherSides(int a){//2
        double Long =0;
        double Short =0;
        Long = a*2;
        Short = a*sqrt(3);
        Short = Math.round(Short*100.0)/100.0;
        Double[] arry = new Double[2];
        arry[0] = Long;
        arry[1] = Short;

        return arry;
    }

    public static String rps(String a, String b){//3
        String wincon1 = "TIE";
        String wincon2 = "Player 1 wins !";
        String wincon3 = "Player 2 wins !";
        String result = "";
        if (a.toLowerCase(Locale.ROOT).equals("scissors") ){//big 1/3
            if (b.toLowerCase(Locale.ROOT).equals("scissors")){// 1/3
                result = wincon1;
            }
            else if (b.toLowerCase(Locale.ROOT).equals("paper")){// 2/3
                result = wincon2;
            }
            else if (b.toLowerCase(Locale.ROOT).equals("rock")) { // 3/3
                result = wincon3;
            }
        }
        else if (a.toLowerCase(Locale.ROOT).equals("paper")){//big 2/3
            if (b.toLowerCase(Locale.ROOT).equals("scissors")){// 1/3
                result = wincon3;
            }
            else if (b.toLowerCase(Locale.ROOT).equals("paper")){// 2/3
                result = wincon1;
            }
            else if (b.toLowerCase(Locale.ROOT).equals("rock")) {// 3/3
                result = wincon2;
            }
        }
        else if (a.toLowerCase(Locale.ROOT).equals("rock")){//big 3/3
            if (b.toLowerCase(Locale.ROOT).equals("scissors")){// 1/3
                result = wincon2;
            }
            else if (b.toLowerCase(Locale.ROOT).equals("rock")){// 2/3
                result = wincon1;
            }
            else if (b.toLowerCase(Locale.ROOT).equals("paper")) {// 3/3
                result = wincon3;
            }
        }
        return result;
    }

    public static int warOfNumbers(String a){//4
        String [] value = a.split(", ");
        int [] arr = new int[a.length()];
        int even = 0;
        int odd = 0;
        int result = 0;
        for (int i=0; i< value.length; i++){
            arr[i]  = Integer.parseInt(value[i]);
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i]%2==0){
                even += arr[i];
            }
            else odd += arr[i];
        }
        result = Math.abs(even-odd);
        return result;
    }

    public static String reverseCase(String a) {//5
        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    public static String inatorInator(String a){//6
        int num = a.length();
        String result = "";
        for(int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { result=(""+a+"-inator"); }
            else if((ch >= 'a'&& ch <= 'z')) {
                result=(""+a+"inator");
            }
        }
        return (""+result+" "+num+"000");
    }

    public static boolean doesBrickFit(String arry){
        String [] value = arry.split(", ");
        int [] arr = new int[arry.length()];
        for (int i=0; i< value.length; i++){
            arr[i]  = Integer.parseInt(value[i]);
        }
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int w = arr[3];
        int h = arr[4];
        if ((a*b==w*h)||(c*b==w*h)||(a*c==w*h)){
            return true;
        }
        else return false;
    }

    public static Double totalDistance(String a){
        String [] value = a.split(", ");
        Double [] arr = new Double[a.length()-1];
        for (int i=0; i< value.length-1; i++){
            arr[i]  = Double.parseDouble(value[i]);
        }
        Double liter = arr[0];
        Double consumption = arr[1];
        Double result = 0.0;
        Double pass = arr[2];
        Double cond = 1.0;
        if (value[3].equals("true")) {
            cond = 1.1;
        }
        result = (liter/((consumption*(1+(pass*0.05)))*cond))*100;
        result = Math.round(result*100.0)/100.0;
        return result;
    }

    public static Double mean(String a){
        String [] value = a.split(", ");
        Double [] arr = new Double[a.length()];
        Double mean = 0.0;
        for (int i=0; i< value.length; i++){
            arr[i]  = Double.parseDouble(value[i]);
        }
        for (int i=0; i<value.length; i++){
            mean += arr[i];
        }
        Double result = 0.0;
        result = mean/value.length;
        return Math.round(result*100.0)/100.0;
    }

    public static boolean parityAnalysis(String a){
        String [] value = a.split("");
        Double [] arr = new Double[a.length()];
        for (int i=0; i< value.length; i++){
            arr[i]  = Double.parseDouble(value[i]);
        }
        Double fullNumber = Double.parseDouble(a);
        Double sumNumber = 0.0;
        for (int i=0; i<value.length; i++){
            sumNumber += arr[i];
        }
        if (fullNumber%2==0){//if even
            if (sumNumber%2==0) {//if even
                return true;
            }
            else return false;//if odd
        }
        else {//if odd
            if (sumNumber%2==0) {//if even
                return false;
            }
            else return true;//if odd
        }

    }

    public static void main(String[] args){
        System.out.print("Choice a task from 1 to 10: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1: System.out.print("Enter City: ");
                String city = sc.nextLine();
                city = sc.nextLine();
                System.out.print("Enter population: ");
                String pop = sc.nextLine();
                System.out.print(""+millionsRounding(city,pop));
                break;
            case 2: System.out.print("Enter shortest side: ");
                Integer arr = sc.nextInt();
                Double[] arry = otherSides(arr);
                System.out.print("[" + arry[0] + ", " + arry[1] + "] ");
                break;
            case 3: System.out.print("Player #1: ");
                String p1 = sc.nextLine();
                p1 = sc.nextLine();
                System.out.print("Player #2: ");
                String p2 =sc.nextLine();
                System.out.print(""+rps(p1,p2));
                break;
            case 4: System.out.print("Enter numbers at war: ");
                String numbersAtWar = sc.nextLine();
                numbersAtWar =sc.nextLine();
                System.out.print(""+warOfNumbers(numbersAtWar));
                break;
            case 5: System.out.print("Enter text to reverseCase: ");
                String reverseCase = sc.nextLine();
                reverseCase = sc.nextLine();
                System.out.print(""+reverseCase(reverseCase));
                break;
            case 6: System.out.print("Enter text: ");
                String inate = sc.nextLine();
                inate = sc.nextLine();
                System.out.print(""+inatorInator(inate));
                break;
            case 7: System.out.print("Enter bricks parameters and hole parameters: ");
                String brick = sc.nextLine();
                brick = sc.nextLine();
                System.out.print(""+doesBrickFit(brick));
                break;
            case 8: System.out.print("Enter fill, consumption, amount of passengers, true/false for conditioner: ");
                String car = sc.nextLine();
                car = sc.nextLine();
                System.out.print(""+totalDistance(car));
                break;
            case 9: System.out.print("Enter an array of numbers: ");
                String mean = sc.nextLine();
                mean = sc.nextLine();
                System.out.print(""+mean(mean));
                break;
            case 10: System.out.print("Enter a number: ");
                String num = sc.nextLine();
                num = sc.nextLine();
                System.out.print(""+parityAnalysis(num));
                break;
        }

    }

}
