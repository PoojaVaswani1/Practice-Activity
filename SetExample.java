package Set;

import java.util.Iterator;
import java.util.*;
public class SetExample {
    
    public static void main(String[] args)
    {
        
        HashSet<String> h = new HashSet<String>();
  
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
  
        h.add("India");
  
        for(String h1:h)
        {
        	System.out.println("element:"+h+"Hash number:"+h.hashCode());
        }
  
        
        h.remove("Australia");
        System.out.println("Set after removing "
                           + "Australia:" + h);
  
        System.out.println("Iterating over set:");
  
        // Iterating through iterators
        Iterator<String> i = h.iterator();
  
        while (i.hasNext())
  
            System.out.println(i.next());
    }

}


