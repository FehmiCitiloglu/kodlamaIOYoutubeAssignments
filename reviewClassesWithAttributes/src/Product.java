public class Product {
    // constructor
    public Product(int id ,String name, String description, double price, int stockAmount, String renk) {
        System.out.println("Yapıcı blok çalıştı.");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }
    // overloading
    public Product(){

    }

    // atribute | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod; // private genelde kullanılmaz ama gösterilmemesi gereken mesela ürüne özel bir kod oluşturmak gibi durumlarda kullanılmalıdır

    // getter
    public int getId() { // readonly
        return id;
    }

    // setter
    public void setId(int id) {
        id = id; // this içinde bulunduğumuz class demek
        // alt cizgi ile olanlar field
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

}
