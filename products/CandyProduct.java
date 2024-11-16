package products;


import java.util.Scanner;

public class CandyProduct extends Products{
    Scanner scan = new Scanner(System.in);

    boolean run = true;

    public CandyProduct(String taste, int numberOfCandy){


        super(null, null, null, taste,
        numberOfCandy, 0, 0,
        0,0);

    }

    public void addProductContent(){
        
        do {
            boolean input = true;

            System.out.println("Välj smak på godiset");
            String taste = scan.nextLine();
            setTaste(taste);


            while (input) {
                System.out.println("Antal ");
                if (!scan.hasNextInt()) {

                    System.out.println("Fel input! endast siffror.");
                    scan.nextLine();
                }
                else{
                    int nbrOfCandy = scan.nextInt();
                    scan.nextLine();
                    setNumberOfCandy(nbrOfCandy);    
                    input = false;  
                    
                }
            }
        int i = productList.size();

        productList.add(new CandyProduct(getTaste(), getNumberOfCandy()));


        //Test code
        System.out.println(getTaste() + " " + getNumberOfCandy());
        System.out.println(getTaste() + " " +getNumberOfCandy());
        System.out.println(productList.get(i).toString());
        run = false;
            
        } while (run);

    }

    public String toString(){

        return"Smak: " +getTaste()+ " " + "Antal: " + getNumberOfCandy();
    }


    public void addToList(){

       
        for(int i =0; i < productList.size();i++){
            
            if (i == 0) {//Testar en grej till en ide (om jag hinner) =)
                
                System.out.println("Godis");
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
