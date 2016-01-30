// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc0.BotTest;

import org.usfirst.frc0.BotTest.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc0.BotTest.subsystems.*;


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
    public JoystickButton strafeTrigger;
    public JoystickButton pivotUp;
    public JoystickButton pivotDown;
    public Joystick rightJoy;
    public Joystick leftJoy;
    public JoystickButton clawOpener;
    public JoystickButton clawUp;
    public JoystickButton clawDown;
    public JoystickButton elevatorUp;
    public JoystickButton elevatorDown;
    public Joystick xbox;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        xbox = new Joystick(2);
        
        elevatorDown = new JoystickButton(xbox, 1);
        elevatorDown.whileHeld(new ElevatorDownC());
        elevatorUp = new JoystickButton(xbox, 1);
        elevatorUp.whileHeld(new ElevatorUpC());
        clawDown = new JoystickButton(xbox, 1);
        clawDown.whileHeld(new ClawDownC());
        clawUp = new JoystickButton(xbox, 1);
        clawUp.whileHeld(new ClawUpC());
        clawOpener = new JoystickButton(xbox, 1);
        clawOpener.whileHeld(new ClawOpenerC());
        
        leftJoy = new Joystick(1);
        
        rightJoy = new Joystick(0);
        
        pivotDown = new JoystickButton(rightJoy, 1);
        pivotDown.whileHeld(new PivotDownC());
        pivotUp = new JoystickButton(rightJoy, 1);
        pivotUp.whileHeld(new PivotUpC());
        strafeTrigger = new JoystickButton(rightJoy, 1);
        strafeTrigger.whileHeld(new Strafe());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Drive", new Drive());
        SmartDashboard.putData("Strafe", new Strafe());
        SmartDashboard.putData("PivotUpC", new PivotUpC());
        SmartDashboard.putData("PivotDownC", new PivotDownC());
        SmartDashboard.putData("ClawOpenerC", new ClawOpenerC());
        SmartDashboard.putData("ClawUpC", new ClawUpC());
        SmartDashboard.putData("ClawDownC", new ClawDownC());
        SmartDashboard.putData("ElevatorUpC", new ElevatorUpC());
        SmartDashboard.putData("ElevatorDownC", new ElevatorDownC());
        SmartDashboard.putData("Blank", new Blank());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getRightJoy() {
        return rightJoy;
    }

    public Joystick getLeftJoy() {
        return leftJoy;
    }

    public Joystick getXbox() {
        return xbox;
    }
    public double getLeftSpeed() {
    	return leftJoy.getY();
    }
    public double getRightSpeed(){
    	return rightJoy.getY();
    }

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

