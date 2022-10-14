package core.logging;

public class FileLogger implements Logger{
    @Override
    public void log(String mesaj) {
        System.out.println("Dosyaya loglanmıştır. ---" + mesaj);
    }
}
