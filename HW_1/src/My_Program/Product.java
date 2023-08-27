package My_Program;

public class Product {

    protected String name; // Наименование
    protected String brand; // Изготовитель
    protected double price; // Стоимость

    public String getName() {
        return name;
    }

    private void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

   private void setBrand(String brand) {
        checkBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 100) {
            throw new RuntimeException("Некорректная цена товара");
        }
        this.price = price;
    }

    public Product() {
        this("noname");

    }

    public Product(String name) {
        this(name, "nobrand");

    }

    public Product(String name, String brand) {
        this(name, brand, 100);
    }

    public Product(String name, String brand, double price) {
        if (price < 100) {
            throw new RuntimeException("Некорректная цена товара");
        }
        this.price = price;
        checkName(name);
        checkBrand(brand);
    }

    void checkName(String name) {
        if (name == null || name.length() < 3) {
            this.name = "noname";
        } else {
            this.name = name;
        }
    }

    void checkBrand(String brand) {
        if (brand == null || brand.length() < 3) {
            this.brand = "nobrand";
        } else {
            this.brand = brand;
        }
    }


    public String displayInfo() {
        return String.format("%s - %s - %.2f", name, brand, price);
    }

}