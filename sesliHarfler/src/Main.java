public class Main {

    public static void main(String[] args) {
	    char harf = 'E';

	    char[] kalinSesliler = {
	            'A',
                'I',
                'O',
                'U'
        };
        char[] inceSesliler = {
	            'E',
                'İ',
                'Ö',
                'Ü'
        };

        boolean kalinSesliMi = false;
        boolean inceSesliMi = false;

        for(char inceSes: inceSesliler) {
            if(inceSes == harf){
                inceSesliMi = true;
            }
            for (char kalinSes: kalinSesliler) {
                if (kalinSes == harf){
                    kalinSesliMi = true;
                }
            }
        }
        if(kalinSesliMi){
            System.out.println(harf + " kalin seslidir");
        }else if(inceSesliMi) {
            System.out.println(harf + " ince seslidir");
        }

        // switch ile daha kolaymış

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf.");
            default:
                System.out.println("İnce sesli harf.");

        }

    }

}
