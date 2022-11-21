package j10_배열;

public class Array4 {

    public static int[] add(int[] array, int value) {
        int[] resultArray = new int[array.length + 1];

        for(int i = 0; i < array.length; i++) { // 기존에 있는 값들을 복사해온다.
            resultArray[i] = array[i];
        }
        resultArray[array.length] = value; //가장 마지막 인덱스에 추가하고자 하는 값을 넣는다.

        return resultArray;
    }


    public static int[] getDuplicateArray(int[] array1, int[] array2) { // 임시 배열 생성
        int[] resultArray = new int[0];

        for(int i = 0; i < array1.length; i++) { //array1번의 크기 만큼 반복
            for(int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) { //array1과 array2의 배열에서 같은 값이 있는지 확인한다.
                    resultArray = add(resultArray, array1[i]);
                }
            }
        }

        return resultArray;
    }

    public static int[] getNonDuplicateArray(int[] array1, int[] array2) {
        int[] resultArray = new int[0];

        for(int i = 0; i < array1.length; i++) {
            int duplicateCountInArray1 = 0;

            for(int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    duplicateCountInArray1++;
                }
            }
            if(duplicateCountInArray1 != 0) {
                continue;
            }
            resultArray = add(resultArray, array1[i]);
        }

        for(int i = 0; i < array2.length; i++) {
            int duplicateCountInArray2 = 0;

            for(int j = 0; j < array2.length; j++) {
                if(array2[i] == array1[j]) {
                    duplicateCountInArray2++;
                }
            }
            if(duplicateCountInArray2 != 0) {
                continue;
            }
            resultArray = add(resultArray, array2[i]);
        }

        return resultArray;
    }

    public static int getMinNumberInArray(int[] array) { // 가장 작은 값을 구한다.
        int min = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static int getMaxNumberInArray(int[] array) { // 가장 큰 값을 구한다.
        int max = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //배열 생성
        int[] nums2 = new int[] {6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; //배열 생성

        int[] duplicateArray = getDuplicateArray(nums1, nums2); // nums1, nums2 중 중복된 값을 가지고 온다
        int[] nonDuplicateArray = getNonDuplicateArray(nums1, nums2);

        int minNumberInDuplicateArray = getMinNumberInArray(duplicateArray);
        int maxNumberInNonDuplicateArray = getMaxNumberInArray(nonDuplicateArray);

        System.out.println("중복된 값 중 최소값: " + minNumberInDuplicateArray);
        System.out.println("중복되지 않은 값 중 최대값: " + maxNumberInNonDuplicateArray);

        /*
        1. 두 배열에서 중복된 값 중 최소값
        2. 두 배열에서 중복되지 않은 값 중 최대값
         */


    }
}