package products.car;

import java.util.Scanner;

public class CarProduct extends Car{
     Scanner scan = new Scanner(System.in);

    public CarProduct(int carRegistrationNbr,String color, String carBrand){

        super(carRegistrationNbr, color, carBrand);

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
