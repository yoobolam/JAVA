package TypeChange;

public class Child extends Parent{//자식클래스

    @Override
    public void method2() { // 오버라이딩을 통해 부모클래스에 있는 method2메소드를 재선언.
        System.out.println("Child-method2()");
    }

    public void  method3(){ // 자식클래스에 있는 메소드3
        System.out.println("Child-method3()");
    }
}
