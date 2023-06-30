import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        HotDrink coffee = new HotDrink("coffee", 10, 0.2, 80);
        HotDrink tea = new HotDrink("tea", 5, 0.4, 50);
        HotDrink chocolate = new HotDrink("chocolate", 15, 0.3, 60);
        HotVendingMachine machine = new HotVendingMachine();
        machine.putDrink(coffee);
        machine.putDrink(tea);
        machine.putDrink(chocolate);
        Iterator<HotDrink> iterator = machine.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("");

        Collections.sort(machine.getHotDrinksList());
        System.out.println(machine);

    }

}

