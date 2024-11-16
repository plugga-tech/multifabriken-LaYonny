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

        return"Diametern är :" + getDiameter()+"diameter" + " och längden är " + getLength()+ ":cm";
    }
    
    public void addToList(){   
        for(int i =0; i < productList.size();i++){
            
            System.out.println(productList.get(i).toString());
            
        }
    }
}
