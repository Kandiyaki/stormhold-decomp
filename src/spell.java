//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

//most of these imports are for microedition/nokia stuff. seemingly unused
import com.nokia.mid.ui.FullCanvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Graphics;

import java.io.DataInputStream;

//this all seems like it's for spells
public class spell {
    String spellName;
    byte field_h;
    byte Cost;
    byte field_f;
    byte field_d;
    byte field_j;
    byte field_g;
    String spellDesc;
    static int numSpells;
    static spell[] staticSpellList;

    spell() {
    }

    static int method_d(int var0) {
        return var0 - 1;
    }

    static spell method_c(int var0) {
        return staticSpellList[method_d(var0)];
    }

    static boolean method_a(int var0) {
        return var0 >= 1 && var0 <= numSpells;
    }

    static boolean method_b(int var0) {
        int var1 = method_d(var0);
        spell var2 = staticSpellList[var1];
        return var2.field_d == 2;
    }

    static void initSpellList() {
        try {
            DataInputStream spellListDataStream = DataTools.readDatFileAsInputStream("/spellsin.dat");
            numSpells = spellListDataStream.readShort(); //should be 25
            staticSpellList = new spell[numSpells];

            for(int i = 0; i < numSpells; ++i) {
                staticSpellList[i] = new spell();
            }

            System.out.println("Number of spells is " + numSpells);

            for(int var2 = 0; var2 < numSpells; ++var2) {
                staticSpellList[var2].spellName = spellListDataStream.readUTF();
            }

            for(int var3 = 0; var3 < numSpells; ++var3) {
                staticSpellList[var3].field_h = spellListDataStream.readByte();
            }

            for(int var4 = 0; var4 < numSpells; ++var4) {
                staticSpellList[var4].Cost = spellListDataStream.readByte();
            }

            for(int var5 = 0; var5 < numSpells; ++var5) {
                staticSpellList[var5].field_f = spellListDataStream.readByte();
            }

            for(int var6 = 0; var6 < numSpells; ++var6) {
                staticSpellList[var6].field_d = spellListDataStream.readByte();
            }

            for(int var7 = 0; var7 < numSpells; ++var7) {
                staticSpellList[var7].field_j = spellListDataStream.readByte();
            }

            for(int var8 = 0; var8 < numSpells; ++var8) {
                staticSpellList[var8].field_g = spellListDataStream.readByte();
            }

            for(int var9 = 0; var9 < numSpells; ++var9) {
                staticSpellList[var9].spellDesc = spellListDataStream.readUTF();
            }

            spellListDataStream.close();
        } catch (Exception var10) {
            System.out.println("ERROR: cannot load spells!");
            System.out.println(var10);
        }

    }
}
