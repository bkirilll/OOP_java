public class HotDrink extends Drink implements Comparable<HotDrink>{
    private int temperature;

    public HotDrink(String nameDrink, long price, double amount, int temperature) {
        super(nameDrink, price, amount);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }


    @Override
    public String toString() {
        return "HotDrink:" +
                " nameDrink - " + super.getNameDrink() +
                "; price: " + super.getPrice() +
                "; amount: " + super.getAmount() +
                "; temperature: " + temperature;
    }

    @Override
    public int compareTo(HotDrink o) {
        return this.price.compareTo(o.price);
    }
}
