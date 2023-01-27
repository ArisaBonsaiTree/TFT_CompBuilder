import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Champion> listOfChamps = new ArrayList<>();


        //Champion zoe = new Champion("Zoe", 1, new ArrayList<>(Arrays.asList("TEST", "ME")));
        listOfChamps.add(new Champion("Zoe", 1, new ArrayList<>(Arrays.asList("TEST", "ME"))));
        listOfChamps.add(new Champion("Poppy", 1, new ArrayList<>(Arrays.asList("Hello", "World"))));

        for( Champion c: listOfChamps){
            System.out.println(c.getName());
        }
    }
}