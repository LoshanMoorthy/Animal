
/**
 * Write a description of class Animal here.
 *
 * @author Loshan Sundaramoorthy
 * @version 02/10/2022
 */
public class Animal implements Comparable<Animal>
{
    private String name;
    private int females;
    private int males;
    
    public Animal(String name, int females, int males) {
        this.name = name;
        this.females = females;
        this.males = males;
    }
    
    public String toString() {
        return name + ": " + females + " female " + "and " + males + " male";
    }
    
    public int getFemales() {
        return females;
    }
    
    public int getMales() {
        return males;
    }
    
    public int getPopulation() {
        return females + males;
    }
    
    public int compareTo(Animal other) {
        if(females != other.females) {
            return other.females - females;
        }
        return other.males - males;
    }
}
