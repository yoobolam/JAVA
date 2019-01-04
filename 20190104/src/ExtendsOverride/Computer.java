package ExtendsOverride;

public class Computer extends Calculator { //부모클래스를 상속받은 자식 클래스
    @Override //생략해도 되지만 정확한 오버라이딩 체크를 위해서
    double areaCircle(double r) { //부모클래스에있는 메소드 오버라이딩 함

        System.out.println("Computer 객체의 areaCircle() 실행");

        super.areaCircle(1);//오버라이딩한 클래스말고 원래의 클래스를 사용하고싶을때.부모메소드 호출

        return Math.PI*r*r; //부모클래스에서는 값을 지정했지만 여기서는 자바에서 제공하는 함수를 사용
    }

}
