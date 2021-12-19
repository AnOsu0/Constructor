public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Czekolada mleczna","Milka");
        Offer offer1 = new Offer(product1, 7.99,true);
        offer1.ShowInfo();
        Offer offer2 = new Offer (new Product("Sok owowcowy","Kubuś"),2.99,false);
        offer2.ShowInfo();
    }
}
