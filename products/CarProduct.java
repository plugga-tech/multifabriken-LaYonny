package products;

import java.util.Scanner;



public class CarProduct extends Products{
     Scanner scan = new Scanner(System.in);

    public CarProduct(String carRegistrationNbr,String color, String carBrand){

       super(carRegistrationNbr, color, carBrand, null,
       0, 0, 0,
       0, 0);

    }

    public void addProductContent(){
        System.out.println("Ange registreringsnummer ");
        String carRegistrationNbr = scan.next();

        setCarRegistrationNbr(carRegistrationNbr);

        System.out.println("Välj bilfärg");
        String color = scan.next();
        setColor(color);

        System.out.println("Bilmärke");
        String carBrand = scan.next();
        setCarBrand(carBrand);

        int i = productList.size();

        productList.add(new CarProduct(getCarRegistrationNbr(), getColor(), getCarBrand()));

        //Test code
        System.out.println(getCarRegistrationNbr() + " " + getColor() + " " + getCarBrand());
        System.out.println(productList.get(i).toString());

    }
    public String toString(){

        return"registreringsnummer: " +getCarRegistrationNbr()+ " " + "färg på bilen: " + getColor()+ " " + "bilmärket: " + getCarBrand();
    }

    public void addToList(){   
        for(int i =0; i < productList.size();i++){
            
            System.out.println(productList.get(i).toString());
            
        }

    }
    
}
