package entities;

public class Course {

    public Course() {
    }

    public Course(String id, String name, double price, double egitimSuresi) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.egitimSuresi = egitimSuresi;
    }

    private String id;
    private String name;
    private double price;
    private double egitimSuresi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getEgitimSuresi() {
        return egitimSuresi;
    }

    public void setEgitimSuresi(double egitimSuresi) {
        this.egitimSuresi = egitimSuresi;
    }
}
