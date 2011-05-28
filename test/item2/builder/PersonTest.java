package item2.builder;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 3:17:07 PM
 */
public class PersonTest {

    @Test
    public void shouldCreatePersonUsingBuilder() {
        Person person = new Person
                            .Builder()
                            .firstName("Shivprasad")
                            .lastName("Bade")
                            .phoneNo("1234567890")
                            .city("Pune")
                            .build();

        Assert.assertEquals("Shivprasad", person.getFirstName());

    }
}
