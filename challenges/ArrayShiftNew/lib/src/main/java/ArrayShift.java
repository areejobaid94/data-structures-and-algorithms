import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args)
    {
        long[] chalArr = {1,2,6,7};
        System.out.println(Arrays.toString(insertShiftArray(chalArr,4)));
        System.out.println(Arrays.toString(insertShiftDeleteArray(chalArr,4)));
    }

    // Insert Shift Array method
    public static long[] insertShiftArray(long[] arr,long val){
        long[] outputArr = new long[arr.length + 1];
        int brackPoint = arr.length % 2 == 0 ? arr.length / 2 : (arr.length + 1) / 2;
        outputArr[brackPoint] = val;
        for(int i = 0; i < arr.length;i++){
            if(i >= brackPoint){
                outputArr[i+1] = arr[i];
            }else{
                outputArr[i] = arr[i];
            }
        }
        return outputArr;
    }
    // Stretch Goal
    public static long[] insertShiftDeleteArray(long[] arr,long val) {
        if(arr.length != 0 ){
            arr[arr.length % 2 == 0 ? arr.length / 2 : (arr.length + 1) / 2] = val;
        }
        return arr;
    };
}
