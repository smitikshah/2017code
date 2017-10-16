package org.usfirst.frc.team2869.robot.commands;

import org.usfirst.frc.team2869.robot.OI;
import org.usfirst.frc.team2869.robot.Robot;
import org.usfirst.frc.team2869.robot.RobotMap;
import org.usfirst.frc.team2869.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TiltIntakeDown extends Command {
	Intake intake;
    public TiltIntakeDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intake);
    	intake = Robot.intake;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	intake.tilt.set(-RobotMap.tiltSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !OI.operatorJoystick.GetRightBumperValue();
    }

    // Called once after isFinished returns true
    protected void end() {
    	intake.tilt.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
