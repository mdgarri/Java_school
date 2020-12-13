package homework_1.task_1;

import java.util.Random;

public class Other {

    static int[] generateArray(int size){

        Random random = new Random();
        int[] array = new int[size];

        System.out.print("Array generated: [");
        for (int i = 0; i <= size-1; i++){
            array[i] = random.nextInt(100);
            System.out.print(array[i]+ ",");
        }

        System.out.println("]");

        return array;
    }


    static void printArray(int[] array){
        for (int i = 0; i < array.length-1; i++ )
            System.out.print(array[i] + ",");
        //
        System.out.println(array[array.length-1]);
    }
}
