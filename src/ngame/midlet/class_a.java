//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ngame.midlet;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public abstract class class_a extends MIDlet implements CommandListener {
    protected boolean field_Z = true;
    public String field_aF;
    public Display field_d = Display.getDisplay(this);
    public static final Command field_aK = new Command("Exit", 7, 1);
    public static final Command field_r = new Command("Exit", 7, 1);
    public static final Command field_aX = new Command("Exit", 7, 1);

    public class_a() {
    }

    protected final void startApp() throws MIDletStateChangeException {
        this.method_m();
    }

    protected abstract void method_m() throws MIDletStateChangeException;

    public void pauseApp() {
    }

    public void destroyApp(boolean var1) {
    }

    public void method_b4() {
        this.method_n1();
    }

    private void method_n1() {
        this.destroyApp(true);
        ((MIDlet)this).notifyDestroyed();
    }

    public void commandAction(Command var1, Displayable var2) {
        if (var1 == field_aK) {
            this.method_b4();
        }

    }
}
