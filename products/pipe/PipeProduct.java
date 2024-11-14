package products.pipe;

import java.util.Scanner;

public class PipeProduct extends Pipe{
    Scanner scan = new  Scanner(System.in);


    public PipeProduct(double diameter, double length){
        super(diameter, length);
    }

    public void addPipeContent(double diameter, double length){

        System.out.println("välj diameter på röret");
        diameter = scan.nextDouble();

        System.out.println("välj längd på röret");
        length = scan.nextDouble();

        System.out.println("Diametern är :" + diameter+"diameter" + " och längden är " + length+ "cm(?)");



    }
    
}
