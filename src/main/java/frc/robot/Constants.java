// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/** Add your docs here. */
public final class Constants
{
    public static class TestConstants
    {
        public static final double betweenTimeSecs = 1.0;
        public static final double instantBetweenTimeSecs = 3.0;

        public static final double swerveModuleMotorTimeoutSecs = 5;
        public static final double swerveModuleDriveForwardPercentOutput = 0.20;
        public static final double swerveModuleDriveReversePercentOutput = -0.20;
        public static final double swerveModuleSteerCcwPercentOutput = 0.20;
        public static final double swerveModuleSteerCwPercentOutput = -0.20;

        public static final String[] swerveModuleNames =
        {
            // Swerve module names in the order in which they are indexed:
            "FrontLeft",
            "FrontRight",
            "BackLeft",
            "BackRight"
        };
    }
}
