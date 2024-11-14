package products.oakmilk;

public class OakProduct {
    private double  fatContent;
    private double volume;
    

    public OakProduct(double fatContent, double volume){
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
