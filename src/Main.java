import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // two String objects/instances, they differ in terms of state/data
        // for String class new keyword is not mandatory, this is just some optimization
        String hello = "Hello World";
        String someString = new String("Just some text");

        // they share the behaviour, we can use the same methods on instances of some class
        System.out.println(hello.length());
        System.out.println(someString.length());

        // Object class is the root class in class hierarchy
        // reference type we can use exact type of an object, or the super type (class which is being extended directly or indirectly)
        Object newString = "New string";

        List<Integer> someList = new ArrayList<>();

        // work with an Item class
        Item pencil = new Item("Pencil", "Yellow");
        // default toString implementation from the Object class will be used untill we provide our own implementation
        pencil.setColor("Black");
        pencil.setSize("Small");
        System.out.println(pencil.toString());

        Item redPencil = new Item("Pencil", "Red");
        System.out.println(redPencil);

        Item greenPencil = new Item();
        greenPencil.setName("Pencil");
        greenPencil.setColor("Green");
        System.out.println(greenPencil);
        System.out.println("The color of the greenPencil is: " + greenPencil.color);

        Item book = new Item("Book", "Brown");
        book.setSize("Medium");
        System.out.println(book);
    }
}