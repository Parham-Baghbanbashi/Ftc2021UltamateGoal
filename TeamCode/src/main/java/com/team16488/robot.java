package com.team16488;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.team16488.compoonents.MecanumDrive;
import com.team16488.compoonents.RobotMap;

/**
 * This is the main OpMode for the driver operated portion of the event
 * This code will either call commands on button presses, run the OI code which will handle the commands
 * or have all of the logic for the control inputs done here IDK yet
 */
public class robot extends OpMode {
    public RobotMap robotMap = new RobotMap();
    public MecanumDrive drive;

    @Override
    public void init() {
        this.robotMap.mapHardware();
        this.drive = new MecanumDrive(this.robotMap);
    }

    @Override
    public void loop() {
        drive.operatorMecanumDrive(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x);
    }
}
