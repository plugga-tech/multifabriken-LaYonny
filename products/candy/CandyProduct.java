package products.candy;

import java.util.Scanner;

public class Candy extends CandyProduct{
    Scanner scan = new Scanner(System.in);

    public Candy(String taste, int numberOfCandy){

        super(taste,numberOfCandy);
    }
    //Basic code to test
    public void addCandyContent(String taste, int numberOfCandy){
        
        System.out.println("Välj smak på godiset " +taste);
        taste = scan.nextLine();

        System.out.println("Antal " + numberOfCandy);
        numberOfCandy = scan.nextInt();
        scan.nextLine();

        System.out.println("Smaken är " +taste + " "+ "Antal godisar: " + numberOfCandy);

    }
    
}