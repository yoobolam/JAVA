package Abstract;//공통된 필드와 메소드의 이름을 통일할 목적, 실체 클래스 작성시 시간 절약

public abstract class Phone { //폰 규격을 Phone으로 추상화클래스를 만든다.외부에서 객체를 직접 이용불가

    public  String owner;

    public Phone(String owner){
        this.owner=owner;
    }

    public void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }
    public void  turnOff(){
        System.out.println("폰 전원을 끕니다");
    }
}
