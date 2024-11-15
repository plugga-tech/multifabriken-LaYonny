package products;

import java.util.Scanner;



public class  OakmilkProduct extends Products{
    Scanner scan = new Scanner(System.in);

    public OakmilkProduct(int fatContent, int vloume,int id){
      
        super(null, null, null,null,
        0, 0, 0,
        fatContent, vloume, id);

    }

    public void addOakMilkContent(double fatContent, double vloume){
        
        System.out.println("Skriv in fetthalt");
        fatContent = scan.nextDouble();

        System.out.println("Skriv in Litermängd");
        vloume = scan.nextDouble();

        System.out.println("fetthalt är " +fatContent + " " + "Litermängd " +vloume);
    }

    public void addProductContent(){

        System.out.println("Skriv in fetthalt");
        double fatContent = scan.nextDouble();
        setFatContent(fatContent);

        System.out.println("Skriv in Litermängd");
        double vloume = scan.nextDouble();
        setVloume(vloume);

        System.out.println("fetthalt är " +getFatContent() + " " + "Litermängd " +getVloume());
        
    }
}
