package builderDesgin.ex1;

/**
 * Create by tachai on 2020-05-12 20:53
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 * 客户端使用
 */
public class Client {
    public static void main(String[] args) {
        showBike(new MobikeBuilder());
        showBike(new OfoBuilder());

    }

    private static void showBike(Builder builder){
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
        System.out.println(bike.getTire());
    }
}
