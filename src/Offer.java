public class Offer {
    Product product1;
    double price1;
    boolean special1;
     Offer(Product product, double price, boolean special){
         product1=product;
         price1=price;
         special1=special;
     }

     void ShowInfo (){
         System.out.println("Nazwa produktu to : " + product1.productName);
         System.out.println("Producent : " + product1.productProducer);
         System.out.println("cean produktu to : " + price1 + " zł");
         System.out.println("Czy produkt jest w ofercie specjalnej : " + special1);
     }
}
