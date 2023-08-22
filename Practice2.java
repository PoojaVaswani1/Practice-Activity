public class Practice2 {
   
        public static int dataTypes(String type) {
    // Write your code here
    if (type.equals("Float")|| type.equals("Integer")){
       return 4;
    }else if (type.equals("Long")|| type.equals("Double")){
       return 8;
    }else
    return 1;
}
public static void main(String[] args) {
    Practice2 practice = new Practice2();
    int result = practice.dataTypes("Float");
    System.out.println(result);
}
} 

