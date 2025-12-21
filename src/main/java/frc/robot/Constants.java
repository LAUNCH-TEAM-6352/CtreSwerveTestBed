// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.pathplanner.lib.config.PIDConstants;

/** Add your docs here. */
public final class Constants
{
    public static final class PathPlannerConstants
    {
        public static final PIDConstants TRANSLATION_PID = new PIDConstants(0.7, 0, 0);
        public static final PIDConstants ANGLE_PID = new PIDConstants(0.4, 0, 0.01);
    }
    
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
