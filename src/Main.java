/**
 * Created by user on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        Main main =new Main();
        Person person = new Person();
        person.setName("Supimi");
        person.setEmail("supimi@gmail.com");
        person.setId("955900480V");
        System.out.println(person);
        System.out.println(main.savePerson(person));

    }
    public Person savePerson(Person person){
        if (person ==null) {
            throw new IllegalArgumentException();
        }
        else {
            person.setId("p1234");
            return person;
        }

    }
}
