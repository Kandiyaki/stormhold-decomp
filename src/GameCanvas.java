//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import com.nokia.mid.ui.FullCanvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Graphics;

//graphics handler of some kind. seems to have been called by the phone itself?
public class GameCanvas extends FullCanvas {
    RunImageLoader imageLoader = null;

    public GameCanvas() {
    }

    public void paint(Graphics var1) {
        if (this.imageLoader != null) {
            this.imageLoader.paint(var1);
        }

    }

    public void addCommand(Command var1) {
        if (this.imageLoader != null) {
            this.imageLoader.addCommand(var1);
        }

    }

    public void removeCommand(Command var1) {
        if (this.imageLoader != null) {
            this.imageLoader.removeCommand(var1);
        }

    }

    public void setCommandListener(CommandListener var1) {
        if (this.imageLoader != null) {
            this.imageLoader.setCommandListener(var1);
        }

    }

    protected void keyPressed(int var1) {
        if (this.imageLoader != null) {
            this.imageLoader.keyPressed(var1);
        }

    }
}
