package core.logging;

public class EmailLogger implements Logger{
    @Override
    public void log(String mesaj) {
        System.out.println("Mail ile loglanmıştır. ---" + mesaj);
    }
}
