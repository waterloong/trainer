package net.thewilliamzhang;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Trainer {

    Robot robot;
    String code = "\tnwcthoth";

    public Trainer(){
        try {
            robot = new Robot();
            robot.delay(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        for (int i = 0; i < 70; i ++) {
            for (char cc : code.toCharArray()) {
                type(cc);
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1500);
        }
    }

    public void type(char cc) {
        int keyCode;
        switch (cc) {
            case '\t':
                keyCode = KeyEvent.VK_TAB;
                break;
            case 'c':
                keyCode = KeyEvent.VK_C;
                break;
            case 'h':
                keyCode = KeyEvent.VK_H;
                break;
            case 'n':
                keyCode = KeyEvent.VK_N;
                break;
            case 't':
                keyCode = KeyEvent.VK_T;
                break;
            case 'o':
                keyCode = KeyEvent.VK_O;
                break;
            case 'w':
                keyCode = KeyEvent.VK_W;
                break;
            default:
                throw new IllegalArgumentException("Unimplemented char: " + cc);
        }
        robot.keyPress(keyCode);
        robot.keyRelease(keyCode);
    }

    public static void main(String[] args) throws Exception {
        Trainer trainer = new Trainer();
        trainer.run();
    }

}
