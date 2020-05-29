package visit.example;

/**
 * Create by tachai on 2020-05-29 13:05
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Saler extends Visitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("收银员"+name+"给苹果过称，然后计算价格");
    }

    @Override
    public void visit(Book book) {
        System.out.println("收银员"+name+"直接计算书的价格");
    }
}
