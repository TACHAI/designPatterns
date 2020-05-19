package decorator;

/**
 * 加密装饰类
 * Create by tachai on 2020-05-19 21:56
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class CipherDecorator implements Cipher {

    private Cipher cipher;

    public CipherDecorator(Cipher cipher){
        this.cipher=cipher;
    }
    @Override
    public String encrypt(String plainText) {
        return cipher.encrypt(plainText);
    }
}
