import java.util.Scanner;


//imports all child products from product folder
import products.CandyProduct;
import products.CarProduct;
import products.OakmilkProduct;
import products.PipeProduct;

public class UserInput {

    public static boolean run = true;

    public UserInput(){
        //Create objects
        CarProduct car = new CarProduct("", "", "");
        CandyProduct candy = new CandyProduct("", 0);
        PipeProduct pipe = new PipeProduct(0, 0);
        OakmilkProduct oakmilk = new OakmilkProduct(0, 0);

        Scanner scan = new Scanner(System.in);
        System.out.println("Multifabriken AB");
        System.out.println();
        do {

        //menyval 1-6
        System.out.println("Välj mellan 1-6");   
        System.out.println("1:Bilar. 2:Godis. 3:Rör. 4:Havremjölk. \n5:Beställningslista. 6:Avsluta programmet.");

            if (scan.hasNextInt()) {
                int meny = scan.nextInt();
        
                switch (meny) {  // switch with menyval, call methods from child product classes and list(s)
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
                        System.out.println("Beställningslista\n");

                            car.addToList();
                            
                            candy.addToList();

                            pipe.addToList();

                            oakmilk.addToList();
                            
                        break;
                        case 6:
                        System.out.println("Programmet avslutas!");//Exit program (gives run value false)
                        run = false;
                        scan.close();
                        break;
                

                        // two diffrent error outputs, if number smaller or larger then 1-6 and if numbers not used for menyval
                    default:
                    System.out.println("Felmeddelande, siffror stämmer ej med 1-6)");
                        break;
                }
            }
            else{
                System.out.println("Felmeddelande för felinput, endast siffror!");
                scan.next();
            }
        } while (run);

    }
}
