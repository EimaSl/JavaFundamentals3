package lesson12.warmUp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductServiceTest {

    @Test
    void calculateTotalProductsPrice() {
        //given/
        Product product1 = new Product("Bread", 1.25, 2);
        Product product2 = new Product("Milk", 2.25, 2);
        Product product3 = new Product("Butter", 3.25, 2);
        Product[] products = {product1, product2, product3};
        ProductService productService = new ProductService();
        //when
        Double actualProductsTotal = productService.calculateTotalProductsPrice(products);
        // then
        assertEquals(13.5, actualProductsTotal);
    }

    @Test
    void calculateTotalProductsPrice_WhenPriceOrQuantityNegative() {
        //given/
        Product product1 = new Product("Bread", -1.25, 2);
        Product product2 = new Product("Milk", 2.25, -2);
        Product product3 = new Product("Butter", 3.25, 2);
        Product[] products = {product1, product2, product3};
        ProductService productService = new ProductService();
        //when
        Double actualProductsTotal = productService.calculateTotalProductsPrice(products);
        // then
        assertEquals(6.5, actualProductsTotal);
    }
}