package LCD;

public class LCD {

    String Status;
    int Volume;
    int Brightness;
    String Cable;
    int CC;

    public void turnOFF(){
        this.Status = "OFF";
    }

    public void turnON(){
        this.Status = "ON";
    }
    public void Freeze(){
        this.Status = "Freeze";
    }

    public void volumeUP(){
        if (Volume <= 100 && Volume >= 0) {
            this.Volume++;
        }
    }

    public void volumeDown(){
        if (Volume <= 100 && Volume >= 0) {
            this.Volume--;
        }
    }
    
    public void setVolume(int Volume){
        this.Volume = Volume;
    }

    public void brightnessUp(){
        if (Brightness <= 100 && Brightness >= 0) {
            this.Brightness++;
        }
    }

    public void brightnessDown(){
        if (Brightness <= 100 && Brightness >= 0) {
            this.Brightness--;
        }
    }

    public void setBrightness(int Brightness){
        this.Brightness = Brightness;
    }


    public void setCable(String Cable){
        switch (Cable) {
            case "HDMI":
                this.Cable = "HDMI";
                break;
            case "DIV":
                this.Cable = "DIV";
                break;
            case "VGA":
                this.Cable = "VGA";
                break;
            default:
                this.Cable = "Display Port";
                break;
        }
    }

public void displayMassege(){
    System.out.println("LCD Status   : " + Status);
    System.out.println("Volume       : " + Volume);
    System.out.println("Brightness   : " + Brightness);
    System.out.println("Cable        : " + Cable);
    }
}