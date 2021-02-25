/* * * * *  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * A factory robot controller that sends commands to multiple robots in an assembly line 
 * to create a specific object following a sequence of predetermined steps. 
 * 
 * Author : Li Pan 200371281
 * Reference: final long number = (long) Math.floor(Math.random() * 900000000000L) + 100000000000L;
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

/**
 * class A01panli200 is demo robot factory class
 */

public class A01panli200 {

    

    // create a object of class robot factory
    public RobotFactory robotFactory = new RobotFactory();

    public static void main(String[] args) {
        // reference for create a 12 digital number
        final long number = (long) Math.floor(Math.random() * 900000000000L) + 100000000000L;

        // create a tem number for save the randon number
        long serialNumber = number;

        /** Create two cutting robot two drill robot and one assembly robot */
        Robot cutRobot1 = RobotFactory.createRobot(RobotType.CUTTING, serialNumber++);
        Robot cutRobot2 = RobotFactory.createRobot(RobotType.CUTTING, serialNumber++);

        Robot drillRobot1 = RobotFactory.createRobot(RobotType.DRILLING, serialNumber++);
        Robot drillRobot2 = RobotFactory.createRobot(RobotType.DRILLING, serialNumber++);

        Robot assemblyRobot = RobotFactory.createRobot(RobotType.ASSEMBLY, serialNumber++);

        /** robot perform different tasks */
        cutRobot1.fetchParts();
        cutRobot2.fetchParts();

        cutRobot1.doTask();
        cutRobot2.doTask();

        cutRobot1.storeParts();
        cutRobot2.storeParts();

        cutRobot1.fetchParts();
        cutRobot2.fetchParts();

        cutRobot1.doTask();
        cutRobot2.doTask();

        cutRobot1.storeParts();
        cutRobot2.storeParts();

        drillRobot1.fetchParts();
        drillRobot2.fetchParts();

        drillRobot1.doTask();
        drillRobot2.doTask();

        drillRobot1.storeParts();
        drillRobot2.storeParts();

        assemblyRobot.fetchParts();
        assemblyRobot.fetchParts();
        assemblyRobot.fetchParts();
        assemblyRobot.fetchParts();
        assemblyRobot.doTask();
        assemblyRobot.storeParts();

    }

}