//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import com.nokia.mid.ui.FullCanvas;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class class_e extends FullCanvas implements Runnable {
    private static final Font field_aj = Font.getFont(64, 0, 8); //FACE_PROPORTIONAL, STYLE_PLAIN, SIZE_SMALL
    private static final Font field_M = Font.getFont(64, 2, 16); //FACE_PROPORTIONAL, STYLE_ITALIC, SIZE_LARGE. unused???
    private static final Font field_w = Font.getFont(64, 2, 16); //FACE_PROPORTIONAL, STYLE_ITALIC, SIZE_LARGE
    private static final Font field_K = Font.getFont(64, 1, 16); //FACE_PROPORTIONAL, STYLE_BOLD, SIZE_LARGE
    static final int[][][] field_n = new int[][][]{{{12, 0, 0, 1}, {11, 0, -1, 1}, {12, 1, -1, 2}, {12, 2, -1, 3}, {11, 2, -2, 3}, {12, 3, -2, 4}}, {{12, 0, 0, 1}, {12, 1, 0, 2}, {11, 1, -1, 2}, {12, 2, -1, 3}, {12, 3, -1, 4}, {12, 3, -1, 4}}, {{12, 0, 0, 1}, {12, 1, 0, 2}, {12, 2, 0, 3}, {11, 2, -1, 3}, {12, 3, -1, 4}, {12, 3, -1, 4}}, {{12, 0, 0, 1}, {12, 1, 0, 2}, {12, 2, 0, 3}, {12, 3, 0, 4}, {11, 3, -1, 4}, {11, 3, -1, 4}}, {{12, 0, 0, 1}, {12, 1, 0, 2}, {12, 2, 0, 3}, {12, 3, 0, 4}, {12, 3, 0, 4}, {12, 3, 0, 4}}};
    private static final byte[][] field_ae = new byte[][]{{1, 5, 31, 53, 0, 1, 40, -39, 1, 4, 13, -2, 3, 6, 71, 4, 30, 64, 2, 0, 0, 0}, {6, 10, 31, 53, 7, 1, 27, -35, 8, 4, 1, 69, 11, 27, 66, 9, 33, 10, 10, 0, 0, 0}, {11, 25, 31, 20, 14, 1, 0, 0, -1, -1, 2, 25, 15, 81, 8, 16, 9, 0, 17, 60, 57, 18}, {26, 40, 31, 32, 21, 1, 0, 0, -1, -1, 43, 44, 22, 50, 25, 23, -36, 9, 24, -25, 44, 25}};
    private static final byte[][] field_a = new byte[][]{{0, 0}, {0, 0}, {0, 3}, {0, 3}, {0, 3}, {0, 2}, {0, 2}, {0, 3}, {0, 3}, {0, 3}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}};
    private static final boolean[][] field_J = new boolean[][]{{false, false, false, false}, {true, false, false, false}, {false, false, false, false}, {false, false, true, false}, {true, false, true, false}, {false, false, false, false}, {false, false, false, false}, {false, true, false, false}, {false, false, true, false}, {false, true, true, false}, {true, false, false, false}, {false, true, false, false}, {true, false, true, false}, {false, true, true, false}, {true, true, true, false}, {true, false, false, false}, {false, true, false, false}, {true, false, true, false}, {false, true, true, false}, {true, true, true, false}, {true, true, false, false}, {true, true, false, false}, {true, true, false, false}, {true, true, true, false}, {true, true, true, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, true, false, true}, {false, true, false, true}, {true, false, false, true}, {true, false, true, false}, {false, true, true, false}, {false, false, false, false}};
    private static final char[] field_e = new char[]{'1', '3', '5', '7', '9', '0'};
    private static final char[] field_O = new char[]{'0', 'N', 'E', 'S', 'W'};
    private static final int[][] field_o = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 2, 1}};
    private ESGame field_H;
    private int field_ac;
    private int field_T;
    private Thread field_au = new Thread(this);
    private boolean field_ak;
    private boolean field_z;
    private boolean field_aB;
    class_j field_ax;
    byte field_aD;
    boolean field_v;
    byte field_c;
    long field_aC;
    long field_s;
    long field_B;
    long field_V;
    boolean field_aw;
    int field_p;
    static boolean field_aa;
    static boolean field_m;
    static boolean field_R;
    static boolean field_W;
    static Image field_h;
    static Image field_Y;
    static class_g[] field_q;
    static Image[] field_aE;
    static class_g[] field_ab;
    static class_g[] field_ar;
    static class_g[] field_u;
    static Image[] field_y;
    private static byte[][] field_l;
    private static byte[][] field_F;
    private static int field_f = 1;
    static boolean field_S = false;
    static boolean field_ao = false;
    static boolean field_am = false;
    static int field_aq;
    static boolean field_av = false;
    static boolean field_ay = false;
    static boolean field_I = false;
    static boolean field_Z = false;
    static boolean field_ap = false;
    static boolean field_U = false;
    static boolean field_ad = false;
    static long field_as = 0L;
    static String[] field_d = null;
    private static int field_X = 0;
    static boolean field_af = false;
    private static boolean field_al = true;
    private static boolean field_at = false;
    static boolean field_E = false;
    static boolean field_A = false;
    static final String[] field_r = new String[]{"Warden's", "Camp"};
    static final String[] field_ag = new String[]{"Outer", "Camp"};
    static final String[] field_C = new String[]{"Cannot", "Camp!"};
    static final String[] field_Q = new String[]{"No spells!", ""};
    static final String[] field_t = new String[]{"Not enough", "magic!"};
    static final String[] field_g = new String[]{"No monster", "here!"};
    static final String[] field_N = new String[]{"Rest", "disturbed!"};
    static final String[] field_b = new String[]{"Rest", "complete!"};
    static final String[] field_P = new String[]{"Creature", "is dead!"};
    static final String[] field_ah = new String[]{"Creature", "attacks!"};
    static final String[] field_x = new String[]{"Chest", ""};
    static final String[] field_D = new String[]{"Chest", "locked!"};
    static final String[] field_aA = new String[]{"Inventory", "full!"};
    static final String[] field_L = new String[]{"Found", "item!"};
    static final String[] field_an = new String[]{"Several", "items!"};
    static final String[][] field_i = new String[][]{{"Arantamo", ""}, {"Celegil", ""}, {"Favela Dralor", ""}, {"Vander", ""}, {"Beneca", ""}, {"Helga", ""}, {"Varus", ""}};
    static class_d field_k = new class_d();
    static class_d field_j = null;
    private static long field_ai = 0L;
    private static boolean field_az = false;
    private static String field_G = null;

    public class_e(ESGame var1) {
        this.field_H = var1;
        this.field_T = 0;
        this.field_ac = 0;
        this.field_z = false;
        this.field_ak = false;
        this.field_aB = false;
        this.field_ax = null;
        this.field_aD = 1;
        this.field_v = false;
        this.field_c = 0;
        this.field_s = 0L;
        this.field_aC = 0L;
        this.field_p = 0;
        this.field_aw = false;
        field_aa = false;
        field_m = false;
        field_R = false;
        field_W = false;
        field_l = new byte[7][7];
        field_F = new byte[17][17];
        field_aq = 0;
        this.field_B = 0L;
        this.field_V = 0L;
    }

    public void paint(Graphics var1) {
        if (this.field_aD == 3) {
            this.paintDeathScreen(var1);
        } else if (this.field_c != 1 && this.field_c != 2) {
            this.paintMonsters(var1);
        } else {
            this.paintCampingScreen(var1);
        }

    }

    private void paintDeathScreen(Graphics var1) {
        var1.setColor(0);
        var1.fillRect(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
        var1.setColor(16777215);
        var1.setFont(field_w);
        var1.drawString("You're Dead!", ((Canvas)this).getWidth() / 2, ((Canvas)this).getHeight() / 2, 33);
    }

    private void paintCampingScreen(Graphics var1) {
        var1.setColor(0);
        var1.fillRect(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
        var1.setColor(16777215);
        var1.setFont(field_w);
        var1.drawString("CAMPING", ((Canvas)this).getWidth() / 2, ((Canvas)this).getHeight() / 2, 33);
    }

    private void paintMonsters(Graphics var1) {
        var1.setColor(0);
        var1.fillRect(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
        this.method_j(var1);
        this.method_b(var1);
        if (field_W) {
            int var2 = this.field_ax.method_r();
            this.method_b1(var1, var2);
        }

        try {
            this.method_g(var1);
        } catch (Throwable var3) {
            System.out.println("Error in paintMonsters: " + var3);
        }

        this.method_a10(var1);
        this.method_d1(var1);
        this.method_l(var1);
        this.method_e(var1);
        if (field_az) {
            this.method_i(var1);
        }

        if (field_f == 1 && !this.field_ax.method_k1(3)) {
            this.method_k(var1);
        }

        if (field_f == 2 && !this.field_ax.method_k1(3)) {
            this.method_h(var1);
        }

    }

    private void method_i(Graphics var1) {
        var1.setColor(16777215);
        var1.drawString(field_G, 60, 10, 17);
    }

    private void method_e(Graphics var1) {
        if (field_S) {
            int var2 = 40 + DataTools.randomIntOneToN(30);
            int var3 = 50 + DataTools.randomIntOneToN(20);
            var1.drawImage(field_aE[0], var2, var3, 20);
            field_S = false;
        }

        if (field_ao) {
            int var4 = 40 + DataTools.randomIntOneToN(30);
            int var6 = 50 + DataTools.randomIntOneToN(22);
            var1.drawImage(field_aE[1], var4, var6, 20);
            field_ao = false;
        }

        if (field_am) {
            int var5 = 50 + DataTools.randomIntOneToN(2);
            int var7 = 80 + DataTools.randomIntOneToN(2);
            var1.drawImage(field_aE[2], var5, var7, 20);
            field_am = false;
        }

    }

    private void method_j(Graphics var1) {
        class_i var2 = this.field_ax.method_b8();
        byte[][] var3 = this.field_ax.field_ae;
        if (!this.field_ax.method_k1(3)) {
            if (this.field_ax.method_k1(4)) {
                var1.setColor(10485760);
                var1.fillRect(0, 0, ((Canvas)this).getWidth(), field_h.getHeight());
            } else {
                for(int var6 = 0; var6 < 5; ++var6) {
                    var1.drawImage(field_h, var6 * 36, 0, 20);
                }
            }
        }

        for(int var15 = 0; var15 < 5; ++var15) {
            int var5 = var15 * 18;

            for(int var7 = 0; var7 < 6; ++var7) {
                int var8 = field_n[var15][var7][0];
                int var9 = field_n[var15][var7][1];
                int var10 = field_n[var15][var7][2];
                int var11 = field_n[var15][var7][3];
                if (DataTools.doBytesShareBits((byte)1, var2.method_a13(var10, var11, var3))) {
                    int var4 = this.method_a2(var8, var9, -1);
                    this.method_a(var1, var4, var5);
                    break;
                }
            }
        }

        for(int var16 = 5; var16 < 10; ++var16) {
            int var14 = var16 * 18;

            for(int var17 = 0; var17 < 6; ++var17) {
                int var18 = field_n[9 - var16][var17][0];
                int var19 = field_n[9 - var16][var17][1];
                int var20 = -field_n[9 - var16][var17][2];
                int var12 = field_n[9 - var16][var17][3];
                if (DataTools.doBytesShareBits((byte)1, var2.method_a13(var20, var12, var3))) {
                    int var13 = this.method_a2(var18, var19, 1);
                    this.method_a(var1, var13, var14);
                    break;
                }
            }
        }

    }

    private void method_b(Graphics var1) {
        for(int var2 = 8; var2 <= 12; ++var2) {
            Object var3 = class_j.field_ad.elementAt(var2);
            if (var3 instanceof byte[]) {
                byte[] var4 = (byte[])var3;
                if (var4.length == 8 || var4.length == 7) {
                    this.method_a4(var1, var4, var2);
                }
            }
        }

        for(int var6 = 4; var6 <= 6; ++var6) {
            Object var7 = class_j.field_ad.elementAt(var6);
            if (var7 instanceof byte[]) {
                byte[] var5 = (byte[])var7;
                if (var5.length == 8 || var5.length == 7) {
                    this.method_a4(var1, var5, var6);
                }
            }
        }

        Object var8 = class_j.field_ad.elementAt(1);
        if (var8 instanceof byte[]) {
            byte[] var9 = (byte[])var8;
            if (var9.length == 8 || var9.length == 7) {
                this.method_a4(var1, var9, 1);
            }
        }

    }

    private void method_a(Graphics var1, int var2, int var3) {
        var1.setClip(var3, 0, 18, ((Canvas)this).getHeight());
        if (var2 > 7) {
            int var4 = var2 - 8;
            DirectGraphics var5 = DirectUtils.getDirectGraphics(var1);
            var5.drawImage(field_Y, var3 - var4 * 18, 0, 20, 8192);
        } else {
            var1.drawImage(field_Y, var3 - var2 * 18, 0, 20);
        }

        var1.setClip(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
    }

    private boolean method_a1(String[] var1, int var2) {
        if (var2 <= field_X && var2 >= 0) {
            return false;
        } else {
            field_d = var1;
            if (var2 < 0) {
                field_X = 10;
            } else {
                field_X = var2;
            }

            return true;
        }
    }

    private void method_c1() {
        class_i var1 = this.field_ax.method_b8();
        byte[][] var2 = this.field_ax.field_ae;
        byte var3 = var1.method_a13(0, 1, var2);
        if (DataTools.doBytesShareBits((byte)32, var3)) {
            int var4 = this.field_ax.method_r();
            field_W = true;
            String[] var5 = field_i[var4];
            if (this.method_a1(var5, 1)) {
                field_as = System.currentTimeMillis();
                field_ad = true;
            }
        } else {
            field_W = false;
            if (!this.method_d4() && ESPersonality.field_d && this.field_ax.field_m == ESPersonality.field_f) {
                ESPersonality.method_a2();
            }
        }

    }

    private int method_a2(int var1, int var2, int var3) {
        if (var1 == 12) {
            return var2;
        } else {
            return var3 == -1 ? 8 + var2 : 7 - var2;
        }
    }

    private void method_b1(Graphics var1, int var2) {
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        switch (var2) {
            case 0:
                this.method_e1(var1, 1, 1);
                break;
            case 1:
                this.method_e1(var1, 6, 1);
                break;
            case 2:
                this.method_e1(var1, 7, 1);
                break;
            case 3:
                this.method_e1(var1, 2, 1);
                break;
            case 4:
                this.method_e1(var1, 3, 2);
                break;
            case 5:
                this.method_e1(var1, 8, 0);
                break;
            case 6:
                int var9 = Math.min(ESPersonality.field_f, 3) - 1;
                this.method_a3(var1, var9);
        }

        var1.setClip(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
    }

    private void method_a3(Graphics var1, int var2) {
        byte var3 = 15;
        byte var4 = 32;
        this.method_a11(var1, field_q[28], field_o[var2][0], 1, var3, var4);
        int var5 = field_q[28].method_a();
        this.method_a12(var1, field_q[28], field_o[var2][0], 1, var3 + var5, var4, 8192);
        this.method_a11(var1, field_q[29], field_o[var2][1], 3, var3 + 45, var4 + -22);
    }

    private void method_g(Graphics var1) {
        field_A = false;

        for(int var2 = 8; var2 <= 12; ++var2) {
            Object var3 = class_j.field_ad.elementAt(var2);
            if (var3 instanceof byte[]) {
                byte[] var4 = (byte[])var3;
                if (var4.length == 28 && var4[6] != 0) {
                    field_A = true;
                    this.method_c3(var1, var4[2], var2);
                }
            } else if (var3 instanceof String) {
                String var7 = (String)var3;
                if (var7.equals("W")) {
                    this.method_b4(var1, 32, var2);
                }
            }
        }

        for(int var6 = 4; var6 <= 6; ++var6) {
            Object var8 = class_j.field_ad.elementAt(var6);
            if (var8 instanceof byte[]) {
                byte[] var5 = (byte[])var8;
                if (var5.length == 28 && var5[6] != 0) {
                    field_A = true;
                    this.method_c3(var1, var5[2], var6);
                }
            } else if (var8 instanceof String) {
                String var10 = (String)var8;
                if (var10.equals("W")) {
                    this.method_d(var1, 31, var6);
                }
            }
        }

        Object var9 = class_j.field_ad.elementAt(1);
        if (var9 instanceof byte[]) {
            byte[] var11 = (byte[])var9;
            if (var11.length == 28 && var11[6] != 0) {
                field_A = true;
                this.method_c3(var1, var11[2], 1);
            }
        } else if (var9 instanceof String) {
        }

    }

    private void method_a4(Graphics var1, byte[] var2, int var3) {
        if (var3 == 1) {
            this.method_a6(var1, var2, false);
        } else if (var3 >= 4 && var3 <= 6) {
            this.method_b2(var1, var2, false, var3);
        } else if (var3 >= 8 && var3 <= 12) {
            this.method_a7(var1, var2, false, var3);
        }

    }

    private static boolean method_a5(byte[] var0) {
        if (var0.length != 7) {
            return false;
        } else {
            return (var0[6] & 4) != 0;
        }
    }

    private void method_a6(Graphics var1, byte[] var2, boolean var3) {
        if (method_a5(var2)) {
            byte var4 = 45;
            byte var5 = 65;
            this.method_a18(var1, field_u[0], var4, var5);
        } else {
            byte var7 = 60;
            int var8 = 94;
            byte var6 = 0;
            if (var2.length == 8) {
                this.method_a18(var1, field_ab[var6], var7, var8);
            } else if (var2.length == 7) {
                var8 += 14;
                this.method_a18(var1, field_ar[var6], var7, var8);
            }
        }

    }

    private void method_b2(Graphics var1, byte[] var2, boolean var3, int var4) {
        byte var5 = 1;
        short var6 = 0;
        int var7 = 0;
        boolean var8 = method_a5(var2);
        switch (var4) {
            case 4:
                var6 = 14;
                var7 = 80;
                if (var8) {
                    var6 = 14;
                    var7 = 55;
                }
                break;
            case 5:
                var6 = 68;
                var7 = 80;
                if (var8) {
                    var6 = 73;
                    var7 = 55;
                } else if (var2.length == 7) {
                    var6 = 73;
                    var7 = 80;
                }
                break;
            case 6:
                var6 = 122;
                var7 = 80;
                if (var8) {
                    var6 = 125;
                    var7 = 55;
                } else if (var2.length == 7) {
                    var6 = 132;
                    var7 = 80;
                }
        }

        if (var8) {
            var7 += 13;
            this.method_a18(var1, field_u[var5], var6, var7);
        } else if (var2.length == 8) {
            var7 += 17;
            this.method_a18(var1, field_ab[var5], var6, var7);
        } else if (var2.length == 7) {
            var7 += 20;
            this.method_a18(var1, field_ar[var5], var6, var7);
        }

    }

    private void method_a7(Graphics var1, byte[] var2, boolean var3, int var4) {
        byte var5 = 2;
        short var6 = 0;
        int var7 = 0;
        boolean var8 = method_a5(var2);
        switch (var4) {
            case 8:
                var6 = 10;
                var7 = 59;
                if (var8) {
                    var6 = 10;
                    var7 = 52;
                }
                break;
            case 9:
                var6 = 44;
                var7 = 59;
                if (var8) {
                    var6 = 44;
                    var7 = 52;
                }
                break;
            case 10:
                var6 = 79;
                var7 = 59;
                if (var8) {
                    var6 = 79;
                    var7 = 52;
                }
                break;
            case 11:
                var6 = 112;
                var7 = 59;
                if (var8) {
                    var6 = 112;
                    var7 = 52;
                }
                break;
            case 12:
                var6 = 146;
                var7 = 59;
                if (var8) {
                    var6 = 146;
                    var7 = 52;
                }
        }

        if (var8) {
            var7 += 20;
            this.method_a18(var1, field_u[var5], var6, var7);
        } else if (var2.length == 8) {
            var7 += 28;
            this.method_a18(var1, field_ab[var5], var6, var7);
        } else if (var2.length == 7) {
            var7 += 28;
            this.method_a18(var1, field_ar[var5], var6, var7);
        }

    }

    private int method_c2(int var1) {
        if (var1 >= 1 && var1 <= 5) {
            return 5;
        } else if (var1 >= 6 && var1 <= 10) {
            return 12;
        } else if (var1 >= 11 && var1 <= 25) {
            return 19;
        } else if (var1 >= 26 && var1 <= 40) {
            return 26;
        } else {
            return var1 == 41 ? 31 : -1;
        }
    }

    private int method_a8(int var1) {
        if (var1 >= 1 && var1 <= 5) {
            return 6;
        } else if (var1 >= 6 && var1 <= 10) {
            return 13;
        } else if (var1 >= 11 && var1 <= 25) {
            return 20;
        } else if (var1 >= 26 && var1 <= 40) {
            return 27;
        } else {
            return var1 == 41 ? 32 : -1;
        }
    }

    private void method_c3(Graphics var1, int var2, int var3) {
        if (var3 == 1) {
            this.method_c4(var1, var2);
        } else if (var3 >= 4 && var3 <= 6) {
            this.method_d(var1, this.method_c2(var2), var3);
        } else if (var3 >= 8 && var3 <= 12) {
            this.method_b4(var1, this.method_a8(var2), var3);
        }

        var1.setClip(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
    }

    private int method_b3(int var1) {
        if (var1 >= 1 && var1 <= 5) {
            return 0;
        } else if (var1 >= 6 && var1 <= 10) {
            return 1;
        } else if (var1 >= 11 && var1 <= 25) {
            return 2;
        } else {
            return var1 >= 26 && var1 <= 40 ? 3 : -1;
        }
    }

    private void method_c4(Graphics var1, int var2) {
        this.method_e1(var1, var2, -1);
    }

    private void method_e1(Graphics var1, int var2, int var3) {
        if (var2 == 41) {
            this.method_a3(var1, 2);
        } else {
            int var4 = this.method_b3(var2);
            if (var4 >= 0) {
                byte var6 = field_ae[var4][2];
                byte var7 = field_ae[var4][3];
                byte var8 = field_ae[var4][4];
                byte var9 = field_ae[var4][5];
                int var10 = var6 + field_ae[var4][6];
                int var11 = var7 + field_ae[var4][7];
                byte var12 = field_ae[var4][8];
                byte var13 = field_ae[var4][9];
                boolean var5;
                if (var12 >= 0) {
                    var5 = true;
                } else {
                    var5 = false;
                }

                byte var14 = field_a[var2 - 1][0];
                int var15 = field_a[var2 - 1][1];
                if (var3 >= 0) {
                    var15 = var3;
                }

                boolean var16 = field_J[var2 - 1][0];
                boolean var17 = field_J[var2 - 1][1];
                boolean var18 = field_J[var2 - 1][2];
                boolean var19 = field_J[var2 - 1][3];
                this.method_a11(var1, field_q[var8], var14, var9, var6, var7);
                if (var5) {
                    this.method_a11(var1, field_q[var12], var15, var13, var10, var11);
                }

                if (var16) {
                    int var20 = var6 + field_ae[var4][10];
                    int var21 = var7 + field_ae[var4][11];
                    byte var22 = field_ae[var4][12];
                    this.method_a11(var1, field_q[var22], 0, 1, var20, var21);
                }

                if (var17) {
                    int var23 = var6 + field_ae[var4][13];
                    int var26 = var7 + field_ae[var4][14];
                    byte var29 = field_ae[var4][15];
                    this.method_a11(var1, field_q[var29], 0, 1, var23, var26);
                }

                if (var18) {
                    int var24 = var6 + field_ae[var4][16];
                    int var27 = var7 + field_ae[var4][17];
                    byte var30 = field_ae[var4][18];
                    this.method_a11(var1, field_q[var30], 0, 1, var24, var27);
                }

                if (var19) {
                    int var25 = var6 + field_ae[var4][19];
                    int var28 = var7 + field_ae[var4][20];
                    byte var31 = field_ae[var4][21];
                    this.method_a11(var1, field_q[var31], 0, 1, var25, var28);
                }
            }

        }
    }

    private void method_d(Graphics var1, int var2, int var3) {
        this.method_a9(var1, var2, var3, 0, 1);
    }

    private void method_a9(Graphics var1, int var2, int var3, int var4, int var5) {
        byte var6 = 0;
        byte var7 = 0;
        switch (var3) {
            case 4:
                var6 = 10;
                var7 = 38;
                break;
            case 5:
                var6 = 62;
                var7 = 38;
                break;
            case 6:
                var6 = 112;
                var7 = 38;
        }

        this.method_a11(var1, field_q[var2], var4, var5, var6, var7);
    }

    private void method_b4(Graphics var1, int var2, int var3) {
        short var4 = 0;
        byte var5 = 0;
        switch (var3) {
            case 8:
                var4 = 10;
                var5 = 44;
                break;
            case 9:
                var4 = 44;
                var5 = 44;
                break;
            case 10:
                var4 = 79;
                var5 = 44;
                break;
            case 11:
                var4 = 112;
                var5 = 44;
                break;
            case 12:
                var4 = 146;
                var5 = 44;
        }

        DirectGraphics var6 = DirectUtils.getDirectGraphics(var1);
        var6.drawPixels(field_q[var2].field_g, true, 0, field_q[var2].field_h, var4, var5, field_q[var2].field_e, field_q[var2].field_a, 0, 4444);
    }

    private void method_a10(Graphics var1) {
        var1.setColor(16776960);
        var1.fillRect(5, 130, 40, 7);
        var1.fillRect(5, 138, 40, 7);
        var1.fillRect(5, 146, 40, 7);
        var1.setColor(16711680);
        int var2 = this.field_ax.method_n1(2) * 38 / this.field_ax.field_U[3];
        var1.fillRect(6, 131, var2, 5);
        var1.setColor(65280);
        var2 = this.field_ax.method_n1(4) * 38 / this.field_ax.field_U[5];
        var1.fillRect(6, 139, var2, 5);
        var1.setColor(255);
        var2 = this.field_ax.method_n1(6) * 38 / this.field_ax.field_U[7];
        if (var2 > 40) {
            var2 = 40;
        }

        var1.fillRect(6, 147, var2, 5);
    }

    private void method_l(Graphics var1) {
        if (field_ad) {
            var1.setColor(13080935);
            var1.fillRoundRect(96, 118, 75, 35, 5, 5);
            var1.setFont(field_aj);
            var1.setColor(0);
            var1.drawString(field_d[0], 100, 122, 20);
            if (field_d.length > 1) {
                var1.drawString(field_d[1], 100, 134, 20);
            }

        }
    }

    private void method_d1(Graphics var1) {
        var1.setFont(field_aj);
        var1.setClip(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
        var1.setColor(0);
        var1.fillRect(0, 156, ((Canvas)this).getWidth(), 52);
        var1.setColor(13080935);
        var1.fillRoundRect(2, 158, ((Canvas)this).getWidth() - 4, 48, 5, 5);
        var1.setColor(0);
        int var2 = this.method_j1();
        field_aq = var2;
        if (var2 == 0) {
            var1.drawImage(field_y[1], 14, 174, 20);
            var1.drawImage(field_y[2], 62, 174, 20);
            var1.drawImage(field_y[3], 104, 174, 20);
            var1.drawImage(field_y[5], 144, 174, 20);
            var1.drawChar(field_e[1], 5, 180, 20);
            var1.drawChar(field_e[2], 53, 180, 20);
            var1.drawChar(field_e[3], 96, 180, 20);
            var1.drawChar(field_e[5], 135, 180, 20);
        } else if (var2 == 1) {
            var1.drawImage(field_y[0], 14, 174, 20);
            var1.drawImage(field_y[1], 62, 174, 20);
            var1.drawImage(field_y[2], 104, 174, 20);
            var1.drawImage(field_y[3], 144, 174, 20);
            var1.drawChar(field_e[0], 5, 180, 20);
            var1.drawChar(field_e[1], 53, 180, 20);
            var1.drawChar(field_e[2], 96, 180, 20);
            var1.drawChar(field_e[3], 135, 180, 20);
        } else if (var2 == 2) {
            var1.drawImage(field_y[1], 14, 174, 20);
            var1.drawImage(field_y[2], 62, 174, 20);
            var1.drawImage(field_y[3], 104, 174, 20);
            var1.drawImage(field_y[4], 144, 174, 20);
            var1.drawChar(field_e[1], 5, 180, 20);
            var1.drawChar(field_e[2], 53, 180, 20);
            var1.drawChar(field_e[3], 96, 180, 20);
            var1.drawChar(field_e[4], 135, 180, 20);
        }

    }

    private int method_j1() {
        if (field_aa) {
            return 1;
        } else if (!field_m && !field_R) {
            return field_W && !this.method_d4() ? 2 : 0;
        } else {
            return 2;
        }
    }

    private void method_a11(Graphics var1, class_g var2, int var3, int var4, int var5, int var6) {
        this.method_a12(var1, var2, var3, var4, var5, var6, 0);
    }

    private void method_a12(Graphics var1, class_g var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var2.method_a() / var4;
        int var9 = var2.method_b1();
        var1.setClip(var5, var6, var8, var9);
        DirectGraphics var10 = DirectUtils.getDirectGraphics(var1);
        var10.drawPixels(var2.field_g, true, 0, var2.field_h, var5 - var3 * var8, var6, var2.field_e, var2.field_a, var7, 4444);
    }

    private void method_k(Graphics var1) {
        var1.setFont(field_aj);
        var1.setColor(16777215);
        var1.drawChar(field_O[this.field_ax.field_ak], 16, 10, 20);
        var1.setColor(0);
        var1.fillRect(10, 20, 23, 23);
        this.method_a13(var1, 10, 20, 7, 3, 1, field_l);
    }

    private void method_h(Graphics var1) {
        var1.setFont(field_K);
        var1.setColor(16777215);
        var1.drawChar(field_O[this.field_ax.field_ak], 58, 10, 20);
        byte var2 = 89;
        var1.fillRect(15, 25, var2, var2);
        this.method_a13(var1, 15, 25, 17, 5, 2, field_F);
    }

    private void method_a13(Graphics var1, int var2, int var3, int var4, int var5, int var6, byte[][] var7) {
        int var8 = var4 / 2;

        for(int var9 = 0; var9 < var4; ++var9) {
            int var10 = var3 + var6 + var9 * var5;

            for(int var11 = 0; var11 < var4; ++var11) {
                int var12 = var2 + var6 + var11 * var5;
                if (var7[var11][var9] == 1) {
                    var1.setColor(0);
                    var1.fillRect(var12, var10, var5, var5);
                } else if (var7[var11][var9] == 0) {
                    var1.setColor(16777215);
                    var1.fillRect(var12, var10, var5, var5);
                } else if ((var7[var11][var9] & 2) != 0) {
                    var1.setColor(16711680);
                    var1.fillRect(var12, var10, var5, var5);
                } else if ((var7[var11][var9] & 4) != 0) {
                    var1.setColor(255);
                    var1.fillRect(var12, var10, var5, var5);
                } else if ((var7[var11][var9] & 8) != 0) {
                    var1.setColor(13369599);
                    var1.fillRect(var12, var10, var5, var5);
                }

                if (var9 == var8 && var11 == var8) {
                    var1.setColor(65280);
                    var1.fillRect(var12, var10, var5, var5);
                }
            }
        }

    }

    void method_q() {
        byte var1 = this.field_ax.field_l;
        byte var2 = this.field_ax.field_k;
        byte var3 = this.field_ax.field_ak;
        this.field_ax.method_b8().method_c4(var1, var2, var3, field_l);
    }

    void method_p() {
        byte var1 = this.field_ax.field_l;
        byte var2 = this.field_ax.field_k;
        byte var3 = this.field_ax.field_ak;
        this.field_ax.method_b8().method_a10(var1, var2, var3, field_F);
    }

    public void keyPressed(int var1) {
        this.field_T = this.field_ac;
        if (var1 == 49) {
            if (field_aq == 1) {
                field_av = true;
            }

        } else if (var1 == 50) {
            this.field_p = 1;
        } else if (var1 == 51) {
            field_ap = true;
        } else if (var1 == 52) {
            this.field_aw = true;
            this.field_p = 4;
        } else if (var1 == 53) {
            field_U = true;
        } else if (var1 == 54) {
            this.field_aw = true;
            this.field_p = 3;
        } else if (var1 == 55) {
            field_Z = true;
        } else if (var1 == 56) {
            this.field_p = 2;
        } else if (var1 == 57) {
            if (field_aq == 2) {
                field_ay = true;
            }

        } else if (var1 == 48) {
            if (field_aq == 0) {
                field_I = true;
            }

        } else if (var1 == 42) {
            ++field_f;
            if (field_f > 2) {
                field_f = 1;
            }

        } else {
            this.field_aw = false;
            this.field_ac = ((Canvas)this).getGameAction(var1);
            switch (this.field_ac) {
                case 1:
                    this.field_p = 1;
                    break;
                case 2:
                    this.field_p = 4;
                case 3:
                case 4:
                default:
                    break;
                case 5:
                    this.field_p = 3;
                    break;
                case 6:
                    this.field_p = 2;
            }

        }
    }

    public void keyReleased(int var1) {
        ((Canvas)this).getGameAction(var1);
        this.field_T = this.field_ac;
        this.field_ac = 0;
    }

    void method_g1() {
        if (this.field_au != null) {
            this.field_z = true;
            if (this.field_au.isAlive()) {
                System.out.println("Killing game thread");
                this.field_aB = true;

                try {
                    this.field_au.join();
                } catch (Exception var2) {
                }

                System.out.println("Done killing game thread");
            }

            this.field_au = null;
            System.gc();
        }
    }

    void method_i1() {
        try {
            this.method_g1();
            this.field_au = new Thread(this);
            this.field_au.start();
            ESGame.debugPrint("after starting game thread");
        } catch (Throwable var2) {
            System.out.println(" start error:");
            var2.printStackTrace();
            ((Canvas)this).repaint();
            ((Canvas)this).serviceRepaints();
        }

    }

    public void run() {
        long var1 = System.currentTimeMillis();
        long var5 = 0L;
        long var7 = 0L;

        try {
            while(this.field_z) {
                boolean var9 = false;
                if (this.field_ak) {
                    long var20 = System.currentTimeMillis();

                    try {
                        Thread.sleep(250L);
                    } catch (Exception var16) {
                    }

                    if (this.field_aB) {
                        this.field_aB = false;
                        return;
                    }
                } else {
                    boolean var10 = true;
                    field_at = false;
                    System.gc();
                    if (this.field_c == 1) {
                        var10 = false;
                        if (var1 - this.field_aC > 2500L) {
                            if (this.method_o()) {
                                this.field_c = 0;
                                this.field_ax.method_b8().method_a1(this.field_ax);
                                this.field_aC = 0L;
                                this.field_v = true;
                                this.field_ax.method_e2(false);
                                var10 = true;
                                if (this.method_a1(field_N, 1)) {
                                    field_as = var1;
                                    field_ad = true;
                                }
                            } else {
                                this.field_c = 2;
                            }
                        }
                    } else if (this.field_c == 2) {
                        var10 = false;
                        if (var1 - this.field_aC > 5000L) {
                            this.field_c = 0;
                            this.field_aC = 0L;
                            this.field_v = true;
                            this.field_ax.method_e2(true);
                            if (this.method_a1(field_b, 1)) {
                                field_as = var1;
                                field_ad = true;
                            }

                            var10 = true;
                        }
                    } else if (this.field_aD != 1) {
                        if (this.field_aD == 2) {
                            this.field_aD = 3;
                            field_ad = false;
                            field_X = 0;
                        }

                        var10 = false;
                        if (var1 - this.field_s > 5000L) {
                            System.out.println("Restart after dead");
                            this.field_ax.method_a(this.field_ax.field_U);

                            for(int var11 = this.field_ax.nItems - 1; var11 >= 0; --var11) {
                                if (!this.field_ax.method_C(var11)) {
                                    this.field_ax.method_y1(var11);
                                }
                            }

                            this.field_ax.method_c1(this.field_ax.field_ar, true);
                            this.field_s = 0L;
                            this.field_aD = 1;
                            ESPersonality.field_l = true;
                            this.field_v = true;
                            field_E = true;
                            var10 = true;
                            if (field_E) {
                                Object var12 = null;
                                String[] var23;
                                if (this.field_ax.field_u) {
                                    var23 = field_r;
                                } else if (this.field_ax.field_O) {
                                    var23 = field_ag;
                                } else {
                                    var23 = this.field_ax.method_b8().method_a14();
                                }

                                if (this.method_a1(var23, 1)) {
                                    field_as = System.currentTimeMillis();
                                    field_ad = true;
                                }

                                field_E = false;
                            }
                        }
                    }

                    if (var10) {
                        if (ESPersonality.method_a1(this.field_ax.field_W)) {
                            ESPersonality.method_c();
                        }

                        if (this.method_d4() && ESPersonality.field_f > this.field_ax.field_m) {
                            String var21 = ESPersonality.method_a6(this.field_ax, 6, -1, -1);
                            this.field_H.field_aV = this.field_H.newWardenSpeaksUI(var21);
                            var9 = true;
                        }

                        this.method_b5(var1);
                        this.method_e2(var1);
                        this.method_a17(var1, var5);
                        if (this.field_ax.method_o1()) {
                            this.method_e3();
                            this.field_H.field_ag = this.field_H.newLevelUpUI(1);
                            this.field_H.method_a12(this.field_H.field_ag);
                            field_al = false;
                        }

                        this.field_v = false;
                    }

                    this.method_a14(false);
                    if (field_al) {
                        ((Canvas)this).repaint();
                        ((Canvas)this).serviceRepaints();
                    }

                    long var22 = System.currentTimeMillis() - var1;
                    field_ai = var22;

                    try {
                        if (var22 < 250L) {
                            long var13 = 250L - var22;
                            Thread.sleep(250L - var22);
                        }
                    } catch (Exception var17) {
                    }

                    if (this.field_aB) {
                        this.field_aB = false;
                        return;
                    }

                    long var3 = var1;
                    var1 = System.currentTimeMillis();
                    var5 = var1 - var3;
                    this.method_c5(var5);
                    var7 += var5;
                    if (var7 > 1000L) {
                        var7 -= 1000L;
                        this.method_l1();
                    }

                    if (var1 - field_as > 3000L) {
                        field_ad = false;
                        field_X = 0;
                    }

                    if (var9) {
                        this.method_e3();
                        this.field_H.method_a12(this.field_H.field_aV);
                    }
                }
            }
        } catch (OutOfMemoryError var18) {
            this.field_H.method_B();
        } catch (Throwable var19) {
            System.out.println("ERROR: An error was thrown in GameCanvas run method!");
            System.out.println(var19);
            var19.printStackTrace();
            field_az = true;
            field_G = String.valueOf(var19);
            ((Canvas)this).repaint();
            ((Canvas)this).serviceRepaints();

            try {
                Thread.sleep(10000L);
            } catch (Throwable var15) {
            }

            this.field_H.method_b4();
        }

    }

    private void method_a14(boolean var1) {
        this.field_ax.method_d1(var1);
        this.method_q();
        if (field_f == 2) {
            this.method_p();
        }

    }

    private void method_b5(long var1) {
        Hashtable var3 = ESGame.field_G[this.field_ax.field_j - 1];
        if (var3 != null) {
            Enumeration var4 = var3.elements();

            while(var4.hasMoreElements()) {
                byte[] var5 = (byte[])var4.nextElement();
                class_d var6 = class_d.method_a(var5);
                if (var6.method_b2(this.field_ax)) {
                    if (var6.field_f == 0) {
                        var6.field_k = var1;
                        var6.field_f = 1;
                    } else if (var6.field_f == 1 && var1 - var6.field_k > 800L) {
                        var6.method_a6(this.field_ax, var1);
                        if (this.method_a1(field_ah, 2)) {
                            field_as = var1;
                            field_ad = true;
                        }
                    } else if (var1 - var6.field_k > 800L) {
                        var6.method_a6(this.field_ax, var1);
                    }

                    var6.method_d();
                } else {
                    var6.method_a4(this.field_ax);
                    var6.method_d();
                }
            }

        }
    }

    private void method_e2(long var1) {
        if (field_I) {
            if (field_A) {
                if (this.method_a1(field_C, 1)) {
                    field_as = var1;
                    field_ad = true;
                }

                field_I = false;
            } else {
                this.method_a16(var1);
            }
        } else if (field_ay) {
            this.method_f1(var1);
        } else if (field_ap) {
            this.method_h2(var1);
        } else if (field_U) {
            this.method_g2(var1);
        } else if (field_av) {
            this.method_d2(var1);
        } else if (field_Z) {
            this.method_f2();
        } else if ((this.field_p != 0 || this.field_v) && !this.field_v) {
            this.method_n();
        }

        this.method_h1();
        this.method_c1();
        this.method_a15();
        this.method_m1();
    }

    private void method_d2(long var1) {
        if (var1 - this.field_B >= 500L && field_j != null) {
            field_at = true;
            this.field_ax.method_a6(field_j);
            System.out.println("monster health is " + field_j.field_g);
            this.field_B = var1;
            field_S = true;
        }

        field_av = false;
    }

    private void method_m1() {
        if (field_j != null && field_j.field_g <= 0) {
            if (field_j.field_l == 41) {
                field_j.method_a9(true);
            } else {
                field_j.method_a9(false);
            }

            ESGame.killMonster(this.field_ax.field_j, field_j.field_a);
            if (this.field_ax.method_k1(4)) {
                short[] var10000 = this.field_ax.field_U;
                var10000[2] = (short)(var10000[2] + 3 * this.field_ax.field_U[3] / 10);
                this.field_ax.field_U[2] = (short)Math.min(this.field_ax.field_U[2], this.field_ax.field_U[3]);
            }

            if (this.method_a1(field_P, 1)) {
                field_as = System.currentTimeMillis();
                field_ad = true;
            }

            field_j = null;
            field_aa = false;
        }

    }

    private void method_a15() {
        field_j = this.field_ax.method_n();
        if (field_j != null) {
            field_aa = true;
            byte[] var1 = field_j.method_f();
            field_j = class_d.method_a1(field_k, var1);
        } else {
            field_aa = false;
        }

        if (field_aa) {
            String var4 = field_j.method_a2();
            String[] var2 = new String[2];
            int var3 = var4.indexOf(32);
            if (var3 < 0) {
                var2[0] = var4;
                var2[1] = "";
            } else {
                var2[0] = var4.substring(0, var3);
                var2[1] = var4.substring(var3 + 1);
            }

            if (this.method_a1(var2, 1)) {
                field_as = System.currentTimeMillis();
                field_ad = true;
            }
        }

    }

    private void method_h1() {
        byte[] var1 = this.field_ax.method_h1();
        if (var1 != null) {
            field_m = true;
        } else {
            field_m = false;
        }

        if (field_m && this.method_a1(field_x, 1)) {
            field_as = System.currentTimeMillis();
            field_ad = true;
        }

    }

    private void method_n() {
        if (this.field_p != 0) {
            byte var1 = this.field_ax.nItems;
            field_at = true;
            this.field_ax.method_a4(this.field_p, this.field_aw);
            if (class_j.field_g) {
                this.field_H.field_aP = this.field_H.newEndOfGameUI();
                this.field_H.method_a12(this.field_H.field_aP);
                field_al = false;
            } else {
                if (this.field_ax.field_i || this.field_ax.field_u || this.field_ax.field_O) {
                    field_E = true;
                    if (field_E) {
                        Object var2 = null;
                        String[] var3;
                        if (this.field_ax.field_u) {
                            var3 = field_r;
                        } else if (this.field_ax.field_O) {
                            var3 = field_ag;
                        } else {
                            var3 = this.field_ax.method_b8().method_a14();
                        }

                        if (this.method_a1(var3, 1)) {
                            field_as = System.currentTimeMillis();
                            field_ad = true;
                        }

                        field_E = false;
                    }
                }

                if (this.field_aw) {
                    this.field_aw = false;
                }
            }

            this.field_p = 0;
            int var4 = this.field_ax.nItems - var1;
            if (var4 == 1) {
                if (this.method_a1(this.method_k1(), -1)) {
                    field_as = System.currentTimeMillis();
                    field_ad = true;
                }
            } else if (var4 > 1 && this.method_a1(field_an, -1)) {
                field_as = System.currentTimeMillis();
                field_ad = true;
            }
        }

    }

    private void method_h2(long var1) {
        if (field_ap) {
            byte var3 = this.field_ax.field_b;
            if (!spell.method_a(var3)) {
                System.out.println("Invalid spell id,= " + var3);
                field_ap = false;
                return;
            }

            if (spell.method_c(var3).Cost > this.field_ax.method_n1(4)) {
                if (this.method_a1(field_t, 3)) {
                    field_as = var1;
                    field_ad = true;
                }
            } else if (var1 - this.field_V >= 500L && spell.method_a(var3)) {
                field_at = true;
                if (spell.method_b(var3)) {
                    if (!field_aa) {
                        if (this.method_a1(field_g, 1)) {
                            field_as = var1;
                            field_ad = true;
                        }
                    } else {
                        this.field_ax.method_b5(var3, field_j);
                        System.out.println("monster health is " + field_j.field_g);
                        field_ao = true;
                    }
                } else {
                    this.field_ax.method_p(var3);
                    field_am = true;
                }

                this.field_V = var1;
            }

            field_ap = false;
        }

    }

    private void method_g2(long var1) {
        if (field_U) {
            int var3 = this.field_ax.method_l1();
            if (var3 == 0) {
                if (this.method_a1(field_Q, -1)) {
                    field_as = var1;
                    field_ad = true;
                }
            } else {
                this.field_ax.field_b = (byte)var3;
                String var4 = spell.method_c(var3).spellName;
                String[] var5 = DataTools.method_c2(var4);
                Object var6 = null;
                String[] var7;
                if (var5.length == 1) {
                    var7 = new String[]{var4, ""};
                } else if (var5.length >= 3) {
                    var7 = new String[]{var5[0] + " " + var5[1], var5[2]};
                } else {
                    var7 = var5;
                }

                if (this.method_a1(var7, -1)) {
                    field_as = var1;
                    field_ad = true;
                }
            }

            field_U = false;
        }

    }

    private void method_f1(long var1) {
        int npcID = this.field_ax.method_r();
        System.out.println("NPC In front is " + npcID);
        if (npcID >= 0) {
            this.method_d3(npcID);
            System.out.println("done interacting with NPC, must paint as well");
        } else if (field_m) {
            byte[] var4 = this.field_ax.method_h1();
            int var5 = this.field_ax.method_b4(var4);
            if (var5 == -1) {
                if (this.method_a1(field_D, 4)) {
                    field_as = var1;
                    field_ad = true;
                }
            } else if (var5 == 0) {
                if (this.method_a1(field_aA, -1)) {
                    field_as = var1;
                    field_ad = true;
                }
            } else if (this.method_a1(this.method_k1(), -1)) {
                field_as = var1;
                field_ad = true;
            }
        }

        field_ay = false;
    }

    private String[] method_k1() {
        int var1 = this.field_ax.nItems - 1;
        int var2 = Math.abs(this.field_ax.field_H[var1]);
        String[] var3 = DataTools.method_c2(class_a.method_d(var2));
        String[] var4 = new String[]{"", ""};
        if (var3.length >= 3) {
            var4[0] = var3[0] + " " + var3[1];
            var4[1] = var3[2];
        } else {
            for(int var5 = 0; var5 < var3.length; ++var5) {
                var4[var5] = var3[var5];
            }
        }

        return var4;
    }

    private void method_f2() {
        this.field_H.method_a12(this.field_H.field_t);
        field_al = false;
        field_Z = false;
    }

    private void method_a16(long var1) {
        this.field_c = 1;
        if (this.field_ax.field_I) {
            this.field_c = 2;
        }

        if (this.field_ax.field_j == 1) {
            this.field_c = 2;
        }

        this.field_aC = var1;
        field_I = false;
    }

    void method_d3(int var1) {
        String var2 = ESPersonality.method_a6(this.field_ax, var1, 1, 0);
        System.out.println("Just after NPC interaction in game canvas!");
        if (var2 != null) {
            this.field_H.field_aq.method_a17(ESPersonality.field_s[var1]);
            this.field_H.field_aq.method_e2(var2);
            this.field_H.field_aq.field_c = this.field_H.field_R[var1];
            this.field_H.field_aq.field_N = var1;
            RunImageLoader var3 = (RunImageLoader)this.field_H.field_aq.field_c;
            String var4 = var3.field_M;
            String var5 = var3.method_t();
            short var6 = 0;
            if (ESPersonality.method_b1(var1)) {
                var6 = ESPersonality.field_p[var1];
            } else if (var1 == 4) {
                var6 = ESPersonality.field_a;
            } else if (var1 == 5) {
                var6 = ESPersonality.field_g;
            }

            var5 = DataTools.replacePOSWithInt(var4, "<TAG>", var6);
            var3.method_e2(var5);
            this.field_H.method_a12(this.field_H.field_aq);
            field_al = false;
        } else if (var1 == 4) {
            System.out.println("BENECA has nothing more to say!");
            RunImageLoader var7 = this.field_H.field_R[4];
            String var9 = var7.field_M;
            String var12 = var7.method_t();
            short var16 = 0;
            var16 = ESPersonality.field_a;
            var12 = DataTools.replacePOSWithInt(var9, "<TAG>", var16);
            var7.method_e2(var12);
            this.field_H.method_a12(var7);
            field_al = false;
        } else if (var1 == 5) {
            System.out.println("HELGA has nothing more to say!");
            RunImageLoader var8 = this.field_H.field_R[5];
            String var10 = var8.field_M;
            String var14 = var8.method_t();
            short var18 = 0;
            var18 = ESPersonality.field_g;
            var14 = DataTools.replacePOSWithInt(var10, "<TAG>", var18);
            var8.method_e2(var14);
            this.field_H.method_a12(var8);
            field_al = false;
        }

    }

    private void method_a17(long var1, long var3) {
        int var5 = this.field_ax.method_n1(2);
        if (var5 <= 0) {
            field_aa = false;
            this.field_aD = 2;
            this.field_s = var1;
        }

        if (!field_at) {
            this.field_ax.method_a16(var3);
        }

    }

    public void method_e3() {
        this.field_ak = true;
    }

    public void method_b6() {
        this.field_ak = false;
    }

    protected void showNotify() {
        this.field_ax.method_w1();
        this.method_q();
        if (field_f == 2) {
            this.method_p();
        }

        this.method_c1();
        this.method_a15();
        field_al = true;
        this.method_b6();
        if (field_E) {
            Object var1 = null;
            String[] var2;
            if (this.field_ax.field_u) {
                var2 = field_r;
            } else if (this.field_ax.field_O) {
                var2 = field_ag;
            } else {
                var2 = this.field_ax.method_b8().method_a14();
            }

            if (this.method_a1(var2, 1)) {
                field_as = System.currentTimeMillis();
                field_ad = true;
            }

            field_E = false;
        }

    }

    private boolean method_o() {
        int var1 = DataTools.randomIntOneToN(10);
        return var1 == 1;
    }

    private void method_c5(long var1) {
        if (this.field_ax.method_k1(4)) {
            class_j var10000 = this.field_ax;
            var10000.field_ah = (short)((int)((long)var10000.field_ah - var1));
            if (this.field_ax.field_ah < 0) {
                this.field_ax.field_ah = 0;
                byte var3 = 3;
                this.field_ax.field_A = (byte) DataTools.clearSingleBit(var3, this.field_ax.field_A);
            }
        }

        if (this.field_ax.method_k1(5)) {
            class_j var6 = this.field_ax;
            var6.field_F = (short)((int)((long)var6.field_F - var1));
            if (this.field_ax.field_F < 0) {
                this.field_ax.field_F = 0;
                byte var4 = 4;
                this.field_ax.field_A = (byte) DataTools.clearSingleBit(var4, this.field_ax.field_A);
            }
        }

        if (this.field_ax.method_k1(7) && field_A) {
            class_j var7 = this.field_ax;
            var7.field_ap = (short)((int)((long)var7.field_ap - var1));
            if (this.field_ax.field_ap < 0) {
                this.field_ax.field_ap = 0;
                byte var5 = 6;
                this.field_ax.field_A = (byte) DataTools.clearSingleBit(var5, this.field_ax.field_A);
            }
        }

    }

    private void method_l1() {
        if (this.field_ax.method_k1(4)) {
            int var1 = 2 * this.field_ax.field_U[3] / 100;
            var1 = Math.max(var1, 0);
            short[] var10000 = this.field_ax.field_U;
            var10000[2] = (short)(var10000[2] - var1);
        }

        if (this.field_ax.method_k1(5)) {
            int var7 = this.field_ax.field_U[5] / 10;
            short[] var11 = this.field_ax.field_U;
            var11[4] = (short)(var11[4] + var7);
            if (this.field_ax.field_U[4] >= this.field_ax.field_U[5]) {
                this.field_ax.field_U[4] = 0;
                int var2 = this.field_ax.field_U[5] / 10;
                var11 = this.field_ax.field_U;
                var11[2] = (short)(var11[2] - var2);
            }
        }

        for(int var8 = 0; var8 < 25; ++var8) {
            if (this.field_ax.field_G[var8] > 0) {
                --this.field_ax.field_G[var8];
                if (this.field_ax.field_G[var8] <= 0) {
                    this.field_ax.field_G[var8] = 0;
                    if (var8 == 5) {
                        System.out.println("Removing daedric weapon!");
                        int var9 = this.field_ax.method_o(109);
                        System.out.println("Removing daedric weapon!: index is " + var9);
                        this.field_ax.method_y1(var9);
                    }
                }
            }
        }

        Hashtable var10 = ESGame.field_G[this.field_ax.field_j - 1];
        if (var10 != null) {
            Enumeration var3 = var10.elements();

            while(var3.hasMoreElements()) {
                byte[] var4 = (byte[])var3.nextElement();
                class_d var5 = class_d.method_a(var4);
                if (var5.field_c[6] != 0) {
                    --var5.field_c[7];
                    if (var5.field_c[7] < 0) {
                        var5.field_c[7] = 0;
                        var5.field_c[6] = 0;
                    }
                }
            }

        }
    }

    private boolean method_d4() {
        if (ESPersonality.method_a7(this.field_ax)) {
            return true;
        } else if (field_j == null) {
            return false;
        } else if (this.field_ax.field_j == 37 && field_j.field_l == 41) {
            int var1 = Math.abs(this.field_ax.field_l - field_j.field_o);
            int var2 = Math.abs(this.field_ax.field_k - field_j.field_m);
            return var1 + var2 == 1;
        } else {
            return false;
        }
    }

    private void method_a18(Graphics var1, class_g var2, int var3, int var4) {
        DirectGraphics var5 = DirectUtils.getDirectGraphics(var1);
        var5.drawPixels(var2.field_g, true, 0, var2.field_h, var3, var4, var2.field_e, var2.field_a, 0, 4444);
    }
}
