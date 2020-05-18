package adapter.other;

/**
 *
 * 目标抽象类  数据操作类
 * Create by tachai on 2020-05-18 21:05
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public abstract class DataOperation {

    private String password;

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public abstract String doEncrypt(int key,String ps);
}
