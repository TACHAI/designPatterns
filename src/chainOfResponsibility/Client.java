package chainOfResponsibility;

/**
 * Create by tachai on 2020-05-25 08:24
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        Leader objDirector,objManager,objGeneralManager;
        objDirector = new Director("王五");
        objManager = new Manager("张三");
        objGeneralManager = new GeneralManager("李四");

        objDirector.setSuccessor(objManager);
        objManager.setSuccessor(objGeneralManager);

        LeaveRequest lr1 = new LeaveRequest("赵一",2);
        objDirector.handleRequest(lr1);

        LeaveRequest lr2 = new LeaveRequest("赵二",6);
        objDirector.handleRequest(lr2);


        LeaveRequest lr3 = new LeaveRequest("赵三",15);
        objDirector.handleRequest(lr3);
    }
}
