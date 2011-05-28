package item1.staticfactory;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 12:31:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class StaticFactoryInsteadOfConstructors {

    public static void main(String[] args) {
        Person person = Person.withName("Shivprasad","Bade");
        System.out.println("Name of Person - "+ person.getFirstName() + " "+ person.getLastName());
    }

    static class Person {
        private String firstName;
        private String lastName;

        private Person() {
        }

        public static Person withName(String firstName, String lastName) {
            Person person = new Person();
            person.firstName = firstName;
            person.lastName = lastName;
            return person;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
