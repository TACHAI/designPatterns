package strategy.troubleExample;

/**
 * 冒泡排序
 * Create by tachai on 2020-05-28 21:03
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] arr) {


        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int temp;
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("冒泡排序");
        return arr;
    }
}
