package Abstract;

public class SmartPhone extends Phone {//추상클래스 메소드를 사용

    public SmartPhone(String owner) {
        super(owner);
    }

    public void internetSerch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
