import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args) {
        Integer[] intsArray = {1, 2, 3, 4, 5};
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car car1 = new Car("BMW", 7000);
        Car car2 = new Car("Lambo", 10000);
        Car car3 = new Car("Mustang", 5000);
        Car[] carList= {car1, car2, car3};
        ArrayList<Car> carArray = new ArrayList<Car>(Arrays.asList(carList));
        System.out.println(carArray);
    }
}
