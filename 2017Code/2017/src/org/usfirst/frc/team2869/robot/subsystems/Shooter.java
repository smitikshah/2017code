package org.usfirst.frc.team2869.robot.subsystems;

import org.usfirst.frc.team2869.robot.MiniPID;
import org.usfirst.frc.team2869.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	public Spark shooter1 = new Spark(RobotMap.shooterWheel1);
	public Spark shooter2 = new Spark(RobotMap.shooterWheel2);
	public MiniPID pid = new MiniPID(0,0,0);
	public Encoder encoder = new Encoder(RobotMap.shooterA, RobotMap.shooterB);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

