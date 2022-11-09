import java.io.IOException;

public class CommandExeImpl implements CommandExe{
    
    @Override
    public void run(String cmd) throws IOException {
        Runtime.getRuntime().exec(cmd);       
    }
}
