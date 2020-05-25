package Interpreter.ex;

/**
 * Create by tachai on 2020-05-25 21:40
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        String statement = "3*4/2%4";
        Calculator calculator = new Calculator();
        calculator.build(statement);
        int result= calculator.compute();
        System.out.println(statement+"="+result);
    }
}
