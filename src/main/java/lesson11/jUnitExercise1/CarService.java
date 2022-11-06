package lesson11.jUnitExercise1;

public class CarService {

    /**
     * Changes given car color value to the specified one
     * @param car car object which color we will change
     * @param colorToPaint specific color to change to
     */
    public void paintCar(Car car, String colorToPaint){
        System.out.println("Current color is - " + car.color);

        if(colorToPaint.equalsIgnoreCase(car.color)){
            System.out.println("Color been not changed, still same: " + car.color);
        }else{
            System.out.println("Car to paint");
            car.color = colorToPaint;
            System.out.println("Car repainted, color is now " + car.color);
        }
    }
}
