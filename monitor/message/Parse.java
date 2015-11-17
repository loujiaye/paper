package message;

import java.io.*;

public class Parse{

    public static LineNumberReader exec(String command){
        LineNumberReader lnr = null;
        try{
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec(command);
            int exitVal = proc.waitFor();

            if(exitVal != 0){
                System.out.println("system command exec wrong");
                System.exit(1);
            }

            InputStreamReader isr = new InputStreamReader(proc.getInputStream());
            lnr = new LineNumberReader(isr);


        } catch (IOException e){
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

        return lnr;

    }

}
