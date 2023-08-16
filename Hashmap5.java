import java.util.HashMap;
import java.util.Map;

//find the highest frequency of a character in a given string
public class Hashmap5 {
    public  void frequency(String input){
    HashMap  <Character,Integer > hashMap = new HashMap<>();
        char[] inputChar = input.toCharArray();
        int count=0;
        for(char ch: inputChar){
           
            if(hashMap.containsKey(ch)){
                hashMap.put(ch,hashMap.get(ch)+1);
            }else{
                hashMap.put(ch,1);
            }
        } ;
        for(Map.Entry<Character,Integer> entry :hashMap.entrySet()){
            if(entry.getValue()>=1){
                System.out.println(entry.getKey()+","+entry.getValue());
            }
        }
}
    public static void main(String[] args) {
        String input="ahsgssj";
        Hashmap5 hashmap5 = new Hashmap5();
        hashmap5.frequency(input);
        };
    }
