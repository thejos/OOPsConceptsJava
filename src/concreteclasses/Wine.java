package concreteclasses;

import abstractclasses.Product;

/**
 *
 * @author: Dejan Smiljić; e-mail: dej4n.s@gmail.com
 *
 */
public class Wine extends Product {

    private final double LUXURY_TAX = 10 / 100D;// constant
    private double volume;

    public Wine(double volume, String name, String barcode, double salePrice) {
        super(name, barcode, salePrice);
        this.volume = volume;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + super.calculatePrice() * LUXURY_TAX;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Volume: %.2fL\nLuxury tax: %.2f\n", volume, super.calculatePrice() * LUXURY_TAX);
    }

}
