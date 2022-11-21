package j10_배열;

public class Array5 {

    public static int gerMinNumber(int nums1, int nums2) {
        return nums1 < nums2 ? nums1 : nums2;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 5, 9, 13, 17};
        int[] nums2 = new int[] {2, 6, 10, 14, 18};
        int[] nums3 = new int[] {3, 7, 11, 15, 19};
        int[] nums4 = new int[] {4, 8, 12, 16, 20};

        int[] resultArray = new int[5];

        for(int i = 0; i < nums1.length; i++) {
            resultArray[i] = gerMinNumber(gerMinNumber(nums1[i], nums2[i]), gerMinNumber(nums3[i], nums4[i]));
            System.out.println(resultArray[i]);
        }

        int a = 10;
        int b = 5;
        int c = 7;

        int min = 0;

        if(a<b) {
            min = a;
        }else {
            min = b;
        }
        if(c<min) {
            min = c;
        }

//        System.out.println("min : " + min);

    }
}
// 네개의 배열 중 동일 인덱스에 위치한 것 중 최솟값인 것만 다 뽑는다.
// 새로운 배열을 만들어서 그 배열을 출력하면 된다.