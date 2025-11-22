// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.test;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants.TestConstants;
import frc.robot.subsystems.CommandSwerveDrivetrain;

/**
 * Tests the drive and steer motors of a swerve drive moduile.
 */
public class TestSwerveDriveModule extends SequentialCommandGroup
{
    /** Creates a new TestSwerveDriveModule. */
    public TestSwerveDriveModule(CommandSwerveDrivetrain drivetrain, int moduleIndex)
    {
        addCommands(       
            new TestSwerveModuleDriveMotor(drivetrain, moduleIndex, TestConstants.swerveModuleDriveForwardPercentOutput).withTimeout(TestConstants.swerveModuleMotorTimeoutSecs),
            new WaitCommand(TestConstants.betweenTimeSecs),

            new TestSwerveModuleDriveMotor(drivetrain, moduleIndex, TestConstants.swerveModuleDriveReversePercentOutput).withTimeout(TestConstants.swerveModuleMotorTimeoutSecs),
            new WaitCommand(TestConstants.betweenTimeSecs),

            new TestSwerveModuleSteerMotor(drivetrain, moduleIndex, TestConstants.swerveModuleSteerCcwPercentOutput).withTimeout(TestConstants.swerveModuleMotorTimeoutSecs),
            new WaitCommand(TestConstants.betweenTimeSecs),

            new TestSwerveModuleSteerMotor(drivetrain, moduleIndex, TestConstants.swerveModuleSteerCwPercentOutput).withTimeout(TestConstants.swerveModuleMotorTimeoutSecs),
            new WaitCommand(TestConstants.betweenTimeSecs)
        );
    }
}
