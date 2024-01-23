package frc.robot.subsystem.drive;

import frc.robot.subsystem.drive.Drive;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class AutoTurnFunction {
    private Drive drive;
    private double SetPoint = 0.0;
    private double kP = 0.20;
    private double kI = 0.000;
    private double kD = 0.000;
    private PIDController controller;

    private boolean Running;

      /** Creates a new AutoTurn. */
    public double AutoTurn(double angle, Drive subsystem) {

        if(Running){
            //run
            double output = controller.calculate(drive.getRotation());
            // error = drivetrain.getYaw() - setPoint;
    
            // double output = kP * error;
            // SmartDashboard.putNumber("balanceout", output);
            if (output > 4.0) {
              output = 4.0;
            }
            if (output < -4.0) {
            output = -4.0;
            }
        
            if(output < 0.1 && output > -0.1 ){
                Running = false;
            }

            return output;
        }
        return 0;


    }

    public boolean IsRunning(){
        return Running;
    }

    public boolean InitAutoTurn(double angle, Drive subsystem){
        drive = subsystem;
        setPoint = angle;
        controller = new PIDController(kP, kI, kD);
        addRequirements(drivetrain);
        // Use addRequirements() here to declare subsystem dependencies.

        controller.enableContinuousInput(0.0, 360.0);
        controller.setSetpoint(setPoint);
    }
}
