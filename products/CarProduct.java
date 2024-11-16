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

        return"Registreringsnummer: " +getCarRegistrationNbr()+ " " + "Bilfärg: " + getColor()+ " " + "Bilmärke: " + getCarBrand();
    }

    public void addToList(){   
        for(int i =0; i < productList.size();i++){
            
            if (i == 0) {//Testar en grej =)
                
                System.out.println("Bil");
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
