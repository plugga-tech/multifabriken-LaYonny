package products;

import java.util.Scanner;



public class PipeProduct extends Products{
    Scanner scan = new  Scanner(System.in);


    public PipeProduct(double diameter, double length){
        super(null, null, null, null,0,
        diameter, length, 0, 0);
    }

    public void addProductContent(){

        System.out.println("välj diameter på röret");
        double diameter = scan.nextDouble();
        setDiameter(diameter);

        System.out.println("välj längd på röret");
        double length = scan.nextDouble();
        setLength(length);


        int i = productList.size();

        productList.add(new PipeProduct(getDiameter(), getLength()));

        //Test code
        System.out.println(getDiameter()+ " " + getLength());
        System.out.println(productList.get(i).toString());
   
    }

    public String toString(){

        return"Diametern :" + getDiameter() + " " + " och längden är " + getLength()+ ":cm";
    }
    
    public void addToList(){   
        for(int i =0; i < productList.size();i++){
            
            
            if (i == 0) {//Testar en grej =)
                
                System.out.println("Rör");
                System.out.println(productList.get(i).toString());
                System.out.println("första på listan \n");
            }
            else if (i == productList.size()-1){
                System.out.println("\nSista på listan godis");
                System.out.println(productList.get(i).toString());
                System.out.println("Sista på listan godis");
            }
            else
            {
                System.out.println("allt mellan 0 och -1");
                System.out.println(productList.get(i).toString());
                System.out.println("allt mellan 0 och -1 ");
            }
            
        }
    }
}
