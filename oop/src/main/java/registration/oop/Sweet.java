package registration.oop;
import java.util.*;
public class Sweet { 
    String name;
    String type;
    int cost;
    int weigth;
    Sweet(String name,String type,int cost,int weigth){
        this.name=name;
        this.type=type;
        this.cost=cost;
        this.weigth=weigth;
    }
}
// sort by weight of the sweets
class Sortbyweigth implements Comparator<Sweet> { 
    public int compare(Sweet a, Sweet b){ 
        return a.weigth - b.weigth; 
    } 
}
//sort by cost of the sweets
class Sortbycost implements Comparator<Sweet> { 
    public int compare(Sweet a, Sweet b){ 
        return a.cost - b.cost; 
    } 
}
// sort by type of sweets
class Sortbytype implements Comparator<Sweet> { 
    public int compare(Sweet a, Sweet b){ 
        return a.type.compareTo(b.type); 
    } 
}
