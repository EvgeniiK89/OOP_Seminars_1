package My_Program;

public class BottleOfMilk extends Product{

    private double volume; // обьем
    private double fat; // жирность

    public BottleOfMilk(String name, String brand, double price, double volume, int fat){
        super(name, brand, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка молока] %s - %s - %.2f - v: %.2f - fat: %.2f ", name, brand, price, volume, fat);
    }

    public double getVolume() {
        return volume;
    }

    public double getFat() {
        return fat;
    }
}
