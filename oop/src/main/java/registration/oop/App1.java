package registration.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App1
{
    public static void main( String[] args )
    {
        List<Sweet> gift = new ArrayList<Sweet>();
        Sweet chco1=new Chocolates("snikers","100%", 2,10);
        gift.add(chco1);
        Sweet chco2=new Chocolates("silk-almond","100%", 1,20);
        gift.add(chco2);
        Sweet chco3=new Candys("mango","60%", 2,10);
        gift.add(chco3);
        Sweet chco4=new Candys("choco","50%", 8,10);
        gift.add(chco4);
        Sweet chco5=new Jellybeans("milkybar","30%",5,2);
        gift.add(chco5);
        Sweet chco6=new Candys("kisses","40%",6,2);
        gift.add(chco6);
        Sweet chco7=new Candys("topico","65%",2,7);
        gift.add(chco7);
        Sweet chco8=new Candys("nuggets","85%",6,4);
        gift.add(chco8);
        List<Sweet> chocolate=new ArrayList<Sweet>();
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Chocolates){
                chocolate.add(gift.get(i));
            }
        }
        //sorted the chocolates with respect to weights
        System.out.println("Chocolates sorted by their weights");
        Collections.sort(chocolate,new Sortbyweigth());
        for(int i=0;i<chocolate.size();i++){
            System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weigth of chocolate is "+chocolate.get(i).weigth+"gms");
        }
        //sorted the chocolates with respect to cost
        System.out.println();
        System.out.println("Chocolates sorted by their cost");
        Collections.sort(chocolate,new Sortbycost());
        for(int i=0;i<chocolate.size();i++){
        	System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weigth of chocolate is "+chocolate.get(i).weigth+"gms");
        }
        //sorted the chocolate with respect to type of content
        System.out.println();
        Collections.sort(chocolate,new Sortbytype());
        System.out.println("Chocolates sorted by their content %");
        for(int i=0;i<chocolate.size();i++){
        	System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weigth of chocolate is "+chocolate.get(i).weigth+"gms");
        }
        // calculates the total weigth of the gifts
        int net_weigth=0;
        for(int i=0;i<gift.size();i++){
            net_weigth+=gift.get(i).weigth;
        }
        System.out.println();
        System.out.println("Total weigth of gift "+net_weigth+"gm");
        int count_candies=0;
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Candys){
                count_candies++;
            }
        }
        System.out.println();
        System.out.println("No of Candies is "+count_candies);
        //candies present in between the range of cost 2 to 5
        System.out.println("");
        System.out.println("candies between range of the cost in between 2 to 5\n");
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Candys){
                if(gift.get(i).cost<=5 && gift.get(i).cost>=2) {
                	System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weigth of Candy is "+gift.get(i).weigth+"gms");
                }
            }
        }
      //candies present in between the range of cost 2 to 9
        System.out.println("");
        System.out.println("candies between range of the weigth in between 2 to 9\n");
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Candys){
                if(gift.get(i).weigth<=5 && gift.get(i).weigth>=2) {
                	System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weigth of Candy is "+gift.get(i).weigth+"gms");
                }
            }
        }
        
    }
}