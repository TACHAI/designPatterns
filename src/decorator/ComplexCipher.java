package decorator;

/**
 * 具体装饰类（复杂加密类）
 * Create by tachai on 2020-05-19 21:59
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class ComplexCipher extends CipherDecorator {
    public ComplexCipher(Cipher cipher) {
        super(cipher);
    }
    @Override
    public String encrypt(String plainText){
        String result = super.encrypt(plainText);
        result = reverse(result);
        return result;

    }

    public String reverse(String text){
        String str ="";
        for(int i=text.length();i>0;i--){
            str +=text.substring(i-1,i);
        }
        return str;
    }
}
