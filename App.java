import java.util.Scanner;
import products.candy.Candy;
import products.car.Car;
import products.oakmilk.Oakmilk;
import products.pipe.Pipe;

public class App {
    public static boolean run = true;
 

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
        do {

        //menyval 1-6
        System.out.println("Välj mellan 1-6");   

            if (scan.hasNextInt()) {
                int meny = scan.nextInt();
        
                switch (meny) {
                    case 1:
                        System.out.println("Bilar");
                        break;
                        case 2:
                        System.out.println("Godis");
                        break;
                        case 3:
                        System.out.println("Rör");
                        break;
                        case 4:
                        System.out.println("Havremjölk");
                        break;
                        case 5:
                        System.out.println("Lista med alla beställda produkter");
                        break;
                        case 6:
                        System.out.println("Avsluta programmet");
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