package products;

import java.util.Scanner;



public class PipeProduct extends Products{
    Scanner scan = new  Scanner(System.in);


    public PipeProduct(double diameter, double length){
        super(null, null, null, null,0,
        diameter, length, 0, 0);
    }

    @Override
    public void addProductContent(){

            boolean input1 = true;
            boolean input2 = true;

            while (input1) {

                System.out.println("välj diameter på röret ");
                if (!scan.hasNextDouble()) {
                    System.out.println("Fel input! Endast siffror, försök igen.");
                    scan.nextLine();
                }
                else{
                    double diameter = scan.nextDouble();
                    setDiameter(diameter);
                    scan.nextLine();
                    input1 = false;
                }
                
            }

            while (input2) {
                System.out.println("välj längd i dm ");
                if (!scan.hasNextDouble()) {
                    System.out.println("Fel input! Endast siffror, försök igen.");
                    scan.nextLine();
                }
                else{
                    double length = scan.nextDouble();
                    setLength(length);
                    scan.nextLine();
                    input2 = false;
                }
                
            }

        int i = productList.size();

        productList.add(new PipeProduct(getDiameter(), getLength()));

        //Test code
        System.out.println(getDiameter()+ " " + getLength());
        System.out.println(productList.get(i).toString());
 
    }

    public String toString(){

        return"Diametern :" + getDiameter() + " " + " och längden är " + getLength()+ ":dm";
    }
    
    @Override
    public void addToList(){   
        for(int i =0; i < productList.size();i++){
            
            
            if (i == 0) {
                
                System.out.println("Rör");
                System.out.println(productList.get(i).toString());
 
            }
  
            else
            {
                System.out.println(productList.get(i).toString());

            }
            
        }
    }
}
