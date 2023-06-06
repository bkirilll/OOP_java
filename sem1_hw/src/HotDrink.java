public class HotDrink extends Drink{
    private int temperature;

    public HotDrink(String nameDrink, int price, double amount, int temperature) {
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
}
