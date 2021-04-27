public class Main {

    public static void main(String[] args) {
	    // For

        for (int i = 0 ; i < 10 ; i+=2) {
            System.out.println( i + " in for loop");
        }
        System.out.println("Döngü bitti");

        // while
        int i = 1;
        while ( i < 10){
            System.out.println(i + " in while loop");
            i++;
        }
        System.out.println("while döngüsü bitti");

        // do while
        int j = 0;
        do {
            System.out.println("Loglandı");
            System.out.println(j + " in do while loop");
            j+=2;
        }while(j < 10);

        System.out.println("do while döngüsü bitti");
    }
}
