package org.usfirst.frc.team2869.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class BaselineAutonomous extends CommandGroup {

    public BaselineAutonomous() {
        addSequential(new DriveForward(10,.75));
    }

}
