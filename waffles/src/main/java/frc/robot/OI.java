
///////UNUSED (but here just in case)/////////

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Axis;
//import edu.wpi.first.wpilibj.buttons.Button and JoystickButton;

public class OI {

/**
* This class is the glue that binds the controls on the physical operator
* interface to the commands and command groups that allow control of the robot.
*/

  // public Joystick xboxController = new Joystick(RobotMap.OI_DRIVER_CONTROLLER); //from a separate contents/robotmap class with OI_DRIVER_CONTROLLER port
   

  public double moveSpeed(){
    return RobotContainer.xboxController.getY();
  }

  public double rotateSpeed(){
    return RobotContainer.xboxController.getX();
  }

  /*
   Button Abutton = new JoystickButton(RobotContainer.xboxController, 1);
   Button Bbutton = new JoystickButton(RobotContainer.xboxController, 2);
   Button Xbutton = new JoystickButton(RobotContainer.xboxController, 3);
   Button Ybutton = new JoystickButton(RobotContainer.xboxController, 4);
   Button leftShoulder = new JoystickButton(RobotContainer.xboxController, 5);
   Button rightShoulder = new JoystickButton(RobotContainer.xboxController, 6);
   Button D7 = new JoystickButton(RobotContainer.xboxController, 7);
   Button D8 = new JoystickButton(RobotContainer.xboxController, 8);
   Button leftStick = new JoystickButton(RobotContainer.xboxController, 9);
   Button rightStick = new JoystickButton(RobotContainer.xboxController, 10);
   Button dUp = new JoystickButton(RobotContainer.xboxController, 11);
   Button dDown = new JoystickButton(RobotContainer.xboxController, 12);
   Button dLeft = new JoystickButton(RobotContainer.xboxController, 13);
   Button dRight = new JoystickButton(RobotContainer.xboxController, 14);
*/

}
