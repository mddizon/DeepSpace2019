/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveCommand;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private Victor frontLeftVictor;
  private Victor backLeftVictor;
  private WPI_VictorSPX frontRightVictor;
  private WPI_VictorSPX backRightVictor;
  private MecanumDrive drive;

  public DriveTrain() {
    frontLeftVictor = new Victor(RobotMap.frontLeftMotor);
    backLeftVictor = new Victor(RobotMap.backLeftMotor);
    frontRightVictor = new WPI_VictorSPX(RobotMap.frontRightMotor);
    backRightVictor = new WPI_VictorSPX(RobotMap.backRightMotor);
    drive = new MecanumDrive(frontLeftVictor, backLeftVictor, frontRightVictor, backRightVictor);
  }

  public void move(XboxController controller) {
    drive.driveCartesian(controller.getX(Hand.kLeft), controller.getY(Hand.kLeft), controller.getX(Hand.kRight));
  }

  public void stop() {
    drive.driveCartesian(0, 0, 0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveCommand());
  }
}
