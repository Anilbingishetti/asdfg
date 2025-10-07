import java.util.*;
class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}