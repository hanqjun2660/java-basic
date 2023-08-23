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

    // 배열의 복사
    /*
        기존 배열을 새로운 배열에 복사해보자
     */
    public static void ArrayEx2() {
        int[] arr = new int[5];
        int[] tmp = new int[arr.length * 2];

        for(int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        arr = tmp;

        // 기존 arr이 tmp를 가리키게 되어 아래 출력되는 주소는 동일하게 된다
        // arr과 tmp는 이름만 다를뿐 같은 배열을 가리킨다.
        System.out.println("arr : " + arr);
        System.out.println("tmp : " + tmp);
    }

    // System.arraycopy()로 배열을 복사해보자
    public static void ArrayEx3() {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        // 배열 abc와 num을 붙여서 하나의 배열로 만든다.
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);
    }

    // 배열의 활용
    /*
        총합과 평균 : 배열의 모든 요소를 더해서 총합과 평균을 구한다.
        최대값과 최소값 : 배열의 요소중 제일 큰 값과 작은 값을 찾는다.
        섞기 : 배열의 요소의 순서를 반복해서 바꾼다. (로또, 카드섞기 등)
        임의의 값으로 배열 채우기 : 연속 또는 불연속적인 값들로 배열을 초기화한다.
        정렬하기 : 오름차순, 내림차순으로 배열 정렬
        빈도수 구하기 : 배열에 어떤 값이 몇개 저장되어 있는지 세어서 보여준다.
     */

    // 총합과 평균
    public static void ArrayEx4() {
        int sum = 0;            // 총점을 저장하기 위한 변수
        float average = 0f;     // 평균을 저장하기 위한 변수

        int[] score = {100, 88, 100, 100, 90};

        for(int i = 0; i < score.length; i++) {
            sum += score[i];       // 배열에 존재하는 모든 값을 더해서 저장한다.
        }

        average = sum / (float)score.length;

        System.out.println("총점: " + sum);
        System.out.println("평균 : " + average);
    }

    // 최대값과 최소값
    public static void ArrayEx5() {

        int[] score = {79, 88, 91, 33, 100, 55, 95};
        int max = score[0], min = score[0];

        for(int i = 1; i < score.length; i++) {
            if(score[i] > max) {
               max = score[i];
            } else if(score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }

    // 섞기
    public static void ArrayEx6() {

        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = i;                          // 배열을 0 ~ 9 사이의 숫자로 초기화
            System.out.print(numArr[i]);
        }

        System.out.println();

        for(int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10);     // 0 ~ 9 사이의 임의의 숫자를 저장
            int tmp = numArr[0];                    // numArr의 0번 요소의 값을 임시 저장
            numArr[0] = numArr[n];                  // numArr의 0번 요소의 값을 임의의 인덱스 번호의 값을 대입
            numArr[n] = tmp;                        // numArr n번 인덱스 요소의 값을 기존의 0번 인덱스의 값으로 대입
        }

        for(int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }

    }

    // 섞기(응용, 로또번호 생성)
    public static void ArrayEx7() {
        int[] ball = new int[45];

        for(int i = 0; i < ball.length; i++) {
            ball[i] = i;
        }

        int temp = 0;
        int j = 0;      // 임의의 값을 받아 저장할 변수

        for(int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        // ball 배열에서 앞 6개의 요소를 출력한다.
        for(int i = 0; i < 6; i++) {
            System.out.println("ball" + "[" + i + "] : " + ball[i]);
        }
    }
}
