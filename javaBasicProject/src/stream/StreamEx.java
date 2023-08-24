package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

    // 컬렉션이나 배열에 데이터를 담고 원하는 결과를 얻기 위해선 For문이나 Iterator를 이용하였다.
    // 하지만 재사용성이 떨어지고 코드가 너무 길고 보기 어렵다.
    // 스트림을 이용하면 배열이나 컬렉션 뿐만 아니라 파일에 저장된 데이터도 같은 방식으로 다룰 수 있다.

    // 간단한 예시를 작성해보자
    public static void StreamEx1() {

        String[] strArr = {"aaa", "bbb", "ccc"};
        List<String> strList = Arrays.asList(strArr);

        // 스트림을 생성
        Stream<String> strStream1 = strList.stream();
        Stream<String> strStream2 = Arrays.stream(strArr);

        // 2가지 스트림의 데이터 소스는 서로 다른 형식이지만 정렬과 출력하는 방법은 동일하다.
        strStream1.sorted().forEach(System.out::println);
        strStream2.sorted().forEach(System.out::println);
    }

    // 학생의 성적 정보를 받아 반 별로 정렬한다음 총점별 내림차순으로 정렬해보자
    public static void StreamEx2() {

        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

    }

    // List에서 특정 조건을 만족하는 결과만 골라내어 출력해보자
    public static void StreamEx3() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(30);
        numbers.add(45);
        numbers.add(50);

        // 스트림으로 30보다 큰 숫자만 필터링 하여 새로운 리스트로 만들자
        List<Integer> filteredNumbers = numbers.stream()
                .filter(number -> number > 30)
//              .sorted()       // 오름차순으로 정렬됨
                .sorted(Comparator.reverseOrder())  // 내림차순으로 정렬됨
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Filtered List: " + filteredNumbers);
    }
}
