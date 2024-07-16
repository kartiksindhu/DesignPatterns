package Structural.Bridge;

public class Fish extends LivingThings {

    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    void breatheProcess() {
        breatheImplementor.breatheProcess();
    }
}
