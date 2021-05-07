import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
	ProductManager manager = new ProductManager();
	Product product = new Product();
	product.id = 1;
	product.name = "";
	product.price = 15000;

	manager.add(product);

	DatabaseHelper.Crud.delete();
	DatabaseHelper.Connection.createConnection();

    }
}
