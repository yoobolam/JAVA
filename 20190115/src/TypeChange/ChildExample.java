package TypeChange;

public class ChildExample {
    public static void main(String[] args){
        Child child = new Child(); //자식클래스의 객체 만듬
        Parent parent = child; //child의 타입을 Parent로 바꿈


        parent.method2(); //타입변환을 하여 자식메소드에있는 오버라이딩된 메소드를 호출한다.
        parent.method1();  //Parent 클래스에 있는 method1메소드를 호출
        //parent.method3();//Parent타입으로 변환후 method3를 호출할 수 없다.
    }
}
