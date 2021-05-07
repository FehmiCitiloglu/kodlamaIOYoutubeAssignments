public abstract class GameCalculator { // abstract bir sınıfta abstract bir method olmak zorunda değil
    // abstractlar sizin base'i gizlemek istediğiniz zamanda kullanılır
    public abstract void hesapla();
    //tamamlanmış operasyon işi bitmiş operasyon
    public final void gameOver(){
        System.out.println("Oyun bitti!!");
    }
}
