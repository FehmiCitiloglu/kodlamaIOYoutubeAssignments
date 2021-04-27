public class Main {

    public static void main(String[] args) {
	    String[][] sehirler = new String[3][3]; // ikici köşeli parantex ile stunlardan da oluşmasını sağlıyoruz
        /*
        * bir köşeli parantex ile satırdan oluşuyor ikinci köşeli parantex ile stunları da ekliyoruz
        * */

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        // System.out.println(sehirler); // hata verdi
        //nested loops: iç içe geçmiş döngüler
        for (int i = 0; i <=2 ; i++) {
            System.out.println("---------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
