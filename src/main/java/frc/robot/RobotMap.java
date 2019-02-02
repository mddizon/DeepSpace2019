/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  public static int backRightMotor = 0;
  public static int frontLeftMotor =  4; 
  public static int frontRightMotor = 1;
  public static int backLeftMotor = 5;

  public static int solenoid1 = 0;
  public static int solenoid2 = 1;
  //public static int solenoid3 = 2;
  //public static int solenoid4 = 3;

  public static int cargoMotor = 0;
  public static double cargoMotorSpeed = 1;
  public static double cargoMotorOff = 0;
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
