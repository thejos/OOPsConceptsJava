package abstractclasses;

/**
 *
 * @author: Dejan Smiljić; e-mail: dej4n.s@gmail.com
 *
 */
public abstract class Product {

    private final double VAT = 20 / 100D;//constant

    private String name;
    private String barcode;
    private double salePrice;

    public Product(String name, String barcode, double salePrice) {
        this.name = name;
        this.barcode = barcode;
        this.salePrice = salePrice;
    }

    public double calculatePrice() {
        return salePrice + salePrice * VAT;
    }

    @Override
    public String toString() {
        return String.format("Product: %s\nName: %s\nBarcode: %s\nPrice: %.2f\nTax: %.2f\nPrice total: %.2f\n",
                this.getClass().getSimpleName(), name, barcode, salePrice, salePrice * VAT, calculatePrice());

    }

}
