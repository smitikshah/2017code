package org.usfirst.frc.team2869.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MiddleAutonomous extends CommandGroup {

    public MiddleAutonomous() {
    	addSequential(new DriveForward(7, 1));
    }

   
}
