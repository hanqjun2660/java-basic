package introduce;

public class Intriduce {
    // 자바란?
    /*
        썬 마이크로시스템즈에서 개발한 객체지향 언어
        1. 운영체제에 독립적, 운영체제의 종류에 상관없이 실행이 가능하다.
        2. 객체지향 언어로써 상속, 캡슐화, 다형성이 잘 적용된 언어이다.
        3. 간결하고 이해가 쉬운 코드, 유지보수성이 용이하다.
        4. 자동 메모리 관리 (가비지컬렉터가 자동으로 메모리를 관리하여 개발자는 메모리를 따로 관리하지 않아도 된다.)
        5. 네트워크와 분산처리 지원
        6. 멀티쓰레드 지원
        7. 동적로딩을 지원(필요한 시점에서 클래스가 로딩됨)
     */

    // JVM(Java Virtual Machine)
    /*
        JVM은 자바를 실행하기 위한 가상 컴퓨터이다.
        자바로 작성된 애플리케이션은 모두 이 JVM에서만 실행되기 때문에, JAVA 애플리케이션 실행을 위해선 반드시 JVM이 필요하다.
        자바 애플리케이션은 JVM하고만 상호작용을 하기 떄문에 운영체제로부터 독립적이지만 JVM은 OS에 종속적이기 때문에
        해당 OS에서 실행이 가능한 JVM이 필요하다.
     */

    // 자바 프로그램 작성
    /*
        자바에서 모든 코드는 반드시 클래스 안에 존재하여야 한다.
        자바로 작성된 코드는 javac.exe (자바 컴파일러)를 통해 컴파일 되어 .class를 생성 후 자바 인터프리터(java.exe)로 실행된다.
        자바 애플리케이션에는 main메서드를 포함한 클래스가 반드시 한개는 존재하여야 한다.
        ex)
        class 클래스명 {
            주석을 제외한 모든 코드는 블럭안에 작성되어야한다.

            // Method
            public static void main(String[] args) {
                // 실행될 코드 작성
                System.out.println("Hello World!");
            }
        }
     */

    // 자주 발생하는 에러
    /*
        1. cannot find symbol / cannot resolve symbol
            - 지정된 변수나 메서드를 찾을 수 없는 뜻으로 선언되지 않은 변수나 메서드를 사용할 때 발생한다.
              대부분 오타인 경우가 많다. 자바는 대소문자 구분을 하기 때문에 일치여부를 꼼꼼히 확인하여야 한다.

        2. ';' expected
            - 세미콜론이 필요한 곳에 없다는 뜻. 자바의 모든 문장 끝에는 ';'를 붙여주어야 한다.

        3. Exception in thread "main" java.lang.NoSuchMethodError: main
            - main 메서드를 찾을 수 없다는 뜻으로 실제로 클래스 내에 main 메서드가 존재하지 않거나
              main 메서드 선언부에 오타가 존재하는 경우 발생한다.

        4. Exception in thread "main" java.lang.NoClassDefFoundError: Hello
            - Hello 클래스를 찾을 수 없다는 뜻이다. 클래스의 철자 확인 후 이상이 없다면
              실제 class 파일이 있는지 확인해야한다.

        5. illegal start of expression
            - 문장 또는 수식의 앞 부분이 문법에 맞지 않는다는 뜻. 문법 오류를 뜻한다.

        6. class, interface, or enum expected
            - class나 interface 혹은 enum이 없다이지만 보통 괄호 '{}'의 갯수가 맞지 않을 때 발생한다.
     */
}
