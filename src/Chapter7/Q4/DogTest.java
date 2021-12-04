package Chapter7.Q4;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog("dog1", "type1");
        dogs[1] = new Dog("dog2", "type1");
        dogs[2] = new Dog("dog3", "type2");
        dogs[3] = new Dog("dog4", "type3");
        dogs[4] = new Dog("dog5", "type4");
        for(Dog d: dogs) {
            System.out.println(d.showDogInfo());;
        }
    }
}
