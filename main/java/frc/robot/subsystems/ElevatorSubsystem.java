public class ElevatorSubsystem extends SubsystemBase {
    private final SparkMax rightMax;
    private final SparkMax leftMax;

    public ElevatorSubsystem() {
        rightMax = new SparkMax(14, MotorType.kBrushless); // port 14
        leftMax = new SparkMax(15, MotorType.kBrushless); // port 15

        SparkMaxConfig leftConfig = new SparkMaxConfig();
        leftConfig.smartCurrentLimit(40);
        leftMax.configure(leftConfig, null, null);

        SparkMaxConfig rightConfig = new SparkMaxConfig();
        rightConfig.smartCurrentLimit(40);

        rightConfig.follow(leftMax, true);
        
        rightMax.configure(rightConfig, null, null);
    }

    public void manualControl(double speed) {
        leftMax.set(speed);

    }
}