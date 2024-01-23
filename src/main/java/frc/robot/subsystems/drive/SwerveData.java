package frc.robot.subsystems.drive;

public class SwerveData {

    public int MotorDrive;
    public int MotorTurn;
    public int Encoderid;
    public Rotation2d absoluteEncoderOffset;

    public SwerveData(int motorDrive, int motorTurn, int Encoderid, Rotation2d absoluteEncoderOffset){

        MotorDrive = motorDrive;
        MotorTurn = motorTurn;
        Encoderid = Encoderid;
        absoluteEncoderOffset = absoluteEncoderOffset;

    }
    
}
