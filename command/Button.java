public class Button {
    
    private Command command;
    
    public Button(Command command){
        this.command = command;
    }

    public void press(){
        this.command.execute();
    }
}
