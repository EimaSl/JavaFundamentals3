package lesson12.warmUp;

public class ProductService {

    /**
     * Sukurti metoda suskaiciuos esanciu visu produktu esanciu masyve kaina
     */

    public Double calculateTotalProductsPrice(Product[] products) {

        double total = 0.0;
        for (Product product : products) {
            if (product.price > 0 && product.quantity > 0) {
                total += product.price * product.quantity;
            }
        }
        return total;
    }
}
