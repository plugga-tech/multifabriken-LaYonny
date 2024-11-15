package products;

public class Products {
    //Car variabels
    private String carRegistrationNbr;
    private String color;
    private String carBrand;

    //Candy
    private String taste;
    private int numberOfCandy;

    //Pipe
    private double diameter;
    private double length;

    //Oakmilk

    private double fatContent;
    private double vloume;

    private int id;
    
    public Products(String carRegistrationNbr,String color, String carBrand, String taste, int numberOfCandy, double diameter, double length,double fatContent, double vloume, int id){

        //Car
        this.carRegistrationNbr = carRegistrationNbr;
        this.color = color;
        this.carBrand = carBrand;

        //Candy
        this.taste = taste;
        this.numberOfCandy = numberOfCandy;
        this.id = id;

        //Pipe
        this.diameter = diameter;
        this.length = length;

        //Oakmilk
        this.fatContent = fatContent;
        this.vloume = vloume;

    }

    public String getCarRegistrationNbr() {
        return carRegistrationNbr;
    }

    public void setCarRegistrationNbr(String carRegistrationNbr) {
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

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getNumberOfCandy() {
        return numberOfCandy;
    }

    public void setNumberOfCandy(int numberOfCandy) {
        this.numberOfCandy = numberOfCandy;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public double getVloume() {
        return vloume;
    }

    public void setVloume(double vloume) {
        this.vloume = vloume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  

    
    
}