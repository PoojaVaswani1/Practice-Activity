package Set;

/*
Adding elements
Accessing elements
Removing elements
Iterating elements
Iterating through Set
*/

import java.util.*;

public class setEample5 {
	// Main driver method
    public static void main(String[] args)
    {
    	
        Set<String> hs = new HashSet<String>();
  
        hs.add("B");
        hs.add("B");
        hs.add("C");
        hs.add("A");
  
        System.out.println(hs);
        
        Set<String> hs1 = new HashSet<String>();
  
        hs1.add("A");
        hs1.add("B");
        hs1.add("C");
        hs1.add("A");
  
        System.out.println("Set is " + hs1);
  
        String check = "D";
  
        System.out.println("Contains " + check + " "
                           + hs1.contains(check));
        
        
        Set<String> hs11 = new HashSet<String>();
        hs11.add("A");
        hs11.add("B");
        hs11.add("C");
        hs11.add("B");
        hs11.add("D");
        hs11.add("E");
  
        System.out.println("Initial HashSet " + hs11);
  
        hs11.remove("B");
  
        System.out.println("After removing element " + hs11);
        
        Set<String> s = new HashSet<String>();
  
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("B");
        s.add("D");
        s.add("E");
  
       
        for (String value : s)
  
            System.out.print(value + ", ");
          
        System.out.println();
        
        
        




    }
	

}

