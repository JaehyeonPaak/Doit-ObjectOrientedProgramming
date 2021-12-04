package Chapter6;

public class Person {
    String name;
    int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public int buyCoffee(int cost) {
        money -= cost;
        return money;
    }
}
