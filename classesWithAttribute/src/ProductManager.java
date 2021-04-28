public class ProductManager {
    public void Add(Product product){
        // JDBC kodları ile veri tabanına ekleniyor
        System.out.println("Ürün eklendi: " + product.getName());
    }
    // Encapsulation
    public void Add2(int id, String name, String describtion, int stockAmount, double price){

    }
}
