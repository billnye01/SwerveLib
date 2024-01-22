package main.java.frc.robot.subsystems.drive;

import frc.robot.subsystems.drive.SwerveData;
import frc.robot.subsystems.drive.GyroIO;
import frc.robot.subsystems.drive.GyroIOPigeon2;
import frc.robot.subsystems.drive.Drive;
import frc.robot.subsystems.drive.ModuleIOSparkMaxAnlog;
import frc.robot.subsystems.drive.ModuleIOSparkMaxCancoder;
import frc.robot.subsystems.drive.ModuleIOTalonFX;

enum SwerveType{
    CANcoderSparkMax,
    AnlogSparkMax,
    CANcoderTalon
};

public class DriveInit {

    Drive drive = null;
  
    public Drive SwerveInit(SwerveType swerveType, GyroIO gyroIO, SwerveData swerveFL, 
                                SwerveData swerveFR, SwerveData swerveBL, SwerveData swerveBR){
        
        switch (swerveType) {
            case AnlogSparkMax:
                    
                drive = new Drive(gyroIO,
                                 new ModuleIOSparkMaxAnlog(swerveFL.MotorDrive, swerveFL.MotorTurn, swerveFL.Encoderid, swerveFL.absoluteEncoderOffset),
                                 new ModuleIOSparkMaxAnlog(swerveFR.MotorDrive, swerveFR.MotorTurn, swerveFR.Encoderid, swerveFR.absoluteEncoderOffset), 
                                 new ModuleIOSparkMaxAnlog(swerveBL.MotorDrive, swerveBL.MotorTurn, swerveBL.Encoderid, swerveBL.absoluteEncoderOffset), 
                                 new ModuleIOSparkMaxAnlog(swerveBR.MotorDrive, swerveBR.MotorTurn, swerveBR.Encoderid, swerveBR.absoluteEncoderOffset)
                );

                return drive;
        
            case CANcoderSparkMax:

                drive = new Drive(gyroIO,
                                 new ModuleIOSparkMaxCancoder(swerveFL.MotorDrive, swerveFL.MotorTurn, swerveFL.Encoderid, swerveFL.absoluteEncoderOffset),
                                 new ModuleIOSparkMaxCancoder(swerveFR.MotorDrive, swerveFR.MotorTurn, swerveFR.Encoderid, swerveFR.absoluteEncoderOffset), 
                                 new ModuleIOSparkMaxCancoder(swerveBL.MotorDrive, swerveBL.MotorTurn, swerveBL.Encoderid, swerveBL.absoluteEncoderOffset), 
                                 new ModuleIOSparkMaxCancoder(swerveBR.MotorDrive, swerveBR.MotorTurn, swerveBR.Encoderid, swerveBR.absoluteEncoderOffset)
                );

                return drive;

            case CANcoderTalon:

                drive = new Drive(gyroIO,
                                 new ModuleIOTalonFX(swerveFL.MotorDrive, swerveFL.MotorTurn, swerveFL.Encoderid, swerveFL.absoluteEncoderOffset),
                                 new ModuleIOTalonFX(swerveFR.MotorDrive, swerveFR.MotorTurn, swerveFR.Encoderid, swerveFR.absoluteEncoderOffset), 
                                 new ModuleIOTalonFX(swerveBL.MotorDrive, swerveBL.MotorTurn, swerveBL.Encoderid, swerveBL.absoluteEncoderOffset), 
                                 new ModuleIOTalonFX(swerveBR.MotorDrive, swerveBR.MotorTurn, swerveBR.Encoderid, swerveBR.absoluteEncoderOffset)
                );

                return drive;

            default:
                break;
        }

    return drive;

    }

}
