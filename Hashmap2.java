import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {
    public int fourSum(int[]A, int[]B, int[]C , int[] D){
       Map<Integer,Integer> map = new HashMap<>();
      int count =0;
        for(int i=0;i<A.length;i++){
            for( int j=i;j<B.length;j++){
                    int SumAB = A[i]+B[j];
                    //if value is present in start it will have 0 value for map.getOrDefault(SumAB, 0),
                    //as this method returns value associated with key ..
                    map.put(SumAB, map.getOrDefault(SumAB, 0)+1);
                        
                    }
                }
                for(int  k=0;k<C.length;k++){
                    for( int l=k; l<D.length;l++){
                        int SumCD = C[k]+D[l];
                        count= count + map.getOrDefault(SumCD, 0);
            
                    }
                }
            
        
        return count ;
    }
    public static void main(String[] args) {
        Hashmap2 hashmap = new Hashmap2();
        
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};

        int result = hashmap.fourSum(A, B, C, D);
        System.out.println("Number of tuples: " + result);
        
        
 }
}
