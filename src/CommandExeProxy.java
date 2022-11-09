public class CommandExeProxy implements CommandExe {

    private boolean isAdmin;
    private CommandExeImpl exe;

    public CommandExeProxy(String user, String pwd) {
        if(user.equals("a use you decide") && pwd.equals("psw you decide")) {
            isAdmin = true;
            exe = new CommandExeImpl();


        }
    }

    @Override
    public void run(String cmd) throws Exception {
        isAdmin : exe.run(cmd);
    }
}