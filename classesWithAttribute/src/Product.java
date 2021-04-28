public class Product {

    public Product(int id, String name, String description, double price, int stockAmount, String color){ // class ile aynı isim olması lazım
        // yapıcı metod deniyor bu constructor'a
        System.out.println("Yapıcı blok çalıştı.");
        // parametreleri kullanmazsak hata veriyor
        this.id = id;
        this.name = name;
        this.color = color;
        this.stockAmount = stockAmount;
        this.price = price;
        this.description = description;
    }
    //overloading
    public Product(){
        // bu da çalışır yukarıdaki de
    }
    // bunlar default olarak public olarak oluşturuluyor
    // eğer private olarka işaretlersek sadece tanımlandığı blokta geçerlidir demek
    private int id;
    private String name; // Refactor > Encapsulate fields ile get ile set i otomatik oluşturuyoruz
    private String description;
    private double price;
    private int stockAmount;
    private String color;
    /* public genelde pek kullanılmaz ancak mesela ürüne ait bir kod oluşturmak istiyoruz bunu sadece sistemin bulmasını kullanıcının
         erişememesini istiyoruz , bu yüzden kodu read only yapıyoruz bunun içinde getter ve setter konularına giriş yapılıyor.
    */
    private String kod;

    // getter
    public int getId() {
        return id; // bu şekilde id'yi yazaman ama okuyabilir demek
    }

    // setter => yazmak zorunda değiliz ama genelde getter ile beraber kullanılıyor
    // bir değer döndürmesine gerek olmadığı için void kullanıyoruz
    public void setId(int id) { // set edilecek değer parametre olarak verilmeli
        //this.id = id; // this bizim içerisinde bulunduğumuz class demek yani yukarıdaki id'yi burada da kullanmak için yazılıyor
        id = id; // genellikle bu şekilde kullanılacak. _ ile kullanılanlar field
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

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
