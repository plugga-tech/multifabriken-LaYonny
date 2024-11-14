package products.pipe;


public class Pipe {
    private double diameter;
    private double length;

    public Pipe(double diameter, double length){
        this.diameter = diameter;
        this.length = length;
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
    
}
