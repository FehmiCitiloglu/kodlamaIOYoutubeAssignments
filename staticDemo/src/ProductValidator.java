// temel class'a static ekleyemeyiz anca inner class'lara static ekleyebiliriz
public class ProductValidator {
    // new'lerken işimiz bittiğinde bellekten atılıyordu anacak static metodta uygulama sıfırlanana kadar atılmıyor
    // ilk çağıran kullanıcı nesneyi oluşturuyor ve daha sonraki bütün kullanıcılar o nesneyi kullanıyor demek static yaptığımız zaman

    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }

    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){ // ! işareti değilse anlamında
            return true;
        }else  {
            return false;
        }
    }

    public void bisey(){
        // productvalidator'ü yenilemeden bunu görmeyiz bunu görebilmemiz icin
    }
    // aşağıdaki bir inner class ve bu class'ı static kullanabilmek icin class'ın kendisine static eklememeiz gerekli
    public static class BaskaBirSey{ // <= inner class
        public static void sil(){

        }
    }

}
