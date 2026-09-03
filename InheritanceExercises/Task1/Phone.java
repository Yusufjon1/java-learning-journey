package Task1;

public class Phone {

    private String brand;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Phone(String brand) {
        this.brand = brand;
    }



    public void call() {
        System.out.println(brand + " Calling you");
    }

}
