import models.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {

    private static final Logger LOG = LogManager.getLogger("logInfo");

    public static void main(String[] args) {

        /*
        models.User user = new models.User();
        user.showUserData();
        user.increaseAge(10);
        user.showUserData();
         */
        /*
        Calc calc = new Calc();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum("2",2.5));
         */
        /*
        TestArray testArray = new TestArray();
        testArray.move();
        System.out.println(Arrays.toString(testArray.array1));
        System.out.println(Arrays.toString(testArray.array2));
         */

        Car bmw = new Car()
                .setBrand("bmw")
                .setModel("x5")
                .setColor("black")
                .setDoors(5);
        System.out.println(bmw.getBrand());

        Car vw = new Car();

    }

}
