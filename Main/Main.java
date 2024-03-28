package Main;

import LCD.LCD;

public class Main {
    public static void main(String[] args) {
        LCD lcd1 = new LCD();
        lcd1.turnOFF();
        lcd1.turnON();
        lcd1.setCable("HDMI");
        lcd1.setVolume(50);
        lcd1.setBrightness(50);
        lcd1.Freeze();
        lcd1.volumeUP();
        lcd1.brightnessDown();
        lcd1.volumeDown();
        lcd1.brightnessUp();
        lcd1.volumeUP();
        lcd1.brightnessUp();
        lcd1.setCable("VGA");
        lcd1.turnON();

        lcd1.displayMassege();

    }
}
