package Structural.Bridge;

public class Dogs extends LivingThings {

    public Dogs(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }
    @Override
    void breatheProcess() {
        breatheImplementor.breatheProcess();
    }
}
