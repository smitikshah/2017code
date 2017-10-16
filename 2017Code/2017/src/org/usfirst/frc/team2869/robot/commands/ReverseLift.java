package org.usfirst.frc.team2869.robot.commands;

import org.usfirst.frc.team2869.robot.OI;
import org.usfirst.frc.team2869.robot.Robot;
import org.usfirst.frc.team2869.robot.subsystems.Lift;
import org.usfirst.frc.team2869.robot.subsystems.Roller;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ReverseLift extends Command {
	Roller roller;
    public ReverseLift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.roller);
    	roller = Robot.roller;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	roller.roller.set(.75);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !OI.driverJoystick.GetBackValue();
        
    }

    // Called once after isFinished returns true
    protected void end() {
    	roller.roller.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
