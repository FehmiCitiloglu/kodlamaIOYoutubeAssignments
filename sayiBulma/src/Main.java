public class Main {

    public static void main(String[] args) {
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
        System.out.println("Sayıların içinde var");
    }else {
        System.out.println("Sayıların içinde yok");
    }



    }
}
