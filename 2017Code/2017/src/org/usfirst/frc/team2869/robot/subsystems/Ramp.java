package org.usfirst.frc.team2869.robot.subsystems;

import org.usfirst.frc.team2869.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Ramp extends Subsystem {
	public DoubleSolenoid solenoid = new DoubleSolenoid(RobotMap.rampSolenoid1,
			RobotMap.rampSolenoid2);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

