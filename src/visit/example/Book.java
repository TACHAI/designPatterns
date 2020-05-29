package visit.example;

/**
 * Create by tachai on 2020-05-29 13:07
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Book implements Product {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
