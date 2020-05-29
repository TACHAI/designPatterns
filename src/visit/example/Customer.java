package visit.example;

import singleton.Villain;

/**
 * Create by tachai on 2020-05-29 13:03
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Customer extends Visitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("顾客"+name+"选苹果");
    }

    @Override
    public void visit(Book book) {
        System.out.println("顾客"+name+"买书");
    }
}
