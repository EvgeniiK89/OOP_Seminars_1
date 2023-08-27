package My_Program;

public class PotatoChips extends Product{

    private double calories; //калорийность
    private String taste; //вкус чипсов

    public PotatoChips(String name, String brand, double price, double calories, String taste){
        super(name, brand, price);
        this.calories = calories;
        this.taste = taste;
    }

    @Override
    public String displayInfo() {
        return String.format("[Чипсы] %s - %s - %.2f ccal:%.2f - %s", name, brand, price, calories, taste);
    }

    public double getCalories() {
        return calories;
    }

    public String getTaste() {
        return taste;
    }
}
