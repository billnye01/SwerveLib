package frc.robot.subsystems.drive;

public class DriveInit {

  public static Drive SwerveInit(
      SwerveType swerveType,
      GyroIO gyroIO,
      SwerveData swerveFL,
      SwerveData swerveFR,
      SwerveData swerveBL,
      SwerveData swerveBR) {

    switch (swerveType) {
      case AnlogSparkMax:
        return (new Drive(
            gyroIO,
            new ModuleIOSparkMaxAnlog(
                swerveFL.MotorDrive,
                swerveFL.MotorTurn,
                swerveFL.Encoderid,
                swerveFL.absoluteEncoderOffset),
            new ModuleIOSparkMaxAnlog(
                swerveFR.MotorDrive,
                swerveFR.MotorTurn,
                swerveFR.Encoderid,
                swerveFR.absoluteEncoderOffset),
            new ModuleIOSparkMaxAnlog(
                swerveBL.MotorDrive,
                swerveBL.MotorTurn,
                swerveBL.Encoderid,
                swerveBL.absoluteEncoderOffset),
            new ModuleIOSparkMaxAnlog(
                swerveBR.MotorDrive,
                swerveBR.MotorTurn,
                swerveBR.Encoderid,
                swerveBR.absoluteEncoderOffset)));

      case CANcoderSparkMax:
        return (new Drive(
            gyroIO,
            new ModuleIOSparkMaxCancoder(
                swerveFL.MotorDrive,
                swerveFL.MotorTurn,
                swerveFL.Encoderid,
                swerveFL.absoluteEncoderOffset),
            new ModuleIOSparkMaxCancoder(
                swerveFR.MotorDrive,
                swerveFR.MotorTurn,
                swerveFR.Encoderid,
                swerveFR.absoluteEncoderOffset),
            new ModuleIOSparkMaxCancoder(
                swerveBL.MotorDrive,
                swerveBL.MotorTurn,
                swerveBL.Encoderid,
                swerveBL.absoluteEncoderOffset),
            new ModuleIOSparkMaxCancoder(
                swerveBR.MotorDrive,
                swerveBR.MotorTurn,
                swerveBR.Encoderid,
                swerveBR.absoluteEncoderOffset)));

      case CANcoderTalon:
        return (new Drive(
            gyroIO,
            new ModuleIOTalonFX(
                swerveFL.MotorDrive,
                swerveFL.MotorTurn,
                swerveFL.Encoderid,
                swerveFL.absoluteEncoderOffset),
            new ModuleIOTalonFX(
                swerveFR.MotorDrive,
                swerveFR.MotorTurn,
                swerveFR.Encoderid,
                swerveFR.absoluteEncoderOffset),
            new ModuleIOTalonFX(
                swerveBL.MotorDrive,
                swerveBL.MotorTurn,
                swerveBL.Encoderid,
                swerveBL.absoluteEncoderOffset),
            new ModuleIOTalonFX(
                swerveBR.MotorDrive,
                swerveBR.MotorTurn,
                swerveBR.Encoderid,
                swerveBR.absoluteEncoderOffset)));
      default:
        break;
    }

    return null;
  }
}
