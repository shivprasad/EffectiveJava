package item2.builder;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 3:15:42 PM
 */
public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String city;


    private Person(){}

    public Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNo;
        this.city = builder.city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (city != null ? !city.equals(person.city) : person.city != null) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(person.phoneNumber) : person.phoneNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String phoneNo;
        private String city;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
