public class Main {

    public static void main(String[] args) {
	WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
	womanGameCalculator.hesapla();
	womanGameCalculator.gameOver();


	// abstract sınıflar newlenemez ve aşağıdaki kullanım düzgün bir kullanım değil
//	GameCalculator gameCalculator = new GameCalculator() { // sadece bu şekilde kullanmamıza izin vermiyor bir tek tanımlanması gereken hesapla metodunu cağırıyor
//		@Override
//		public void hesapla() {
//
//		}
//	};

		GameCalculator gameCalculator = new WomanGameCalculator(); // bu şekilde new'leyebiliriz
    }
}
