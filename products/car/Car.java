package products.car;


public class Car {

    private int carRegistrationNbr;
    private String color;
    private String carBrand;
    private int id;

    public Car(int carRegistrationNbr, String color, String carBrand, int id){
        this.carRegistrationNbr = carRegistrationNbr;
        this.color = color;
        this.carBrand = carBrand;
        this.id = id;

    }

    public int getCarRegistrationNbr() {
        return carRegistrationNbr;
    }

    public void setCarRegistrationNbr(int carRegistrationNbr) {
        this.carRegistrationNbr = carRegistrationNbr;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  
}
