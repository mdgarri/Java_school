package homework_1.task_1;

public class BinarySearch {

    static int binary_search(int[] array, int key, int l, int h, boolean isArraySorted) {

        if (!isArraySorted){ //we will sort array if it's not sorted
            BubbleSort.bubble_sort(array);
        }

        int middle = (l + h)/2;

        if (h < l) {
            return -1;
        }

        if ( key == array[middle]) return middle;

        if (key < array[middle])
            return binary_search(array, key, l, middle - 1,isArraySorted);
        else
            return binary_search(array, key, middle + 1, h,isArraySorted);

    }


    public static void main(String[] args) {

        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};


        System.out.println("Результат поиска (индекс) = " + binary_search(array,250, 0,array.length-1,true));
        // if result index equal to -1 then key was not found in the array

        //we can also put in in the parameters not sorted array, then we should pass false for the last parameter

    }

}
