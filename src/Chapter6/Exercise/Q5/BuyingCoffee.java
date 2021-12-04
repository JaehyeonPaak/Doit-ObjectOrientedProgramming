package Chapter6;

public class BuyingCoffee {
    public static void main(String[] args) {
        Person p1 = new Person("Kim", 10000);
        Person p2 = new Person("Lee", 20000);
        Coffee coffee1 = new Coffee("Americano", 4000);
        Coffee coffee2 = new Coffee("Latte", 4500);
        p1.buyCoffee(coffee1.cost);
        p2.buyCoffee(coffee2.cost);
        System.out.println(p1.name + " bought " + coffee1.name + " with " + coffee1.cost + " Won");
        System.out.println(p2.name + " bougth " + coffee2.name + " with " + coffee2.cost + " Won");
    }
}
