public class ManipulatorShoot extends Command {
    private final ManipulatorSubsystem manipulatorSubsystem;
    private final double speed;

    public ManipulatorShoot(ManipulatorSubsystem manipulatorSubsystem, double speed) {
        this.manipulatorSubsystem = manipulatorSubsystem;
        this.speed = speed;

        addRequirements(manipulatorSubsystem);
    }
    
    @Override
    public void execute() {
        manipulatorSubsystem.setSpeed(speed);
    }
}
