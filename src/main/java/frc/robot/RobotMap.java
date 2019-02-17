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
  public static final int backRightMotor = 0;
  public static final int frontLeftMotor =  3; 
  public static final int frontRightMotor = 1;
  public static final int backLeftMotor = 5;

  public static final int solenoid1 = 0;
  public static final int solenoid2 = 1;

  public static final int cargoMotor = 9;
  public static final double cargoMotorSpeed = 1.0;
  public static final double cargoMotorOff = 0.0;

  public static final int wristMotor = 5;
  public static final int flaccidWristMotor = 8;
  public static final double wristMotorSpeed = 1.0;
  public static final double wristMotorOff = 0.0;

  public static final int pot = 0;
  public static final int wrist = 5;

  public static final int distanceHatch = 0;
  public static final int distanceCargo = 1;
  public static final int backLinesensor = 3;
  public static final int frontLinesensor = 2;

  public static final double fastTurnSpeed = .4;
  public static final double slowTurnSpeed = .2;
  public static final double slowDriveSpeed = .25;
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
