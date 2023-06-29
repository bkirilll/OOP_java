import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class HotVendingMachine implements VendingMachine, Iterable<HotDrink> {
    private LinkedList<HotDrink> hotDrinksList;

    public HotVendingMachine() {
        this.hotDrinksList = new LinkedList<>();
    }

    public void putDrink(HotDrink drink) {
        this.hotDrinksList.add(drink);
    }

    public LinkedList<HotDrink> getHotDrinksList() {
        return hotDrinksList;
    }

    @Override
    public void acceptingMoney() {
        System.out.println("Автомат принял деньги");
    }

    @Override
    public void extraditionDrink() {
        System.out.println("Автомат выдал напиток");
    }

    @Override
    public String toString() {
        return "HotVendingMachine{" +
                "hotDrinksList=" + hotDrinksList +
                '}';
    }

    @Override
    public Iterator<HotDrink> iterator() {
        return new HotDrinkIterator(hotDrinksList);
    }

    public void Shop() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название желаемого напитка");
        String name = scan.nextLine();
        for (HotDrink hotDrink: hotDrinksList) {
            if (name.equals(hotDrink.getNameDrink())) {
                System.out.println("Внесите сумму:" +hotDrink.getPrice());
                acceptingMoney();
                extraditionDrink();
            }

        }

    }
}
