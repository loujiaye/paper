package message;

import java.io.*;

public class CpuParse extends Parse{
    public static void main(String args[]){
        CpuParse.parse();
    }


    public static CpuModel parse(){
        CpuModel cpuModel = new CpuModel();
        LineNumberReader lnr = null;
        String command = "vmstat 1 2 ";
        String line = "";

        lnr = exec(command);

        try{
            while( (line = lnr.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

        return cpuModel;
    }
}
