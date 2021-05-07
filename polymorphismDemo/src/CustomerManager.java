public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    public void add(){
        System.out.println("Müşteri eklendi.");
        System.out.println(this.logger);
        this.logger.log("Log mesajı");
        //DatabaseLogger logger = new DatabaseLogger(); // newlemekten korkmaya başlamalıyız bir class'ı başka bir class'ın içinde new
        // yapmak demek o new yapılan class'a körü körüne bağlıyız demek. spagetti alert
        //logger.Log("Log mesajı");

    }
}
