package prototypeMode.ex;

import java.io.IOException;

/**
 * Create by tachai on 2020-05-13 08:24
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 浅拷贝
        Wheel wheel = new Wheel();
        Car car = new Car("blue",wheel);
        Car copyCar = (Car) car.clone();

        System.out.println(car==copyCar);
        System.out.println(car.getWheel()==copyCar.getWheel());

        // 深拷贝
        DeepWheel deepWheel = new DeepWheel();
        DeepCar deepCar = new DeepCar("write",deepWheel);
        DeepCar copyDeepCar = (DeepCar) deepCar.deepClone();

        System.out.println(deepCar==copyDeepCar);
        System.out.println(deepCar.getWheel()==copyDeepCar.getWheel());

    }
}
