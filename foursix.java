import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class foursix {

    public static String sevenBoom(String a) {//1
        String[] value = a.split(", ");
        String result = "there is no 7 in the array";
        for (int i = 0; i < value.length; i++) {
            if (value[i].contains("7")) {
                result = "Boom!";
            }

        }
        return result;
    }

    public static boolean cons(String a){// 2
        String [] value = a.split(", ");
        int [] arr = new int[value.length];
        boolean result = false;
        for (int i=0; i< value.length; i++){
            arr[i]  = Integer.parseInt(value[i]);
        }
        Arrays.sort(arr);
        for (int i=1; i < value.length; i++){
            if(arr[i]-1==arr[i-1]){
                result = true;
            }
            else    result = false;
        }

        return result;
    }

    public static String unMix(String a){//3
        String [] value = a.split("");
        ArrayList <String>  arr = new ArrayList<String>();

        for (int i=0; i< value.length; i++){
            arr.add(value[i]);
        }
        String parser = "";
        String parser1 = "";
        String result = "";
        if (value.length%2!=0) {
            arr.add(arr.get(value.length-1));
        }
        for (int i=0; i< value.length; i=i+2){
            parser = arr.get(i);
            parser1 = arr.get(i+1);
            arr.set(i+1,parser);
            arr.set(i,parser1);
        }
        for (int i=0; i< value.length; i++){
            result+=(""+arr.get(i)+" ");
        }


        return result;
    }

    public static String noYelling(String a){//4
        String [] value = a.split("");
        String result = "";
        for (int i= value.length-1; i > 0 ; i--) {
            if (value[i].equals(value[i - 1])) {
                value[i] = "";
            }
            else break;
        }
        for (int i=0; i< value.length; i++){
                result+=(value[i]);
        }

        return result;
    }

    public static String xPronouce(String a){//5
        String [] value = a.split("");
        String result = "";
        for (int i = 0; i < value.length; i++){
            if(value[i].equals("x")){
                if (value[i - 1].equals(" ")&&value[i+1].equals(" ")) {
                    value[i]="ecks";
                }
                else if (value[i - 1].equals(" ")){
                    value[i]="z";
                }
                else {
                    value[i]="cks";
                }
            }
        }
        for (int i=0; i< value.length; i++){
            result+=(value[i]);
        }
        return result;
    }

    public static int largestGap(String a){//6
        String [] value = a.split(", ");
        int result = 0;
        int gap = 0;
        int max = 0;
        int [] arr = new int[value.length];
        for (int i=0; i< value.length; i++){
            arr[i]  = Integer.parseInt(value[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < value.length; i++){
                gap = arr[i] - result;
                result = arr[i];
            if (max<gap) {
                max = gap;
            }
        }
        return max;
    }

    public static int code(int a){//7

        return a;
    }

    public static String commonLastVowel(String a){//8
        String [] value = a.split("");
        String result = "";
        for (int i= value.length-1; i > 0 ; i--) {
            if (value[i].toLowerCase(Locale.ROOT).equals("a")||value[i].toLowerCase(Locale.ROOT).equals("o")||value[i].toLowerCase(Locale.ROOT).equals("i")
                    ||value[i].toLowerCase(Locale.ROOT).equals("e")||value[i].toLowerCase(Locale.ROOT).equals("u")) {
                result = value[i].toLowerCase(Locale.ROOT);
                break;
            }

        }

        return result;
    }

    public static String memeSum(String a, String b){//9
        String [] value1 = a.split("");
        String [] value2 = b.split("");
        ArrayList <String>  arr1 = new ArrayList<String>();
        for (int i=0; i< value1.length; i++){
            arr1.add(value1[i]);
        }//first number
        ArrayList <String>  arr2 = new ArrayList<String>();
        for (int i=0; i< value2.length; i++){
            arr2.add(value2[i]);
        }//second number
        String result = "";
        int max = a.length();
        if (value1.length> value2.length){
            arr2.set(0,"0");
            for (int i=0; i<= value2.length -2; i++){
                arr2.set(i+1,value2[i]);
            }
            arr2.add(value2[value2.length-1]);
            max = value1.length;
        }
        else if(value1.length< value2.length) {
            arr1.set(0,"0");
            for (int i=0; i<= value1.length -2; i++){
                arr1.set(i+1,value1[i]);
            }
            arr1.add(value1[value1.length-1]);
        max = value2.length;}

        int[] arrr1 = new int[max];
        int[] arrr2 = new int[max];
        for (int i = 0; i< max; i++){
            arrr1[i]  = Integer.parseInt(arr1.get(i));
        }
        for (int i=0; i< max; i++){
            arrr2[i]  = Integer.parseInt(arr2.get(i));
        }

        for (int i = 0; i<max ; i++ ){
            result +=arrr1[i]+arrr2[i];
        }
        return result;

    }

    public static String unRepeated(String a){//10
        String [] value = a.split("");
        String result = "";
        for (int i= value.length-1; i > 0 ; i--) {
            for (int k= 0; k < i ; k++) {
            if (value[i].equals(value[k])) {
                value[i] = "";
                break;
            }

        }
        }
        for (int i=0; i< value.length; i++){
            result+=(value[i]);
        }

        return result;
    }

    public static void main(String[] args){
        System.out.print("Choice a task from 1 to 10: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.print("Enter an array of numbers: ");
                String seven = sc.nextLine();
                seven = sc.nextLine();
                System.out.print("" + sevenBoom(seven));
                break;
            case 2:
                System.out.print("Enter an array of numbers: ");
                String cons = sc.nextLine();
                cons = sc.nextLine();
                System.out.print("" + cons(cons));
                break;
            case 3:
                System.out.print("Enter a sentence to unMix: ");
                String unMix = sc.nextLine();
                unMix = sc.nextLine();
                System.out.print("" + unMix(unMix));
                break;
            case 4:
                System.out.print("Enter a sentence: ");
                String noYell = sc.nextLine();
                noYell = sc.nextLine();
                System.out.print("" + noYelling(noYell));
                break;
            case 5:
                System.out.print("Enter a sentence with x: ");
                String x = sc.nextLine();
                x = sc.nextLine();
                System.out.print("" + xPronouce(x));
                break;
            case 6:
                System.out.print("Enter numbers to sort and find the largest gap: ");
                String gap = sc.nextLine();
                gap = sc.nextLine();
                System.out.print("" + largestGap(gap));
                break;
            case 7:
                System.out.print("Enter numbers to sort and find the largest gap: ");
                String code = sc.nextLine();
                code = sc.nextLine();
                System.out.print("" + largestGap(code));
                break;
            case 8:
                System.out.print("Enter a sentence: ");
                String vowel = sc.nextLine();
                vowel = sc.nextLine();
                System.out.print("" + commonLastVowel(vowel));
                break;
            case 9:
                System.out.print("Enter first number to add: ");
                String num1 = sc.nextLine();
                num1 = sc.nextLine();
                System.out.print("Enter second number to add: ");
                String num2 = sc.nextLine();
                System.out.print("" + memeSum(num1,num2));
                break;
            case 10:
                System.out.print("Enter a sentence: ");
                String noRep = sc.nextLine();
                noRep = sc.nextLine();
                System.out.print("" + unRepeated(noRep));
                break;
        }
    }

}
