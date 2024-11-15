package products;

import java.util.Scanner;



public class CarProduct extends Products{
     Scanner scan = new Scanner(System.in);

    public CarProduct(String carRegistrationNbr,String color, String carBrand,int id){

       super(carRegistrationNbr, color, carBrand, null, 0, 0, 0,
       0, 0, id);

    }

    public void addCarContent(int carRegistrationNbr,String color, String carBrand){

        System.out.println("Ange registreringsnummer ");
        carRegistrationNbr = scan.nextInt();

        System.out.println("Välj bilfärg");
        color = scan.next();

        System.out.println("Bilmärke");
        carBrand = scan.next();

        System.out.println("Bilens registreringsnummer: " +carRegistrationNbr + " "+ "Bilens färg " + color + "Bilmärke" +carBrand);

    }
    
}
