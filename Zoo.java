import java.util.*;
/**
 * Write a description of class Zoo here.
 *
 * @author Loshan Sundaramoorthy
 * @version 02/10/2022
 */
public class Zoo
{
    private String name;
    private ArrayList<Animal> animals;
    
    public Zoo(String name) {
        this.name = name;
        animals = new ArrayList<>();
    }
    
    public void add(Animal a) {
        animals.add(a);
    }
    
    public int animals() {
        int result = 0;
        for (Animal a : animals) {
            if(a.getFemales() > 0 && a.getMales() > 0) {
                result += a.getFemales() + a.getMales();
            }
        }
        return result; 
    }
    
    public Animal largestPopulation() {
        Animal result = null;
        for(Animal a : animals) {
            if(result == null || result.getPopulation() < a.getPopulation() ) {
                result = a;
            }
        }
        return result; 
    }
    
    public void printZoo() {
        System.out.println(name);
        Collections.sort(animals);
        for(Animal a : animals) {
            System.out.println(a);
        }
    }
}
