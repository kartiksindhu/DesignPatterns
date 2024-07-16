package Structural.Bridge;

public class WaterBreathe implements BreatheImplementor {
    @Override
    public void breatheProcess() {
        System.out.println("water breathe");
    }
}
