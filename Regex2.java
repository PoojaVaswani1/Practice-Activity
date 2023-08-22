package Regex;

import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String args[]){  
        System.out.println("? quantifier -occurs once or not at all");  
        System.out.println(Pattern.matches("[amn]?", "a")); 
        System.out.println(Pattern.matches("[amn]?", "aaa"));
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//a,m,n>>1  
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//a>>1  
        System.out.println(Pattern.matches("[amn]?", "amn"));//a or m or n came one time
          
        System.out.println("+ quantifier .occurs one or more time ");  
        System.out.println(Pattern.matches("[amn]+", "a"));
        System.out.println(Pattern.matches("[amn]+", "aaa"));
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//a ,m,n>>1  
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//z and t are not matching pattern 
          
        
          
        }}  

