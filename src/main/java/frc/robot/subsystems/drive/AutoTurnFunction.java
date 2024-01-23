package frc.robot.subsystems.drive;

import edu.wpi.first.math.controller.PIDController;

public class AutoTurnFunction {
  private Drive drive;
  private double SetPoint = 0.0;
  private double kP = 0.20;
  private double kI = 0.000;
  private double kD = 0.000;
  private PIDController controller;

  private boolean Running;

  // function for cuntius AutoTurn
  public double AutoTurn() {

    if (Running) {
      // run
      double output = controller.calculate(drive.getRotation().getDegrees());
      // error = drivetrain.getYaw() - setPoint;

      // double output = kP * error;
      // SmartDashboard.putNumber("balanceout", output);
      if (output > 4.0) {
        output = 4.0;
      }
      if (output < -4.0) {
        output = -4.0;
      }

      if (output < 0.1 && output > -0.1) {
        Running = false;
      }

      return output;
    }
    return 0;
  }

  public boolean IsRunning() {
    return Running;
  }

  // Init Auto Turn
  public void InitAutoTurn(double angle, Drive subsystem) {
    drive = subsystem;
    SetPoint = angle;
    controller = new PIDController(kP, kI, kD);
    // Use addRequirements() here to declare subsystem dependencies.

    controller.enableContinuousInput(0.0, 360.0);
    controller.setSetpoint(SetPoint);
  }
}
