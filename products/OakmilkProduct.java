package products;

import java.util.Scanner;



public class  OakmilkProduct extends Products{
    Scanner scan = new Scanner(System.in);

    public OakmilkProduct(double fatContent, double vloume){
      
        super(null, null, null,null,
        0, 0, 0,
        fatContent, vloume);

    }

    public void addProductContent(){
        boolean run = true;

        do {
            boolean input1 = true;
            boolean input2 = true;

            while (input1) {
                System.out.println("Skriv in fetthalt i % med siffror");

                if (!scan.hasNextDouble()) {
                    System.out.println("Fel input! Endast siffror, försök igen.");
                    scan.nextLine();
                }
                else{
                    double fatContent = scan.nextDouble();
                    setFatContent(fatContent);
                    scan.nextLine();
                    input1 = false;
                }            
            }
            while (input2) {
                System.out.println("Skriv in Litermängd");

                if (!scan.hasNextDouble()) {
                    System.out.println("Fel input! Endast siffror, försök igen.");
                    scan.nextLine();
                              
                }
                else{
                    double vloume = scan.nextDouble();
                    setVloume(vloume);
                    scan.nextLine();
                    input2 = false;
                }

                
            }
            int i = productList.size();

            productList.add(new OakmilkProduct(getFatContent(), getVloume()));
    
            //Test code
            System.out.println(getFatContent()+ " " + getVloume());
            System.out.println(productList.get(i).toString());
            run = false;
        } while (run);
        
    }


    public String toString(){

        return"Fetthalt:" +getFatContent()+ ":%" + " " + "Litermängd  " + getVloume() +":L";
    }

    public void addToList(){   
        for(int i =0; i < productList.size();i++){
            
          
            if (i == 0) {//Testar en grej =)
                
                System.out.println("Havremjölk");
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
