package Car;

import Car.Car;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Car myCar = new Car();

       myCar.setSpeed(-50);
        System.out.println("현재속도는 :"+ myCar.getSpeed()+"km입니다");

        myCar.setSpeed(60);
        System.out.println("현재속도는 :"+ myCar.getSpeed()+"km입니다");


        if(!myCar.isStop()){ //현재 차가 멈추지 않았을때 상태를 멈추는것으로 바꾼다.
            myCar.setStop(true);
        }
        System.out.println("현재속도는 :"+ myCar.getSpeed()+"km입니다");
    }
}
