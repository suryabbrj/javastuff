// applet has been depricated since jdk9 and marked for removal. so didn't bother coding it. anyways here's the code, "ctrl+c" "ctrl+v"

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

/* uncomment to set manual dimensions....
<applet code = "BasicAppletExample.class" width = 200 height = 200>
</applet>
*/
public class BasicAppletExample extends Applet {
    public void init() {
        setBackground(Color.CYAN);
        System.out.println("init() called");
    }

    public void start() {
        System.out.println("Start() called");
    }

    public void paint(Graphics g) {
        // write text using drawString method of Graphics class
        g.drawString("This is my First Applet", 20, 100);
    }

    public void stop() {
        System.out.println("Stop() Called");
    }

    public void destroy() {
        System.out.println("Destroy)() Called");
    }
}