public class Main {
// bir class birden fazla interface'i implemente edebilir
    public static void main(String[] args) {
        // interface'ler de abstractlar gibi new'lenemez
//	ICustomerDal customerDal = new ICustomerDal() {
//        @Override
//       public void Add() {

//        }
//   };
        // Ama aşağıdaki şekilde uygundur. yani interface onu implemente eden class'ın referancısını tutabilir
        //ICustomerDal customerDal = new OracleCustomerDal(); // => poliymorphism
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        // customerManager.customerDal = new MySqlCustomerDal(); // programcı bunu yazmayı unutabiliyor bu yüzden CustomerManager kısmında unutlmaytacak bir yapıya dönüştürüleecek
        customerManager.add();
    }
}