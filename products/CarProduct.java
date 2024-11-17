package products;

import java.util.Scanner;



public class CarProduct extends Products{
     Scanner scan = new Scanner(System.in);
   
    //The variabels car uses from Sup
    public CarProduct(String carRegistrationNbr,String color, String carBrand){

       super(carRegistrationNbr, color, carBrand, null, //Calls in Sup
       0, 0, 0,
       0, 0);

    }

    @Override //Override inherited method
    public void addProductContent(){
        
        System.out.println("Ange registreringsnummer ");//Ask for three diffrent user input, saves to variables. Calls in setters
        String carRegistrationNbr = scan.next();

        setCarRegistrationNbr(carRegistrationNbr);

        System.out.println("Välj bilfärg");
        String color = scan.next();
        setColor(color);

        System.out.println("Bilmärke");
        String carBrand = scan.next();
        setCarBrand(carBrand);

        int i = productList.size(); //gives i the size of the list

        productList.add(new CarProduct(getCarRegistrationNbr(), getColor(), getCarBrand())); // 

        //Test code
        System.out.println(getCarRegistrationNbr() + " " + getColor() + " " + getCarBrand());
        System.out.println(productList.get(i).toString());

    }
    public String toString(){

        //create output text for the object when list is called with toString
        return"Registreringsnummer: " +getCarRegistrationNbr()+ " " + "Bilfärg: " + getColor()+ " " + "Bilmärke: " + getCarBrand();
    }

    @Override //Override inherited method for list
    public void addToList(){   
        for(int i =0; i < productList.size();i++){ //loops all objects from Car class (only from car class)
            
            if (i == 0) {
                
                System.out.println("Bil");
                System.out.println(productList.get(i).toString());
                
            }
            else
            {
                  
                System.out.println(productList.get(i).toString());
 
            }         
        }
    }
    
}
