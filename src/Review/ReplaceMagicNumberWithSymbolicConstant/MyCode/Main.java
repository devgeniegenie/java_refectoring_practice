package Review.ReplaceMagicNumberWithSymbolicConstant.MyCode;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(Robot.Command.WALK);
        robot.order(Robot.Command.STOPS);
        robot.order(Robot.Command.JUMPS);
    }
}
