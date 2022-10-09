public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new ConsoleLogger(), new EmailLogger(), new FileLoger(), new DatabaseLogger()};
//        for (BaseLogger logger : loggers){
//            logger.log("Log Mesajı");

            CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
            customerManager.add();


        }

}