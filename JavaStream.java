import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

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
public class JavaStream {
  public static void main(String[] args) {
    //usually i did this and added the product into list ...
    //Product  product = new Product(0, null, 0);
    List<Product> productList = new ArrayList<Product>();
    //reduced code.... new method..
    productList.add(new Product(12, "Laptop", 10000));
    productList.add(new Product(13, "Laptop2", 20000));
    productList.add(new Product(16, "Laptop3", 30000));
    productList.add(new Product(18, "Laptop4", 40000));

    List<Float> productList2 =productList.stream()
    .filter(p ->p.price> 20000) // filtering data  
    .map(p ->p.price)  //fetching
    .collect(Collectors.toList());  //collecting as list
    System.out.println(productList2);  
  }  
}
