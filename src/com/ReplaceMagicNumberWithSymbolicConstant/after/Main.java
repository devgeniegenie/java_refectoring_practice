package com.ReplaceMagicNumberWithSymbolicConstant.after;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(robot.COMMAND_WALK);
        robot.order(robot.COMMAND_STOP);
        robot.order(robot.COMMAND_JUMP);
    }
}
