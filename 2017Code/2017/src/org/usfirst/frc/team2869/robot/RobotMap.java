package org.usfirst.frc.team2869.robot;

import edu.wpi.first.wpilibj.AnalogOutput;
import edu.wpi.first.wpilibj.SpeedController;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static SpeedController speedController;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
	public static AnalogOutput driveTrainAnalog;
	
	/*
	 * PWM Values
	 */
	public static int leftMotor1 = 2;
	public static int leftMotor2 = 1;
	public static int rightMotor1 = 4;
	public static int rightMotor2 = 3;
	public static int climberSolenoid1 = 1;
	public static int climberSolenoid2 = 0;
	public static int rampSolenoid1 = 2;
	public static int rampSolenoid2 = 3;
	public static int intakeMotor = 4;
	public static int intakeTilt = 5;
	/*
	 * CAN Values
	 */
	public static int lift = 2; //TODO: Reset these values because they were lost in the pull
	public static int shooterWheel1 = 1;
	public static int shooterWheel2 = 0;
	public static int climber = 0;
	/*
	 * ANALOG Values
	 */
	public static int shooterA = 0, shooterB = 1;
	
	
	/*
	 * OTHER CONSTANTS
	 */
	public static double driveForward = 5300;
	public static double driveRotation = 1;
	public static double shooterSpeed = .6;
	public static double liftSpeed = 1;
	public static double distanceMultiplier = 1;
	public static double driveRotationTolerance = .04;
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	public static double pressureConstant = 30.0394224802;
	public static double speedMultiplier = .3;
	public static double speedAtFullVoltage = 12.33;
	public static double tiltSpeed = .5;
}
