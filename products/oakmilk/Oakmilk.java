package products.oakmilk;

import java.util.Scanner;

public class  Oakmilk extends OakProduct{
    Scanner scan = new Scanner(System.in);

    public Oakmilk(int fatContent, int vloume){
      
        super(fatContent,vloume);  

    }

    public void addFatContent(double fatContent, double vloume){
        System.out.println("Skriv in fetthalt");
        fatContent = scan.nextDouble();

        System.out.println("Skriv in Litermängd");
        vloume = scan.nextDouble();

        System.err.println("fetthalt är " +fatContent + " " + "Litermängd " +vloume);
    }
}
