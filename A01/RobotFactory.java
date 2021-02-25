/**
 * RobotFactory class for create each different type of robot.
 * Author: Li Pan
 */

public class RobotFactory {

    public static Robot createRobot(RobotType type, long serialNumber) {

        Robot robot = null;//initial a null robot

        switch (type) {

            case CUTTING:
                System.out.println("Cutting Robot created");
                System.out.println("Regina Machines " + serialNumber);
                robot = new Cutting();
                break;

            case DRILLING:
                System.out.println("Drilling Robot created");
                System.out.println("Regina Machines " + serialNumber);
                robot = new Drilling();
                break;

            case ASSEMBLY:
                System.out.println("Assembly Robot created");
                System.out.println("SK Robotics " + serialNumber);
                robot = Assembly.getAssembly();
                break;

        }
        return robot;

    }

}
