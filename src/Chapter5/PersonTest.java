package Chapter5;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 40;
        person.name = "James";
        person.married = true;
        person.numOfKids = 3;
        System.out.println("He is " + person.age + "years old");
        System.out.println("He's name is " + person.name);
        System.out.println("Is he married?: " + person.married);
        System.out.println("How many kids does he have?: " + person.numOfKids);
    }
}
