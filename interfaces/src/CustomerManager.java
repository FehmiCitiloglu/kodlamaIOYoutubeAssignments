public class CustomerManager {
    private ICustomerDal customerDal;


    // aşağıda unutulmayacak şekile dönüştürüldü
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        // iş kodları yazılır
        // OracleCustomerDal oracleCustomerDal = new OracleCustomerDal(); // bunu yapmak demek Oracle'a bağlıyız, sistem sadece Oracle da çalışıyor demek
        customerDal.Add();
    }
}
