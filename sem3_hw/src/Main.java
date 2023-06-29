import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
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
        LinkedList<HotDrink> hotDrinkList = new LinkedList<>();
        hotDrinkList.add(coffee);
        hotDrinkList.add(tea);
        hotDrinkList.add(chocolate);
        System.out.println(" ");

        List<HotDrink> sortedList = hotDrinkList.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i));
        }

    }

}

