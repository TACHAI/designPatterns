package fang;

import java.util.ArrayList;

/**
 * Create by tachai on 2020-05-21 20:26
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class DeviceFactory {
    private ArrayList devices = new ArrayList<>();

    private int totalTermianl =0;

    public DeviceFactory(){
        NetworkDevice nd1 = new Switch("Cisco-WS-C2950-24");
        devices.add(nd1);
        NetworkDevice nd2 = new Hub("TP-LINK-HF8M");
        devices.add(nd2);
    }

    public NetworkDevice getNetworkDevice(String type){
        if(type.equalsIgnoreCase("cisco")){
            totalTermianl++;
            return (NetworkDevice) devices.get(0);
        }else if(type.equalsIgnoreCase("tp")){
            totalTermianl++;
            return (NetworkDevice) devices.get(1);
        }else {
            return null;
        }
    }

    public int getTotalDevice(){
        return devices.size();
    }
    public int getTotalTermianl(){
        return totalTermianl;
    }

}
