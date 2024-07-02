package Day_02_Review;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {

        Set<Car> set = new HashSet<>();

        Car car1 = new Car(1,"BMW");
        set.add(car1);
        Car car2 = new Car(1,"BMW");
        set.add(car2);


    }
}
