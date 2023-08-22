package Regex;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String args[]){  
        System.out.println(Pattern.matches("[amn]", "man")); 
        System.out.println(Pattern.matches("[amn]", "a"));
        System.out.println(Pattern.matches("[amn]", "ammmna"));

        System.out.println(Pattern.matches(".s", "as"));  
        System.out.println(Pattern.matches("m.", "mk"));  
        System.out.println(Pattern.matches(".s.", "mst"));  
        System.out.println(Pattern.matches(".s", "amms"));
    }}  
    

