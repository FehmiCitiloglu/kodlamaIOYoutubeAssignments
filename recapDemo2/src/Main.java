public class Main {

    public static void main(String[] args) {
        // double[] myList = new double[4];
        // array oluşturmanın bir diğer yöntemi ise süslü parantez
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        // bu yazım tekniği arka planda bir new yazarak oluşturuyor yine


        double total = 0;
        /*
        for (double number : myListe) {
            total += number;
            System.out.println(number);
        }
        System.out.println("Toplam: " + total);
        */
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total += number;
            System.out.println(number);
        }
        System.out.println("Döngü bitti");
        System.out.println("Sayıların toplamı: " + total);
        System.out.println("En büyük sayı: " + max);
    }

}
