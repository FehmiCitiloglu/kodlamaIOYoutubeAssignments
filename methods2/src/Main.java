public class Main {

    public static void main(String[] args) {
        //bir diğer çalışma ise bir şeyi return eden fonksiyonlar
        String mesaj = "Bugün hava çok güzel.";
        // String yeniMesaj = mesaj.substring(0,2); // substring bir şey oluşturdu ve bize onu sonuç olarak veriyor ama void bize sonuç olarak hiçbir şey vermez
        String yeniMesaj = sehirVer();// sehirVer string döndürdüğü için hiç bir hata vermiyor
        int sayi = topla(5, 7);
        System.out.println(sayi);
        // String yenimesaj = ekle(); //  incompatible type hatası veriyor
        System.out.println(yeniMesaj);
        int toplam = topla2(2, 3, 5, 6, 1, 8, 10, 5); // arka planda bu sayıları diziye çeviriyor
    }

    // operasyon method fonksiyon hepsi aynı anlama geliyor
    // void operasyon emir kipi gibi, bir şey yapmasını istiyoruz aşağıdakiler void operasyonlar
    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    // ekranda çıktı yazması onun bir şey döndürdüğü anlamına gelmiyor
    // değer döndüren operasyon:
    public static int topla(int sayi1, int sayi2) { // burada sadece iki adet için izin veriliyor
        // daha fazla argument için varieble arguments kullanılıyor
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) { // ...'ya variable arguments deniyor istediğimiz kadar parametre giremizi sağlıyor
        // bizim için int array gibi çalışıyor
        // tercih edilmeme nedeni => int yerine obje gönderildiğinde tes edilebilirliği zayıflıyor bu tip yapıların
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    // veya
    public static String sehirVer() {
        return "Ankara";
    }
}
