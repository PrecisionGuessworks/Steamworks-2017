package org.usfirst.frc.team1646.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutonomousDrive extends CommandGroup {

    public AutonomousDrive(double left, double right, double waitTime) {
    	//addSequential(new AutoStabilizeServo(true));
    	addSequential(new SetLeftPower(left));
    	addSequential(new SetRightPower(right));
    	addSequential(new WaitCommand(1.58));
    	addSequential(new StopDriveTrain());
    	
    	addSequential(new SetLeftPower(left));
    	addSequential(new SetRightPower(-right));
    	addSequential(new WaitCommand(0.43));
    	addSequential(new StopDriveTrain());
    	
    	addSequential(new SetLeftPower(left));
    	addSequential(new SetRightPower(right));
    	addSequential(new WaitCommand(0.32));
    	addSequential(new StopDriveTrain());
    	
    	addSequential(new WaitCommand(2));
    	addSequential(new AutoReleaseServo(true));
    	addSequential(new WaitCommand(1));
    	
    	addSequential(new SetLeftPower(-left));
    	addSequential(new SetRightPower(-right));
    	addSequential(new WaitCommand(0.32));
    	addSequential(new StopDriveTrain());
    	
    	addSequential(new WaitCommand(1));
       	addSequential(new AutoStabilizeServo(true));
    	
       	addSequential(new SetLeftPower(-left));
    	addSequential(new SetRightPower(right));
    	addSequential(new WaitCommand(0.43));
    	addSequential(new StopDriveTrain());
    	
    	addSequential(new SetLeftPower(left));
    	addSequential(new SetRightPower(right));
    	addSequential(new WaitCommand(1.58));
    	addSequential(new StopDriveTrain());
    	
    	
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	
    }
}
