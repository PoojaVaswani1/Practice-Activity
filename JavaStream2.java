import java.util.ArrayList;
import java.util.List;

class Product{
        int id;
        String name;
        float price;
      
        public Product(int id,String name,float price){
          this.id = id;
          this.name = name;
          this.price = price;
        }
      }
      public class JavaStream2 {
        public static void main(String[] args) {
          
          List<Product> productList = new ArrayList<Product>();
          //reduced code.... new method..
          productList.add(new Product(12, "Laptop", 10000));
          productList.add(new Product(13, "Laptop2", 20000));
          productList.add(new Product(16, "Laptop3", 30000));
          productList.add(new Product(18, "Laptop4", 40000));
      
          productList.stream()
          .filter(p ->p.price> 20000) 
          .forEach(p -> System.out.println(p.name));  
           
        }  
      }  

