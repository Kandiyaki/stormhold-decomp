//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import com.nokia.mid.ui.FullCanvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Graphics;

//graphics handler of some kind
public class class_c extends FullCanvas {
    runImageLoader field_a = null;

    public class_c() {
    }

    public void paint(Graphics var1) {
        if (this.field_a != null) {
            this.field_a.method_e1(var1);
        }

    }

    public void addCommand(Command var1) {
        if (this.field_a != null) {
            this.field_a.method_a18(var1);
        }

    }

    public void removeCommand(Command var1) {
        if (this.field_a != null) {
            this.field_a.method_b3(var1);
        }

    }

    public void setCommandListener(CommandListener var1) {
        if (this.field_a != null) {
            this.field_a.method_a19(var1);
        }

    }

    protected void keyPressed(int var1) {
        if (this.field_a != null) {
            this.field_a.method_b2(var1);
        }

    }
}
