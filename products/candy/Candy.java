package products.candy;

public class CandyProduct {
    private String taste;
    private int numberOfCandy;
    
    public CandyProduct(String taste, int numberOfCandy){
        this.taste = taste;
        this.numberOfCandy = numberOfCandy;

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
    
}
