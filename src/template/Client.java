package template;

/**
 * Create by tachai on 2020-05-28 21:38
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        BankTemplateMethod bank;
        bank = new Deposit();
        bank.process();
        System.out.println("---------");
    }
}
