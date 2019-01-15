package MethodTypeChange;

public class Taxi extends Vehicle {//자식클래스
    @Override
    public void run() { //오버라이딩을 통해 재정의
        System.out.println("택시가 달립니다.");
    }
}
