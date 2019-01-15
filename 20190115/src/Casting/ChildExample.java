package Casting;//부모타입을 자식 타입으로 변환하는 것을 말한다.자식타입이 부모타입으로 자동 변환한 후, 다시 자식 타입으로 변환할 때 강제 타입 변환을 사용할 수 있다.

public class ChildExample {
    public static void main(String[] args){
        Parent parent = new Child(); //자동 타입변환
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        //parent.field2="data2";//불가능하다 타입이 변환 되었기때문에 자식 클래스의 필드와 메소드에 접근할 수 없다.
        //parent.method3();//불가능

        Child child = (Child) parent; //강제 타입 변환
        child.field2="yyy";
        child.method3();

    }
}
