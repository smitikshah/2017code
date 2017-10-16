package org.usfirst.frc.team2869.robot.commands;

import org.usfirst.frc.team2869.robot.Robot;
import org.usfirst.frc.team2869.robot.RobotMap;
import org.usfirst.frc.team2869.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveForward extends Command {
	DriveTrain driveTrain;
	double distance;
	double angle;
	double power;
	double speed;
	long time;
	private long timeStarted;
	long timeToGo;
    public DriveForward(double distance, double power) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	driveTrain = Robot.driveTrain;
    	this.distance = distance;
    	this.power = power;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	timeStarted = System.currentTimeMillis();
    	angle = driveTrain.gyro.getYaw();
    	speed = RobotMap.speedAtFullVoltage * power;
    	timeToGo = (long)(distance / speed) * 1000;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double currentAngle = driveTrain.gyro.getYaw();
    	driveTrain.drive.arcadeDrive(speed, 0);
    }
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return System.currentTimeMillis() - timeStarted >= timeToGo;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
