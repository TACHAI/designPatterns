package builderDesgin.ex1;

/**
 * Create by tachai on 2020-05-12 20:50
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 * 指挥者类
 */
public class Director {
    private Builder mBuilder = null;
    public Director(Builder builder){
        mBuilder=builder;
    }

    public Bike construct(){
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        mBuilder.buildTire();
        return mBuilder.createBike();
    }
}
