package My_Program;

public class BottleOfWater extends Product{
    private double volume;

    public BottleOfWater(String name, String brand, double price, double volume){
        super(name, brand, price);
        this.volume = volume;

    }
    @Override
    public String displayInfo() {
        return String.format("[Бутылка с водой] %s - %s - %.2f - v: %.2f", name, brand, price, volume);
    }

    public double getVolume() {
        return volume;
    }
}
