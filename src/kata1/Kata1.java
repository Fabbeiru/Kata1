package kata1;

import java.util.Date;

/**
 *
 * @author Fabián B.
 */
public class Kata1 {
    
    public static void main(String[] args) {
        
        Person person = new Person("Fabian", new Date(98,6,9));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
