package Car;

public class Car {

    private  int speed;
    private  boolean stop;

    public int getSpeed(){ //speed값을 외부로 보낸다.
        return  speed;
    }
    public void setSpeed(int speed){ //외부에서 얻은 speed값이 유효한지 확인한다.
        if (speed>0){
            this.speed=speed;
            return;
        }else {
            this.speed=0;
        }
    }

    public boolean isStop(){ //현재 false인 상태
        return stop;
    }
    public void setStop(boolean stop){
        this.stop=stop;
        this.speed=0;
    }
}
