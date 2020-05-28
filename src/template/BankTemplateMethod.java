package template;

/**
 * Create by tachai on 2020-05-28 21:34
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public abstract class BankTemplateMethod {

    public void takeNumber(){
        System.out.println("取号排队");
    }

    public abstract void transact();

    public void evaluate(){
        System.out.println("反馈评分");
    }

    public void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
