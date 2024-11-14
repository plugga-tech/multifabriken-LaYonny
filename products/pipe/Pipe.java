package products.pipe;


public class Pipe {
    private double diameter;
    private double length;
    private int id;

    public Pipe(double diameter, double length, int id){
        this.diameter = diameter;
        this.length = length;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
