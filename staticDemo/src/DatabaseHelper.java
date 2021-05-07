public class DatabaseHelper {
    // bu kullanım mümkün ancak önerilmiyor çünkü SOLİD ilkelerinin single responsibility maddesine aykırı
    // yani burada tek bir class tek bir işi yapmıyor birden fazla işe kayıyor ve bu da kodu spagetti olma yolunda ilerletiyor
    // inner classlar sektörde de yaygın olarak kullanılmıyor.

    public static class Crud{ // <= create read update delete in baş harflerindne oluşmuştur
        public static void delete(){}
        public static void update(){}
    }
    public static class Connection {
        public static void createConnection(){}
    }
}
