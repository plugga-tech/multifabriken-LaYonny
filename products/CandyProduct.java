package products;

import java.util.Scanner;

public class CandyProduct extends Products{
    Scanner scan = new Scanner(System.in);

    public CandyProduct(String taste, int numberOfCandy,int id){

        super(taste, null, null, null,
        numberOfCandy, 0, 0,
        0,0, id);
    }
    //Basic code to test
    public void addCandyContent(String taste, int numberOfCandy){
        
        System.out.println("Välj smak på godiset");
        taste = scan.nextLine();

        System.out.println("Antal " + numberOfCandy);
        numberOfCandy = scan.nextInt();
        scan.nextLine();

        System.out.println("Smaken är " +taste + " "+ "Antal godisar: " + numberOfCandy);

    }
    public void addProductContent(){
        System.out.println("Välj smak på godiset");
        String test = scan.nextLine();
        setTaste(test);

        System.out.println("Antal ");
        int test2 = scan.nextInt();
        scan.nextLine();
        setNumberOfCandy(test2);

        System.out.println(getTaste() + " " +getNumberOfCandy());

    }
}
