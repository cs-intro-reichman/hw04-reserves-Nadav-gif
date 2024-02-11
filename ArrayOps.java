public class ArrayOps {
    public static void main(String[] args) {

    }

    //this function finds the missing integer in the array and returns it.
    public static int findMissingInt (int [] array) {
        int [] new_arr = new int[array.length + 1];
        int missing = 0;
        for (int i = 1; i < new_arr.length; i++) {
            new_arr[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            new_arr[array[i]] = 1;
        }
        for (int i = 1; i < new_arr.length; i++) {
            if (new_arr[i] == 0) {
                missing = i;
            }
        }
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        int max1 = array[0];
        int max2 = array[0];
        int count_max = 0;
        //finds the largest number in the array
        for (int i = 0; i < array.length; i++) {
            if (max1 < array[i]) {
                max1 = array[i];
            }
        }
        // checks if the max appears more than once abd return it if it does.
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max1) {
                count_max++;
            }
        }
        if (count_max > 1) {
            return max1;
        }
        // find the second largest number in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max2 && array[i] < max1) {
                max2 = array[i];
            }
        }
        return max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    count++;
                }
            }
            if (count == 0) {
                return false;
            }
            count = 0;
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean up = true;
        boolean down = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                up = false;
            } else if (array[i] < array[i+1]) {
                down = false;
            }
        }
        if (up || down) {
            return true;
        } else {
            return false;
        }

    }
}
