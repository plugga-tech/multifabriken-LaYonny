package products.oakmilk;

public class Oakmilk {
    private double  fatContent;
    private double volume;
    

    public Oakmilk(double fatContent, double volume){
        this.fatContent = fatContent;
        this.volume = volume;
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

    
}
