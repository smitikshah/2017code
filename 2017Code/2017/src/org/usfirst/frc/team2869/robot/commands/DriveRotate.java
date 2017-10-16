package org.usfirst.frc.team2869.robot.commands;

import org.usfirst.frc.team2869.robot.Robot;
import org.usfirst.frc.team2869.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveRotate extends Command {
	DriveTrain driveTrain;
	double degrees;
	double startAngle;
    public DriveRotate(double degrees) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	driveTrain = Robot.driveTrain;
    	this.degrees = degrees;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	SmartDashboard.putBoolean("Turning", true);
    	this.startAngle = driveTrain.gyro.getYaw();
    	driveTrain.gyro.pid.setSetpoint(degrees + startAngle);
    	driveTrain.gyro.pid.setPID(.005, 0, .005);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double output = driveTrain.gyro.pid.getOutput(driveTrain.gyro.getYaw());
    	driveTrain.drive.arcadeDrive(0, output);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Math.abs((driveTrain.gyro.getYaw()-(degrees+startAngle))/(degrees+startAngle))<=.05;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
