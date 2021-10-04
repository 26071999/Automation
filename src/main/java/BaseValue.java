import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaseValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Character,Integer>value=new HashMap<>();
        value.put('A',10);
        value.put('B',11);
        value.put('C',12);
        value.put('D',13);
        value.put('E',14);
        value.put('F',15);
        value.put('G',16);
        String input=sc.nextLine();
        getBaseValue(value,input);
        System.out.println("Hello Prakash");
    }

    private static void getBaseValue(Map<Character, Integer> value, String input) {
        int baseValue=0;
        int k=0;
        for(int i=input.length()-1;i>=0;i--){
           if(input.charAt(i)>='A'&&input.charAt(i)<='Z'||input.charAt(i)>='a'&&input.charAt(i)<='z') {
               baseValue += (value.get(input.charAt(i)) * (int) (Math.pow(17, k++)));
           }
           else {
               baseValue+=(input.charAt(i)-'0')*(int)(Math.pow(17,k++));
           }
        }

    }
}
