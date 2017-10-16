package org.usfirst.frc.team2869.robot.commands;

import org.usfirst.frc.team2869.robot.Robot;
import org.usfirst.frc.team2869.robot.RobotMap;
import org.usfirst.frc.team2869.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveForwardTime extends Command {
	DriveTrain driveTrain;
	long timeStarted;
	long timeToRun;
	double angle;
    public DriveForwardTime(long time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	driveTrain = Robot.driveTrain;
    	timeToRun = time;
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timeStarted = System.currentTimeMillis();
    	angle = driveTrain.gyro.getYaw();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	long currentTime = System.currentTimeMillis();
    	double currentAngle = driveTrain.gyro.getYaw();
    	double xVal = ((currentTime - timeStarted) / timeToRun) * (Math.PI/2);
    	double speed = Math.cos(xVal) * RobotMap.speedMultiplier;
    	driveTrain.leftMotor1.set(speed + (angle - currentAngle)*.01);
    	driveTrain.leftMotor2.set(speed + (angle - currentAngle)*.01);
    	driveTrain.rightMotor1.set(-speed - (angle - currentAngle)*.01);
    	driveTrain.rightMotor2.set(-speed - (angle - currentAngle)*.01);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return System.currentTimeMillis() - timeStarted >= timeToRun;
    }

    // Called once after isFinished returns true
    protected void end() {
    	//SmartDashboard.putBoolean("Finished", true);
    	//System.out.println("Finished");
    	driveTrain.leftMotor1.set(0);
    	driveTrain.leftMotor2.set(0);
    	driveTrain.rightMotor1.set(0);
    	driveTrain.rightMotor2.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
