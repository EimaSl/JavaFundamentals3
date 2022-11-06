package lesson11.jUnitTesting;

/**
 * Class dedicated for f...
 * @author VitalijusK
 */

public class PhysicTeacher {

    //JAVA doc description - documentacija, aprasyti sito metodo pricipa
    /**
     * Calculate driven speed per time and speed
     * @param time - given time
     * @param speed - given speed
     * @return - return driven distance
     */
    public Double calculateDistance(Double time, Double speed) {
        if (time > 0){
            return time * speed;
        }
        else {
            return 0.0;
        }


    }
}


