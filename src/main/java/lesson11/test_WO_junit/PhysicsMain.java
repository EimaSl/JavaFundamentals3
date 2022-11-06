package lesson11.test_WO_junit;

import lesson11.jUnitTesting.PhysicTeacher;

public class PhysicsMain {

    public static void main(String[] args) {
      PhysicTeacher teacher = new PhysicTeacher();
        Double calculatedDistance = teacher.calculateDistance(10.0, 50.0);
        System.out.println("Calculated distance = " + calculatedDistance+ " km");
        System.out.println("Calculated distance equal 500 when time = 10 & speed = 50 ==> " + (calculatedDistance == 500));
    }
}
