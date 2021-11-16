// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class drivetrain extends SubsystemBase {
  //declared here because constructors get called when calling this drivetrain class
  Talon leftFrontTalon = null;
  Talon leftBackTalon = null;
  Talon rightFrontTalon = null;
  Talon rightBackTalon = null;

  SpeedControllerGroup leftMotors = null;
  SpeedControllerGroup rightMotors = null;

  DifferentialDrive differentialDrive = null;

  /** Creates a new Drivetrain. */
  public drivetrain() {
    //Talons/Motors
    leftFrontTalon = new Talon(Constants.DRIVETRAIN_LEFT_FRONT_TALON);
    leftBackTalon = new Talon(Constants.DRIVETRAIN_LEFT_REAR_TALON);
    rightFrontTalon = new Talon(Constants.DRIVETRAIN_RIGHT_FRONT_TALON);
    rightBackTalon = new Talon(Constants.DRIVETRAIN_RIGHT_REAR_TALON);

    leftMotors = new SpeedControllerGroup(leftFrontTalon, leftBackTalon);
    rightMotors = new SpeedControllerGroup(rightFrontTalon, rightBackTalon);

    differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
  }
  
  
  public void arcadeDrive(double moveSpeed, double rotateSpeed) { //this dumbo made my robot not work for awhile
    differentialDrive.setDeadband(Constants.DEADBAND);
    differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

}
