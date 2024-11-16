package products;


import java.util.Scanner;

public class CandyProduct extends Products{
    Scanner scan = new Scanner(System.in);

    public CandyProduct(String taste, int numberOfCandy){

        super(null, null, null, taste,
        numberOfCandy, 0, 0,
        0,0);
    }

    public void addProductContent(){
        System.out.println("Välj smak på godiset");
        String taste = scan.nextLine();
        setTaste(taste);

        System.out.println("Antal ");
        int nbrOfCandy = scan.nextInt();
        scan.nextLine();
        setNumberOfCandy(nbrOfCandy);

        int i = productList.size();

        productList.add(new CandyProduct(getTaste(), getNumberOfCandy()));


        //Test code
        System.out.println(getTaste() + " " + getNumberOfCandy());
        System.out.println(getTaste() + " " +getNumberOfCandy());
        System.out.println(productList.get(i).toString());

    }

    public String toString(){

        return"Smak: " +getTaste()+ " " + "Antal: " + getNumberOfCandy();
    }

    public void addToList(){

       
        for(int i =0; i < productList.size();i++){
            
            System.out.println(productList.get(i).toString());
            
        }

    }
}
