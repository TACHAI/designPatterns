package observer;

/**
 * Create by tachai on 2020-05-27 21:01
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        MySubject subject = new Cat();

        MyObserver obs1,obs2,obs3;
        obs1= new Mouse();
        obs2=new Mouse();
        obs3 = new Dog();

        subject.attach(obs1);
        subject.attach(obs2);
        subject.attach(obs3);

        subject.cry();
    }
}
