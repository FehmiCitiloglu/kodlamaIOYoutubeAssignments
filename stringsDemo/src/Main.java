import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String message = "Bugün hava çok güzel";// aslında bu bir char array dir

	    System.out.println(message);


	   /* System.out.println("Elemna sayısı: " + message.length());
	    System.out.println("5. eleman: " + message.charAt(4));

	    System.out.println(message.concat(". Yaşasın! ")); // aslına dokunmuyor sadece bu kod icinde ekliyor. yani yeni bir string oluşturuyor bunu daha sonra kullanmak istersek bir değişkene atamamız gerekiyor.

        System.out.println(message.startsWith("B")); // boolean döndürüyor
        System.out.println(message.endsWith("l")); // boolean döndürüyor


        char[] charcters = new char[5];
        message.getChars(0,5, charcters, 0); // void döndürecek yani bir şey döndürmüyormuş
        *//*
        * getChars 4 ü dahil etmiyor ondan "Bugü" diye döndürdü
        * *//*
        System.out.println(charcters);

        // çok kullanılan bir fonksiyon
        System.out.println(message.indexOf("ok"));// int de alabilir char da
        //ilk bulduğunu veriyor
        System.out.println(message.lastIndexOf("ü")); // aramaya sağdan başlıyor sadece string alıyor*/

        System.out.println(message.replace(" ", "-"));// replace = değiştirme : aslını değiştirmiyor kullanmak icin yeni bir değişkene atamamız gerekiyor.
        // String fonksiyonların hemen hemen tamamı metnin kendisini değiştirmez

        String newMessage = message.replace(" ", "-");
        System.out.println(message);
        System.out.println(newMessage);
        //Yine Çok kullanılan bir metod substring
        String substringMessage = message.substring(2); // 2. indexinden itibaren parçala diyoruz
        System.out.println(substringMessage);
        // substring'in ikinci bir kullanımı istediğimiz indexe kadar kesmesini istersek
        substringMessage = message.substring(2,4); // 2.den 4.üncü indekse kadar (4 dahil değil)
        System.out.println(substringMessage);

        // split: belli bir karater yada karkter dizisini baz alarak metni ayırmaya yarar.

        for (String word: message.split(" ")) {
            System.out.println(word);
        }

        // toLowerCase
        System.out.println(message.toLowerCase());
        // toUpperCase
        System.out.println(message.toUpperCase());
        /*
        * son ikisini(toUpperCase, toLowerCase) genellikle database de arama yaparken kulanıyoruz
        * replace ile falanda ü leri u ya falan çevirebiliyoruz
        * */

        // trim: cümlenin başındaki ve sonundaki boşlukları silme
        String meesageWithSpace = "          Bu gün hava Ne gadağ da güze            ";
        System.out.println(meesageWithSpace);
        System.out.println(meesageWithSpace.trim());
    }

}
