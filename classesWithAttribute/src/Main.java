public class Main {

    public static void main(String[] args) {
    	// bir class sadece bir işi yapar bir metod sadece bir işi yapar SOLİD kurallarındaki S'den gelir.
		// S: single responsibility => asla elden bırakmıyoruz.
	    // refactoring yapınca kendiliğinden burayıda düzenledi.
		Product product = new Product(1, "Laptop","Asus Laptop",3000,2,"Siyah");

	    /*
	    böyle yazmak yerine constructor'dan set edebilriiz
	    bunlarıda kullanmak istiyorsak Product class'ına parametresiz Product'ı eklememiz gerek
		product.setId(1);
	    product.setName("ASUS Laptop");
	    product.setDescription("16 GB RAM");
	    product.setPrice(18000);
	    product.setStockAmount(3);
		*/
		// private olarak işaretlediğimiz için burada kullanamıyoruz
	    System.out.println(product.getName());
		System.out.println(product.getKod());

	    ProductManager productManager = new ProductManager();
	    productManager.Add(product);
/*
	    //ürüne yeni bir özellik eklediğimizi varsayalım zibilyon tane ürün için her birine teker teker o özelliği eklemek çok zor olacaktır
		// bunları engellemek için encapsulation'dan faydalanıyoruz

	    productManager.Add2(1,"","",2,2,);
		productManager.Add2(1,"","",2,2,);
		productManager.Add2(1,"","",2,2,);
		productManager.Add2(1,"","",2,2,);
		productManager.Add2(1,"","",2,2,);
*/
    }
}
