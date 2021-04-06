package BinarySearch;

public class BinarySearch {
  public static void main(String[] args)
  {
    long[] newArr = {2,4,6,7};
    System.out.println(BinarySearch2ndSol(newArr,1));
//    System.out.println(BinarySearch2ndSol(newArr,8));

  }


  public static int BinarySearch (long[] arr,long num){
    int startPoint = 0;
    int endPoint = arr.length;
    int midPoint =(int) Math.floor(arr.length / 2);
    while (startPoint >= 0 && midPoint < endPoint) {
      if (arr[midPoint] == num) {
        return midPoint;
      } else if (arr[midPoint] > num) {
        endPoint = midPoint;
        if((endPoint - startPoint) % 2 == 0){
          midPoint = midPoint - (int) (endPoint - startPoint) / 2;
        }else{
          midPoint = midPoint - (int) (endPoint - startPoint + 1) / 2;
        }
      } else {
        startPoint = midPoint;
        midPoint =midPoint + (int)((endPoint - startPoint + 1) / 2);
      }
    }
    return -1;
  };

  public static int BinarySearch2ndSol (long[] arr,long num){
    int start = 0;
    int end = arr.length;
    int mid =(int) Math.floor(arr.length / 2);
    return BinarySearch2ndSol(arr,num,start,mid,end);
  };

  public static int BinarySearch2ndSol (long[] arr, long num,int start,int mid,int end){
    if (start >= 0 && mid < end && mid < arr.length) {
      if (mid >=0 && arr[mid] == num) return mid;
      if ( mid >=0 && arr[mid] > num) {
        int midPoint = mid - (int) (end - start) / 2;
        return BinarySearch2ndSol(arr,num,start,midPoint,mid);
      }
      else {
        int midPoint = (int) mid + (end - mid + 1) / 2;
        return BinarySearch2ndSol(arr, num, mid,midPoint, end);
      }
    }
    return -1;
  };
}
