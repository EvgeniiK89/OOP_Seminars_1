package My_Program;

public class Chocolate extends Product {

    private double calories;
    private String typeChoc; //тип шоколада

    public Chocolate(String name, String brand, double price, double calories, String typeChoc){
        super(name, brand, price);
        this.calories = calories;
        this.typeChoc = typeChoc;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %.2f ccal:%.2f - %s", name, brand, price, calories, typeChoc);
    }

    public double getCalories() {
        return calories;
    }

    public String getTypeChoc() {
        return typeChoc;
    }
}
