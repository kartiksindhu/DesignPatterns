package Structural.Bridge;

public class LandBreathe implements BreatheImplementor {
    @Override
    public void breatheProcess() {
        System.out.println("Land Breathe");
    }
}
