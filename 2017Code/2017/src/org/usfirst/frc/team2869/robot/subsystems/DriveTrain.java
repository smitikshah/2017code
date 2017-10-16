package org.usfirst.frc.team2869.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team2869.robot.GyroScope;
import org.usfirst.frc.team2869.robot.RobotMap;

import com.ctre.CANTalon;
/**
 *
 */
public class DriveTrain extends Subsystem {
	public CANTalon leftMotor1 = new CANTalon(RobotMap.leftMotor1),
			leftMotor2 = new CANTalon(RobotMap.leftMotor2),
			rightMotor1 = new CANTalon(RobotMap.rightMotor1),
			rightMotor2 = new CANTalon(RobotMap.rightMotor2);
	
	public RobotDrive drive = new RobotDrive(leftMotor1, 
			rightMotor1);
	public GyroScope gyro = new GyroScope();
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

