package academy.mindswap.bears;

public class Cranky extends Bear{

    private int battery;

    public Cranky(){
        this.battery = getBattery();
    }

    @Override
    public String talk(){
        if (battery > 0){
            this.battery--;
            if(battery == 50){
                this.battery = 0;
                return "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
            }
            if (battery < 50){
                return "I can't sing anymore";
            }
            return "I love you!";
        }
        return "Gri gri...";
    }
}