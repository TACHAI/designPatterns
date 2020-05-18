package adapter.other;

/**
 * 适配器类   加密适配器
 * Create by tachai on 2020-05-18 21:14
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class CipherAdapter extends DataOperation {

    private Caesar caesar;

    public CipherAdapter(){
        caesar= new Caesar();
    }


    @Override
    public String doEncrypt(int key, String ps) {

        return caesar.doEncrypt(key,ps);
    }
}
