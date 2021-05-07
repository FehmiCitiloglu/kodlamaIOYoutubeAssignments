public class ProductManager {
    public void add(Product product){

        //ProductValidator validator = new ProductValidator();


        if(ProductValidator.isValid(product)) { // araç amacıyla kullanacağımız yapılarda staticlerden faydalanıyoruz

            System.out.println("Eklendi.");
        } else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }
//        ProductValidator productValidator = new ProductValidator();
//        productValidator.bisey();
    }
}
