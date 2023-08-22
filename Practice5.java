import java.util.Scanner;

public class Practice5 {
    public int maximum(int a ,int b){
     if(a>b){
        return a;
     }  else {
        return b;}
    }
    public void swap(int a, int b){
        int c=0;
        c=b;
        b=a;
        a=c;
        System.out.println(a +" "+b);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        Practice5 practice = new Practice5();
        
        switch(no){
            case 1:
           int result = practice.maximum(a, b);
            System.out.println(result);
            break;
        case 2:
            practice.swap(a, b);
        break;    
    }
}
}