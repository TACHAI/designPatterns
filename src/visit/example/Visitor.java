package visit.example;

/**
 * Create by tachai on 2020-05-29 13:02
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public abstract class Visitor {
    protected String name;

    public void setName(String name){
        this.name=name;
    }

    public abstract void visit(Apple apple);

    public abstract void visit(Book book);
}
