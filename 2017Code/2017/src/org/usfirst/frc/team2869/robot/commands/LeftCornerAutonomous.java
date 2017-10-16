package org.usfirst.frc.team2869.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LeftCornerAutonomous extends CommandGroup {

    public LeftCornerAutonomous() {
    	addSequential(new DriveForward(6+(6/12), 1));
    	addSequential(new DriveRotate(45));
    	addSequential(new DriveForward(6+(6/12), 1));
    	//addSequential(new SpinShooter());
    	//addSequential(new DriveForward(-83.5));
    	//addSequential(new DriveForward(93.5));
    	
    	addParallel(new MoveRamp());
    	//addSequential(new DriveForward(10));
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
