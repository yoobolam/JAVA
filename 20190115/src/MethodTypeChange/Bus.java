package MethodTypeChange;

public class Bus extends Vehicle{ //자식클래스
    @Override
    public void run() { // 오버라이딩을 통해 재정의
        System.out.println("버스가 달립니다.");
    }
}
