//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import ngame.midlet.javaMicroMIDlet;

public class ESGame extends javaMicroMIDlet implements Runnable, CommandListener {
    private static int field_aT;
    static byte[] field_at = new byte[2000];
    static String field_aN = null;
    Form field_w;
    StringItem field_ad;
    Form field_ao;
    StringItem field_ar;
    private static final Command field_aC = new Command("Menu", 7, 0);
    private static final Command field_aS = new Command("Exit", 7, 0);
    static int field_af;
    static int field_aO;
    static byte[][] field_i;
    static int field_J = 1;
    static String field_c = "";
    private static Thread field_b = null;
    private static int field_E = 0;
    private static byte[][] field_ai;
    private static int[][] field_x = new int[][]{{2, 3, 4, 11, 12, 13, 20, 21, 22, 29, 30, 31}, {5, 6, 7}, {23, 24, 25}, {14, 15, 16}, {8, 9, 10}, {32, 33, 34}, {26, 27, 28}, {17, 18, 19}, {35, 36, 37}};
    private static String[][] field_T;
    private static final int[][] field_ah = new int[][]{{0, 7}, {7, 7}, {14, 7}, {21, 7}, {28, 5}};
    static final String[] field_p = new String[]{"/charin.dat", "/droppeditemsin.dat", "/itemsin.dat", "/monstersin.dat", "/npcstrings.dat", "/spellsin.dat", "/geomin.dat", "/dungnamesin.dat"};
    private static int[] field_l = new int[3];
    private static final String[] field_aM = new String[]{"Your fingers look gnarled to you.", "The scales on your arms and back itch.", "Your ears dissolve back into your skull.", "Your jaw hurts as it elongates, and your teeth seem to completely fill your mouth.", "Walking hurts, and the camp denizens are sure looking tasty. \n\nYour dreams are filled with the screams of overseers and others as you follow the delicious scent of blood throughout the camp. You awake cold, curled up, with Vander's head tucked under your arm."};
    Display field_d;
    private Form field_W;
    static Image field_O = null;
    static Image field_aU = null;
    private RunImageLoader field_aR;
    private RunImageLoader field_aZ;
    private static RunImageLoader field_al;
    private static RunImageLoader field_aQ;
    private RunImageLoader field_ay;
    private RunImageLoader field_U;
    private RunImageLoader field_az;
    private RunImageLoader field_y;
    private RunImageLoader field_h;
    private RunImageLoader field_aE;
    private RunImageLoader field_M;
    private RunImageLoader field_ba;
    private RunImageLoader field_f;
    RunImageLoader field_ab;
    RunImageLoader field_aq;
    RunImageLoader field_m;
    RunImageLoader[] field_R;
    RunImageLoader field_Q;
    RunImageLoader field_ap;
    RunImageLoader field_z;
    RunImageLoader field_ae;
    RunImageLoader field_I;
    RunImageLoader field_X;
    RunImageLoader field_V;
    RunImageLoader field_aJ;
    RunImageLoader field_an;
    RunImageLoader field_aw;
    RunImageLoader field_aI;
    RunImageLoader field_aL;
    RunImageLoader field_H;
    RunImageLoader field_K;
    RunImageLoader field_s;
    RunImageLoader field_t;
    RunImageLoader field_B;
    RunImageLoader field_aY;
    RunImageLoader field_aB;
    RunImageLoader field_L;
    RunImageLoader field_N;
    RunImageLoader field_v;
    RunImageLoader field_q;
    RunImageLoader field_ag;
    RunImageLoader field_aV;
    RunImageLoader field_aP;
    RunImageLoader field_C;
    RunImageLoader field_D;
    private RunImageLoader field_F;
    RunImageLoader field_aj;
    RunImageLoader field_A;
    private class_e field_av;
    private Form field_aD;
    private static String[] field_o = new String[12];
    private static String[] field_as = new String[12];
    private static String field_n = null;
    public class_j field_k;
    public class_j field_e;
    static class_i[] field_u;
    Thread field_aH;
    boolean field_ak;
    boolean field_aW;
    byte field_a;
    boolean field_am;
    static Hashtable[] field_G;
    static Hashtable[] field_S;
    static Vector[] field_au;
    static RunImageLoader field_ax = null;
    int field_Y;
    int field_g;
    static boolean field_aG;
    static Image field_aa;
    static Image field_aA;
    boolean field_ac;
    static Random field_P;
    private static boolean field_j = false;

    public ESGame() {
        super.field_aF = "The Elder Scrolls";
        this.field_d = null;
        field_aN = ((MIDlet)this).getAppProperty("Pluto-Server-URL");
        if (field_aN != null) {
            System.out.println("FOUND Pluto-Server-URL in JAR! Adding prefix gives: " + field_aN);
        } else {
            field_aN = "http://localhost/essm";
            System.out.println("Did not find Pluto-Server-URL in JAR! Using default of http://localhost/essm");
        }

        String var1 = ((MIDlet)this).getAppProperty("Mserver-User-Id");
        if (var1 != null) {
            class_j.field_X = var1;
            System.out.println("User ID is " + class_j.field_X);
        } else {
            System.out.println("User ID is NULL!");
        }

        field_aT = 1;
    }

    //startapp, overrides the MIDlet
    public void method_m() {
        if (this.field_d == null) {
            debugPrint("Very start of startapp");
            this.field_d = Display.getDisplay(this);
            this.field_Y = -1;
            this.field_g = -1;
            this.field_aH = new Thread(this);
            this.field_ak = false;
            this.field_aW = false;
            this.field_a = 0;
            this.field_am = false;
            debugPrint("Before error form");
            this.method_y();
            debugPrint("After error form");
            this.method_H();
            field_aT = 2;
        }

    }

    private void method_H() {
        try {
            field_aa = Image.createImage("/mformaLogo.png");
            field_aA = Image.createImage("/vir2lLogo.png");
            Thread var1 = new Thread(this);
            field_O = this.makeUnmovingSprite("/splashtop.png");
            field_aU = this.makeUnmovingSprite("/splashbot.png");
            this.field_ay = new RunImageLoader(this, 2, 1);
            this.field_ay.method_e();
            this.field_ay.field_c = this.field_w;
            field_J = 2;
            this.field_ac = true;
            field_aG = false;
            this.method_a12(this.field_ay);
            var1.start();
        } catch (Exception var2) {
            System.out.println("Barfed in initSplash");
            this.field_d.setCurrent(this.field_w);
        }

    }

    public void run() {
        if (field_J == 1) {
            System.out.println("run() Initial download, no longer implemented");
        } else if (field_J == 2) {
            this.method_e();
        } else if (field_J == 4) {
            this.createNewGame();
        } else if (field_J == 5) {
            if (this.saveGameState()) {
                this.method_a12(this.field_av);
            } else {
                this.method_a12(this.field_A);
            }
        } else if (field_J == 6) {
            if (this.loadGameState()) {
                this.method_J();
                this.field_a = this.field_k.field_j;
                this.field_ak = true;
                field_j = true;
                field_j = false;
                this.field_ak = false;
                field_aQ.field_m = 100;
                field_aQ.method_c2();
                field_aQ.method_f1();
                this.field_k.method_w1();
                this.field_av.field_ax = this.field_k;
                this.field_av.field_v = true;
                this.field_av.method_i1();
                this.method_a12(this.field_av);
            } else {
                this.method_a12(this.field_ba);
            }
        } else {
            this.method_s();
            this.method_a12(this.field_av);
        }

    }

    private void method_e() {
        try {
            this.field_ac = true;
            field_aG = false;

            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }

            this.field_ac = false;
            this.field_ay.field_m = 0;
            this.allocateESGame();
            this.allocateAllUIs();
            this.method_A();
            this.field_ay.field_m = 100;
        } catch (Throwable var5) {
            System.out.println("ERROR: CANNOT LOAD APP!!");
            System.out.println(var5);
            this.method_a3("" + var5, true);
            this.method_a12(this.field_w);

            try {
                Thread.sleep(15000L);
            } catch (Exception var3) {
            }
        }

    }

    private void allocateESGame() throws Exception {
        this.method_a3("Start of allocateESGame", true);
        this.method_a3("Start of allocateESGame", true);
        method_I();
        class_i.method_g1();
        this.method_a3("Right before character load", true);
        class_j.method_u();
        this.method_a3("ESPersonality load", true);
        class_k.method_e();
        this.field_ay.field_m = 5;
        this.method_a3("Item load", true);
        .javaMicroMIDlet.method_e1();
        this.method_a3("Spell load", true);
        class_b.method_a1();
        this.method_a3("Monster load", true);
        class_d.method_g();
        this.field_ay.field_m = 10;
        this.method_a3("End of allocESGame", true);
    }

    private void method_A() {
        field_u = null;
        System.gc();
        System.out.println(" >>>> CREATING CAMP DUNGEON <<<<<<");
        debugPrint("    Before dungeon vector");
        field_u = new class_i[37];
        debugPrint("    After dungeon vector");
        this.field_ay.field_m = 62;
        field_u[0] = new class_i((byte)1, field_ai[0], field_af, field_aO, field_i);
        debugPrint("    After camp dungeon before GC");
        System.gc();
        debugPrint("    After camp dungeon after GC");

        for(int var1 = 1; var1 < 37; ++var1) {
            field_u[var1] = new class_i((byte)(var1 + 1), field_ai[var1]);
            debugPrint("Before dungeon " + var1);
            field_u[var1].method_b1();
            debugPrint("    After dungeon " + var1 + " before GC");
            System.gc();
            debugPrint("    After dungeon " + var1);
            ++this.field_ay.field_m;
        }

        System.out.println(" After creating dungeons");
        debugPrint(" After creating dungeons, before GC");
        System.gc();
        debugPrint(" After creating dungeons");
    }

    private void createNewGame() {
        System.out.println("Start of createNewGame");
        this.field_aZ.field_m = 0;
        int var1 = getGameAdvancementLevel(0);

        for(int var2 = 0; var2 <= var1; ++var2) {
            this.checkOpenAndPopulateDungeons(var2);
        }

        this.method_a12(this.field_az);
    }

    private void method_J() {
        int var1 = getGameAdvancementLevel(this.field_k.field_W);
        method_i(var1);
    }

    private void allocateAllUIs() throws Exception {
        System.out.println("Starting allocateAllUIs");
        this.method_a3("Start of allocateAllUIs", true);
        System.gc();
        debugPrint("Start of allocateAllUIs");
        this.method_h();
        this.field_ay.field_m = 20;
        this.method_j1();
        this.field_av = new class_e(this);
        debugPrint("Before floors and walls");
        class_e.field_h = this.makeUnmovingSprite("floor3.png");
        debugPrint("after floors");
        class_e.field_Y = this.makeUnmovingSprite("newwallsnok.png");
        debugPrint("After walls");
        this.method_a3("After floor and wall images", true);
        class_e.field_q = new class_g[33];

        for(int var1 = 0; var1 < 33; ++var1) {
            class_e.field_q[var1] = null;
        }

        this.method_a3("After alloc monster images", true);
        this.field_a = 1;
        this.field_ak = true;
        this.method_a3("before runImageLoader", true);
        this.field_ab = new RunImageLoader(this, 11, 304);
        this.field_ab.method_o();
        debugPrint("Before load camp monster images ");
        this.method_p1();
        this.method_a3("After monster images", true);
        debugPrint("After monster images ");
        this.method_j1();
        class_e.field_ar = new class_g[3];
        class_e.field_ar[0] = class_g.makeMultiSprite("baglarge.cus");
        class_e.field_ar[1] = class_g.makeMultiSprite("bagmid.cus");
        class_e.field_ar[2] = class_g.makeMultiSprite("bagsmall.cus");
        debugPrint("After bag images ");
        System.gc();
        this.method_a3("After bag images ", true);
        class_e.field_u = new class_g[3];
        class_e.field_u[0] = class_g.makeMultiSprite("crystalnear.cus");
        class_e.field_u[1] = class_g.makeMultiSprite("crystalmid.cus");
        class_e.field_u[2] = class_g.makeMultiSprite("crystalfar.cus");
        debugPrint("After crystal images ");
        this.method_a3("After crystal images ", true);
        this.method_j1();
        debugPrint("After oracle images ");
        this.method_a3("After oracle images ", true);
        class_e.field_aE = new Image[3];

        for(int var2 = 0; var2 < 3; ++var2) {
            class_e.field_aE[var2] = null;
        }

        class_e.field_aE[0] = this.makeUnmovingSprite("blood1.png");
        class_e.field_aE[1] = this.makeUnmovingSprite("monsterspell.png");
        class_e.field_aE[2] = this.makeUnmovingSprite("selfspell.png");
        System.gc();
        debugPrint("After spell images ");
        this.method_a3("After effects images ", true);
        class_e.field_ab = new class_g[3];
        class_e.field_ab[0] = class_g.makeMultiSprite("chestnearclosed.cus");
        class_e.field_ab[1] = class_g.makeMultiSprite("chestmidclosed.cus");
        class_e.field_ab[2] = class_g.makeMultiSprite("chestfarclosed.cus");
        this.method_a3("After chest images ", true);
        this.method_j1();
        class_e.field_y = new Image[6];
        class_e.field_y[0] = this.makeUnmovingSprite("icon_attack.png");
        class_e.field_y[1] = this.makeUnmovingSprite("icon_cast.png");
        class_e.field_y[2] = this.makeUnmovingSprite("icon_change.png");
        class_e.field_y[3] = this.makeUnmovingSprite("icon_option.png");
        class_e.field_y[4] = this.makeUnmovingSprite("icon_action.png");
        class_e.field_y[5] = this.makeUnmovingSprite("icon_camp.png");
        this.method_a3("After monster and icon images", true);
        System.gc();
        this.method_j1();
        this.method_a13();
        this.method_a3("After HELP STRINGS", true);
        this.method_u();
        this.method_a3("After HELP TITLES", true);
        field_n = this.makeCredits();
        this.method_a3("After CREDITS", true);
        this.field_U = new RunImageLoader(this, 3, 2);
        String[] var3 = new String[]{"New Game", "Continue Game", "Help", "Credits", "Exit"};
        Object var4 = null;
        this.field_U.method_a1("Main Menu", var3, (Vector)var4, false);
        this.field_az = new RunImageLoader(this, 5, 3);
        String[] var5 = class_j.field_K;
        this.field_az.method_a4("New Game", "Select a Class:", var5, (Vector)null);
        this.field_ay.field_m = 35;
        this.method_a3("After newGameUI", true);
        this.field_y = new RunImageLoader(this, 6, 4);
        String[] var6 = new String[]{"See Class Info", "Create Character"};
        Object var7 = null;
        this.field_y.method_a6("Character", "You selected:", "", var6, (Vector)var7);
        this.field_h = new RunImageLoader(this, 4, 5);
        this.field_h.method_a2("Info", "");
        this.field_aE = new RunImageLoader(this, 4, 6);
        this.field_aE.method_a2("New Character", "Character Created!\n \nPress 'select' to enter a name");
        this.field_aE.removeCommand(RunImageLoader.field_I);
        this.field_aE.addCommand(RunImageLoader.field_u);
        this.field_aE.addCommand(RunImageLoader.field_P);
        this.field_M = new RunImageLoader(this, 4, 7);
        this.field_M.method_a2("Welcome", "Welcome to The Elder Scrolls Travels!");
        debugPrint("After all the welcome screens");
        this.method_a3("After all the welcome screens", true);
        this.field_A = new RunImageLoader(this, 4, 499);
        this.field_A.method_a2("Save Error", "There was an error in saving your character record. Your previous character record is still saved. Try turning your phone off then on again to clear the memory.");
        debugPrint("Before NPCHelloUI");
        this.field_aq = new RunImageLoader(this, 4, 8);
        this.field_aq.method_a3("NPC name here", "NPC text here", true);
        this.field_m = new RunImageLoader(this, 4, 360);
        this.field_m.method_a3("Rumors", "Rumors text here", true);
        debugPrint("After NPCHelloUI");
        this.method_a3("After helloUI", true);
        this.field_R = new RunImageLoader[6];

        for(int var8 = 0; var8 < 4; ++var8) {
            this.field_R[var8] = new RunImageLoader(this, 5, 9 + var8);
            String[] var9 = new String[]{"Train", "Give", "Befriend", "Threaten", "Kill"};
            this.field_R[var8].method_a4("Name", "Aid: <TAG>", var9, (Vector)null);
            this.field_R[var8].field_s = this.field_av;
        }

        this.field_R[4] = new RunImageLoader(this, 5, 13);
        String[] var14 = new String[]{"Give Item", "Take Crystal"};
        this.field_R[4].method_a4("Beneca", "Aid: <TAG>", var14, (Vector)null);
        this.field_R[4].field_s = this.field_av;
        this.field_R[5] = new RunImageLoader(this, 5, 14);
        String[] var10 = new String[]{"Rumors", "Give Crystal", "Enchant", "Bless", "Cure", "Warp", "Recovery"};
        this.field_R[5].method_a4("Helga", "Aid: <TAG>", var10, (Vector)null);
        this.field_R[5].field_s = this.field_av;
        this.method_a3("After choicesUI", true);
        this.field_ap = new RunImageLoader(this, 4, 23);
        this.field_ap.method_a3("Oracle", "NPC text here", true);
        this.field_t = new RunImageLoader(this, 3, 31);
        String[] var11 = new String[]{"Stats", "Inventory", "Skills", "Spells", "Save Game", "Load Game", "Help", "Quit Game"};
        this.field_t.method_a1("Options", var11, (Vector)null, false);
        this.field_t.addCommand(RunImageLoader.field_z);
        this.method_a3("After OptionsUI", true);
        this.field_ay.field_m = 42;
        this.field_aD = new Form("Enter name");
        StringItem var12 = new StringItem((String)null, "Enter a name for your character");
        this.field_aD.append(var12);
        TextField var13 = new TextField((String)null, (String)null, 10, 0);
        this.field_aD.append(var13);
        this.field_aD.addCommand(RunImageLoader.field_I);
        this.field_aD.addCommand(RunImageLoader.field_P);
        this.field_aD.setCommandListener(this);
        this.field_ba = new RunImageLoader(this, 4, 305);
        this.field_ba.method_a2("Unavailable", "No game is available for loading. Press OK to return to main menu.");
        this.field_ba.addCommand(RunImageLoader.field_I);
        this.field_ba.setCommandListener(this);
        this.field_ba.field_s = this.field_U;
        this.method_a3("After NoSavedGameUI", true);
        this.field_ay.field_c = this.field_U;
        this.field_az.field_s = this.field_U;
        this.field_y.field_s = this.field_az;
        this.field_h.field_s = this.field_y;
        this.field_h.field_c = this.field_y;
        this.field_aE.field_s = this.field_y;
        this.field_f = new RunImageLoader(this, 4, 399);
        this.field_f.method_n();
        this.field_ay.field_m = 55;
        debugPrint("End of loading UI and images");
        this.method_a3("End of allocateAllUIs", true);
    }

    private RunImageLoader method_a(int var1) {
        System.gc();
        RunImageLoader var2 = new RunImageLoader(this, 5, 22);
        var2.field_N = var1;
        String[] var3 = new String[this.field_k.field_p];

        for(int var4 = 0; var4 < this.field_k.field_p; ++var4) {
            int var5 = Math.abs(this.field_k.field_H[var4]);
            if (this.field_k.method_C(var4)) {
                var3[var4] = "E:" + .javaMicroMIDlet.method_d(var5);
            } else {
                var3[var4] = .javaMicroMIDlet.method_d(var5);
            }
        }

        var2.method_a5(class_k.field_s[var1], "Give What?", var3, (Vector)null, true);
        var2.field_s = this.field_av;
        return var2;
    }

    private RunImageLoader method_b(int var1) {
        System.gc();
        debugPrint("Start of newTrainWhat");
        RunImageLoader var2 = new RunImageLoader(this, 5, 20);
        var2.field_N = var1;
        String[] var3 = new String[3];
        int var4 = 0;

        for(int var5 = 0; var5 < 14; ++var5) {
            int var6 = this.field_k.method_b3(var5, false);
            String var7 = class_j.field_E[var5] + " (<TAG>)";
            if (class_k.method_c1(var1, var5)) {
                var3[var4++] = DataTools.replacePOSWithInt(var7, "<TAG>", var6);
            }
        }

        var2.method_a5(class_k.field_s[var1], "Train What?", var3, (Vector)null, true);
        var2.field_s = this.field_av;
        return var2;
    }

    private RunImageLoader method_p(int var1) {
        System.gc();
        debugPrint("Start of newTakeWhat");
        RunImageLoader var2 = new RunImageLoader(this, 5, 27);
        var2.field_N = var1;
        String[] var3 = .javaMicroMIDlet.method_b1();
        var2.method_a5(class_k.field_s[var1], "Take What?", var3, (Vector)null, true);
        var2.field_s = null;
        return var2;
    }

    private RunImageLoader method_c(int var1) {
        System.gc();
        debugPrint("Start of newEnchantWhat");
        RunImageLoader var2 = new RunImageLoader(this, 5, 350);
        var2.field_N = var1;
        String[] var3 = new String[this.field_k.field_p];

        for(int var4 = 0; var4 < this.field_k.field_p; ++var4) {
            int var5 = Math.abs(this.field_k.field_H[var4]);
            var3[var4] = .javaMicroMIDlet.method_d(var5);
        }

        var2.method_a5(class_k.field_s[var1], "Enchant What?", var3, (Vector)null, true);
        var2.field_s = this.field_av;
        return var2;
    }

    private RunImageLoader method_D() {
        RunImageLoader var1 = new RunImageLoader(this, 4, 32);
        var1.method_a2("Stats", this.field_av.field_ax.method_j1());
        return var1;
    }

    private RunImageLoader method_c1() {
        System.gc();
        RunImageLoader var1 = new RunImageLoader(this, 5, 33);
        String[] var2 = new String[this.field_k.field_p];

        for(int var3 = 0; var3 < this.field_k.field_p; ++var3) {
            byte var4 = this.field_k.field_H[var3];
            System.out.println("itemid is " + var4);
            if (var4 < 0) {
                var2[var3] = "E: " + .javaMicroMIDlet.method_d(Math.abs(var4));
                System.out.println("item is " + var2[var3]);
            } else {
                var2[var3] = .javaMicroMIDlet.method_d(var4);
                System.out.println("item is " + var2[var3]);
            }
        }

        var1.method_a5("Inventory", "Items:", var2, (Vector)null, true);
        var1.field_s = this.field_t;
        return var1;
    }

    private RunImageLoader method_c2(RunImageLoader var1) {
        System.gc();
        //quit menu
        RunImageLoader var2 = new RunImageLoader(this, 5, 202);
        String[] var3 = new String[]{"Yes", "No"};
        var2.method_a5("Quit?", "Are you sure?", var3, (Vector)null, true);
        var2.field_s = var1;
        return var2;
    }

    private RunImageLoader method_b1(RunImageLoader var1) {
        System.gc();
        RunImageLoader var2 = new RunImageLoader(this, 3, 203);
        var2.method_a("Help", field_as, (Vector)null);
        var2.field_s = var1;
        return var2;
    }

    private RunImageLoader method_g(int var1) {
        System.gc();
        RunImageLoader var2 = new RunImageLoader(this, 4, 206);
        var2.method_a3(field_as[var1], field_o[var1], true);
        var2.field_s = this.field_D;
        return var2;
    }

    private RunImageLoader method_a1(RunImageLoader var1) {
        System.gc();
        RunImageLoader var2 = new RunImageLoader(this, 4, 204);
        var2.method_a3("Credits", field_n, true);
        var2.field_s = var1;
        return var2;
    }

    public void pauseApp() {
        this.field_av.method_e3();
        field_aT = 3;
    }

    public void destroyApp(boolean var1) {
        field_aT = 4;
    }

    //this is terrifying
    //i think it's for interfacing with java micro? might need to replace for PC refactor
    public void commandAction(Command var1, Displayable var2) {
        if (field_ax != null) {
            if (var1 == RunImageLoader.field_P && field_ax.field_s != null) {
                this.method_a12(field_ax.field_s);
                return;
            }

            if (field_ax.field_B == 2) {
                if (var1 == RunImageLoader.field_u) {
                    int var3 = field_ax.method_a13();
                    String[] var4 = field_ax.method_r();
                    switch (var3) {
                        case 0:
                            System.gc();
                            this.field_aZ = new RunImageLoader(this, 8, 301);
                            this.field_aZ.method_o();
                            Thread var5 = new Thread(this);
                            field_J = 4;
                            var5.start();
                            this.method_a12(this.field_aZ);
                            break;
                        case 1:
                            System.gc();
                            this.field_av.method_g1();
                            field_aQ = new RunImageLoader(this, 9, 302);
                            field_aQ.method_o();
                            Thread var6 = new Thread(this);
                            field_J = 6;
                            var6.start();
                            this.method_a12(field_aQ);
                            break;
                        case 2:
                            this.field_D = this.method_b1(field_ax);
                            this.method_a12(this.field_D);
                            break;
                        case 3:
                            this.field_aj = this.method_a1(field_ax);
                            this.method_a12(this.field_aj);
                            break;
                        case 4:
                            this.field_C = this.method_c2(field_ax);
                            this.method_a12(this.field_C);
                    }
                }
            } else if (field_ax.field_B == 3) {
                if (var1 == RunImageLoader.field_u) {
                    int var7 = field_ax.method_a13();
                    String[] var30 = field_ax.method_r();
                    this.field_e = null;
                    System.gc();
                    this.field_e = new class_j(this);
                    this.field_e.method_c(var7);
                    this.field_e.method_d(var7);
                    this.field_y.method_a16(1, var30[var7]);
                    this.method_a12(this.field_y);
                }
            } else if (field_ax.field_B == 4) {
                if (var1 == RunImageLoader.field_u) {
                    int var8 = field_ax.method_a13();
                    String[] var31 = field_ax.method_r();
                    if (var8 == 0) {
                        String var40 = this.field_e.method_m();
                        this.field_h.method_a16(0, var40);
                        this.field_h.field_w = 0;
                        this.method_a12(this.field_h);
                    } else {
                        this.field_k = this.field_e;
                        this.method_a12(this.field_aE);
                    }
                }
            } else if (field_ax.field_B == 5) {
                if (var1 == RunImageLoader.field_I) {
                    this.method_a12(field_ax.field_c);
                }
            } else if (field_ax.field_B == 6) {
                if (var1 == RunImageLoader.field_u) {
                    this.method_a12(this.field_aD);
                }
            } else if (field_ax.field_B == 7) {
                this.field_aR = new RunImageLoader(this, 4, 101);
                this.field_aR.method_a3("Introduction", class_k.field_k[7][3], true);
                this.method_a12(this.field_aR);
            } else if (field_ax.field_B == 101) {
                if (var1 == RunImageLoader.field_I) {
                    this.field_av.field_ax = this.field_k;
                    this.field_av.method_i1();
                    this.method_a12(this.field_av);
                }
            } else if (field_ax.field_B != 8 && field_ax.field_B != 360) {
                if (field_ax.field_B >= 9 && field_ax.field_B <= 14) {
                    if (var1 == RunImageLoader.field_P) {
                        this.method_a12(field_ax.field_s);
                    } else {
                        this.method_d(field_ax);
                    }
                } else if (field_ax.field_B == 20) {
                    if (var1 == RunImageLoader.field_u) {
                        int var10 = field_ax.field_N;
                        int var32 = field_ax.method_a13();
                        int var41 = class_k.method_b2(var10, var32);
                        this.field_ae = this.method_a2(field_ax, var10, 21, 5, var41);
                        this.method_a12(this.field_ae);
                    } else if (var1 == RunImageLoader.field_P) {
                        int var11 = field_ax.field_N;
                        this.method_k1(var11);
                        this.method_a12(this.field_R[var11]);
                    }
                } else if (field_ax.field_B == 22) {
                    if (var1 == RunImageLoader.field_u) {
                        System.out.println("Found give what select");
                        int var12 = field_ax.field_N;
                        int var33 = field_ax.method_a13();
                        if (var33 >= 0) {
                            this.field_ap = this.method_a2(field_ax, var12, 23, 4, var33);
                            this.method_a12(this.field_ap);
                        }
                    } else if (var1 == RunImageLoader.field_P) {
                        int var13 = field_ax.field_N;
                        this.method_k1(var13);
                        this.method_a12(this.field_R[var13]);
                    }
                } else if (field_ax.field_B == 27) {
                    if (var1 == RunImageLoader.field_u) {
                        int var14 = field_ax.field_N;
                        int var34 = field_ax.method_a13() + 87;
                        this.field_aJ = this.method_a2(field_ax, var14, 28, 7, var34);
                        this.method_a12(this.field_aJ);
                    } else if (var1 == RunImageLoader.field_P) {
                        int var15 = field_ax.field_N;
                        this.method_k1(var15);
                        this.method_a12(this.field_R[var15]);
                    }
                } else if (field_ax.field_B == 350) {
                    if (var1 == RunImageLoader.field_u) {
                        int var16 = field_ax.field_N;
                        int var35 = field_ax.method_a13();
                        if (var35 >= 0) {
                            this.field_aI = this.method_a2(field_ax, var16, 351, 8, var35);
                            this.method_a12(this.field_aI);
                        }
                    } else if (var1 == RunImageLoader.field_P) {
                        int var17 = field_ax.field_N;
                        this.method_k1(var17);
                        this.method_a12(this.field_R[var17]);
                    }
                } else if (field_ax.field_B != 23 && field_ax.field_B != 21 && field_ax.field_B != 24 && field_ax.field_B != 25 && field_ax.field_B != 28) {
                    if (field_ax.field_B == 26) {
                        this.method_a12(this.field_av);
                    } else if (field_ax.field_B != 351 && field_ax.field_B != 352 && field_ax.field_B != 353 && field_ax.field_B != 355) {
                        if (field_ax.field_B == 30) {
                            if (var1 == RunImageLoader.field_I) {
                                this.method_a12(this.field_av);
                            }
                        } else if (field_ax.field_B == 41) {
                            if (var1 == RunImageLoader.field_I) {
                                this.field_k.field_Q = false;
                                this.method_a12(this.field_av);
                            }
                        } else if (field_ax.field_B == 31) {
                            if (var1 == RunImageLoader.field_u) {
                                int var20 = field_ax.method_a13();
                                String[] var36 = field_ax.method_r();
                                switch (var20) {
                                    case 0:
                                        this.field_B = this.method_D();
                                        this.method_a12(this.field_B);
                                        break;
                                    case 1:
                                        this.field_aY = this.method_c1();
                                        this.method_a12(this.field_aY);
                                        break;
                                    case 2:
                                        this.field_L = this.newSkillsListUI();
                                        this.method_a12(this.field_L);
                                        break;
                                    case 3:
                                        this.field_v = this.newSpellsListUI();
                                        this.method_a12(this.field_v);
                                        break;
                                    case 4:
                                        field_al = new RunImageLoader(this, 10, 303);
                                        field_al.method_o();
                                        Thread var42 = new Thread(this);
                                        field_J = 5;
                                        var42.start();
                                        this.method_a12(field_al);
                                        break;
                                    case 5:
                                        System.gc();
                                        this.field_av.method_g1();
                                        field_aQ = new RunImageLoader(this, 9, 302);
                                        field_aQ.method_o();
                                        Thread var46 = new Thread(this);
                                        field_J = 6;
                                        var46.start();
                                        this.method_a12(field_aQ);
                                        break;
                                    case 6:
                                        debugPrint("Help");
                                        this.field_D = this.method_b1(field_ax);
                                        this.method_a12(this.field_D);
                                        break;
                                    case 7:
                                        this.field_C = this.method_c2(field_ax);
                                        this.method_a12(this.field_C);
                                        break;
                                    case 8:
                                        this.method_g1();
                                        this.method_a12(this.field_ao);
                                }
                            } else if (var1 == RunImageLoader.field_z) {
                                this.method_a12(this.field_av);
                            }
                        } else if (field_ax.field_B == 32) {
                            if (var1 == RunImageLoader.field_I) {
                                this.method_a12(this.field_t);
                            }
                        } else if (field_ax.field_B == 33) {
                            if (var1 == RunImageLoader.field_u) {
                                int var21 = field_ax.method_a13();
                                if (var21 >= 0) {
                                    this.field_aB = this.newInventoryItemUI(var21);
                                    this.field_Y = var21;
                                    this.method_a12(this.field_aB);
                                }
                            }
                        } else if (field_ax.field_B == 34) {
                            if (var1 == RunImageLoader.field_u) {
                                int var22 = field_ax.method_a13();
                                Integer var37 = (Integer)field_ax.field_n.elementAt(var22);
                                int var43 = var37;
                                if (var43 == 0) {
                                    this.field_k.method_i1(this.field_Y);
                                    this.field_aY = this.method_c1();
                                    this.method_a12(this.field_aY);
                                } else if (var43 == 1) {
                                    if (!this.field_k.method_C(this.field_Y)) {
                                        this.field_k.method_d3(this.field_Y, true);
                                    } else {
                                        this.field_k.method_A1(this.field_Y);
                                    }

                                    this.field_aY = this.method_c1();
                                    this.method_a12(this.field_aY);
                                } else if (var43 == 2) {
                                    this.field_k.method_r1(this.field_Y);
                                    this.field_aY = this.method_c1();
                                    this.method_a12(this.field_aY);
                                } else if (var43 == 3) {
                                    this.field_k.method_a14(this.field_Y);
                                    if (this.field_k.field_Q) {
                                        this.field_k.field_Q = false;
                                        this.method_a12(this.field_av);
                                    } else {
                                        this.field_aY = this.method_c1();
                                        this.method_a12(this.field_aY);
                                    }
                                }

                                this.field_Y = -1;
                            }
                        } else if (field_ax.field_B == 35) {
                            if (var1 == RunImageLoader.field_u) {
                                int var23 = field_ax.method_a13();
                                this.field_N = this.newSkillInfoUI(var23);
                                this.method_a12(this.field_N);
                            }
                        } else if (field_ax.field_B == 36) {
                            if (var1 == RunImageLoader.field_I) {
                                this.method_a12(this.field_L);
                            }
                        } else if (field_ax.field_B == 37) {
                            if (var1 == RunImageLoader.field_u) {
                                int var24 = field_ax.method_a13();
                                if (var24 >= 0) {
                                    this.field_q = this.newSpellInfoUI(var24);
                                    this.field_g = var24;
                                    this.method_a12(this.field_q);
                                }
                            }
                        } else if (field_ax.field_B == 38) {
                            if (var1 == RunImageLoader.field_u) {
                                int var25 = this.field_k.method_B(this.field_g);
                                this.field_k.field_b = (byte)(var25 + 1);
                                this.field_v = this.newSpellsListUI();
                                this.method_a12(this.field_v);
                                this.field_g = -1;
                            }
                        } else if (field_ax.field_B == 39) {
                            if (var1 == RunImageLoader.field_u) {
                                String var26 = field_ax.method_p();
                                field_l[field_ax.field_N] = -1;

                                for(int var38 = 0; var38 < class_j.field_y.length; ++var38) {
                                    if (var26.equals(class_j.field_y[var38])) {
                                        field_l[field_ax.field_N] = var38;
                                        break;
                                    }
                                }

                                if (field_ax.field_N < 2) {
                                    int var44 = field_ax.field_N + 1;
                                    this.field_ag = this.newLevelUpUI(var44 + 1);
                                    this.method_a12(this.field_ag);
                                } else {
                                    short[] var10000 = this.field_k.field_J;
                                    int var10001 = field_l[0];
                                    var10000[var10001] = (short)(var10000[var10001] + 3);
                                    var10000 = this.field_k.field_J;
                                    var10001 = field_l[1];
                                    var10000[var10001] = (short)(var10000[var10001] + 2);
                                    ++this.field_k.field_J[field_l[2]];
                                    this.field_k.method_g();
                                    this.field_k.method_d5();
                                    this.method_a12(this.field_av);
                                    this.field_av.method_b6();
                                }
                            }
                        } else if (field_ax.field_B == 202) {
                            if (var1 == RunImageLoader.field_u) {
                                int var27 = field_ax.method_a13();
                                if (var27 == 0) {
                                    this.method_a12(this.field_f);
                                } else {
                                    this.method_a12(field_ax.field_s);
                                }
                            }
                        } else if (field_ax.field_B == 202) {
                            ((javaMicroMIDlet)this).method_b4();
                        } else if (field_ax.field_B == 40) {
                            this.method_a12(this.field_av);
                            this.field_av.method_b6();
                        } else if (field_ax.field_B == 102) {
                            this.method_a12(this.field_av);
                            this.field_av.method_b6();
                        } else if (field_ax.field_B == 203) {
                            if (var1 == RunImageLoader.field_u) {
                                int var28 = field_ax.method_a13();
                                this.field_F = this.method_g(var28);
                                this.method_a12(this.field_F);
                            } else {
                                this.method_a12(field_ax.field_s);
                            }
                        } else if (field_ax.field_B == 206) {
                            this.method_a12(field_ax.field_s);
                        } else if (field_ax.field_B == 204) {
                            this.method_a12(field_ax.field_s);
                        } else if (field_ax.field_B == 305) {
                            this.method_a12(field_ax.field_s);
                        } else if (field_ax.field_B == 205) {
                            this.method_a12(field_ax.field_s);
                        } else if (field_ax.field_B != 200 && field_ax.field_B != 201) {
                            if (field_ax.field_B == 399) {
                                ((javaMicroMIDlet)this).method_b4();
                            } else if (field_ax.field_B == 499) {
                                ((javaMicroMIDlet)this).method_b4();
                            }
                        } else {
                            this.method_a12(field_ax.field_c);
                        }
                    } else if (var1 == RunImageLoader.field_I) {
                        int var19 = field_ax.field_N;
                        this.method_k1(var19);
                        this.method_a12(this.field_R[var19]);
                    }
                } else if (var1 == RunImageLoader.field_I) {
                    int var18 = field_ax.field_N;
                    this.method_k1(var18);
                    this.method_a12(this.field_R[var18]);
                }
            } else if (var1 == RunImageLoader.field_I) {
                if (field_ax.field_c == null) {
                    System.out.println("ERROR: next is null!");
                } else {
                    RunImageLoader var9 = (RunImageLoader)field_ax.field_c;
                    if (var9 == null) {
                        System.out.println("uic.next is null!");
                    }
                }

                this.method_a12(field_ax.field_c);
            }
        } else if (var2 == this.field_w) {
            ((javaMicroMIDlet)this).method_b4();
        } else if (var2 == this.field_ao) {
            this.method_a12(this.field_av);
        } else if (var2 == this.field_W) {
            if (var1 == field_aS) {
                ((javaMicroMIDlet)this).method_b4();
            }
        } else if (var2 == this.field_aD) {
            if (var1 == RunImageLoader.field_I) {
                TextField var29 = (TextField)this.field_aD.get(1);
                String nameInputString = var29.getString();
                if (nameInputString.length() < 3) {
                    Alert var45 = new Alert("Error", DataTools.replacePOSWithInt("Your character name must be at least <TAG> letters", "<TAG>", 3), (Image)null, AlertType.ERROR);
                    var45.setTimeout(-2);
                    this.method_a12(var45);
                } else {
                    this.field_k.field_v = nameInputString;
                    this.method_a12(this.field_M);
                }
            } else if (var1 == RunImageLoader.field_P) {
                this.method_a12(this.field_aE);
            }
        }

    }

    private void method_d(RunImageLoader var1) {
        int var3 = var1.method_a13();
        int var4 = var1.field_B - 9;
        switch (var4) {
            case 0:
            case 1:
            case 2:
            case 3:
                if (var3 == 0) {
                    this.field_z = this.method_b(var4);
                    this.method_a12(this.field_z);
                } else if (var3 == 1) {
                    if (this.field_k.field_p <= 0) {
                        this.field_ap.method_a17(class_k.field_s[var4]);
                        this.field_ap.method_e2("You have nothing to give me!");
                        this.method_a12(this.field_ap);
                    } else {
                        this.field_Q = this.method_a(var4);
                        this.method_a12(this.field_Q);
                    }
                } else if (var3 == 2) {
                    this.field_X = this.method_a2(var1, var4, 24, 2, 0);
                    this.method_a12(this.field_X);
                } else if (var3 == 3) {
                    this.field_V = this.method_a2(var1, var4, 25, 3, 0);
                    this.method_a12(this.field_V);
                } else if (var3 == 4) {
                    this.field_an = this.method_a2(var1, var4, 26, 6, 0);
                    this.method_a12(this.field_an);
                }
                break;
            case 4:
                if (var3 == 0) {
                    if (this.field_k.field_p <= 0) {
                        this.field_ap.method_a17(class_k.field_s[var4]);
                        this.field_ap.method_e2("You have nothing to give me!");
                        this.method_a12(this.field_ap);
                    } else {
                        this.field_Q = this.method_a(var4);
                        this.method_a12(this.field_Q);
                    }
                } else if (var3 == 1) {
                    this.field_I = this.method_p(var4);
                    this.method_a12(this.field_I);
                }
                break;
            case 5:
                if (var3 == 0) {
                    this.method_x();
                } else if (var3 == 1) {
                    if (this.field_k.field_p <= 0) {
                        this.field_ap.method_a17(class_k.field_s[var4]);
                        this.field_ap.method_e2("You have nothing to give me!");
                        this.method_a12(this.field_ap);
                    } else {
                        this.field_Q = this.method_a(var4);
                        this.method_a12(this.field_Q);
                    }
                } else if (var3 == 2) {
                    this.field_aw = this.method_c(var4);
                    this.method_a12(this.field_aw);
                } else if (var3 == 3) {
                    this.field_aL = this.method_a2(var1, var4, 352, 9, 0);
                    this.method_a12(this.field_aL);
                } else if (var3 == 4) {
                    this.field_H = this.method_a2(var1, var4, 353, 10, 0);
                    this.method_a12(this.field_H);
                } else if (var3 == 5) {
                    this.field_K = this.method_a2(var1, var4, 41, 11, 0);
                    this.method_a12(this.field_K);
                } else if (var3 == 6) {
                    this.field_s = this.method_a2(var1, var4, 355, 12, 0);
                    this.method_a12(this.field_s);
                }
        }

    }

    private RunImageLoader method_a2(RunImageLoader var1, int var2, int var3, int var4, int var5) {
        RunImageLoader var6 = new RunImageLoader(this, 4, var3);
        var6.method_a3("NPC name here", "NPC text here", true);
        String var7 = class_k.method_a6(this.field_k, var2, var4, var5);
        var6.method_a17(class_k.field_s[var2]);
        var6.method_e2(var7);
        var6.field_N = var2;
        return var6;
    }

    private Image makeUnmovingSprite(String var1) throws Exception {
        return !var1.startsWith("/") ? Image.createImage("/" + var1) : Image.createImage(var1);
    }

    private boolean loadGameState() {
        boolean var1 = true;
        boolean var2 = false;
        RecordStore var3 = null;
        field_aQ.field_m = 0;
        String var4 = this.method_M();

        try {
            if (var4 == null) {
                throw new Exception("No valid record store!");
            }

            var3 = RecordStore.openRecordStore(var4, false);
            int var5 = var3.getNumRecords();
            byte[] var6 = var3.getRecord(1);
            this.field_k = class_j.method_a3(var6, true);
            this.field_k.field_ai = this;
            field_aQ.field_m = 20;
            field_aQ.method_c2();
            field_aQ.method_f1();
            int var7 = method_a5(var3, 2);
            System.out.println("Read the master lists from RecordStore");
            var6 = var3.getRecord(var7);
            method_b2(var6);
        } catch (Exception var17) {
            System.out.println("Exception in loadGameState");
            System.out.println(var17);
            var1 = false;
        } finally {
            if (var3 != null) {
                try {
                    var3.closeRecordStore();
                } catch (Exception var16) {
                }
            }

        }

        return var1;
    }

    private boolean saveGameState() {
        boolean var1 = true;
        boolean var2 = false;
        RecordStore var3 = null;
        field_al.field_m = 0;
        String var4 = this.method_f2();

        try {
            var3 = RecordStore.openRecordStore(var4, true);
            byte[] var5 = this.field_k.method_g1(true);
            field_al.field_m = 20;
            field_al.method_c2();
            field_al.method_f1();
            var3.addRecord(var5, 0, var5.length);
            System.gc();
            method_a4(var3);
            var5 = method_k();
            var3.addRecord(var5, 0, var5.length);
            Object var22 = null;
            System.gc();
            var3.closeRecordStore();
            var3 = null;
            this.method_L();
            field_al.field_m = 100;
            field_al.method_c2();
            field_al.method_f1();
        } catch (Throwable var18) {
            System.out.println("Exception in saveGameState");
            System.out.println(var18);

            try {
                RecordStore.deleteRecordStore(var4);
            } catch (Exception var17) {
            }

            var1 = false;
        } finally {
            if (var3 != null) {
                try {
                    var3.closeRecordStore();
                } catch (Exception var16) {
                }
            }

        }

        return var1;
    }

    private void method_y() {
        this.field_w = new Form("Error");
        this.field_ad = new StringItem("Error: ", "Cannot load game");
        this.field_w.append(this.field_ad);
        Command var1 = new Command("Ok", 4, 1);
        this.field_w.addCommand(var1);
        this.field_w.setCommandListener(this);
    }

    private void method_a3(String var1, boolean var2) {
        this.method_b3(var1);
        boolean var3 = false;
        if (var3) {
            String var4 = this.field_ad.getText();
            var4 = var4 + "\n" + method_f(var1);
            this.field_ad.setText(var4);
        } else {
            this.field_ad.setText(method_f(var1));
        }

    }

    void method_B() {
        this.method_a3("Out of memory", true);
        this.field_d.setCurrent(this.field_w);
    }

    static int getGameAdvancementLevel(int giftPoints) {
        System.out.println("In getGameAdvancementLevel, giftPoints = " + giftPoints);
        if (giftPoints < 9) {
            return 0;
        } else if (giftPoints < 13) {
            return 1;
        } else if (giftPoints < 17) {
            return 2;
        } else if (giftPoints < 23) {
            return 3;
        } else if (giftPoints < 28) {
            return 4;
        } else if (giftPoints < 34) {
            return 5;
        } else if (giftPoints < 40) {
            return 6;
        } else {
            return giftPoints < 48 ? 7 : 8;
        }
    }

    void checkOpenAndPopulateDungeons(int gameAdvLevel) {
        System.out.println("In checkOpenAndPopulateDungeons, gameAdvLevel = " + gameAdvLevel);
        int[] var2 = field_x[gameAdvLevel];
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int var5 = field_x[gameAdvLevel][var4];
            int var6 = var5 - 1;
            if (!field_u[var6].field_k) {
                field_u[var6].field_k = true;
                field_u[var6].method_e();
            }

            if (this.field_aZ != null) {
                this.field_aZ.field_m = 100 * (var4 + 1) / var3;
                if (this.field_aZ.field_m > 100) {
                    this.field_aZ.field_m = 100;
                }

                this.field_aZ.method_c2();
                this.field_aZ.method_f1();
            }
        }

    }

    static void method_i(int var0) {
        int var1 = 0;
        int var2 = 0;

        for(int var3 = 0; var3 <= var0; ++var3) {
            int[] var4 = field_x[var3];
            int var5 = var4.length;
            var2 += var5;
        }

        for(int var10 = 0; var10 <= var0; ++var10) {
            int[] var11 = field_x[var10];
            int var6 = var11.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                int var8 = field_x[var10][var7];
                int var9 = var8 - 1;
                field_u[var9].field_k = true;
                field_u[var9].method_h();
                ++var1;
                field_aQ.field_m = 100 * var1 / var2;
                if (field_aQ.field_m > 100) {
                    field_aQ.field_m = 100;
                }
            }
        }

    }

    static void method_i1() throws Exception {
        method_E();
    }

    private static void method_E() {
        field_af = 19;
        field_aO = 19;
        field_i = new byte[field_aO][field_af];

        for(int var0 = 0; var0 < field_aO; ++var0) {
            for(int var1 = 0; var1 < field_af; ++var1) {
                field_i[var0][var1] = 1;
            }
        }

        for(int var5 = 0; var5 < field_af; ++var5) {
            field_i[var5][9] = 0;
        }

        for(int var2 = 0; var2 < field_aO; ++var2) {
            field_i[9][var2] = 0;
        }

        for(int var3 = 0; var3 < 3; ++var3) {
            for(int var4 = 0; var4 < 3; ++var4) {
                field_i[8 + var3][8 + var4] = 0;
            }
        }

        field_i[4][8] = 0;
        field_i[4][7] = 0;
        field_i[3][7] = 0;
        field_i[16][8] = 0;
        field_i[16][7] = 0;
        field_i[15][7] = 0;
        field_i[8][3] = 0;
        field_i[7][3] = 0;
        field_i[7][2] = 0;
        field_i[10][4] = 0;
        field_i[11][4] = 0;
        field_i[12][4] = 0;
        field_i[12][3] = 0;
        field_i[6][14] = 0;
        field_i[7][14] = 0;
        field_i[8][14] = 0;
        field_i[9][14] = 0;
        field_i[10][14] = 0;
        field_i[11][14] = 0;
        field_i[12][14] = 0;
        field_i[6][13] = 0;
        field_i[12][13] = 0;
    }

    private static void method_K() {
        field_G = new Hashtable[37];

        for(int var0 = 1; var0 < 37; ++var0) {
            field_G[var0] = new Hashtable();
        }

        field_S = new Hashtable[37];

        for(int var1 = 1; var1 < 37; ++var1) {
            field_S[var1] = new Hashtable();
        }

        field_au = new Vector[37];

        for(int var2 = 0; var2 < 37; ++var2) {
            field_au[var2] = new Vector();
        }

    }

    private static void method_b2(byte[] var0) throws Exception {
        DataInputStream var1 = new DataInputStream(new ByteArrayInputStream(var0, 0, var0.length));
        .javaMicroMIDlet.field_i = var1.readShort();
        class_d.field_j = var1.readShort();

        for(int var2 = 0; var2 < 7; ++var2) {
            class_k.field_b[var2] = var1.readBoolean();
        }

        for(int var3 = 0; var3 < 7; ++var3) {
            class_k.field_q[var3] = var1.readBoolean();
        }

        for(int var4 = 0; var4 < 4; ++var4) {
            class_k.field_r[var4] = var1.readShort();
        }

        for(int var5 = 0; var5 < 4; ++var5) {
            class_k.field_p[var5] = var1.readShort();
        }

        for(int var6 = 0; var6 < 4; ++var6) {
            class_k.field_h[var6] = var1.readShort();
        }

        for(int var7 = 0; var7 < 4; ++var7) {
            class_k.field_c[var7] = var1.readByte();
        }

        for(int var8 = 0; var8 < 4; ++var8) {
            class_k.field_n[var8] = var1.readByte();
        }

        class_k.field_f = var1.readByte();
        class_k.field_d = var1.readBoolean();
        class_k.field_a = var1.readShort();
        class_k.field_g = var1.readShort();
        class_k.field_l = var1.readBoolean();

        for(int var9 = 0; var9 < 7; ++var9) {
            if (!class_k.field_b[var9]) {
                class_i var10 = field_u[0];
                var10.field_w[class_k.field_j[var9]][class_k.field_i[var9]] = DataTools.clearManyBits((byte)32, var10.field_w[class_k.field_j[var9]][class_k.field_i[var9]]);
            }
        }

    }

    private static byte[] method_k() throws Exception {
        ByteArrayOutputStream var0 = new ByteArrayOutputStream(60);
        DataOutputStream var1 = new DataOutputStream(var0);
        var1.writeShort(.class_a.field_i);
        var1.writeShort(class_d.field_j);

        for(int var2 = 0; var2 < 7; ++var2) {
            var1.writeBoolean(class_k.field_b[var2]);
        }

        for(int var3 = 0; var3 < 7; ++var3) {
            var1.writeBoolean(class_k.field_q[var3]);
        }

        for(int var4 = 0; var4 < 4; ++var4) {
            var1.writeShort(class_k.field_r[var4]);
        }

        for(int var5 = 0; var5 < 4; ++var5) {
            var1.writeShort(class_k.field_p[var5]);
        }

        for(int var6 = 0; var6 < 4; ++var6) {
            var1.writeShort(class_k.field_h[var6]);
        }

        for(int var7 = 0; var7 < 4; ++var7) {
            var1.writeByte(class_k.field_c[var7]);
        }

        for(int var8 = 0; var8 < 4; ++var8) {
            var1.writeByte(class_k.field_n[var8]);
        }

        var1.writeByte(class_k.field_f);
        var1.writeBoolean(class_k.field_d);
        var1.writeShort(class_k.field_a);
        var1.writeShort(class_k.field_g);
        var1.writeBoolean(class_k.field_l);
        byte[] var9 = var0.toByteArray();
        return var9;
    }

    private static void method_a4(RecordStore var0) throws Exception {
        for(int var2 = 1; var2 < 37; ++var2) {
            int var3 = field_G[var2].size();
            int var1 = 4 + var3 * 28;
            ByteArrayOutputStream var4 = new ByteArrayOutputStream(var1);
            DataOutputStream var5 = new DataOutputStream(var4);
            var5.writeInt(var3);
            Enumeration var6 = field_G[var2].elements();

            while(var6.hasMoreElements()) {
                byte[] var7 = (byte[])var6.nextElement();
                class_d var8 = class_d.method_a(var7);
                var8.method_a8(var5);
            }

            byte[] var25 = var4.toByteArray();
            var0.addRecord(var25, 0, var25.length);

            try {
                var5.close();
            } catch (Exception var13) {
            }

            Object var19 = null;
            Object var26 = null;
            System.gc();
            field_al.field_m = 20 + 30 * (var2 + 1) / 37;
            field_al.method_c2();
            field_al.method_f1();
        }

        for(int var16 = 1; var16 < 37; ++var16) {
            int var17 = field_S[var16].size();
            int var14 = 4 + var17 * 8;
            ByteArrayOutputStream var20 = new ByteArrayOutputStream(var14);
            DataOutputStream var22 = new DataOutputStream(var20);
            var22.writeInt(var17);
            Enumeration var27 = field_S[var16].elements();

            while(var27.hasMoreElements()) {
                byte[] var30 = (byte[])var27.nextElement();
                method_a7(var22, var30, 8);
            }

            byte[] var31 = var20.toByteArray();
            var0.addRecord(var31, 0, var31.length);

            try {
                var22.close();
            } catch (Exception var12) {
            }

            Object var23 = null;
            Object var32 = null;
            System.gc();
            field_al.field_m = 50 + 30 * (var16 + 1) / 37;
            field_al.method_c2();
            field_al.method_f1();
        }

        for(int var18 = 0; var18 < 37; ++var18) {
            int var21 = field_au[var18].size();
            int var15 = 4 + var21 * 7;
            ByteArrayOutputStream var24 = new ByteArrayOutputStream(var15);
            DataOutputStream var28 = new DataOutputStream(var24);
            var28.writeInt(var21);
            Enumeration var33 = field_au[var18].elements();

            while(var33.hasMoreElements()) {
                byte[] var9 = (byte[])var33.nextElement();
                method_a7(var28, var9, 7);
            }

            byte[] var34 = var24.toByteArray();
            var0.addRecord(var34, 0, var34.length);

            try {
                var28.close();
            } catch (Exception var11) {
            }

            Object var29 = null;
            Object var35 = null;
            System.gc();
            field_al.field_m = 80 + 19 * (var18 + 1) / 37;
            field_al.method_c2();
            field_al.method_f1();
        }

    }

    private static int method_a5(RecordStore var0, int var1) throws Exception {
        int var2 = var1;

        for(int var3 = 1; var3 < 37; ++var3) {
            byte[] var4 = var0.getRecord(var2++);
            DataInputStream var5 = new DataInputStream(new ByteArrayInputStream(var4, 0, var4.length));
            field_G[var3].clear();
            int var6 = var5.readInt();

            for(int var7 = 0; var7 < var6; ++var7) {
                class_d var8 = class_d.method_a7(var5);
                String var9 = String.valueOf(var8.field_a);
                field_G[var3].put(var9, var8.method_f());
            }

            try {
                var5.close();
            } catch (Exception var13) {
            }

            Object var16 = null;
            Object var14 = null;
            System.gc();
            field_aQ.field_m = 20 + 30 * (var3 + 1) / 37;
            field_aQ.method_c2();
            field_aQ.method_f1();
        }

        for(int var15 = 1; var15 < 37; ++var15) {
            byte[] var17 = var0.getRecord(var2++);
            DataInputStream var20 = new DataInputStream(new ByteArrayInputStream(var17, 0, var17.length));
            field_S[var15].clear();
            int var24 = var20.readInt();

            for(int var27 = 0; var27 < var24; ++var27) {
                byte[] var29 = method_a6(var20, 8);
                String var10 = DataTools.commaBetweenInts(var29[0], var29[1]);
                field_S[var15].put(var10, var29);
            }

            try {
                var20.close();
            } catch (Exception var12) {
            }

            Object var21 = null;
            Object var18 = null;
            System.gc();
            field_aQ.field_m = 50 + 30 * (var15 + 1) / 37;
            field_aQ.method_c2();
            field_aQ.method_f1();
        }

        for(int var19 = 0; var19 < 37; ++var19) {
            byte[] var22 = var0.getRecord(var2++);
            DataInputStream var25 = new DataInputStream(new ByteArrayInputStream(var22, 0, var22.length));
            field_au[var19].removeAllElements();
            int var28 = var25.readInt();

            for(int var30 = 0; var30 < var28; ++var30) {
                byte[] var31 = method_a6(var25, 7);
                field_au[var19].addElement(var31);
            }

            try {
                var25.close();
            } catch (Exception var11) {
            }

            Object var26 = null;
            Object var23 = null;
            System.gc();
            field_aQ.field_m = 80 + 19 * (var19 + 1) / 37;
            field_aQ.method_c2();
            field_aQ.method_f1();
        }

        return var2;
    }

    private static byte[] method_a6(DataInputStream var0, int var1) throws Exception {
        byte[] var2 = new byte[var1];

        for(int var3 = 0; var3 < var1; ++var3) {
            var2[var3] = var0.readByte();
        }

        return var2;
    }

    private static void method_a7(DataOutputStream var0, byte[] var1, int var2) throws Exception {
        for(int var3 = 0; var3 < var2; ++var3) {
            var0.writeByte(var1[var3]);
        }

    }

    //empty, probably removed for release
    public static void debugPrint(String var0) {
    }

    static String method_f(String var0) {
        if (var0 == null) {
            var0 = "";
        }

        Runtime var1 = Runtime.getRuntime();
        long var2 = var1.freeMemory();
        long var4 = var1.totalMemory();
        return ">>> MEMORY: " + var0 + ": Free memory is " + var2 + ", Total memory is " + var4;
    }

    private void method_h() {
        this.field_W = new Form("Done");
        StringItem var1 = new StringItem((String)null, "I am done");
        this.field_W.append(var1);
        this.field_W.addCommand(field_aS);
        this.field_W.setCommandListener(this);
    }

    private void method_p1() {
        byte[] var1 = new byte[5];
        System.out.println("LOADING WARDEN IMAGES");
        var1[0] = 1;
        var1[1] = 1;
        var1[2] = 1;
        var1[3] = 1;
        var1[4] = 1;
        this.field_a = 1;
        this.method_a8(var1);
    }

    void method_s() {
        System.out.println("Running image loader thread for new dungeon ID: " + this.field_a);
        this.field_am = false;
        if (field_j) {
            field_aQ.field_m = 80;
        } else {
            this.field_ab.field_m = 0;
        }

        byte[] var1 = new byte[5];

        for(int var2 = 0; var2 < 5; ++var2) {
            var1[var2] = 0;
        }

        if (this.field_a == 1) {
            this.method_z();
            this.method_p1();
        } else {
            Hashtable var3 = field_G[this.field_a - 1];
            if (var3 == null) {
                return;
            }

            Enumeration var4 = var3.elements();

            while(var4.hasMoreElements()) {
                byte[] var5 = (byte[])var4.nextElement();
                class_d var6 = class_d.method_a(var5);
                if (var6.field_l >= 1 && var6.field_l <= 5) {
                    ++var1[0];
                } else if (var6.field_l >= 6 && var6.field_l <= 10) {
                    ++var1[1];
                } else if (var6.field_l >= 11 && var6.field_l <= 25) {
                    ++var1[2];
                } else if (var6.field_l >= 26 && var6.field_l <= 40) {
                    ++var1[3];
                } else {
                    ++var1[4];
                }
            }

            this.method_z();
            this.method_a8(var1);
        }

        class_e.field_E = true;
    }

    private boolean method_m1(int var1) {
        switch (var1) {
            case 4:
            case 11:
            case 18:
            case 23:
            case 30:
                return true;
            default:
                return false;
        }
    }

    void method_a8(byte[] var1) {
        this.field_am = false;
        this.method_a3("Inside runImageLoader", true);

        try {
            for(int var2 = 0; var2 < 5; ++var2) {
                if (var1[var2] > 0) {
                    this.method_a3("Handling ichunk = " + var2, true);
                    int var3 = field_ah[var2][0];
                    int var4 = field_ah[var2][1];

                    for(int var5 = 0; var5 < var4; ++var5) {
                        int var6 = var3 + var5;
                        if (!this.method_m1(var6)) {
                            class_e.field_q[var6] = class_g.makeMultiSprite(field_T[var2][var5]);
                        }

                        if (!this.field_ak) {
                            return;
                        }

                        if (this.field_aW) {
                            this.field_aW = false;
                            return;
                        }
                    }
                }

                if (field_j) {
                    field_aQ.field_m = 80 + (var2 + 1) * 20 / 5;
                    field_aQ.method_c2();
                    field_aQ.method_f1();
                } else {
                    this.field_ab.field_m = (var2 + 1) * 100 / 5;
                    this.field_ab.method_c2();
                    this.field_ab.method_f1();
                }
            }

            this.field_am = true;
            System.out.println("SUCCESSFULLY LOADED MONSTER IMAGES!!");
            this.field_ak = false;
        } catch (Throwable var7) {
            System.out.println("ERROR in image loader: " + var7);
            this.field_d.setCurrent(this.field_w);
        }

    }

    void method_z() {
        int var1 = class_e.field_q.length;

        for(int var2 = 0; var2 < var1; ++var2) {
            if (class_e.field_q[var2] != null) {
                class_e.field_q[var2].field_g = null;
                class_e.field_q[var2] = null;
            }
        }

        System.gc();
        debugPrint("After unloading all monster images");
    }

    static void killMonster(int dungid, int var1) {
        System.out.println("In killMonster! dungid is " + dungid);
        byte[] var2 = (byte[])field_G[dungid - 1].remove(String.valueOf(var1));
        byte var3 = var2[4];
        byte var4 = var2[5];
        class_i var5 = field_u[dungid - 1];
        if (var2 != null) {
            var5.field_w[var3][var4] = DataTools.clearManyBits((byte)2, var5.field_w[var3][var4]);
        }

        System.out.println("End of killMonster, size of HT is " + field_G[dungid - 1].size());
    }

    private RunImageLoader newInventoryItemUI(int itemToGet) {
        RunImageLoader var2 = new RunImageLoader(this, 5, 34);
        System.out.println("In newInventoryItemUI: getting item " + itemToGet);
        String var3 = this.field_k.method_b7(itemToGet);
        Vector var4 = new Vector();
        Vector var5 = new Vector();
        var4.addElement("Drop");
        var5.addElement(new Integer(0));
        if (this.field_k.method_w(itemToGet)) {
            if (!this.field_k.method_C(itemToGet)) {
                var4.addElement("Equip");
            } else {
                var4.addElement("Unequip");
            }

            var5.addElement(new Integer(1));
        }

        if (this.field_k.method_e(itemToGet)) {
            var4.addElement("Learn");
            var5.addElement(new Integer(2));
        }

        if (this.field_k.method_v1(itemToGet)) {
            var4.addElement("Use");
            var5.addElement(new Integer(3));
        }

        String[] var6 = new String[var4.size()];

        for(int var7 = 0; var7 < var4.size(); ++var7) {
            var6[var7] = (String)var4.elementAt(var7);
        }

        var2.method_a4("Item", var3, var6, var5);
        var2.field_A = true;
        var2.field_s = this.field_aY;
        return var2;
    }

    private RunImageLoader newSkillsListUI() {
        System.gc();
        debugPrint("Start of newSkillsListUI");
        RunImageLoader var1 = new RunImageLoader(this, 5, 35);
        Vector var2 = this.field_k.method_f2();
        int var3 = var2.size();
        String[] var4 = new String[var3];

        for(int var5 = 0; var5 < var3; ++var5) {
            var4[var5] = (String)var2.elementAt(var5);
        }

        var1.method_a5("Skills", "Your Skills:", var4, (Vector)null, true);
        var1.field_s = this.field_t;
        return var1;
    }

    private RunImageLoader newSkillInfoUI(int var1) {
        System.gc();
        debugPrint("Start of newSkillInfoUI");
        RunImageLoader var2 = new RunImageLoader(this, 4, 36);
        int var3 = this.field_k.method_l(var1);
        String var4 = this.field_k.method_m1(var3);
        var2.method_a2("Skill Info", var4);
        var2.field_s = this.field_L;
        return var2;
    }

    private RunImageLoader newSpellsListUI() {
        System.gc();
        debugPrint("Start of newSpellsListUI");
        RunImageLoader var1 = new RunImageLoader(this, 5, 37);
        Vector var2 = this.field_k.method_J();
        int var3 = var2.size();
        String[] var4 = new String[var3];

        for(int var5 = 0; var5 < var3; ++var5) {
            var4[var5] = (String)var2.elementAt(var5);
        }

        var1.method_a5("Spells", "Your Spells:", var4, (Vector)null, true);
        var1.field_s = this.field_t;
        return var1;
    }

    private RunImageLoader newSpellInfoUI(int var1) {
        System.gc();
        debugPrint("Start of newSpellInfoUI");
        RunImageLoader var2 = new RunImageLoader(this, 5, 38);
        int var3 = this.field_k.method_B(var1);
        String var4 = this.field_k.method_s1(var3);
        String[] var5 = new String[]{"Ready Spell"};
        var2.method_a4("Spell Info", var4, var5, (Vector)null);
        var2.field_A = true;
        var2.field_s = this.field_v;
        return var2;
    }

    RunImageLoader newLevelUpUI(int levelUpIndex) {
        System.gc();
        debugPrint("Start of newLevelUpUI: index= " + levelUpIndex);
        RunImageLoader var2 = new RunImageLoader(this, 5, 39);
        String[] var3 = this.field_k.method_q1();
        String var4 = null;
        if (levelUpIndex == 1) {
            var2.field_N = 0;
            var4 = "Select an attribute to \nincrease 3 points:";
        } else if (levelUpIndex == 2) {
            var4 = "Select an attribute to \nincrease 2 points:";
            var2.field_N = 1;
        } else if (levelUpIndex == 3) {
            var2.field_N = 2;
            var4 = "Select an attribute to \nincrease 1 point:";
        }

        var2.method_a4("Level Up", var4, var3, (Vector)null);
        var2.field_t.removeCommand(RunImageLoader.field_P);
        var2.field_A = true;
        var2.field_s = var2;
        return var2;
    }

    RunImageLoader newWardenSpeaksUI(String var1) {
        System.gc();
        debugPrint("Start of newWardenSpeaksUI");
        RunImageLoader var2 = new RunImageLoader(this, 4, 102);
        var2.method_a2("Varus", var1);
        return var2;
    }

    RunImageLoader newEndOfGameUI() {
        System.gc();
        debugPrint("Start of newEndOfGameUI");
        String var1 = class_k.field_k[7][4];
        RunImageLoader var2 = new RunImageLoader(this, 4, 200);
        var2.method_a2("Victory!", var1);
        var2.field_c = this.newGameOverUI();
        return var2;
    }

    private RunImageLoader newGameOverUI() {
        System.gc();
        debugPrint("Start of newGameOverUI");
        String var1 = class_k.field_k[7][5];
        RunImageLoader var2 = new RunImageLoader(this, 4, 201);
        var2.method_a2("Game Over", var1);
        var2.field_c = this.field_U;
        return var2;
    }

    static DataInputStream method_a10(String var0) throws Exception {
        InputStream var1 = (new Object()).getClass().getResourceAsStream(DataTools.method_b(var0));
        if (var1 == null) {
            return null;
        } else {
            byte[] var2 = DataTools.method_a(var1.available(), var1);
            return new DataInputStream(new ByteArrayInputStream(var2));
        }
    }

    static int method_h1(int var0) {
        return Math.abs(field_P.nextInt() % var0);
    }

    static int method_f1(int var0) {
        return 1 + Math.abs(field_P.nextInt() % var0);
    }

    static int method_a11(Random var0, int var1) {
        return 1 + Math.abs(var0.nextInt() % var1);
    }

    void method_a12(Object var1) {
        if (field_ax != null) {
            if (var1 instanceof RunImageLoader) {
                RunImageLoader var2 = (RunImageLoader)var1;
                if (field_ax != var2) {
                    field_ax.method_q();
                }
            } else {
                field_ax.method_q();
            }
        }

        if (this.field_av != null) {
            this.field_av.method_e3();
        }

        if (this.field_d == null) {
            this.field_d = Display.getDisplay(this);
        }

        if (var1 instanceof RunImageLoader) {
            field_ax = (RunImageLoader)var1;
            GameCanvas var3 = RunImageLoader.method_j();
            var3.imageLoader = field_ax;
            field_ax.field_t = var3;
            this.field_d.setCurrent(field_ax.field_t);
            field_ax.method_h();
            field_ax.method_c2();
            field_ax.method_f1();
        } else if (var1 instanceof Displayable) {
            Displayable var4 = (Displayable)var1;
            field_ax = null;
            this.field_d.setCurrent(var4);
        }

    }

    private static void method_I() throws Exception {
        DataInputStream var0 = DataTools.method_a1("/geomin.dat");
        field_ai = new byte[37][6];

        for(int var1 = 0; var1 < 37; ++var1) {
            for(int var2 = 0; var2 < 6; ++var2) {
                field_ai[var1][var2] = var0.readByte();
            }
        }

    }

    private static void method_C() throws Exception {
        InputStream var0 = (new Object()).getClass().getResourceAsStream("/monsterfilenamesin.dat");
        byte[] var1 = DataTools.method_a(var0.available(), var0);
        DataInputStream var2 = new DataInputStream(new ByteArrayInputStream(var1));
        field_T = new String[5][7];

        for(int var3 = 0; var3 < 5; ++var3) {
            for(int var4 = 0; var4 < 7; ++var4) {
                field_T[var3][var4] = var2.readUTF();
            }
        }

    }

    private void method_g1() {
        this.field_ao = new Form("Debug");
        String var1 = this.field_av.field_ax.method_K();
        this.field_ar = new StringItem("Debug: ", var1);
        this.field_ao.append(this.field_ar);
        Command var2 = new Command("Ok", 4, 1);
        this.field_ao.addCommand(var2);
        this.field_ao.setCommandListener(this);
    }

    synchronized void method_b3(String var1) {
        field_c = var1;
    }

    private void method_u() {
        field_as[0] = class_k.field_k[7][6];
        field_as[1] = class_k.field_k[7][8];
        field_as[2] = class_k.field_k[7][11];
        field_as[3] = class_k.field_k[7][13];
        field_as[4] = class_k.field_k[7][19];
        field_as[5] = class_k.field_k[7][21];
        field_as[6] = class_k.field_k[7][24];
        field_as[7] = class_k.field_k[7][29];
        field_as[8] = class_k.field_k[7][31];
        field_as[9] = class_k.field_k[7][34];
        field_as[10] = class_k.field_k[7][37];
        field_as[11] = class_k.field_k[7][39];
    }

    private void method_a13() {
        StringBuffer var1 = new StringBuffer(1200);
        var1.append(class_k.field_k[7][7]);
        field_o[0] = var1.toString();
        var1.delete(0, 1200);
        var1.append(class_k.field_k[7][9]);
        var1.append(class_k.field_k[7][10]);
        field_o[1] = var1.toString();
        var1.delete(0, 1200);
        var1.append(class_k.field_k[7][12]);
        field_o[2] = var1.toString();
        var1.delete(0, 1200);
        var1.append(class_k.field_k[7][14]);
        var1.append(class_k.field_k[7][15]);
        var1.append(class_k.field_k[7][16]);
        var1.append(class_k.field_k[7][17]);
        var1.append(class_k.field_k[7][18]);
        field_o[3] = var1.toString();
        var1.delete(0, 1200);
        var1.append(class_k.field_k[7][20]);
        field_o[4] = var1.toString();
        var1.delete(0, 1200);
        var1.append(class_k.field_k[7][22]);
        var1.append(class_k.field_k[7][23]);
        field_o[5] = var1.toString();
        var1.delete(0, 1200);
        var1.append(class_k.field_k[7][25]);
        var1.append(class_k.field_k[7][26]);
        var1.append(class_k.field_k[7][27]);
        var1.append(class_k.field_k[7][28]);
        field_o[6] = var1.toString();
        var1.delete(0, 1200);
        var1.append(class_k.field_k[7][30]);
        field_o[7] = var1.toString();
        var1.delete(0, 1200);
        var1.append(class_k.field_k[7][32]);
        var1.append(class_k.field_k[7][33]);
        field_o[8] = var1.toString();
        var1.delete(0, 1200);
        var1.append(class_k.field_k[7][35]);
        var1.append(class_k.field_k[7][36]);
        field_o[9] = var1.toString();
        var1.delete(0, 1200);
        var1.append(class_k.field_k[7][38]);
        field_o[10] = var1.toString();
        var1.delete(0, 1200);
        var1.append(class_k.field_k[7][40]);
        field_o[11] = var1.toString();
        var1.delete(0, 1200);
    }

    private String makeCredits() {
        StringBuffer var1 = new StringBuffer(400);
        var1.append("Game Design: Anthony Gill and Greg Gorden");
        var1.append('\n');
        var1.append("Art: Mark Jones");
        var1.append('\n');
        var1.append("Programming: Marc Ilgen");
        var1.append('\n');
        var1.append("Technical Director: Andrew Friedman");
        var1.append('\n');
        var1.append("(C) 2003 Vir2L Studos, a ZeniMax Media company. The Elder Scrolls and Vir2L are ");
        var1.append("registered trademarks of ZeniMax Media Inc. All rights reserved.");
        var1.append('\n');
        return var1.toString();
    }

    private void method_k1(int var1) {
        String var2 = this.field_R[var1].field_M;
        String var3 = this.field_R[var1].method_t();
        short var4 = 0;
        if (class_k.method_b1(var1)) {
            var4 = class_k.field_p[var1];
        } else if (var1 == 4) {
            var4 = class_k.field_a;
        } else if (var1 == 5) {
            var4 = class_k.field_g;
        }

        var3 = DataTools.replacePOSWithInt(var2, "<TAG>", var4);
        this.field_R[var1].method_e2(var3);
    }

    private String method_f2() {
        String[] var1 = RecordStore.listRecordStores();
        int var2 = 0;
        if (var1 == null) {
            var2 = 0;
        } else {
            var2 = var1.length;
        }

        int var3 = DataTools.method_a2(10000);
        String var4 = "es_gamestate" + var3;

        while(true) {
            boolean var5 = false;

            for(int var6 = 0; var6 < var2; ++var6) {
                if (var4.equals(var1[var6])) {
                    var5 = true;
                }
            }

            if (!var5) {
                return var4;
            }

            var3 = DataTools.method_a2(10000);
            var4 = "es_gamestate" + var3;
        }
    }

    private String method_M() {
        String[] var1 = RecordStore.listRecordStores();
        int var2 = 0;
        if (var1 == null) {
            var2 = 0;
        } else {
            var2 = var1.length;
        }

        String var3 = null;
        if (var2 == 0) {
            return null;
        } else {
            long var4 = 0L;
            RecordStore var6 = null;

            for(int var7 = 0; var7 < var2; ++var7) {
                try {
                    var6 = RecordStore.openRecordStore(var1[var7], false);
                    int var8 = var6.getNumRecords();
                    long var9 = var6.getLastModified();
                    if (var9 > var4) {
                        var3 = var1[var7];
                        var4 = var9;
                    }
                } catch (Throwable var20) {
                } finally {
                    try {
                        if (var6 != null) {
                            var6.closeRecordStore();
                        }

                        var6 = null;
                    } catch (Exception var19) {
                    }

                }
            }

            return var3;
        }
    }

    private void method_L() {
        String var1 = this.method_M();
        String[] var2 = RecordStore.listRecordStores();
        int var3 = 0;
        if (var2 == null) {
            var3 = 0;
        } else {
            var3 = var2.length;
        }

        if (var3 != 0) {
            for(int var4 = 0; var4 < var3; ++var4) {
                if (var1 == null || !var1.equals(var2[var4])) {
                    try {
                        RecordStore.deleteRecordStore(var2[var4]);
                    } catch (Exception var6) {
                    }
                }
            }

        }
    }

    void method_x() {
        String var1 = class_k.method_a6(this.field_k, 5, 13, 0);
        if (var1 == null) {
            var1 = "No rumors!";
        }

        this.field_m.method_a17(class_k.field_s[5]);
        this.field_m.method_e2(var1);
        this.field_m.field_c = this.field_R[5];
        this.field_m.field_N = 5;
        RunImageLoader var2 = (RunImageLoader)this.field_m.field_c;
        String var3 = var2.field_M;
        String var4 = var2.method_t();
        short var5 = 0;
        var5 = class_k.field_g;
        var4 = DataTools.replacePOSWithInt(var3, "<TAG>", var5);
        var2.method_e2(var4);
        this.method_a12(this.field_m);
    }

    private void method_j1() {
        if (field_aT == 4) {
            ((javaMicroMIDlet)this).method_b4();
        }

    }

    static {
        try {
            field_P = new Random(System.currentTimeMillis());
            method_i1();
            method_C();
            method_K();
        } catch (Exception var1) {
            System.out.println("ERROR: problem with loading camp or image record HT");
        }

    }
}
