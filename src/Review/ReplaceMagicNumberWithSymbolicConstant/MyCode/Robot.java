package Review.ReplaceMagicNumberWithSymbolicConstant.MyCode;

public class Robot {
    private final String _name;

    public Robot(String name) {
        _name = name;
    }

    public void order(Command command){
        if(command == Command.WALK){
            System.out.println(_name + " walks.");
        } else if(command == Command.STOPS){
            System.out.println(_name + " stops.");
        } else if(command == Command.JUMPS){
            System.out.println(_name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }

    enum Command {
        WALK,
        STOPS,
        JUMPS
    }

}
