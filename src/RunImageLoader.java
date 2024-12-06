//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.Screen;
import javax.microedition.lcdui.StringItem;

public class RunImageLoader implements Runnable {
    static GameCanvas[] field_K = new GameCanvas[2];
    static int field_x;
    static Image field_r;
    Vector field_q;
    CommandListener field_J;
    static final Font font0;
    private static final Font font1;
    private static final Font font2;
    static final Font font3;
    static final Font font4;
    static final Command field_I;
    static final Command field_u;
    static final Command field_P;
    static final Command field_z;
    static final Command field_a;
    static final String[] field_y;
    int field_Q;
    int field_B;
    int field_N;
    private ESGame esGameField;
    Screen field_i;
    int field_f;
    private int field_h;
    Vector field_n;
    String field_M;
    String[] field_E;
    volatile int field_m;
    private boolean field_j;
    private Thread field_D;
    long field_C;
    Displayable field_t;
    Object field_s;
    Object field_c;
    int field_o;
    int field_e;
    int field_G;
    Font field_b;
    int field_g;
    int field_F;
    int field_w;
    int field_v;
    int field_k;
    boolean field_A = false;

    public RunImageLoader(ESGame game, int var2, int var3) {
        this.esGameField = game; //stores an ESGame
        this.field_Q = var2;
        this.field_B = var3;
        this.field_N = 0;
        this.field_i = null;
        this.field_f = 0;
        this.field_s = null;
        this.field_c = null;
        this.field_M = null;
        this.field_E = null;
        this.field_D = null;
        this.field_q = new Vector(5);
    }

    void method_e() {
        this.field_t = field_K[field_x];
    }

    void method_o() {
        this.field_t = field_K[field_x];
    }

    void method_a(String var1, String[] var2, Vector var3) {
        this.method_a1(var1, var2, var3, true);
    }

    void method_a1(String var1, String[] var2, Vector var3, boolean var4) {
        List var5 = new List(var1, 3);
        this.field_i = var5;
        this.field_f = 1;
        int var6 = var2.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            var5.append(var2[var7], (Image)null);
        }

        this.field_n = var3;
        this.field_w = 0;
        this.field_v = 0;
        this.field_k = 0;
        this.field_t = field_K[field_x];
        this.addCommand(field_u);
        if (var4) {
            this.addCommand(field_P);
        }

        this.setCommandListener(this.esGameField);
    }

    void method_n() {
        String var1 = "";

        for(int var2 = 0; var2 < field_y.length; ++var2) {
            var1 = var1 + field_y[var2];
        }

        this.method_a2("Exiting", var1);
        this.removeCommand(field_I);
        this.addCommand(field_a);
    }

    void method_a2(String var1, String var2) {
        this.method_a3(var1, var2, false);
    }

    void method_a3(String var1, String var2, boolean var3) {
        Form var4 = new Form(var1);
        this.field_i = var4;
        this.field_f = 2;
        StringItem var5 = new StringItem((String)null, var2);
        var4.append(var5);
        this.field_g = 10;
        this.field_F = 10;
        this.field_w = 0;
        this.field_v = 0;
        this.field_k = 0;
        this.field_t = field_K[field_x];
        this.addCommand(field_I);
        this.setCommandListener(this.esGameField);
    }

    void method_a4(String var1, String var2, String[] var3, Vector var4) {
        this.method_a5(var1, var2, var3, var4, false);
    }

    void method_a5(String var1, String var2, String[] var3, Vector var4, boolean var5) {
        Form var6 = new Form(var1);
        this.field_i = var6;
        this.field_f = 2;
        StringItem var7 = new StringItem((String)null, var2);
        var6.append(var7);
        this.field_g = 15;
        this.field_F = 15;
        ChoiceGroup var8 = new ChoiceGroup((String)null, 1);
        int var9 = var3.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            var8.append(var3[var10], (Image)null);
        }

        this.field_h = 1;
        var6.append(var8);
        this.field_n = var4;
        this.field_w = 0;
        this.field_v = 0;
        this.field_k = 0;
        this.field_t = field_K[field_x];
        this.addCommand(field_u);
        this.addCommand(field_P);
        this.setCommandListener(this.esGameField);
        if (var2 != null && var2.indexOf("<TAG>") >= 0) {
            this.field_M = new String(var2);
        }

    }

    void method_a6(String var1, String var2, String var3, String[] var4, Vector var5) {
        Form var6 = new Form(var1);
        this.field_i = var6;
        this.field_f = 2;
        StringItem var7 = new StringItem((String)null, var2);
        var6.append(var7);
        StringItem var8 = new StringItem((String)null, var3);
        var6.append(var8);
        this.field_g = 15;
        this.field_F = 15;
        ChoiceGroup var9 = new ChoiceGroup((String)null, 1);
        int var10 = var4.length;

        for(int var11 = 0; var11 < var10; ++var11) {
            var9.append(var4[var11], (Image)null);
        }

        this.field_h = 2;
        var6.append(var9);
        this.field_n = var5;
        this.field_t = field_K[field_x];
        this.addCommand(field_u);
        this.addCommand(field_P);
        this.setCommandListener(this.esGameField);
    }

    public void paint(Graphics var1) {
        Graphics var2 = field_r.getGraphics();
        switch (this.field_Q) {
            case 1:
                System.out.println("        IN CANVAS DOWNLOAD PAINT!");
                break;
            case 2:
                this.method_f(var2);
                break;
            case 3:
                this.method_c(var2);
                break;
            case 4:
                this.method_d(var2);
                break;
            case 5:
                this.method_a8(var2, 1);
                break;
            case 6:
                this.method_a8(var2, 2);
            case 7:
            default:
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                this.method_b(var2);
        }

        this.method_a20(var2);
        var1.drawImage(field_r, 0, 0, 20);
    }

    private void method_f(Graphics var1) {
        var1.setColor(0);
        var1.fillRect(0, 0, this.method_b4(), 20 + this.method_k());
        if (ESGame.field_aG) {
            var1.setColor(16777215);
            var1.fillRect(0, 0, this.method_b4(), 20 + this.method_k());
            var1.drawImage(ESGame.field_aA, this.method_b4() / 2, 10, 17);
            int var2 = 10 + ESGame.field_aA.getHeight() + 3;
            var1.setColor(0);

            for(int var3 = 0; var3 < field_y.length; ++var3) {
                var1.drawString(field_y[var3], this.method_b4() / 2, var2, 17);
                var2 += 14;
            }

            var1.drawString("Distributed by:", this.method_b4() / 2, 143, 17);
            var1.drawImage(ESGame.field_aa, this.method_b4() / 2, 158, 17);
        } else if (this.esGameField.field_ac) {
            var1.setColor(0);
            var1.fillRect(0, 0, this.method_b4(), 20 + this.method_k());
            var1.drawImage(ESGame.field_O, this.method_b4() / 2, 20, 17);
            var1.drawImage(ESGame.field_aU, this.method_b4() / 2, 100, 17);
        } else {
            var1.setColor(0);
            var1.fillRect(0, 0, this.method_b4(), 20 + this.method_k());
            var1.drawImage(ESGame.field_O, this.method_b4() / 2, 20, 17);
            var1.drawImage(ESGame.field_aU, this.method_b4() / 2, 100, 17);
            var1.setColor(16777215);
            var1.fillRect(12, 165, 152, 22);
            var1.setColor(10485760);
            var1.fillRect(13, 166, 3 * this.field_m / 2, 20);
        }

    }

    private void method_b(Graphics var1) {
        var1.setColor(11429934);
        var1.fillRect(0, 0, this.method_b4(), 20 + this.method_k());
        var1.setFont(font4);
        var1.setColor(16777215);
        int var2 = this.method_b4() / 2;
        if (this.field_Q == 8) {
            var1.drawString("Creating New Game", var2, 30, 17);
        } else if (this.field_Q == 9) {
            var1.drawString("Loading Game", var2, 30, 17);
        } else if (this.field_Q == 10) {
            var1.drawString("Saving Game", var2, 30, 17);
        } else if (this.field_Q == 11) {
            var1.drawString("Loading Dungeon", var2, 30, 17);
        }

        var1.drawString("Please Wait", var2, 45, 17);
        var1.setColor(16777215);
        var1.fillRect((this.method_b4() - 90) / 2, 60, 90, 20);
        int var3 = this.field_m * 88 / 100;
        var1.setColor(255);
        var1.fillRect((this.method_b4() - 88) / 2, 61, var3, 18);
    }

    private void method_a7(Graphics var1, String var2) {
        Font var3 = var1.getFont();
        var1.setFont(font1);
        int var4 = var1.getColor();
        var1.setColor(0);
        var1.fillRect(0, 0, this.method_b4(), 14);
        var1.setColor(16777215);
        var1.drawString(var2, this.method_b4() / 2, 0, 17);
        var1.setColor(var4);
        var1.setFont(var3);
    }

    private void method_c(Graphics var1) {
        var1.setColor(11429934);
        var1.fillRect(0, 0, this.method_b4(), 20 + this.method_k());
        this.method_a7(var1, this.field_i.getTitle());
        this.field_b = font3;
        var1.setFont(this.field_b);
        this.field_o = this.field_b.getHeight();
        this.field_e = 20;
        this.field_G = 15;
        String[] var2 = this.method_r();
        int var3 = var2.length;
        byte var4 = 10;
        int var5 = Math.min(var3, var4);
        this.field_v = this.field_w + var5 - 1;

        for(int var6 = this.field_w; var6 <= this.field_v; ++var6) {
            this.method_a9(var1, var2[var6], var6 == this.method_a13());
        }

        if (this.field_w > 0) {
            this.method_a10(var1, 155, 180, 1);
        }

        if (this.field_v + 1 < var3) {
            this.method_a10(var1, 165, 180, 2);
        }

    }

    private void method_a8(Graphics var1, int var2) {
        Form var3 = (Form)this.field_i;
        var1.setColor(11429934);
        var1.fillRect(0, 0, this.method_b4(), 20 + this.method_k());
        this.method_a7(var1, ((Screen)var3).getTitle());
        this.field_b = font3;
        var1.setFont(this.field_b);
        this.field_o = this.field_b.getHeight();
        this.field_e = 20;
        this.field_G = 15;

        for(int var4 = 0; var4 < var2; ++var4) {
            StringItem var5 = (StringItem)var3.get(var4);
            String var6 = var5.getText();
            if (this.field_A) {
                String[] var7 = this.method_c1(var6);

                for(int var8 = 0; var8 < var7.length; ++var8) {
                    var1.setColor(16776960);
                    var1.drawString(var7[var8], this.field_G, this.field_e, 20);
                    this.field_e += this.field_o;
                }
            } else {
                if (var4 == 0) {
                    var1.setColor(16776960);
                } else {
                    var1.setColor(16777215);
                }

                var1.drawString(var6, this.field_G, this.field_e, 20);
                this.field_e += this.field_o;
            }
        }

        this.field_e += 5;
        String[] var10 = this.method_r();
        int var11 = var10.length;
        byte var12 = 9;
        int var13 = Math.min(var11, var12);
        this.field_v = this.field_w + var13 - 1;

        for(int var9 = this.field_w; var9 <= this.field_v; ++var9) {
            this.method_a9(var1, var10[var9], var9 == this.method_a13());
        }

        if (this.field_w > 0) {
            this.method_a10(var1, 155, 180, 1);
        }

        if (this.field_v + 1 < var11) {
            this.method_a10(var1, 165, 180, 2);
        }

    }

    private void method_a9(Graphics var1, String var2, boolean var3) {
        if (var3) {
            var1.setColor(6710886);
            int var4 = this.method_b4() - 2 * (this.field_G - 10);
            int var5 = this.field_o + 2;
            var1.fillRect(this.field_G - 10, this.field_e - 1, var4, var5);
        }

        var1.setColor(16776960);
        var1.drawString(var2, this.field_G, this.field_e, 20);
        this.field_e += this.field_o;
        ++this.field_e;
    }

    private void method_d(Graphics var1) {
        Form var2 = (Form)this.field_i;
        var1.setColor(11429934);
        var1.fillRect(0, 0, this.method_b4(), 20 + this.method_k());
        this.method_a7(var1, ((Screen)var2).getTitle());
        this.field_b = font3;
        var1.setFont(this.field_b);
        this.field_o = this.field_b.getHeight();
        this.field_e = 20;
        this.field_G = 5;
        StringItem var3 = (StringItem)var2.get(0);
        String var4 = var3.getText();
        String[] var5 = this.method_c1(var4);
        this.field_k = var5.length;
        byte var6 = 11;
        int var7 = Math.min(this.field_k, var6);
        this.field_v = this.field_w + var7 - 1;
        var1.setColor(16776960);

        for(int var8 = this.field_w; var8 <= this.field_v; ++var8) {
            String var9 = var5[var8];
            var1.drawString(var9, this.field_G, this.field_e, 20);
            this.field_e += this.field_o;
        }

        if (this.field_w > 0) {
            this.method_a10(var1, 155, 180, 1);
        }

        if (this.field_v + 1 < this.field_k) {
            this.method_a10(var1, 165, 180, 2);
        }

    }

    private void method_a10(Graphics var1, int var2, int var3, int var4) {
        int var5 = var1.getColor();
        var1.setColor(0);
        byte var6 = 5;
        if (var4 == 1) {
            for(int var7 = 0; var7 < var6; ++var7) {
                var1.drawLine(var2 - var7, var3 + var7, var2 + var7, var3 + var7);
            }
        } else {
            for(int var8 = 0; var8 < var6; ++var8) {
                var1.drawLine(var2 - (var6 - var8), var3 + var8, var2 + (var6 - var8), var3 + var8);
            }
        }

    }

    String[] method_c1(String var1) {
        Vector var2 = new Vector();

        for(String var6 : this.method_b1(var1)) {
            this.method_a11(var2, var6);
        }

        return method_a12(var2);
    }

    private String[] method_b1(String var1) {
        Vector var2 = new Vector();
        int var3 = 0;
        int var4 = 0;

        do {
            var4 = var1.indexOf(10, var3);
            if (var4 < 0) {
                var4 = var1.length();
                var2.addElement(var1.substring(var3, var4));
                break;
            }

            var2.addElement(var1.substring(var3, var4));
            var3 = var4 + 1;
        } while(var3 < var1.length());

        return method_a12(var2);
    }

    private void method_a11(Vector var1, String var2) {
        int var3 = this.method_b4() - this.field_g - this.field_F;
        String[] var4 = DataTools.method_c2(var2);
        int var5 = var4.length;
        String var6 = "";

        for(int var7 = 0; var7 < var5; ++var7) {
            String var8 = var4[var7];
            String var9 = var6 + var8;
            if (this.field_b.stringWidth(var9) > var3) {
                if (this.field_b.stringWidth(var8) <= var3) {
                    var1.addElement(new String(var6));
                    var9 = var8;
                } else {
                    if (var6.length() > 0) {
                        var1.addElement(new String(var6));
                    }

                    String[] var10 = this.method_d1(var8);

                    for(int var11 = 0; var11 < var10.length - 1; ++var11) {
                        var1.addElement(new String(var10[var11]));
                    }

                    var9 = var10[var10.length - 1];
                }
            }

            var6 = var9;
            if (var7 < var5 - 1) {
                var9 = var9 + " ";
                if (this.field_b.stringWidth(var9) > var3) {
                    var1.addElement(new String(var9));
                    var6 = "";
                } else {
                    var6 = var9;
                }
            }
        }

        var1.addElement(new String(var6));
    }

    private String[] method_d1(String var1) {
        int var2 = this.method_b4() - this.field_g - this.field_F;
        Vector var3 = new Vector();
        int var4 = var1.length();
        String var5 = "";

        for(int var6 = 0; var6 < var4; ++var6) {
            char var7 = var1.charAt(var6);
            String var8 = var5 + var7;
            if (this.field_b.stringWidth(var8) > var2) {
                var3.addElement(new String(var5));
                var5 = var7 + "";
            } else {
                var5 = var8;
            }
        }

        var3.addElement(new String(var5));
        return method_a12(var3);
    }

    private static String[] method_a12(Vector var0) {
        int var1 = var0.size();
        String[] var2 = new String[var1];

        for(int var3 = 0; var3 < var1; ++var3) {
            var2[var3] = (String)var0.elementAt(var3);
        }

        return var2;
    }

    protected void keyPressed(int var1) {
        if (var1 == -6) {
            Command var2 = this.method_s();
            if (var2 != null) {
                this.field_J.commandAction(var2, this.field_t);
                return;
            }
        } else if (var1 == -7) {
            Command var4 = this.method_l();
            if (var4 != null) {
                this.field_J.commandAction(var4, this.field_t);
                return;
            }
        }

        int var5 = this.method_c3(var1);
        switch (var5) {
            case 1:
                if (this.field_Q != 3 && this.field_Q != 5 && this.field_Q != 6) {
                    if (this.field_Q == 4) {
                        int var9 = this.method_a13();
                        if (this.field_w > 0) {
                            --this.field_w;
                            --this.field_v;
                            this.method_c2();
                            this.method_f1();
                        }
                    }
                } else {
                    int var7 = this.method_a13();
                    if (var7 > 0) {
                        --var7;
                        this.method_a14(var7);
                        if (this.field_w > var7) {
                            --this.field_w;
                            --this.field_v;
                        }

                        this.method_c2();
                        this.method_f1();
                    }
                }
                break;
            case 6:
                if (this.field_Q != 3 && this.field_Q != 5 && this.field_Q != 6) {
                    if (this.field_Q == 4 && this.field_v < this.field_k - 1) {
                        ++this.field_w;
                        ++this.field_v;
                        this.method_c2();
                        this.method_f1();
                    }
                } else {
                    int var3 = this.method_a13();
                    if (var3 < this.method_d2() - 1) {
                        ++var3;
                        this.method_a14(var3);
                        if (this.field_v < var3) {
                            ++this.field_w;
                            ++this.field_v;
                        }

                        this.method_c2();
                        this.method_f1();
                    }
                }
        }

    }

    String[] method_r() {
        int var1 = 0;
        switch (this.field_Q) {
            case 3:
                List var8 = (List)this.field_i;
                var1 = var8.size();
                String[] var9 = new String[var1];

                for(int var10 = 0; var10 < var1; ++var10) {
                    var9[var10] = var8.getString(var10);
                }

                return var9;
            case 4:
            default:
                return null;
            case 5:
            case 6:
                Form var2 = (Form)this.field_i;
                ChoiceGroup var3 = (ChoiceGroup)var2.get(this.field_h);
                var1 = var3.size();
                String[] var4 = new String[var1];

                for(int var5 = 0; var5 < var1; ++var5) {
                    var4[var5] = var3.getString(var5);
                }

                return var4;
        }
    }

    String method_p() {
        int var1 = this.method_a13();
        String[] var2 = this.method_r();
        return var2[var1];
    }

    int method_a13() {
        byte var1 = -1;
        switch (this.field_Q) {
            case 3:
                List var2 = (List)this.field_i;
                return var2.getSelectedIndex();
            case 4:
            default:
                return var1;
            case 5:
            case 6:
                Form var3 = (Form)this.field_i;
                ChoiceGroup var4 = (ChoiceGroup)var3.get(this.field_h);
                return var4.getSelectedIndex();
        }
    }

    void method_a14(int var1) {
        switch (this.field_Q) {
            case 3:
                List var2 = (List)this.field_i;
                var2.setSelectedIndex(var1, true);
            case 4:
            default:
                break;
            case 5:
            case 6:
                Form var3 = (Form)this.field_i;
                ChoiceGroup var4 = (ChoiceGroup)var3.get(this.field_h);
                var4.setSelectedIndex(var1, true);
        }

    }

    protected void method_h() {
        switch (this.field_Q) {
            case 2:
                this.method_g();
            default:
        }
    }

    protected void method_q() {
        switch (this.field_Q) {
            case 1:
            case 2:
                this.method_i();
            default:
        }
    }

    private void method_g() {
        System.out.println("IN START HELPER THREAD IN UICANVAS");
        this.field_D = new Thread(this);
        System.out.println("Helper thread in UICanvas: " + this.field_D);
        System.out.println("num active threads = " + Thread.activeCount());
        this.field_j = true;
        this.field_D.start();
    }

    private void method_i() {
        this.field_j = false;
    }

    public void run() {
        if (this.field_Q == 2) {
            this.method_m();
        } else if (this.field_Q == 1) {
            System.out.println("Running a download helper thread to repaint");
        }

    }

    private void method_m() {
        try {
            this.field_C = 0L;
            System.out.println("Just before helper thread loop in UICanvas");

            while(this.field_j && (this.field_m < 100 || this.field_C < 4000L)) {
                long var1 = System.currentTimeMillis();
                this.method_c2();
                this.method_f1();
                long var3 = System.currentTimeMillis() - var1;

                try {
                    if (var3 < 500L) {
                        long var5 = 500L - var3;
                        Thread.sleep(500L - var3);
                    }
                } catch (Exception var7) {
                }

                var3 = System.currentTimeMillis() - var1;
                this.field_C += var3;
                System.out.println("Progress pct is " + this.field_m);
            }

            ESGame.field_aG = true;
            this.esGameField.field_ac = false;
            this.method_a15(2000L);
            this.esGameField.field_ac = true;
            ESGame.field_aG = false;
            this.method_a15(1000L);
            this.esGameField.field_ac = false;
            ESGame.field_aa = null;
            ESGame.field_aA = null;
            ESGame.field_O = null;
            ESGame.field_aU = null;
            this.field_D = null;
            ESGame.debugPrint("After nuking splash");
            System.out.println("End of splash, changing to next");
            this.esGameField.method_a12(this.field_c);
        } catch (Throwable var8) {
            var8.printStackTrace();
            this.esGameField.method_a12(this.esGameField.field_w);
        }

    }

    private void method_a15(long var1) {
        long var3 = 0L;

        do {
            this.method_c2();
            this.method_f1();

            try {
                Thread.sleep(500L);
            } catch (Exception var6) {
            }

            var3 += 500L;
        } while(var3 <= var1);

    }

    int method_d2() {
        if (this.field_Q == 3) {
            List var3 = (List)this.field_i;
            return var3.size();
        } else if (this.field_Q != 5 && this.field_Q != 6) {
            return 0;
        } else {
            Form var1 = (Form)this.field_i;
            ChoiceGroup var2 = (ChoiceGroup)var1.get(this.field_h);
            return var2.size();
        }
    }

    void method_a16(int var1, String var2) {
        Form var3 = (Form)this.field_i;
        if (this.field_Q == 6) {
            System.out.println("type is form2, size is " + var3.size());
        }

        if (this.field_Q == 5 || this.field_Q == 6 || this.field_Q == 4) {
            StringItem var4 = (StringItem)var3.get(var1);
            var4.setText(var2);
        }

    }

    void method_a17(String var1) {
        if (this.field_i != null) {
            this.field_i.setTitle(var1);
        }

    }

    void method_e2(String var1) {
        Form var2 = (Form)this.field_i;

        try {
            if (var2 != null) {
                StringItem var3 = (StringItem)var2.get(0);
                var3.setText(var1);
            }
        } catch (Throwable var4) {
        }

    }

    String method_t() {
        Form var1 = (Form)this.field_i;

        try {
            if (var1 != null) {
                StringItem var2 = (StringItem)var1.get(0);
                return var2.getText();
            }
        } catch (Throwable var3) {
        }

        return null;
    }

    public void addCommand(Command var1) {
        this.field_q.addElement(var1);
    }

    public void removeCommand(Command var1) {
        this.field_q.removeElement(var1);
    }

    public void setCommandListener(CommandListener var1) {
        this.field_J = var1;
    }

    private void method_a20(Graphics var1) {
        if (this.field_q.size() != 0) {
            var1.setColor(16777215);
            var1.fillRect(0, 190, this.method_b4(), 20);
            int var2 = this.field_q.size();
            var1.setColor(0);
            var1.setFont(font0);
            Command var3 = this.method_s();
            if (var3 != null) {
                var1.drawString(var3.getLabel(), 10, 192, 20);
            }

            Command var4 = this.method_l();
            if (var4 != null) {
                var1.drawString(var4.getLabel(), this.method_b4() - 10, 195, 24);
            }

        }
    }

    private Command method_l() {
        int var1 = this.field_q.size();
        Command var2 = null;
        if (var1 == 1) {
            var2 = (Command)this.field_q.elementAt(0);
        } else if (var1 == 2) {
            for(int var3 = 0; var3 < 2; ++var3) {
                Command var4 = (Command)this.field_q.elementAt(var3);
                if (var4 == field_I || var4 == field_u) {
                    var2 = var4;
                    break;
                }
            }
        }

        return var2;
    }

    private Command method_s() {
        int var1 = this.field_q.size();
        Command var2 = null;
        if (var1 == 2) {
            for(int var3 = 0; var3 < 2; ++var3) {
                Command var4 = (Command)this.field_q.elementAt(var3);
                if (var4 == field_z || var4 == field_P) {
                    var2 = var4;
                    break;
                }
            }
        }

        return var2;
    }

    static GameCanvas method_j() {
        return field_K[field_x];
    }

    public void method_c2() {
        if (ESGame.field_ax == null || this.field_B == ESGame.field_ax.field_B) {
            field_K[field_x].repaint();
        }
    }

    public void method_f1() {
        field_K[field_x].serviceRepaints();
    }

    public int method_b4() {
        return field_K[field_x].getWidth();
    }

    public int method_k() {
        return field_K[field_x].getHeight();
    }

    public int method_c3(int var1) {
        return field_K[field_x].getGameAction(var1);
    }

    static {
        field_K[0] = new GameCanvas();
        field_K[1] = new GameCanvas();
        field_x = 0;

        try {
            field_r = Image.createImage(field_K[0].getWidth(), field_K[0].getHeight());
        } catch (Throwable var1) {
            System.out.println("Error allocating bufferImage");
        }

        font0 = Font.getFont(0, 1, 8);
        font1 = Font.getFont(0, 1, 0);
        font2 = Font.getFont(64, 0, 8);
        font3 = Font.getFont(0, 1, 8);
        font4 = Font.getFont(0, 1, 0);
        field_I = new Command("Ok", 3, 0);
        field_u = new Command("Select", 3, 0);
        field_P = new Command("Cancel", 4, 0);
        field_z = new Command("Back", 4, 0);
        field_a = new Command("Exit", 7, 0);
        field_y = new String[]{"(c) 2003 Vir2L Studios, ", "a ZeniMax Media company. ", "The Elder Scrolls and Vir2L ", "are registered trademarks ", "of ZeniMax Media Inc. ", "All rights reserved."};
    }
}
