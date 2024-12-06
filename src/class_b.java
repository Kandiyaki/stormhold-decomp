//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import com.nokia.mid.ui.FullCanvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Graphics;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import java.io.DataInputStream;

public class class_b {
    String field_c;
    byte field_h;
    byte field_e;
    byte field_f;
    byte field_d;
    byte field_j;
    byte field_g;
    String field_a;
    static int field_i;
    static class_b[] field_b;

    class_b() {
    }

    static int method_d(int var0) {
        return var0 - 1;
    }

    static class_b method_c(int var0) {
        return field_b[method_d(var0)];
    }

    static boolean method_a(int var0) {
        return var0 >= 1 && var0 <= field_i;
    }

    static boolean method_b(int var0) {
        int var1 = method_d(var0);
        class_b var2 = field_b[var1];
        return var2.field_d == 2;
    }

    static void method_a1() {
        try {
            DataInputStream var0 = class_f.method_a1("/spellsin.dat");
            field_i = var0.readShort();
            field_b = new class_b[field_i];

            for(int var1 = 0; var1 < field_i; ++var1) {
                field_b[var1] = new class_b();
            }

            System.out.println("Number of spells is " + field_i);

            for(int var2 = 0; var2 < field_i; ++var2) {
                field_b[var2].field_c = var0.readUTF();
            }

            for(int var3 = 0; var3 < field_i; ++var3) {
                field_b[var3].field_h = var0.readByte();
            }

            for(int var4 = 0; var4 < field_i; ++var4) {
                field_b[var4].field_e = var0.readByte();
            }

            for(int var5 = 0; var5 < field_i; ++var5) {
                field_b[var5].field_f = var0.readByte();
            }

            for(int var6 = 0; var6 < field_i; ++var6) {
                field_b[var6].field_d = var0.readByte();
            }

            for(int var7 = 0; var7 < field_i; ++var7) {
                field_b[var7].field_j = var0.readByte();
            }

            for(int var8 = 0; var8 < field_i; ++var8) {
                field_b[var8].field_g = var0.readByte();
            }

            for(int var9 = 0; var9 < field_i; ++var9) {
                field_b[var9].field_a = var0.readUTF();
            }

            var0.close();
        } catch (Exception var10) {
            System.out.println("ERROR: cannot load spells!");
            System.out.println(var10);
        }

    }
}
