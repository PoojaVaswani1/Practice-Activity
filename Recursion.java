

public class Recursion {       
       
    public static void print(int a[],int n){
         int count =0;
        if(count == n){
            return;
        }
        a[count]= count + 1;
        count++;
        print(a,n);
    }

 public static int[] printNos(int n) {

    

    int a[]=new int[n];

    print(a,n);

    return a;

}

}