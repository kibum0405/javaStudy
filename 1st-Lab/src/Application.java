// Hello, world 출력
/*
public class Application {

    // equals 비교 연산자
    public static void main(String[] args) {

        System.out.println("선택한 동물은 : " + args[0] + "입니다.");

        if ("Dog".equals(args[0])) { // 만약에 args가 Dog와 같다면 멍멍
            System.out.println("멍멍");
        } else if ("Cat".equals(args[0])) { // 만약에 args가 Cat와 같다면 야옹
            System.out.println("야옹");
        } else if ("Chicken".equals(args[0])) { // 만약에 args가 Chicken과 같다면 꼬끼오
            System.out.println("꼬끼오");
        } else {
            System.out.println("동물을 선택해 주세요 Dog, Cat, Chicken");
        }
    }
}
*/

public class Application {

    // equals 비교 연산자
    // static 은 공유할때 사용
    public static void main(String[] args) throws Exception {

        System.out.println("선택한 동물은 : " + args[0] + "입니다.");

        // 기존 방식 코드
        /*
        if ("Dog".equals(args[0])) { // 만약에 args가 Dog와 같다면 멍멍
            me = new Dog();
        } else if ("Cat".equals(args[0])) { // 만약에 args가 Cat와 같다면 야옹
            me = new Cat();
        } else if ("Chicken".equals(args[0])) { // 만약에 args가 Chicken과 같다면 꼬끼오
            me = new Chicken();
        }
        */

        // 인스턴스
        // Class.forName라 하는 것은 args[0] 명으로 넘어온 Class 명으로 객체를 만들어 달라는 뜻
        Animal me = (Animal) Class.forName(args[0]).newInstance();

        if (me != null) {
            me.say();
        }
    }
}
