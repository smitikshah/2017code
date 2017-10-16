package org.usfirst.frc.team2869.robot.subsystems;

import org.usfirst.frc.team2869.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	public Talon tilt = new Talon(RobotMap.intakeTilt);
	public Spark intakeMotor = new Spark(RobotMap.intakeMotor);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

