package org.usfirst.frc.team2869.robot.subsystems;

import org.usfirst.frc.team2869.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
	public CANTalon climber = new CANTalon(RobotMap.climber);
	public DoubleSolenoid solenoid = new DoubleSolenoid(RobotMap.climberSolenoid1, RobotMap.climberSolenoid2);
	//public Solenoid s2 = new Solenoid(RobotMap.climberSolenoid2);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

