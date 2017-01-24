// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc810.BullseyeNew.subsystems;

import org.usfirst.frc810.BullseyeNew.RobotMap;
import org.usfirst.frc810.BullseyeNew.commands.*;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Arm extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Solenoid upDown = RobotMap.armUpDown;
    private final Solenoid grabPiston = RobotMap.armGrabPiston;
    private final Compressor compressor = RobotMap.armCompressor;
    private final Solenoid armHolder = RobotMap.armArmHolder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public void setArmExtended(boolean bool) {
    	upDown.set(bool);
    }
    
    public void setGrabPiston(boolean bool) {
    	grabPiston.set(!bool);
    }
    
    public void setHoldPiston(boolean bool){
    	armHolder.set(!bool);
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

