public class BaseKrediManager {
    public final double hesapla(double tutar){
        return tutar * 1.18;
    }
    // aksi belirtilmediği sürece metodlar overridable'dır
    // override'ı kapatmak için => final anahtar kelimesi ile beslemek
}
