package flow;

import java.util.Scanner;

public class Flow {

    // if문
    /*
        if문은 조건식, true, false로 이루어져 있으며,
        조건식이 true이면 {}안 문장들을 수행한다.
     */
    public static void FlowEx() {
        int x = 0;
        System.out.printf("x=%d 일때, 참인 것은%n", x);

        if(x == 0) {System.out.println("x==0");}
        if(x != 0) {System.out.println("x!=0");}
        if(!(x == 0)) {System.out.println("!(x==0)");}
        if(!(x != 0)) {System.out.println("!(x!=0)");}

        x = 1;
        System.out.printf("x=%d 일 때, 참인 것은 %n", x);

        if(x == 0) {System.out.println("x==0");}
        if(x != 0) {System.out.println("x!=0");}
        if(!(x == 0)) {System.out.println("!(x==0)");}
        if(!(x != 0)) {System.out.println("!(x!=0)");}
    }

    // if-else문
    /*
        조건식의 결과 밖의 결과(false인 경우) 수행할 코드를 작성할 수 있다.
     */
    public static void FlowEx2() {
        System.out.print("숫자를 하나 입력하세요.");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }
    }

    // if-else if문
    /*
        처리해야할 경우의 수가 여러개인 경우 사용할 수 있다.
     */
    public static void FlowEx3() {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if(score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if(score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("당신의 학점은 " + grade + "입니다.");
    }

    // 중첩 if문
    /*
        if문 블럭 내 또 다른 if문을 포함시켜 사용
     */
    public static void FlowEx4() {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력해주세요.");

        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        System.out.printf("당신의 점수는 %d입니다.%n", score);

        if(score >= 90) {
            grade = 'A';
            if(score >= 98) {
                opt = '+';
            } else if(score < 94) {
                opt = '-';
            }
        } else if(score >= 80) {
            grade = 'B';
            if(score >= 88) {
                opt = '+';
            } else if(score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }

        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
    }


    // switch문
    /*
        경우의 수가 많아질수록 if문은 조건식이 많아져 가독성이 떨어진다.
        이럴때 switch문을 사용하면 간결하게 처리할 수 있다.
        조건식에 맞는 case문으로 이동하여 수행하고 break문을 사용하여 switch문을 빠져나올 수 있다.
        (switch문의 조건식 결과는 정수 또는 문자열이어야하며, case문의 값은 정수, 상수만 가능하고 중복되선 안된다.)
     */

    public static void FlowEx5() {
        System.out.print("현재 월을 입력하세요.");

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 3:                                             // case문은 한줄씩 또는 한줄에 붙여서 쓰던 상관없다.
            case 4:
            case 5:
                System.out.println("현재 계절은 봄입니다.");
                break;                                          // break 문을 통해 switch문을 빠져나와야 한다.
            case 6: case 7: case 8:
                System.out.println("현재 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재 계절은 가을입니다.");
                break;
            default: case 12: case 1: case 2:                   // default문은 위의 case를 제외하고 나머지 결과에 대한것으로 switch문 마지막이기 때문에 break문이 필요없다.
                System.out.println("현재 계절은 겨울입니다.");
        }
    }

    // switch문을 활용하여 간단한 게임을 작성해보자
    public static void FlowEx6() {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.");

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        // Math.random은 0.0 ~ 1.0 사이의 double형 난수를 반환한다.
        int com = (int)(Math.random() * 3 ) + 1;

        System.out.println("당신은 " + user + "입니다.");
        System.out.println("컴퓨터는 " + com + "입니다.");

        switch(user-com) {
            case 2: case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case 1: case -2:
                System.out.println("당신이 이겼습니다.");
            case 0:
                System.out.println("비겼습니다.");           // switch문의 마지막으로 break 생략가능
        }
    }

    // 주민등록번호를 받아서 성별을 출력해보자
    public static void FlowEx7() {
        System.out.print("당신의 주민등록번호를 입력하세요. (000000-0000000)");

        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();

        char gender = regNo.charAt(7);  // 입력받은 문자열 8번째 자리 저장

        switch (gender) {
            case '1': case '3':
                System.out.println("당신의 성별은 남자입니다.");
                break;
            case '2': case '4':
                System.out.println("당신의 성별은 여자입니다.");
                break;
            default:
                System.out.println("외국인이거나 유효하지 않은 주민등록번호입니다.");
        }
    }

    // 반복문 (For문)
    /*
        for문은 반복횟수를 알고 있을 때 사용하기 적합하다.
        for문은 초기화, 조건식, 증감식, 블럭 4개의 부분으로 나누어져 있고 조건식이 거짓이 되면 for문을 벗어난다.
     */
    public static void FlowEx8() {
        // 아래와 같이 초기화, 조건식, 증감식, 블럭의 구조로 이루어져있다.
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }
    }

    // for문으로 1부터 10까지 합계를 구해보자
    public static void FlowEx9() {
        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("1부터 10까지 합계 : " + sum);
    }

    // 중첩 For문
    /*
        if문과 같이 for문안에 또 다른 for문을 포함시킬 수 있다.
     */
    public static void FlowEx10() {

        // for문 안 중첩이 가능하다.
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 중첩 for문을 이용하여 삼각형 모양의 *을 찍어보자 출력 라인수는 사용자로부터 입력받자
    public static void FlowEx11() {
        int num = 0;

        System.out.print("*을 출력할 라인의 수를 입력해주세요.");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 그럼 중첩 for문을 이용해서 구구단을 출력해보자
    public static void FlowEx12() {
        for(int i = 2; i <= 9; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.println(i + "x" + j + "=" + (i*j));
            }
        }
    }

    // 이번엔 for문과 if문을 사용하여 조건에 맞을때 공백을 출력해보자
    public static void FlowEx13() {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i == j) {
                    System.out.print("[" + i + "," + j +"]");
                } else {
                    System.out.printf("%5c", ' ');
                }
            }
            System.out.println();
        }
    }

    // for each문
    /*
        배열과 컬렉션에 저장된 요소에 접근할때 기존 for문보다 편리한 방법으로 처리할 수 있도록
        for each문이 추가되었다. (JDK1.5 이후)

        for(타입 변수명 : 배열 또는 컬렉션){
            // 반복될 문장
        }
     */
    // 배열을 만들어 for each문으로 출력을 해보자
    public static void FlowEx14() {
        int arr[] = {10,20,30,40,50};
        int sum = 0;

        // 기존 for문
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

        System.out.println();

        // for each문으로 작성하면 간결하다.
        for(int tmp : arr) {
            System.out.printf("%d ", tmp);
            sum += tmp;
        }
        System.out.println();
        System.out.println("sum= " + sum);
    }

    // while문
    /*
        for문보다 간략하게 작성이 가능하고 조건식과 코드 블럭으로만 이루어져 있다.
        조건식이 참인동안 반복되며, 조건식의 연산결과가 거짓일때 while문을 빠져나온다.
        조건식이 참인동안 항상 반복되기 때문에 무한루프에 빠지기 쉬우니 유념하자
     */
    public static void FlowEx15() {
        int i = 5;

        while (i-- != 0) {      // i가 0이 아닐때 true 즉, i가 0이 되면 반복을 중지하고 while문을 빠져나온다.
            System.out.println(i + " - i can do it.");
        }
    }

    // while문을 이용해서 각 자리수의 합을 출력해보자
    public static void FlowEx16() {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요 (예 : 12345)>");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        num = Integer.parseInt(tmp);

        while(num != 0) {     // 입력받은 값이 0이 될때까지 반복
            sum += num%10;      // num을 10으로 나눈 나머지를 sum에 더함
            System.out.printf("sum=%3d num=%d%n", sum, num);

            num /= 10;  // num = num / 10; num을 10으로 나눈 값을 다시 num에 저장
        }
        System.out.println("각 자리수의 합:" + sum);
    }

    // while을 사용하여 1부터 몇까지 더하면 누적합계가 100을 넘지 않는 수가 제일 큰 수가 되는지 알아보자
    public static void FlowEx17() {
        int sum = 0, i = 0;

        // i를 1씩 증가시켜서 100이 넘지 않을때까지 더하여 100이하 제일 큰 수를 출력하자
        while((sum += ++i) <= 100) {
            System.out.printf("%d - %d%n", i, sum);
        }
    }

    // while문을 사용하여 사용자로부터 숫자를 입력받다가 0을 입력하면 입력을 마치고 총합을 출력해보자
    public static void FlowEx18() {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요 (끝내려면 0을 입력)");

        while(flag) {
            System.out.print(">>");

            String tmp = sc.nextLine();
            num = Integer.parseInt(tmp);

            if(num != 0) {
                sum += num;     // 사용자가 0이 아닌 숫자를 입력하면 sum 변수에 중첩하여 더한다.
            } else {
                flag = false;   // 사용자가 0을 입력하면 flag를 false로 만들어 while문을 빠져나온다.
            }
        }

        System.out.println("합계: " + sum);
    }

    // do-while문
    /*
        while문과 기본적인 구조는 같지만 do문 블럭의 내용을 먼저 실행하고 while문의 조건식을 평가한다.
        쉽게 말해 do-while문은 조건식의 결과와 상관없이 최초 1회는 무조건 실행된다.
     */

    // 1부터 100까지의 숫자를 랜덤하게 생성하고 사용자로부터 숫자를 입력받아 맞출때까지 반복하는 프로그램을 작성해보자
    public static void FlowEx19() {

        int input = 0;      // 사용자로부터 입력받은 수를 저장
        int answer = 0;     // Math.random 함수를 사용하여 1부터 100 사이의 값을 저장할 변수

        answer = (int) (Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("1부터 100사이의 값을 입력하세요.");
            input = sc.nextInt();

            if(input > answer) {
                System.out.println("더 작은 수로 다시 시도하세요.");
            } else if(input < answer) {
                System.out.println("더 큰 수로 다시 시도하세요.");
            }

        } while(input != answer);   // 입력한 숫자와 정답이 같으면 false가 나와야 하기때문에 해당 조건식을 작성

        System.out.println("정답입니다.");
    }
}
