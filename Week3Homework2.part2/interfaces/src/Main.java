public class Main {
    public static void main(String[] args) {
/*       CustomerManager customerManager= new CustomerManager();
       customerManager.customerDal = new MySqlCustomerDal();
       customerManager.add();

       Yukarıda yapılan çağırma işlemi (customer manager da ICustomerDal 'ı tanıtarak customerManager'ın
         operasyonunun içinenden çağırılmasıdır. Bu bir Tasarım Deseni alternatifidir. Bir diğer örnek commentli olmayan
         daha tercih edilendir. Programcı bu yöntemi unutabilir çünkü program hata çıktısı vermez.
        ICustomerDal customerDal;
        public void add(){
            // İş kodları yazılır
            customerDal.add(); }*/
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}