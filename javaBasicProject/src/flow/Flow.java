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
}
