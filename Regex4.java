package Regex;

import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String args[]){  
         
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949")); 
        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389497")); 
        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949")); 
        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));  
          
        System.out.println("by metacharacters ...");// d means digit D- means non digit  
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));  
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));  
          
}
}
