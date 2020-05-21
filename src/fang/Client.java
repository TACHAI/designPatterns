package fang;

import java.net.NetworkInterface;
import java.text.DecimalFormat;

/**
 * Create by tachai on 2020-05-21 20:33
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        NetworkDevice nd1,nd2,nd3;
        DeviceFactory df = new DeviceFactory();
        nd1 = df.getNetworkDevice("cisco");
        nd1.use();

        nd2 =df.getNetworkDevice("tp");
        nd2.use();

        nd3 = df.getNetworkDevice("tp");
        nd3.use();

        System.out.println("total device:"+df.getTotalDevice());
        System.out.println("total terminal"+df.getTotalTermianl());
    }
}
