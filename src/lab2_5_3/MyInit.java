package lab2_5_3;

/**
 * Created by m18 on 22.02.2016.
 */
public class MyInit {
    private static int[] arr;
    {
        arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(100*Math.random());
        }
    }
    public void printArray(){
        for(int el:arr){
            System.out.print(el+",");
        }
        System.out.println();
    }

}
