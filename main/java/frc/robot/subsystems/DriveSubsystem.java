// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  // TODO: Initialize a DifferentialDrive variable
  private final DifferentialDrive differentialDrive;
  // TODO: Initialize four CANSparkMax motors
  private final CANSparkMax frontLeftMotor;
  private final CANSparkMax frontRightMotor;
  private final CANSparkMax backLeftMotor;
  private final CANSparkMax backRightMotor;

  public ExampleSubsystem() {
    // TODO: Set motor current limits
    frontLeftMotor = new CANSparkMax(2, MotorType.kBrushless);
    frontRightMotor = new CANSparkMax(3, MotorType.kBrushless);
    backLeftMotor = new CANSparkMax(4, MotorType.kBrushless);
    backRightMotor = new CANSparkMax(5, MotorType.kBrushless);

    SparkMaxConfig config = new SparkMaxConfig();
    config.smartCurrentLimit(40);
    frontLeftMotor.configure(config, null, null);
    frontRightMotor.configure(config, null, null);
    backLeftMotor.configure(config, null, null);
    backRightMotor.configure(config, null, null);

    // TODO: Set the rear left and right motors to be followers
    backLeftMotor.follow(frontLeftMotor);
    backRightMotor.follow(frontRightMotor);
    // TODO: Set one side of the motors to be inverted 
    frontRightMotor.setInverted(true);
    // TODO: Assign the DifferentialDrive variable to a new DifferentialDrive object passing in the two front motors
    differentialDrive = new DifferentialDrive(frontLeftMotor, frontRightMotor);
    // TODO: Pass in a max speed 
    differentialDrive.setMaxOutput(0.8);
  }

  // TODO: Create an arcadeDrive method, taking in speed and rotation 
  public void arcadeDrive(double speed, double rotation) {
    differentialDrive.arcadeDrive(speed, rotation);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
