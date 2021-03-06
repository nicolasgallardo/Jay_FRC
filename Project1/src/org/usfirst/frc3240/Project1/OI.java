// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3240.Project1;

import org.usfirst.frc3240.Project1.commands.AutonomousCommand;
import org.usfirst.frc3240.Project1.commands.DriveBack;
import org.usfirst.frc3240.Project1.commands.DriveForward;
import org.usfirst.frc3240.Project1.commands.DriveWithJoysticks;
import org.usfirst.frc3240.Project1.commands.ElevatorDown;
import org.usfirst.frc3240.Project1.commands.ElevatorUp;
import org.usfirst.frc3240.Project1.commands.Intake;
import org.usfirst.frc3240.Project1.commands.PracticeAuto;
import org.usfirst.frc3240.Project1.commands.Throw;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton up;
    public JoystickButton in;
    public Joystick joystick1;
    public JoystickButton down;
    public JoystickButton out;
    public Joystick joystick2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick2 = new Joystick(1);
        
        out = new JoystickButton(joystick2, 1);
        out.whileHeld(new Throw());
        joystick1 = new Joystick(0);
        
        in = new JoystickButton(joystick1, 1);
        in.whileHeld(new Intake());



        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DriveWithJoysticks", new DriveWithJoysticks());
        SmartDashboard.putData("Elevator Up", new ElevatorUp());
        SmartDashboard.putData("Elevator Down", new ElevatorDown());
        SmartDashboard.putData("Drive Forward", new DriveForward());
        SmartDashboard.putData("Drive Back", new DriveBack());
        SmartDashboard.putData("Practice Auto", new PracticeAuto());
        SmartDashboard.putData("Intake", new Intake());
        SmartDashboard.putData("Throw", new Throw());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }

    public Joystick getJoystick2() {
        return joystick2;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

