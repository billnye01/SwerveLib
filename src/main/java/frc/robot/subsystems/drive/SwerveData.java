package frc.robot.subsystems.drive;

public class SwerveData {

  public int MotorDrive;
  public int MotorTurn;
  public int Encoderid;
  public double absoluteEncoderOffset;

  public SwerveData(int motorDrive, int motorTurn, int Encoderid, double absoluteEncoderOffset) {

    MotorDrive = motorDrive;
    MotorTurn = motorTurn;
    Encoderid = Encoderid;
    absoluteEncoderOffset = absoluteEncoderOffset;
  }
}
