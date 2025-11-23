// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.test;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.TestConstants;
import frc.robot.subsystems.CommandSwerveDrivetrain;

/**
 * Tests the steer motor of a swerve module.
 */
public class TestSwerveModuleSteerMotor extends Command
{
    private final TalonFX motor;
    private final String moduleName;
    private final double percentOutput;

    /** Creates a new TestSwerveModuleDriveMotor. */
    public TestSwerveModuleSteerMotor(CommandSwerveDrivetrain drivetrain, int moduleIndex, double percentOutput)
    {
        this.motor = drivetrain.getModule(moduleIndex).getSteerMotor();
        this.moduleName = TestConstants.swerveModuleNames[moduleIndex];
        this.percentOutput = percentOutput;

        addRequirements(drivetrain);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize()
    {
        System.out.println("Testing Steer Motor: " + moduleName  + (percentOutput > 0 ? " CCW" : " CW"));
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute()
    {
        motor.set(percentOutput);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted)
    {
        motor.set(0);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished()
    {
        return false;
    }
}
