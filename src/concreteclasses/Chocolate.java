package concreteclasses;

import abstractclasses.Product;

/**
 *
 * @author: Dejan Smiljić; e-mail: dej4n.s@gmail.com
 *
 */
public class Chocolate extends Product {

    private double weight;

    public Chocolate(double weight, String name, String barcode, double salePrice) {
        super(name, barcode, salePrice);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "Net weight: " + weight + "kg\n";
    }

}
