public class Main {

    public static void main(String[] args) {
 /*
        for (int i = 2; i < 20; i++) {
            for (int j = 2; j < 15; j++) {
                if(i % j != 0){
                    System.out.println(j + " " + i );
                }
            }
        }
        becerilemedi
  */
        int number = 13;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime = true;
/*
        for (int i = 2; i < (number + 1); i++) {
            if (number % i == 0) {
                System.out.println(number + " asal değildir");
            }
        }
        yine başaramadık
 */
        if(number <= 1 ) {
            System.out.println("Geçersiz sayı");
        }
        for (int i = 2; i < number; i++) {
            if (number % i != 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + " asaldır");
        } else {
            System.out.println(number + " asal değildir");
        }
    }
}
