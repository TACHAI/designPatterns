package prototypeMode.ex;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Create by tachai on 2020-05-13 08:18
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 * 原型模式
 */
public class Car implements Cloneable{

    private String color;

    private Wheel wheel;

    public Car(String color,Wheel wheel){
        this.color=color;
        this.wheel=wheel;
    }

    @Override
    public Object clone(){
        Car clone = null;

        try {
            clone= (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
