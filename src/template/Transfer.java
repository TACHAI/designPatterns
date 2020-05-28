package template;

/**
 * 具体子类
 * Create by tachai on 2020-05-28 21:37
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Transfer extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("转账");
    }
}
