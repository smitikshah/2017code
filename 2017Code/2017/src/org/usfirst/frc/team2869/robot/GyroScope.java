package org.usfirst.frc.team2869.robot;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.kauailabs.navx.mxp.IMU;

public class GyroScope {

	SerialPort sp;
	IMU navx;
	public MiniPID pid;
	public GyroScope() {
		sp = new SerialPort(57600, SerialPort.Port.kMXP);
		navx = new IMU(sp); // (byte) 50 as a second parameter to specify refresh rate.
		pid = new MiniPID(0,0,0);
		
	}
	public void showDashboard() {
		SmartDashboard.putNumber("Pitch", navx.getPitch());
		SmartDashboard.putNumber("Roll", navx.getRoll());
		SmartDashboard.putNumber("Yaw", navx.getYaw());
	}
	
	public double getPitch() {
		return navx.getPitch();
	}
	
	public double getRoll() {
		return navx.getRoll();
	}
	
	public double getYaw() {
		return navx.getYaw();
	}
}