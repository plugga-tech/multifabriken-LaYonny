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

        System.out.println("Skriv in fetthalt");
        double fatContent = scan.nextDouble();
        setFatContent(fatContent);

        System.out.println("Skriv in Litermängd");
        double vloume = scan.nextDouble();
        setVloume(vloume);

        int i = productList.size();

        productList.add(new OakmilkProduct(getFatContent(), getVloume()));

        //Test code
        System.out.println(getFatContent()+ " " + getVloume());
        System.out.println(productList.get(i).toString());
        
    }

    public String toString(){

        return"Fetthalt:" +getFatContent()+ ":%" + " " + "Litermängd  " + getVloume() +":L";
    }

    public void addToList(){   
        for(int i =0; i < productList.size();i++){
            
            System.out.println(productList.get(i).toString());
            
        }
    }     
}
