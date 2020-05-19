package decorator;

/**
 * Create by tachai on 2020-05-19 22:07
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        String password = "abcd";
        String cpassword;
        Cipher sc,cc;

        sc = new SimpleCipher();
        cpassword=sc.encrypt(password);
        System.out.println(cpassword);
        System.out.println("-----------------------");

        cc = new ComplexCipher(sc);
        cpassword =cc.encrypt(password);
        System.out.println(cpassword);
        System.out.println("-----------------------");

    }
}
