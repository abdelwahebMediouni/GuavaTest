import factory.Factory;
import model.Circle;

import java.awt.*;

public class Application {

    public static void main(String[] args) {


        Factory<Circle> factory = Factory.createFactory(Circle::new, Color.RED);

        Circle circle = factory.newInstance();
        System.out.println(circle);
        try {
            GuavaAlgo.getElements();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
