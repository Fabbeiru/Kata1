package kata1;

import java.time.LocalDate;

/**
 *
 * @author Fabián B.
 */
public class Kata1 {
    
    public static void main(String[] args) {
                
        Person person = new Person("Fabian", LocalDate.of(1998,7,9));
        System.out.println(person.getName() + " is " + person.getAge() + " years old");
    }
    
}
