public class Main {
    // class'lar ile operasyonları metodları grupluyoruz
    // classlar referans tiptir
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(); // CustomerManager türünde bir örnek oluşturuyoruz
        /*
            bellekte iki tane alan var biri steak biri heap customerManager'ı oluşturduğumuzda steak'te oluşuyor
        *   sağ kısımda new ile ise steak'te oluşan yerin karşılığını heapte oluşturuyoruz
        * */
        CustomerManager customerManager1 = new CustomerManager();
        /*
        * aşağıda customerManager'ın referans numarasını customerManager1'in referans numarasına atadık
        * yukarıda ki customerManager'ın karşısındaki new CustomerManager'ın soluklaşmasının sebebi artık kullanılmaması
        * customerManager'ın Heap'i garbage manager bellekten siliyor.
        * new pahalıdır....
        * sadece ihtiyaç duyulduğu zaman kullanılmalı
        * */
        customerManager = customerManager1;


        customerManager.Remove();
        customerManager.Add();
        customerManager.Update();

        // value type: heap ile hic bir alakası yok her şey stack'te oluşuyor.
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        // Diziler referans tiptir string yada byte olmasının bir önemi yoktur
        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {4,5,10};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

    }
}
