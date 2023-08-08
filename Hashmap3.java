//array of integers and an integer k,find the total number of continuous subarrays (sublists) whose sum equals k.
public class Hashmap3 {
    public int[] Subarray(int[]A,int k){
        
        while(A.length >=0){
            for(int i=0;i<A.length;i++){
            int sum=0;
                for(int j=i;j<A.length;j++){
                     sum += A[j];
                    if(sum == k){
                     return new int[]{A[i],+A[j]};
                       
                    } 
                }
            }
           

        }
        return new int[0] ;
    }
    public static void main(String[] args) {
        Hashmap3 hashmap3 = new Hashmap3();
        int[] A = {1, 2, 3, 4, 1, 2};
       int  k = 5;
      int[]result = hashmap3.Subarray(A, k);
       System.out.println(+result[0]+","+result[1]);
    }
}
