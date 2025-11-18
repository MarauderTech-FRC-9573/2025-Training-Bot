// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ManipulatorSubsystem extends SubsystemBase { 
    // TODO: Create one Talon motor 
    private final TalonSRX talon;
    public ManipulatorSubsystem() {
        // TODO: Assign the Talon Motor
        talon = new TalonSRX(1);

    }

    // TODO: Create a method to run the motor 
    public void runMotor(double speed) {
        talon.set(speed);
    }
}