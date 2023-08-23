package array;

import java.util.Arrays;

public class Array {

    // Arrays.toString() 메서드를 사용해서 배열의 값을 확인하자
    public static void ArrayEx1() {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//      int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        // 첫번째 배열의 길이만큼 1 ~ 10을 순차적으로 저장한다.
        for(int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }

        // 두번째 배열에도 똑같이 넣지만 순서대로가 아닌 무작위로 넣어보자
        for(int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random() * 10 + 1);
        }

        // 첫번째 배열의 값을 출력해보자
        for(int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ",");
        }

        // 나머지도 출력해보자
        System.out.println();
        System.out.println("첫번째 : " + Arrays.toString(iArr1));
        System.out.println("두번째 : " + Arrays.toString(iArr2));
        System.out.println("세번째(숫자) : " + Arrays.toString(iArr3));
        System.out.println("네번째(문자) : " + Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
    }
}
