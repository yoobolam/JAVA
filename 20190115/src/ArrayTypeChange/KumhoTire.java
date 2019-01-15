package ArrayTypeChange;

public class KumhoTire extends Tire { //다형성을 위한 KumhoTire 클래스

    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + "KumhoTire 수명" + (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("***"+location+"KumhoTire 펑크 ***");
            return false;
        }
    }
}
