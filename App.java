import java.util.Scanner;

import products.CandyProduct;
import products.CarProduct;
import products.OakmilkProduct;
import products.PipeProduct;



public class App {
    public static boolean run = true;
 

    public static void main(String[] args) {

        CarProduct car = new CarProduct("", "", "");
        CandyProduct candy = new CandyProduct("", 0);
        PipeProduct pipe = new PipeProduct(0, 0);
        OakmilkProduct oakmilk = new OakmilkProduct(0, 0);

        
        Scanner scan = new Scanner(System.in);
    
        do {

        //menyval 1-6
        System.out.println("Välj mellan 1-6");   
        System.out.println("1:Bilar. 2:Godis. 3:Rör. 4:Havremjölk. \n5:Beställningslista. 6:Avsluta programmet.");

            if (scan.hasNextInt()) {
                int meny = scan.nextInt();
        
                switch (meny) {  //Basic kod, ska ändras
                    case 1:
                        System.out.println("1 Bilar");
                        car.addProductContent();
                        
                        break;
                        case 2:
                        System.out.println("2 Godis");

                        candy.addProductContent();
                        break;
                        case 3:
                        System.out.println("3 Rör");
                        pipe.addProductContent();

                        break;
                        case 4:
                        System.out.println("4 Havremjölk");

                        oakmilk.addProductContent();
                        break;
                        case 5:
                        System.out.println("Lista med alla beställda produkter");
                        System.out.println();

                            car.addToList();
                            System.out.println();

                            candy.addToList();

                            oakmilk.addToList();
                            System.out.println();

                            pipe.addToList();
                            System.out.println();
  

                        break;
                        case 6:
                        System.out.println("Programmet avslutas!");
                        run = false;
                        scan.close();
                        break;
                
                    default:
                    System.out.println("Felmeddelande, siffror stämmer ej med 1-6)");
                        break;
                }
            }
            else{
                System.out.println("Felmeddelande för felinput (bokstäver etc)");
                scan.next();
            }
        } while (run);
    }
}