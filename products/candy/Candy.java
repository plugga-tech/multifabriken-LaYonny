package products.candy;

public class Candy {
    private String taste;
    private int numberOfCandy;
    private int id;
    
    public Candy(String taste, int numberOfCandy,int id){
        this.taste = taste;
        this.numberOfCandy = numberOfCandy;
        this.id = id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
