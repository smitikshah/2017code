package org.usfirst.frc.team2869.robot.commands;

import org.usfirst.frc.team2869.robot.OI;
import org.usfirst.frc.team2869.robot.Robot;
import org.usfirst.frc.team2869.robot.subsystems.CompressorSwitch;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DisableCompressor extends Command {
	CompressorSwitch c;
    public DisableCompressor() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.compressorSwitch);
    	c = Robot.compressorSwitch;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	c.compressor.stop();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !OI.operatorJoystick.GetBackValue();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
