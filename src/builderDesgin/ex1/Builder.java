package builderDesgin.ex1;

/**
 * Create by tachai on 2020-05-12 20:44
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 * 抽象builder类
 */
public abstract class Builder {
    abstract void buildFrame();
    abstract void buildSeat();

    abstract void buildTire();
    abstract Bike createBike();
}
