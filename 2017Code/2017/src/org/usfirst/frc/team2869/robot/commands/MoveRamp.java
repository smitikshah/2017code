package org.usfirst.frc.team2869.robot.commands;

import org.usfirst.frc.team2869.robot.OI;
import org.usfirst.frc.team2869.robot.Robot;
import org.usfirst.frc.team2869.robot.subsystems.Ramp;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveRamp extends Command {
	Ramp ramp;
	DoubleSolenoid.Value value;
    public MoveRamp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.ramp);
    	ramp = Robot.ramp;
    	value = ramp.solenoid.get();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(ramp.solenoid.get().equals(DoubleSolenoid.Value.kOff) || ramp.solenoid.get().equals(DoubleSolenoid.Value.kReverse))
    		ramp.solenoid.set(DoubleSolenoid.Value.kForward);
    	else
    		ramp.solenoid.set(DoubleSolenoid.Value.kReverse);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !value.equals(ramp.solenoid.get());
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
