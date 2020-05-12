package builderDesgin.ex1.ex2;

/**
 * Create by tachai on 2020-05-12 21:16
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("intel至强")
                .screen("三星")
                .memory("16G")
                .build();
    }
}
