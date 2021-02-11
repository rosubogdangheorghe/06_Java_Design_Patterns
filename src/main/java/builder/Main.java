package builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> toysList = new ArrayList<>();
        toysList.add("minge");
        toysList.add("os");
        Dog dog = new Dog.Builder().
                withName("Rex").withType("Ciobanesc").withAge(5).withToys(toysList).build();

        System.out.println(dog.toString());
        System.out.println(dog.getName());
    }
}
