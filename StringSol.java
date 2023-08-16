import java.util.Scanner;
//Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
public class StringSol {

    public static String getSmallestAndLargest(String s, int k) {
       
        int i,j;
        String result = "";
        int length = s.length();
        java.util.ArrayList <String> list = new java.util.ArrayList();
        //ArrayList<String> list = new Arraylist();
        for(i=0;i< length-k+1;i++){
            
                list.add(s.substring(i, k+i)); 
             
        }
        java.util.Collections.sort(list);;
         String smallest = list.get(0);
        String largest = list.get(list.size()-1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}