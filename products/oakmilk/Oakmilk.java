package products.oakmilk;

public class Oakmilk {
    private double  fatContent;
    private double volume;
    private int id;
    

    public Oakmilk(double fatContent, double volume,int id){
        this.fatContent = fatContent;
        this.volume = volume;
        this.id = id;
    }


    public double getFatContent() {
        return fatContent;
    }


    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }


    public double getVolume() {
        return volume;
    }


    public void setVolume(double volume) {
        this.volume = volume;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    
}
