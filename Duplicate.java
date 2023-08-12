import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
 
n=sc.nextInt();  
 
int[] array = new int[30];  
int count = 1;
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
for(int j =0; j<n;j++){
    for(int k =j+1;k<n;k++){
        if(array[j]==array[k]){
             count++;
        }
        else{
            count = 1;
        }
        
    }
    if(count>1){
        System.out.println(array[j]+ " " +count);
    }
}
    sc.close();
    }
}
