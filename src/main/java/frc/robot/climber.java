package frc.robot;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;

public class climber {
    private CANSparkMax m_climberMotor;

    public climber(){
        m_climberMotor = new CANSparkMax(1, CANSparkMax.MotorType.kBrushless);
    }

    public Command raise(){
        return new InstantCommand(()-> {
            m_climberMotor.set(0.1);
        });
    }
}
