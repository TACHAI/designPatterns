package prototypeMode.ex;

import java.io.*;

/**
 * Create by tachai on 2020-05-13 08:29
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class DeepCar implements Serializable {
    private String color;

    private DeepWheel wheel;

    public DeepCar(String color,DeepWheel wheel){
        this.color=color;
        this.wheel=wheel;
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return(ois.readObject());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public DeepWheel getWheel() {
        return wheel;
    }

    public void setWheel(DeepWheel wheel) {
        this.wheel = wheel;
    }
}
