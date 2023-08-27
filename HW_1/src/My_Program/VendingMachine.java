package My_Program;

import  java.util.List;
public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Chocolate getChocolate(String name, String typeChoc) {
        for (Product product : products) {
            if (product instanceof Chocolate) {
                Chocolate chocolate = (Chocolate) product;
                if (chocolate.getName().equals(name) && chocolate.getTypeChoc() == typeChoc) {
                    return chocolate;
                }
            }
        }
        return null;
    }

    public PotatoChips getPotatoChips(String name, String taste) {
        for (Product product : products) {
            if (product instanceof PotatoChips) {
                PotatoChips potatoChips = (PotatoChips) product;
                if (potatoChips.getName().equals(name) && potatoChips.getTaste() == taste) {
                    return potatoChips;
                }
            }
        }
        return null;
    }

}
