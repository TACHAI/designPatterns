package iterator;

import java.io.DataInputStream;

/**
 *
 * Create by tachai on 2020-05-26 20:52
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        Television tv;
        tv=new TCLTelevisionn();
        display(tv);
        System.out.println("================");
        reverseDisplay(tv);
    }

    public static void display(Television tv){
        TVIterator i=tv.createIterator();
        System.out.println("电视机频道");
        while (!i.isLast()){
            System.out.println(i.currentChannel().toString());
            i.next();
        }
    }

    public static void reverseDisplay(Television tv){
        TVIterator i=tv.createIterator();
        i.setChannel(4);
        System.out.println("逆向遍历电视机频道");
        while(!i.isFirst()){
            i.previous();
            System.out.println(i.currentChannel().toString());

        }
    }



}
