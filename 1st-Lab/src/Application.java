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
    public static void main(String[] args) {

        System.out.println("선택한 동물은 : " + args[0] + "입니다.");

        if ("Dog".equals(args[0])) { // 만약에 args가 Dog와 같다면 멍멍
            Dog.say();
        } else if ("Cat".equals(args[0])) { // 만약에 args가 Cat와 같다면 야옹
            Cat.say();
        } else if ("Chicken".equals(args[0])) { // 만약에 args가 Chicken과 같다면 꼬끼오
            Chicken.say();
        } else {
            System.out.println("동물을 선택해 주세요 Dog, Cat, Chicken");
        }
    }
}
