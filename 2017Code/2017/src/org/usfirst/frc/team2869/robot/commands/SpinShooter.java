package org.usfirst.frc.team2869.robot.commands;

import org.usfirst.frc.team2869.robot.OI;
import org.usfirst.frc.team2869.robot.Robot;
import org.usfirst.frc.team2869.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SpinShooter extends Command {
	Shooter shooter;
	double totalSpeed = 0;
	int i = 0;
	long timePressed = 0;
    public SpinShooter() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shooter);
    	shooter = Robot.shooter;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timePressed = System.currentTimeMillis();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double velocity = shooter.encoder.getRate();
    	
    	//double output = shooter.pid.getOutput(velocity);
    	shooter.shooter1.set(1);
    	shooter.shooter2.set(1);
    	//totalSpeed += velocity;
    	//i++;
    	//SmartDashboard.putNumber("Avg Speed", totalSpeed/i);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !OI.driverJoystick.GetXValue();
    }

    // Called once after isFinished returns true
    protected void end() {
    	shooter.shooter1.set(0);
    	shooter.shooter2.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
