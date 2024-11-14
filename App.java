import java.util.Scanner;

import products.candy.CandyProduct;
import products.car.CarProduct;
import products.pipe.PipeProduct;
import products.oakmilk.OakmilkProduct;


public class App {
    public static boolean run = true;
 

    public static void main(String[] args) {

        CarProduct car = new CarProduct(0, null, null,0);
        CandyProduct candy = new CandyProduct(null, 0,0);
        PipeProduct pipe = new PipeProduct(0, 0,0);
        OakmilkProduct oakmilk = new OakmilkProduct(0, 0,0);

        
        Scanner scan = new Scanner(System.in);
    
        do {

        //menyval 1-6
        System.out.println("Välj mellan 1-6");   
        System.out.println("1:Bilar. 2:Godis. 3:Rör. 4:Havremjölk. 5:Beställningslista. 6:Avsluta programmet.");

            if (scan.hasNextInt()) {
                int meny = scan.nextInt();
        
                switch (meny) {  //Basic kod, ska ändras
                    case 1:
                        System.out.println("1 Bilar");
                        car.addCarContent(meny, null, null);
                        
                        break;
                        case 2:
                        System.out.println("2 Godis");

                        candy.addCandyContent(null, 0);
                        break;
                        case 3:
                        System.out.println("3 Rör");
                        pipe.addPipeContent(0, 0);

                        break;
                        case 4:
                        System.out.println("4 Havremjölk");

                        oakmilk.addOakMilkContent(0, 0);
                        break;
                        case 5:
                        System.out.println("Lista med alla beställda produkter");
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