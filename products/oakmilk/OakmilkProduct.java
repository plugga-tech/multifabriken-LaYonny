package products.oakmilk;

import java.util.Scanner;

public class  OakmilkProduct extends Oakmilk {
    Scanner scan = new Scanner(System.in);

    public OakmilkProduct(int fatContent, int vloume){
      
        super(fatContent,vloume);  

    }

    public void addOakMilkContent(double fatContent, double vloume){
        
        System.out.println("Skriv in fetthalt");
        fatContent = scan.nextDouble();

        System.out.println("Skriv in Litermängd");
        vloume = scan.nextDouble();

        System.out.println("fetthalt är " +fatContent + " " + "Litermängd " +vloume);
    }
}
