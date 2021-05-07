public class Main {

    public static void main(String[] args) {
	    Product product = new Product(2, "Phone", "iPhone",12000,10,"black");
		Product product2 = new Product();
	    product2.setName("Laptop");
	    product2.setId(1);
	    product2.setDescription("Asus Laptop");
	    product2.setPrice(5000);
	    product2.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getKod());
		/*
		productManager.Add2(1, "","",2,200);
		productManager.Add2(1, "","",2,200);
		productManager.Add2(1, "","",2,200);
		productManager.Add2(1, "","",2,200);
*/
    }
}
