package strategy.troubleExample;

/**
 * 环境类
 * Create by tachai on 2020-05-28 21:17
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class ArrayHandler {

    private Sort sortObj;

    public int[] sort(int arr[]){
        sortObj.sort(arr);
        return arr;
    }

    public void setSortObj(Sort sortObj){
        this.sortObj=sortObj;
    }
}
