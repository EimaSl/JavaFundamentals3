package lesson11.jUnitExercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    CarService carService = new CarService();
    Car volvo = new Car("Volvo","White",false);

    @Test
    void shouldChangeCarColor_WhenNewColorIsGiven() {
        //given to 9&10 line
        //when
        carService.paintCar(volvo, "Black");
        //then
        assertEquals("Black", volvo.color);

    }
    @Test
    void shouldNotChangeCarColor_WhenGivenColorIsSame() {
        //given extracted to 9&10 line
        //when
        carService.paintCar(volvo, "White");
        //then
        assertEquals("White", volvo.color);

    }
    @Test
    void shouldNotChangeCarColor_sample() {
        //given extracted to 9&10 line
        //when
        assertEquals(5, 5);
        boolean isOld = true;
        assertTrue(isOld);

        Car car = null;
        assertNull(car);

        assertEquals(64, 2*32);

//        assertEquals(5, 5);
//        boolean isOld = true;
//        assertTrue(isOld);

//        Product product = null;
//        assertNull(product);

//        assertEquals(64, 2 * 32);
//        assertEquals(2, 2, "Reiksmes turetu buti lygios");
//        assertTrue(true);
//        assertFalse(false);
//
//        int[] skaiciai1 = {1,2,3};
//        int[] skaiciai2 = {1,2,3};
//        assertArrayEquals(skaiciai1, skaiciai2);
//
//        Product bread = new Product("Bread", null);
//        Product bread2 = new Product("Bread", null);
//        assertNotSame(bread, bread2);


    }
}