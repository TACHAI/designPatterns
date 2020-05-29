package visit.example;

/**
 * Create by tachai on 2020-05-29 13:10
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        Product b1  = new Book();
        Product b2 = new Book();
        Product b3 = new Apple();

        Visitor visitor;
        BuyBasket buyBasket = new BuyBasket();
        buyBasket.addProcuct(b1);
        buyBasket.addProcuct(b2);
        buyBasket.addProcuct(b3);


        visitor = new Customer();
        visitor.setName("王二");
        buyBasket.accept(visitor);
    }
}
