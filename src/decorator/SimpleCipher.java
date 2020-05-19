package decorator;

/**
 * 具体构件类
 * Create by tachai on 2020-05-19 21:53
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class SimpleCipher implements Cipher {


    @Override
    public String encrypt(String plainText) {
        String str="";
        for(int i=0;i<plainText.length();i++){
            char c= plainText.charAt(i);
            if(c>='a'&&c<='z'){
                c += 6;
                if(c>'z'){
                    c-=26;
                }
                if(c<'a'){
                    c+=26;
                }
            }

            if(c>'A'&&c<'Z'){
                c+=6;
                if(c>'Z'){
                    c-=26;
                }
                if(c<'A'){
                    c+=26;
                }
            }
            str+=c;
        }
        return str;
    }
}
