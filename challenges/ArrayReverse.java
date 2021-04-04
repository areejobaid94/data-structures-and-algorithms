import java.util.Arrays;

class reverseArray  {
  public static void main(String[] args) {
    // test first solution
    // the testing Arr with even length;
    long[] arrEven = {3, 5,6, 7,11,13,14,16 ,17,18,19,20};

    // the testing Arr with Odd length
    long[] arrOdd = {3, 5,6, 7,11,13,14,16 ,17,18,19};

    // the testing Arr with Zero length
    long[] arrZeroLength = {};

    System.out.println(Arrays.toString(reverseArray(arrEven)));
    System.out.println(Arrays.toString(reverseArray(arrOdd)));
    System.out.println(Arrays.toString(reverseArray(arrZeroLength)));
    /////////////////////////////////////////////////////////////

    // test 2nd solution
    // the testing Arr with even length;
    long[] arrEven2nd = {3, 5,6, 7,11,13,14,16 ,17,18,19,20};

    // the testing Arr with Odd length
    long[] arrOdd2nd = {3, 5,6, 7,11,13,14,16 ,17,18,19};

    // the testing Arr with Zero length
    long[] arrZeroLength2nd = {};

    System.out.println(Arrays.toString(reverseArray2nd(arrEven2nd)));
    System.out.println(Arrays.toString(reverseArray2nd(arrOdd2nd)));
    System.out.println(Arrays.toString(reverseArray2nd(arrZeroLength2nd)));
    //////////////////////////////////////////////////////////////

    // test 3rd solution
    // the testing Arr with even length;
    long[] arrEven3rd = {3, 5,6, 7,11,13,14,16 ,17,18,19,20};

    // the testing Arr with Odd length
    long[] arrOdd3rd = {3, 5,6, 7,11,13,14,16 ,17,18,19};

    // the testing Arr with Zero length
    long[] arrZeroLength3rd = {};

    System.out.println(Arrays.toString(reverseArray3rd(arrEven3rd)));
    System.out.println(Arrays.toString(reverseArray3rd(arrOdd3rd)));
    System.out.println(Arrays.toString(reverseArray3rd(arrZeroLength)));
    //////////////////////////////////////////////////////////////

    // test 4th solution
    // the testing Arr with even length;
    long[] arrEven4th = {3, 5,6, 7,11,13,14,16 ,17,18,19,20};

    // the testing Arr with Odd length
    long[] arrOdd4th = {3, 5,6, 7,11,13,14,16 ,17,18,19};

    // the testing Arr with Zero length
    long[] arrZeroLength4th = {};

    System.out.println(Arrays.toString(reverseArray4th(arrEven4th)));
    System.out.println(Arrays.toString(reverseArray4th(arrOdd4th)));
    System.out.println(Arrays.toString(reverseArray4th(arrZeroLength4th)));
  }

  //first solution using for loop and return new arr
  public static long[] reverseArray (long[] arr) {
    long[]  revarsedArr = new long[arr.length];
    for(int i = 0 ; i < arr.length ; i++){
      revarsedArr[i] = (arr[arr.length - 1 - i]);
    }
    return revarsedArr;
  };

  // 2nd solution for loop modify the arg arr
  public static long[] reverseArray2nd (long[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      long ele = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = ele;
    }
    return arr;
  };

  // using recursion and overlaod 3rd solution modify the arg arr
  public static long[] reverseArray3rd (long[] arr) {
    int i = 0;
    if (i >= arr.length / 2 - 1) return arr;
    long ele = arr[i];
    arr[i] = arr[arr.length - i - 1];
    arr[arr.length - i - 1] = ele;
    i++;
    return reverseArray3rd(arr, i);
  };

  public static long[] reverseArray3rd (long[] arr,int i) {
    if (i >= arr.length / 2 - 1) return arr;
    long ele = arr[i];
    arr[i] = arr[arr.length - i - 1];
    arr[arr.length - i - 1] = ele;
    i++;
    return reverseArray3rd(arr, i);
  };
  /////////////////////////////////

  // using recursion and overlaod 4th solution return new array
  public static long[] reverseArray4th (long[] arr) {
    long[] revarsedArr = new long[arr.length];
    int i = arr.length;
    if (i - 1 >= 0) {
      revarsedArr[arr.length -  i] = arr[i - 1];
      i--;
      return reverseArray4th(arr,i,revarsedArr);
    }
    return revarsedArr;
  };

  public static long[] reverseArray4th (long[] arr,int i,long[] revarsedArr) {
    if (i - 1 >= 0) {
      revarsedArr[arr.length -  i] = arr[i - 1];
      i--;
      return reverseArray4th(arr,i,revarsedArr);
    }
    return revarsedArr;
  };
  ///////////////////////////////
}
