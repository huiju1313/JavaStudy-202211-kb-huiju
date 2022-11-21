package j10_배열;

/*
randomArray 배열을 생성(공간 = 10개)
10, 2, 3, 4, 5, 6, 7, 8, ... c총합??
*/

import java.util.Random;

public class Array3 {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] randomArray = new int[10];
//        int total = 0;
//
//
//        //배열에 랜덤한 값 대입
//
//
//            for (int i = 0; i < randomArray.length; i++) {
//                randomArray[i] = random.nextInt(10) + 1;
//            }
//
//
//}
//}

    private static int foundMinNumber(int[] numbers) {
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
            }
        }

        return min;
    }

    private static int foundMaxNumber(int[] numbers) {
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {
        Random random = new Random();
        int[] randomArray = new int[10];
        int total = 0;

        for (int i = 0; i < randomArray.length; i++) {
            while (true) {

                int randomNumber = random.nextInt(10) + 1;
                int count = 0;

                for (int j = 0; j < randomArray.length; j++) {
                    if(randomArray[i] == randomNumber) {
                        count++;
                         break;
                    }
                }
                if(count == 0) {
                    randomArray[i] = randomNumber;
                    break;
                }
            }

        }
        for (int i = 0; i < randomArray.length; i++) {
        //    if (randomArray[i] != randomArray[i]) {
                total += randomArray[i];

                System.out.print(randomArray[i]);


                if (i != randomArray.length - 1) {
                    System.out.print(", ");

                }
            }

            System.out.println();
            System.out.println("총합 : " + total);
            System.out.println("최소값 : " + foundMinNumber(randomArray));
            System.out.println("최대값 : " + foundMaxNumber(randomArray));

        }



    }



// 겹치는 것 중에 제일 큰 값




//
//    int[] numbers = new int[10];
//    int add = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//        System.out.print(random.nextInt(10)+1 +", ");
//
//        if (i+1 == numbers.length)
//        System.out.println(numbers[i]+1);
//
//        add += numbers[i];
//        }
//        System.out.println("총점 : " + add);