

public class AccommodateArrangement{
    public static void main(String[] args) {
        //int[] array1 = new int[] {0,4,1,0,2,6,0,0,7,8,5};
        int[] array2 = new int[] {1,4,1,0,2,3,1};
        //int[] array3 = new int[] {0,0,4,1,10,2,0};
        //int[] array4 = new int[] {1,0,0,1,0,2,1,2,3,4};
        //int[] array5 = new int[] {6,4,0,0,0,0,0,0};
        
        int amount = accommodate(array2);

        System.out.println("Modified arrangement: ");

        for(int i=0; i<=array2.length-1; i++){
            System.out.println(array2[i]);
        }
        System.out.println("The number of non-zero numbers is: " +amount);

    }
     /**
     * This algorithm sorts all non-zero items to the left and
     * returns the number of non-zero items.
     * Complexity: O(n)
     **/
     public static int accommodate(int[] arr) {
     	int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != j) {
                    arr[j] = arr[i];
                    arr[i] = 0;
                }
                j++;
            }
        }
        return j;
    }
}
