package products.car;


public class Car {

    private int carRegistrationNbr;
    private String color;
    private String carBrand;

    public Car(int carRegistrationNbr, String color, String carBrand){
        this.carRegistrationNbr = carRegistrationNbr;
        this.color = color;
        this.carBrand = carBrand;

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

    
    
}
