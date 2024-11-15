package products;

import java.util.Scanner;



public class PipeProduct extends Products{
    Scanner scan = new  Scanner(System.in);


    public PipeProduct(double diameter, double length, int id){
        super(null, null, null, null,0,
        diameter, length, 0, 0, id);
    }

    public void addPipeContent(double diameter, double length){

        System.out.println("välj diameter på röret");
        diameter = scan.nextDouble();

        System.out.println("välj längd på röret");
        length = scan.nextDouble();

        System.out.println("Diametern är :" + diameter+"diameter" + " och längden är " + length+ "cm(?)");



    }
    
}
