/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private Spark leftSpark;
  private Spark rightSpark;
  private DifferentialDrive drive;

  public DriveTrain() {
    leftSpark = new Spark(RobotMap.leftMotor);
    rightSpark = new Spark(RobotMap.rightMotor);
    drive = new DifferentialDrive(leftSpark, rightSpark);
  }

  public void move(XboxController controller) {
    drive.arcadeDrive(controller.getX(), controller.getY());
  }

  public void stop() {
    drive.arcadeDrive(0, 0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
