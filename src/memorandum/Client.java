package memorandum;

import java.util.UUID;

/**
 * Create by tachai on 2020-05-27 19:45
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        UserInfoDTO user = new UserInfoDTO();
        Caretaker c = new Caretaker();


        user.setAccount("zhangsan");
        user.setPassword("123456");
        user.setTelNo("130000000");

        System.out.println("状态一：");
        user.show();
        c.setMemento(user.saveMemento());

        // 保存备忘录
        System.out.println("-------------");
        user.setPassword("111111");
        user.setTelNo("17000000");
        System.out.println("状态二");
        user.show();
        System.out.println("-------------");

        // 从备忘录中恢复
        user.restoreMemento(c.getMemento());
        System.out.println("回到状态一");
        user.show();
        System.out.println("-------------");
    }
}
