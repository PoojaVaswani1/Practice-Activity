import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("string1");
        String st1 =sc.next();
        System.out.println("string2");
        String st2 =sc.next();

        if(st1.length()==st2.length()){
            char[] string1 = st1.toCharArray();
            char[] string2 = st2.toCharArray();
            
            Arrays.sort(string1);
            Arrays.sort(string2);

            if(Arrays.equals(string1, string2)){
                System.out.println("anagrams");
            }
            else{
                System.out.println("not anagram");
            }


        }
        else
        {
            System.out.println("not anagram");
        }
        sc.close();
    }
}
