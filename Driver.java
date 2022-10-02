
/**
 * Write a description of class Driver here.
 *
 * @author Loshan Sundaramoorthy
 * @version 02/10/2022
 */
public class Driver
{
    public static void exam() {
        Animal a1 = new Animal("elephant", 17, 24);
        Animal a2 = new Animal("gorilla", 10, 30);
        Animal a3 = new Animal("monkey", 30, 10);
        Animal a4 = new Animal("alligator", 30, 5);
        Animal a5 = new Animal("giraffe", 4, 10);
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        
        Zoo z = new Zoo("DenFarligeZoo");
        
        z.add(a1);
        z.add(a2);
        z.add(a3);
        z.add(a4);
        z.add(a5);
        
        System.out.println("");
        System.out.println("The total number of animals in the zoo:");
        System.out.println(z.animals());
        
        System.out.println("");
        System.out.println("The largest population in the zoo:");
        System.out.println(z.largestPopulation());
        
        System.out.println("");
        z.printZoo();
    }
}
