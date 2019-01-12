// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc0.Steamworks2017.subsystems;

import org.usfirst.frc0.Steamworks2017.RobotMap;
import org.usfirst.frc0.Steamworks2017.commands.*;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Direction;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class GearPlunger extends Subsystem {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final DigitalInput backPlungerLimit = RobotMap.gearPlungerBackPlungerLimit;
    private final SpeedController gearSC = RobotMap.gearPlungerGearSC;
    private final DigitalInput frontPlungerLimit = RobotMap.gearPlungerFrontPlungerLimit;
    private final DigitalInput positionSwitch = RobotMap.gearPlungerPositionSwitch;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	public void PlungerInsert(){
		gearSC.set(0.4);
	}

	public void PlungerExtract(){
		gearSC.set(-0.4);
	}

	public void StopPlunger(){
		gearSC.set(0.0);
	}
	//active low "0 when closed"
	public boolean IsIn(){
		return !backPlungerLimit.get();
	}
	public boolean IsOut(){
		return !frontPlungerLimit.get();		
	}
	public boolean IsGearPos1(){
		return positionSwitch.get();
	}
	public boolean IsGearPos2(){
		return !positionSwitch.get();
		
	}
}
