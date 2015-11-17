package message;

public class CpuModel{
    private float user = 0;
    private float system = 0;
    private float idle = 0;

    public float getUser(){
        return this.user;
    }

    public void setUser(float user){
        this.user = user;
    }

    public float getSystem(){
        return this.system;
    }

    public void setSystem(float system){
        this.system = system;
    }

    public float getIdle(){
        return this.idle;
    }

    public void setIdle(float idle){
        this.idle = idle;
    }

}
