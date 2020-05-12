package builderDesgin.ex1;

/**
 * Create by tachai on 2020-05-12 20:47
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class MobikeBuilder extends Builder {
    private Bike mBike = new Bike();


    @Override
    void buildFrame() {
        mBike.setFrame("frame");
    }

    @Override
    void buildSeat() {
        mBike.setSeat("seat");
    }

    @Override
    void buildTire() {
        mBike.setTire("tire");
    }

    @Override
    Bike createBike() {
        return mBike;
    }
}
