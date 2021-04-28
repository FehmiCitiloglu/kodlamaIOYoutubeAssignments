public class Main {

    public static void main(String[] args) {
        // javada direk main kodu çalışır ve mainden dallanır
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }
    public static void sayiBulmaca() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int wanted = 10;

        boolean isIn = false;

        for (int number: numbers) {
            if(number == wanted){
                isIn = true;
                break;
            }
        }
        if (isIn){
            mesajVer("Sayı mevcuttur: " + wanted);
        }else {
            mesajVer("Sayı mevcut değildir: " + wanted);
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println("Sayı mevcuttur: " + wanted ); // diğer metodların içindeki değişkenlere ulaşamıyor ancak parametre olarak gönderebiliriz
    }
}}
