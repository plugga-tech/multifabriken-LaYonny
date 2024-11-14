import java.util.Scanner;

import products.candy.CandyProduct;
import products.car.Car;
import products.oakmilk.OakmilkProduct;
import products.pipe.Pipe;

public class App {
    public static boolean run = true;
 

    public static void main(String[] args) {
        CandyProduct candy = new CandyProduct(null, 0);
        OakmilkProduct oakmilk = new OakmilkProduct(0, 0);

        
        Scanner scan = new Scanner(System.in);
    
        do {

        //menyval 1-6
        System.out.println("Välj mellan 1-6");   

            if (scan.hasNextInt()) {
                int meny = scan.nextInt();
        
                switch (meny) {
                    case 1:
                        System.out.println("1 Bilar");
                        break;
                        case 2:
                        System.out.println("2 Godis");

                        candy.addCandyContent("", 0);
                        break;
                        case 3:
                        System.out.println("3 Rör");
                        break;
                        case 4:
                        System.out.println("4 Havremjölk");

                        //Oakmilk oakmilk = new Oakmilk(0, 0);
                        //Basic kod, ska ändras

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