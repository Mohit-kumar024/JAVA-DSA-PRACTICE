public class shrtArry  {
    public static void main(String[] args) {
       int[] arr = {1,2,4,5,6};

  //      boolean sorted = true;
int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
    }
} 
