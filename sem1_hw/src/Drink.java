public abstract class Drink {

    public Drink(String nameDrink, int price, double amount) {
        this.nameDrink = nameDrink;
        this.price = price;
        this.amount = amount;
    }

    private String nameDrink;
    private int price;
    private double amount;

    public int getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public String getNameDrink() {
        return nameDrink;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "nameDrink='" + nameDrink + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

}
