package Abstract;

public class PhoneExample {
    public static void main(String[] args){
        //Phone phone = new Phone(); //추상클래스 객체를 직접이용불가
        SmartPhone smartPhone = new SmartPhone("홍길동씨");

        smartPhone.turnOn();
        smartPhone.internetSerch();
        smartPhone.turnOff();

    }
}
