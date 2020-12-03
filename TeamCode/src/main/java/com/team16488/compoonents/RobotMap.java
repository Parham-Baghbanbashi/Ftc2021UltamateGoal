package com.team16488.compoonents;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * This class makes it really easy for us to initialize our robots hardware
 * here we declare all the hardware variables that we will be using in the robot and initilize them in
 * our robots init method, see robot.java for more
 * when writing each individual component we initialize this method IN THE CONSTRUCTOR OF THE COMPONENT that allows us
 * to store all of our hardware variables place and just call them from each class
 *
 * Note: when making a component we only have to call from here to get the hardware objects afterwards we can use local objecs or these objects
 */
public class RobotMap {
    // hardware map object(local, hence why its private)
    HardwareMap map;

    // Robot objects(project wide, hence why its public)
    // drivetrain motors
    public DcMotor FrontRightMotor;
    public DcMotor FrontLeftMotor;
    public DcMotor RearRightMotor;
    public DcMotor RearLeftMotor;

    public RobotMap(){
        // constructor
    }

    public void mapHardware(){
        // here we map all of our hardware components

        //Drive train
        FrontLeftMotor = map.dcMotor.get("FL");
        FrontRightMotor = map.dcMotor.get("FR");
        RearRightMotor = map.dcMotor.get("BR");
        RearLeftMotor = map.dcMotor.get("BL");
        FrontLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        RearLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

}
