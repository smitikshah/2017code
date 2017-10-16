package org.usfirst.frc.team2869.robot.commands;

import org.usfirst.frc.team2869.robot.OI;
import org.usfirst.frc.team2869.robot.Robot;
import org.usfirst.frc.team2869.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SpinIntake extends Command {
	Intake intake;
    public SpinIntake() {
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
    	intake.intakeMotor.set(1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !OI.driverJoystick.GetYValue();
    }

    // Called once after isFinished returns true
    protected void end() {
    	intake.intakeMotor.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
