import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<String> Fruits = new ArrayList<>();
        Fruits.add("Mango");
        Fruits.add("Banana");
        Fruits.add("Apple");
        System.out.println(Fruits);
        Fruits.remove("Banana");
        System.out.println(Fruits);
    }
}
