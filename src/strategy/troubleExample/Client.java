package strategy.troubleExample;

import java.util.HashMap;

/**
 * Create by tachai on 2020-05-28 21:19
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        int arr[] ={1,53,6,2,0,8};
        int result[];

        ArrayHandler handler = new ArrayHandler();

        Sort sort;
        sort = new BubbleSort();
        handler.setSortObj(sort);
        result = handler.sort(arr);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+",");
        }
    }
}
