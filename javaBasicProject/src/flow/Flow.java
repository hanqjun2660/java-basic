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

}
