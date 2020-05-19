package decorator;

/**
 * 具体装饰类
 * Create by tachai on 2020-05-19 22:04
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class AdvancedCipher extends CipherDecorator{

    public AdvancedCipher(Cipher cipher) {
        super(cipher);
    }

    @Override
    public String encrypt(String plainText){
        String result = super.encrypt(plainText);
        result = mod(result);
        return result;
    }

    public String mod(String text){
        String str ="";
        for(int i=0;i<text.length();i++){
            String c = String.valueOf(text.charAt(i)%6);
            str+=c;
        }
        return str;
    }
}
