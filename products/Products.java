package products;

import java.util.ArrayList;
import java.util.List;

public abstract class Products {
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

  
    
    public Products(String carRegistrationNbr,String color, String carBrand, String taste, int numberOfCandy, double diameter, double length,double fatContent, double vloume){

        //Car
        this.carRegistrationNbr = carRegistrationNbr;
        this.color = color;
        this.carBrand = carBrand;

        //Candy
        this.taste = taste;
        this.numberOfCandy = numberOfCandy;
       

        //Pipe
        this.diameter = diameter;
        this.length = length;

        //Oakmilk
        this.fatContent = fatContent;
        this.vloume = vloume;

    }

    // two abstract methods one adds all product infon second adds all created objects to a list
    public abstract void addProductContent();

    public abstract void addToList();

    

    //Makes one arraylist all child classes can use
    public List<Products> productList = new ArrayList<>();



    //All getters and setters for all child classes

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
    
}
