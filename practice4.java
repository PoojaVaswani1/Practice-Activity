import java.util.ArrayList;
import java.util.Scanner;

public class practice4 {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//int size = String.valueOf(n).length();
        int sum =0;
        int sum1 =0;
		while(n>0){
           int last = n%10;
            if(last %2==0){
                sum += last;
            }else {
                sum1 += last;
            }
            n= n/10;
        }
        ArrayList <Integer> list = new ArrayList<>();
        list.add(sum);
        list.add(sum1);
        
        
            System.out.println(list.get(0) + " " +list.get(1));
            
        
	}
}
