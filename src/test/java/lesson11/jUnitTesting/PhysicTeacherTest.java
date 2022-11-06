package lesson11.jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhysicTeacherTest {

    PhysicTeacher physicTeacher = new PhysicTeacher();

    @Test
    void shouldCalculateDistance_WhenTimeAndSpeedArePositive() {
        //given
                Double speed = 10.0;
        Double time = 5.0;
        //when
        Double actualDistance = physicTeacher.calculateDistance(time, speed);
        //then
        assertEquals(50, actualDistance);
    }

    @Test
    void shouldCalculateDistance_WhenTimeAndSpeedAreNegative() {
        //given

        //then
        assertEquals(0.0, physicTeacher.calculateDistance(-5.0, 10.0));
    }
}