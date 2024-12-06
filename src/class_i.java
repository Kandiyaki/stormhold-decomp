//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import java.io.DataInputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

public class class_i {
    static String[][] field_c;
    static final int[][] field_l = new int[][]{{1, 2, 1, 3}, {6, 7, 8, 6}, {1, 2, 3, 1}, {6, 7, 8, 7}, {3, 4, 11, 12}, {8, 9, 11, 12}, {3, 4, 12, 13}, {8, 9, 12, 13}, {4, 5, 12, 13}, {9, 10, 12, 13}, {4, 5, 13, 14}, {9, 10, 13, 14}, {12, 13, 4, 5}, {12, 13, 9, 10}, {13, 14, 15, 16}, {14, 15, 16, 17}, {15, 16, 17, 18}, {16, 17, 18, 21}, {17, 18, 19, 26}, {18, 19, 20, 21}, {19, 20, 26, 27}, {21, 22, 26, 27}, {21, 22, 27, 28}, {22, 23, 27, 28}, {22, 23, 28, 29}, {23, 24, 28, 29}, {23, 24, 29, 30}, {24, 25, 29, 30}, {26, 27, 28, 31}, {27, 28, 31, 32}, {28, 29, 32, 33}, {29, 30, 33, 34}, {31, 32, 34, 35}, {32, 33, 36, 37}, {34, 35, 37, 38}, {38, 39, 40, 35}, {38, 39, 40, 35}};
    static final byte[] field_q = new byte[]{1, 5, 9, 13, 14, 15, 22, 23, 24, 2, 6, 10, 19, 20, 21, 31, 32, 33, 3, 7, 11, 16, 17, 18, 28, 29, 30, 4, 8, 12, 25, 26, 27, 34, 35, 36};
    static final int[] field_n = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 1, 1, 3, 1, 3, 3, 1, 3, 3, 3, 3, 5, 3, 5, 5, 3, 5, 5, 5, 5, 5, 5, 5, 5};
    byte field_o;
    byte field_a;
    short field_g;
    short field_y;
    byte[][] field_w;
    short[] field_f;
    short[] field_d;
    short field_p;
    short field_i;
    short field_r;
    short field_b;
    short field_s;
    short field_v;
    boolean field_k;
    Vector field_m;
    Vector field_j;
    Vector field_t;
    Random field_e;
    byte[] field_x;
    int[] field_u;
    boolean field_h;

    public class_i() {
        this.field_k = false;
        this.field_u = new int[2];
        this.field_h = false;
    }

    public class_i(byte var1, byte[] var2) {
        this();
        this.field_o = var1;
        this.method_i();
        this.field_g = 35;
        this.field_y = 35;
        this.field_f = new short[2];
        this.field_d = new short[6];
        this.field_x = var2;
        this.field_s = (short)this.field_x[4];
        this.field_v = (short)this.field_x[5];
    }

    public class_i(byte var1, byte[] var2, int var3, int var4, byte[][] var5) {
        this();
        this.field_o = var1;
        this.method_i();
        this.field_g = (short)var3;
        this.field_y = (short)var4;
        this.field_w = var5;
        this.field_f = new short[2];
        this.field_d = new short[6];
        this.field_x = var2;
        this.field_s = (short)this.field_x[4];
        this.field_v = (short)this.field_x[5];
        int var6 = 6;
        if (class_k.field_d) {
            ++var6;
        }

        for(int var7 = 0; var7 < var6; ++var7) {
            byte[] var10000 = this.field_w[class_k.field_j[var7]];
            byte var10001 = class_k.field_i[var7];
            var10000[var10001] = (byte)(var10000[var10001] | 32);
        }

        this.field_k = true;
    }

    void method_i() {
        this.field_a = 1;
        if (this.field_o >= 2 && this.field_o <= 37) {
            this.field_a = field_q[this.field_o - 2];
        }

    }

    void method_c() {
        int var1 = this.field_t.size();
        short var2 = (short)(this.field_o << 8);
        Object var3 = null;

        for(int var4 = 0; var4 < var1; ++var4) {
            short[] var5 = (short[])this.field_t.elementAt(var4);
            class_d var6;
            if (this.field_o == 37 && var4 == var1 - 1) {
                var6 = class_d.method_a11(this.field_e, this, 41);
            } else {
                var6 = class_d.method_a11(this.field_e, this, -1);
            }

            this.method_a(var6, var5);
            var6.method_d();
        }

        System.gc();
    }

    void method_a(class_d var1, short[] var2) {
        var1.field_o = (byte)var2[4];
        var1.field_m = (byte)var2[5];
        byte[] var10000 = this.field_w[var1.field_o];
        byte var10001 = var1.field_m;
        var10000[var10001] = (byte)(var10000[var10001] | 2);
    }

    void method_c1(int var1) {
        int var2 = this.field_t.size();
        boolean var3 = false;

        for(int var4 = 0; var4 < var1; ++var4) {
            class_d var6;
            short var10;
            short var11;
            do {
                int var5 = Math.abs(this.field_e.nextInt() % var2);
                var6 = class_d.method_a10(this);
                short[] var7 = (short[])this.field_t.elementAt(var5);
                short var8 = (short)(var7[2] - var7[0] + 1);
                short var9 = (short)(var7[3] - var7[1] + 1);
                var10 = (short)(var7[0] + Math.abs(this.field_e.nextInt() % var8));
                var11 = (short)(var7[1] + Math.abs(this.field_e.nextInt() % var9));
            } while(!this.method_d2(var10, var11));

            var6.field_o = (byte)var10;
            var6.field_m = (byte)var11;
            this.field_w[var6.field_o][var6.field_m] = class_f.method_b2((byte)2, this.field_w[var6.field_o][var6.field_m]);
            var6.method_d();
        }

    }

    void method_a1(class_j var1) {
        if (this.field_o != 1) {
            class_d var2 = class_d.method_a10(this);
            byte var3 = var1.field_l;
            byte var4 = var1.field_k;
            boolean var5 = true;

            for(int var6 = 0; var6 <= 4; ++var6) {
                int var7 = var3;
                int var8 = var4;
                if (var6 < 2) {
                    var7 = var3 + (2 * var6 - 1);
                } else {
                    var8 = var4 + (2 * var6 - 5);
                }

                if (this.method_d2(var7, var8)) {
                    var2.field_o = (byte)var7;
                    var2.field_m = (byte)var8;
                    var2.method_d();
                    this.field_w[var2.field_o][var2.field_m] = class_f.method_b2((byte)2, this.field_w[var2.field_o][var2.field_m]);
                    break;
                }
            }

        }
    }

    static int method_a2(int var0, int var1, boolean var2) {
        if (var2) {
            if (var0 < var1) {
                return -1;
            } else {
                return var0 > var1 ? 1 : 0;
            }
        } else if (var0 > var1) {
            return -1;
        } else {
            return var0 < var1 ? 1 : 0;
        }
    }

    int[] method_b(int var1) {
        int var2 = this.field_t.size();
        int[] var3 = new int[var2];
        int[] var4 = new int[var2];

        for(int var5 = 0; var5 < var2; ++var5) {
            var3[var5] = var5;
            int var6 = class_f.method_a3(this.field_e, 1000);
            var4[var5] = var6;
        }

        for(int var10 = 1; var10 < var2; ++var10) {
            int var7 = var4[var10];
            int var8 = var3[var10];

            int var9;
            for(var9 = var10 - 1; var9 >= 0 && method_a2(var4[var9], var7, false) > 0; --var9) {
                var4[var9 + 1] = var4[var9];
                var3[var9 + 1] = var3[var9];
            }

            var4[var9 + 1] = var7;
            var3[var9 + 1] = var8;
        }

        int[] var11 = new int[var1];

        for(int var12 = 0; var12 < var1; ++var12) {
            var11[var12] = var3[var12];
        }

        return var11;
    }

    void method_j() {
        int var1 = 0;
        int[] var2 = this.method_b(5);
        int var3 = field_n[this.field_a - 1];
        boolean var4 = true;

        for(int var5 = 0; var5 < 5; ++var5) {
            int var6 = var2[var5];
            short[] var7 = (short[])this.field_t.elementAt(var6);
            boolean var8 = false;
            if (var4) {
                var1 = class_a.method_a3(this.field_e, var3);
                var4 = false;
            } else {
                var1 = class_a.method_a4(this.field_e, this.field_a, 2);
            }

            short var9 = (short)(var7[2] - var7[0] + 1);
            short var10 = (short)(var7[3] - var7[1] + 1);
            short var11 = (short)(var7[0] + Math.abs(this.field_e.nextInt() % var9));

            short var12;
            for(var12 = (short)(var7[1] + Math.abs(this.field_e.nextInt() % var10)); (this.field_w[var11][var12] & 8) != 0; var12 = (short)(var7[1] + Math.abs(this.field_e.nextInt() % var10))) {
                var11 = (short)(var7[0] + Math.abs(this.field_e.nextInt() % var9));
            }

            byte[] var13 = new byte[8];
            var13[0] = (byte)var11;
            var13[1] = (byte)var12;
            var13[2] = (byte)(var4 ? 1 : 0);
            byte var14 = (byte)(Math.abs(this.field_e.nextInt() % 3) << 6);
            var13[3] = (byte)(var14 | this.field_a);
            byte var15 = (byte)(var1 & 255);
            byte var16 = 0;
            if (var15 == 86) {
                var16 = (byte)(var1 >>> 8 & 255);
            }

            var13[4] = var15;
            var13[7] = var16;
            short var17 = class_a.method_a();
            var15 = (byte)(var17 >>> 8 & 255);
            var16 = (byte)(var17 & 255);
            var13[5] = var15;
            var13[6] = var16;
            this.method_a3(var13);
        }

    }

    void method_a3(byte[] var1) {
        byte var2 = var1[0];
        byte var3 = var1[1];
        ESGame.field_S[this.field_o - 1].put(class_f.method_b1(var2, var3), var1);
        byte[] var10000 = this.field_w[var2];
        var10000[var3] = (byte)(var10000[var3] | 16);
    }

    void method_c2(byte[] var1) {
        byte var2 = var1[0];
        byte var3 = var1[1];
        ESGame.field_au[this.field_o - 1].addElement(var1);
        byte[] var10000 = this.field_w[var2];
        var10000[var3] = (byte)(var10000[var3] | 4);
    }

    public void method_b1() {
        long var1 = (long)(this.field_o * 5000);
        this.field_w = new byte[this.field_g][this.field_y];
        short var3 = (short)this.field_x[4];
        short var4 = (short)this.field_x[5];
        this.field_t = new Vector();
        this.method_a4(var1, var3, var4);
    }

    void method_e() {
        this.method_c();
        this.method_j();
    }

    void method_h() {
        boolean var1 = false;
        Hashtable var2 = ESGame.field_G[this.field_o - 1];
        if (var2 != null) {
            byte[] var10000;
            byte var10001;
            for(Enumeration var3 = var2.elements(); var3.hasMoreElements(); var10000[var10001] = (byte)(var10000[var10001] | 2)) {
                byte[] var4 = (byte[])var3.nextElement();
                class_d var5 = class_d.method_a(var4);
                var10000 = this.field_w[var5.field_o];
                var10001 = var5.field_m;
            }

            System.gc();
        }

        var1 = false;
        var2 = ESGame.field_S[this.field_o - 1];
        byte[] var11;
        byte[] var15;
        if (var2 != null) {
            for(Enumeration var9 = var2.elements(); var9.hasMoreElements(); var15[var11[1]] = (byte)(var15[var11[1]] | 16)) {
                var11 = (byte[])var9.nextElement();
                var15 = this.field_w[var11[0]];
            }
        }

        var1 = false;

        for(Enumeration var10 = ESGame.field_au[this.field_o - 1].elements(); var10.hasMoreElements(); var15[var11[1]] = (byte)(var15[var11[1]] | 4)) {
            var11 = (byte[])var10.nextElement();
            var15 = this.field_w[var11[0]];
        }

        if (this.field_o == 1 && class_k.field_d) {
            byte var13 = class_k.field_j[6];
            byte var14 = class_k.field_i[6];
            var15 = this.field_w[var13];
            var15[var14] = (byte)(var15[var14] | 32);
        }

    }

    boolean method_b2(short var1) {
        switch (var1) {
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            default:
                return false;
        }
    }

    public void method_a4(long var1, short var3, short var4) {
        this.field_s = var3;
        this.field_v = var4;
        int var5 = -1;
        this.field_e = new Random(var1);

        for(int var6 = 0; var6 < 35; ++var6) {
            for(int var7 = 0; var7 < 35; ++var7) {
                this.field_w[var6][var7] = 1;
            }
        }

        this.field_m = new Vector();
        this.field_j = new Vector();
        this.field_p = 3;
        this.field_b = 3;
        this.field_i = 31;
        this.field_r = 31;
        if (this.method_b2(var3)) {
            var5 = this.method_a6(var3);
            if (var5 >= 0) {
                this.method_d1(var5);
            }
        }

        if (this.method_b2(var4)) {
            var5 = this.method_a6(var4);
            if (var5 >= 0) {
                this.method_d1(var5);
            }
        }

        boolean var18 = false;
        int var8 = 0;

        while(var8 < 15) {
            this.field_d = this.method_f();
            if (this.method_a5(this.field_d)) {
                ++var8;
                int var9 = this.method_a8(this.field_d[4], this.field_d[5]);
                this.method_d1(var9);
                if (var8 >= 2 && !var18) {
                    short var10 = this.field_d[4];
                    short var11 = this.field_d[5];
                    short var12 = (short)(this.field_d[2] - this.field_d[0] + 1);
                    short var13 = (short)(this.field_d[3] - this.field_d[1] + 1);
                    if (var12 >= 3 && var13 >= 3) {
                        short var14 = (short)(this.field_d[0] + var12 / 2);
                        short var15 = (short)(this.field_d[1] + var13 / 2);
                        if (var14 != var10 || var15 != var11) {
                            byte[] var10000 = this.field_w[var14];
                            var10000[var15] = (byte)(var10000[var15] | 8);
                            var18 = true;
                        }
                    }
                }
            }
        }

        this.method_d();
    }

    private short[] method_f() {
        byte var1 = 4;
        int var2 = 2 + Math.abs(this.field_e.nextInt()) % var1;
        int var3 = 2 + Math.abs(this.field_e.nextInt()) % var1;
        int var4 = this.field_i - this.field_b + 1 - (var2 - 1);
        int var5 = this.field_r - this.field_p + 1 - (var3 - 1);
        this.field_d[0] = (short)(this.field_b + Math.abs(this.field_e.nextInt()) % var4);
        this.field_d[1] = (short)(this.field_p + Math.abs(this.field_e.nextInt()) % var5);
        this.field_d[2] = (short)(this.field_d[0] + (var2 - 1));
        this.field_d[3] = (short)(this.field_d[1] + (var3 - 1));
        this.field_d[4] = (short)(this.field_d[0] + Math.abs(this.field_e.nextInt()) % var2);
        this.field_d[5] = (short)(this.field_d[1] + Math.abs(this.field_e.nextInt()) % var3);
        return this.field_d;
    }

    private boolean method_a5(short[] var1) {
        int var2 = var1[0] - 1 >= 0 ? var1[0] - 1 : 0;
        int var3 = var1[2] + 1 <= 34 ? var1[2] + 1 : 34;
        int var4 = var1[1] - 1 >= 0 ? var1[1] - 1 : 0;
        int var5 = var1[3] + 1 <= 34 ? var1[3] + 1 : 34;

        for(int var6 = var2; var6 <= var3; ++var6) {
            for(int var7 = var4; var7 <= var5; ++var7) {
                if (this.field_w[var6][var7] == 0) {
                    return false;
                }
            }
        }

        this.method_a7(var1[0], (short)(var1[2] - var1[0] + 1), var1[1], (short)(var1[3] - var1[1] + 1));
        if (var1[2] != var1[0] && var1[3] != var1[1]) {
            short[] var9 = new short[6];

            for(int var8 = 0; var8 < 6; ++var8) {
                var9[var8] = var1[var8];
            }

            this.field_t.addElement(var9);
        }

        return true;
    }

    private void method_d() {
        Object var1 = null;
        int var2 = this.field_m.size();

        for(int var3 = 0; var3 < var2; ++var3) {
            Integer var4 = (Integer)this.field_m.elementAt(var3);
            int var5 = this.field_j.size();
            int var6 = Integer.MAX_VALUE;
            Integer var7 = null;
            int var8 = -1;

            for(int var9 = 0; var9 < var5; ++var9) {
                Integer var10 = (Integer)this.field_j.elementAt(var9);
                if (!var10.equals(var4)) {
                    int var11 = this.method_g(var4, var10);
                    if (var11 < var6) {
                        var6 = var11;
                        var7 = var10;
                    }
                } else {
                    var8 = var9;
                }
            }

            if (var7 != null) {
                this.method_h1(var4, var7);
            }

            if (var8 != -1) {
                this.field_j.removeElementAt(var8);
            }
        }

    }

    private int method_a6(short var1) {
        int var2 = -1;
        if (var1 == 1) {
            this.method_a7(17, 1, 0, 5);
            var2 = this.method_a8((short)17, (short)4);
        } else if (var1 == 3) {
            this.method_a7(17, 1, 30, 5);
            var2 = this.method_a8((short)17, (short)30);
        } else if (var1 == 4) {
            this.method_a7(0, 5, 17, 1);
            var2 = this.method_a8((short)4, (short)17);
        } else if (var1 == 2) {
            this.method_a7(30, 5, 17, 1);
            var2 = this.method_a8((short)30, (short)17);
        }

        return var2;
    }

    private void method_h1(int var1, int var2) {
        short[] var3 = this.method_a9(var1);
        short var4 = var3[0];
        short var5 = var3[1];
        var3 = this.method_a9(var2);
        short var6 = var3[0];
        short var7 = var3[1];
        int var8 = Math.abs(this.field_e.nextInt() % 2);
        if (var8 == 0) {
            if (var6 > var4) {
                this.method_a7(var4, var6 - var4 + 1, var5, 1);
            } else {
                this.method_a7(var6, var4 - var6 + 1, var5, 1);
            }

            if (var7 > var5) {
                this.method_a7(var6, 1, var5, var7 - var5 + 1);
            } else {
                this.method_a7(var6, 1, var7, var5 - var7 + 1);
            }
        } else {
            if (var7 > var5) {
                this.method_a7(var4, 1, var5, var7 - var5 + 1);
            } else {
                this.method_a7(var4, 1, var7, var5 - var7 + 1);
            }

            if (var6 > var4) {
                this.method_a7(var4, var6 - var4 + 1, var7, 1);
            } else {
                this.method_a7(var6, var4 - var6 + 1, var7, 1);
            }
        }

    }

    private void method_a7(int var1, int var2, int var3, int var4) {
        for(int var5 = var1; var5 < var1 + var2; ++var5) {
            for(int var6 = var3; var6 < var3 + var4; ++var6) {
                if (this.field_w[var5][var6] != 8) {
                    this.field_w[var5][var6] = 0;
                }
            }
        }

    }

    private int method_a8(short var1, short var2) {
        return var1 << 16 | var2;
    }

    private short[] method_a9(int var1) {
        this.field_f[0] = (short)((-65536 & var1) >>> 16);
        this.field_f[1] = (short)('\uffff' & var1);
        return this.field_f;
    }

    private void method_d1(int var1) {
        Integer var2 = new Integer(var1);
        this.field_m.addElement(var2);
        this.field_j.addElement(var2);
    }

    private int method_g(int var1, int var2) {
        short[] var3 = this.method_a9(var1);
        short var4 = var3[0];
        short var5 = var3[1];
        short[] var6 = this.method_a9(var2);
        short var7 = var6[0];
        short var8 = var6[1];
        return (var7 - var4) * (var7 - var4) + (var8 - var5) * (var8 - var5);
    }

    boolean method_d2(int var1, int var2) {
        byte var3 = this.field_w[var1][var2];
        if (class_f.method_a8((byte)1, var3)) {
            return false;
        } else if (class_f.method_a8((byte)2, var3)) {
            return false;
        } else if (class_f.method_a8((byte)8, var3)) {
            return false;
        } else {
            return !class_f.method_a8((byte)32, var3);
        }
    }

    class_d method_c3(int var1, int var2) {
        byte var3 = this.field_w[var1][var2];
        if (class_f.method_a8((byte)1, var3)) {
            return null;
        } else if (!class_f.method_a8((byte)2, var3)) {
            return null;
        } else {
            Enumeration var4 = ESGame.field_G[this.field_o - 1].elements();

            while(var4.hasMoreElements()) {
                byte[] var5 = (byte[])var4.nextElement();
                class_d var6 = class_d.method_a(var5);
                if (var6.field_o == var1 && var6.field_m == var2) {
                    return var6;
                }
            }

            return null;
        }
    }

    void method_b3(byte[] var1) {
        byte var2 = var1[0];
        byte var3 = var1[1];
        byte var4 = this.field_w[var2][var3];
        if (!class_f.method_a8((byte)1, var4)) {
            if (class_f.method_a8((byte)16, var4)) {
                ESGame.field_S[this.field_o - 1].remove(class_f.method_b1(var2, var3));
                this.field_w[var2][var3] = class_f.method_c1((byte)16, this.field_w[var2][var3]);
            }
        }
    }

    void method_d3(byte[] var1) {
        byte var2 = var1[0];
        byte var3 = var1[1];
        byte var4 = this.field_w[var2][var3];
        if (!class_f.method_a8((byte)1, var4)) {
            if (class_f.method_a8((byte)4, var4)) {
                ESGame.field_au[this.field_o - 1].removeElement(var1);
                if (this.method_f1(var2, var3) == 0) {
                    this.field_w[var2][var3] = class_f.method_c1((byte)4, this.field_w[var2][var3]);
                }

            }
        }
    }

    int method_f1(int var1, int var2) {
        int var3 = 0;
        Enumeration var4 = ESGame.field_au[this.field_o - 1].elements();

        while(var4.hasMoreElements()) {
            byte[] var5 = (byte[])var4.nextElement();
            if (var5[0] == var1 && var5[1] == var2) {
                ++var3;
            }
        }

        return var3;
    }

    byte[] method_e1(int var1, int var2) {
        Enumeration var3 = ESGame.field_au[this.field_o - 1].elements();

        while(var3.hasMoreElements()) {
            byte[] var4 = (byte[])var3.nextElement();
            if (var4[0] == var1 && var4[1] == var2) {
                return var4;
            }
        }

        return null;
    }

    Vector method_b4(int var1, int var2) {
        Vector var3 = new Vector(5);
        Enumeration var4 = ESGame.field_au[this.field_o - 1].elements();

        while(var4.hasMoreElements()) {
            byte[] var5 = (byte[])var4.nextElement();
            if (var5[0] == var1 && var5[1] == var2) {
                var3.addElement(var5);
            }
        }

        return var3;
    }

    void method_b5(int var1, int var2, int var3, byte[][] var4) {
        if (var3 != 1 && var3 != 3) {
            if (var3 == 2 || var3 == 4) {
                byte var12 = 0;
                if (var3 == 2) {
                    var12 = 1;
                } else {
                    var12 = -1;
                }

                var4[0][0] = this.method_i1(var1, var2 - var12);
                var4[1][0] = 0;
                var4[2][0] = this.method_i1(var1, var2 + var12);
                int var17 = var1 + var12;

                for(int var21 = 0; var21 < 5; ++var21) {
                    var4[var21][1] = this.method_i1(var17, var2 + (var21 - 2) * var12);
                }

                var17 = var1 + 2 * var12;

                for(int var22 = 0; var22 < 7; ++var22) {
                    var4[var22][2] = this.method_i1(var17, var2 + (var22 - 3) * var12);
                }

                var17 = var1 + 3 * var12;

                for(int var23 = 0; var23 < 9; ++var23) {
                    var4[var23][3] = this.method_i1(var17, var2 + (var23 - 4) * var12);
                }

                var17 = var1 + 4 * var12;

                for(int var24 = 0; var24 < 9; ++var24) {
                    var4[var24][4] = this.method_i1(var17, var2 + (var24 - 4) * var12);
                }
            }
        } else {
            byte var5 = 0;
            if (var3 == 1) {
                var5 = 1;
            } else {
                var5 = -1;
            }

            var4[0][0] = this.method_i1(var1 - var5, var2);
            var4[1][0] = this.method_i1(var1, var2);
            var4[2][0] = this.method_i1(var1 + var5, var2);
            int var6 = var2 - var5;

            for(int var7 = 0; var7 < 5; ++var7) {
                var4[var7][1] = this.method_i1(var1 + (var7 - 2) * var5, var6);
            }

            var6 = var2 - 2 * var5;

            for(int var8 = 0; var8 < 7; ++var8) {
                var4[var8][2] = this.method_i1(var1 + (var8 - 3) * var5, var6);
            }

            var6 = var2 - 3 * var5;

            for(int var9 = 0; var9 < 9; ++var9) {
                var4[var9][3] = this.method_i1(var1 + (var9 - 4) * var5, var6);
            }

            var6 = var2 - 4 * var5;

            for(int var10 = 0; var10 < 9; ++var10) {
                var4[var10][4] = this.method_i1(var1 + (var10 - 4) * var5, var6);
            }
        }

    }

    void method_c4(int var1, int var2, int var3, byte[][] var4) {
        this.method_a11(var1, var2, var3, 7, var4);
    }

    void method_a10(int var1, int var2, int var3, byte[][] var4) {
        this.method_a11(var1, var2, var3, 17, var4);
    }

    void method_a11(int var1, int var2, int var3, int var4, byte[][] var5) {
        int var6 = var4 / 2;
        if (var3 != 1 && var3 != 3) {
            if (var3 == 2 || var3 == 4) {
                byte var17 = 0;
                if (var3 == 2) {
                    var17 = 1;
                } else {
                    var17 = -1;
                }

                for(int var19 = 0; var19 < var4; ++var19) {
                    for(int var22 = 0; var22 < var4; ++var22) {
                        var5[var22][var19] = (byte)(this.method_i1(var1 - (var19 - var6) * var17, var2 + (var22 - var6) * var17) & 1);
                        if ((var5[var22][var19] & 1) == 0) {
                            var5[var22][var19] = (byte)(this.method_i1(var1 - (var19 - var6) * var17, var2 + (var22 - var6) * var17) & 8);
                        }
                    }
                }

                if (this.field_o > 1) {
                    Enumeration var23 = ESGame.field_G[this.field_o - 1].elements();

                    while(var23.hasMoreElements()) {
                        byte[] var27 = (byte[])var23.nextElement();
                        class_d var33 = class_d.method_a(var27);
                        int var40 = var17 * (var33.field_m - var2) + var6;
                        int var46 = var6 - var17 * (var33.field_o - var1);
                        if (var40 >= 0 && var40 < var4 && var46 >= 0 && var46 < var4 && var33.field_i) {
                            var5[var40][var46] = (byte)(var5[var40][var46] | 2);
                        }
                    }

                    Enumeration var28 = ESGame.field_S[this.field_o - 1].elements();

                    while(var28.hasMoreElements()) {
                        byte[] var34 = (byte[])var28.nextElement();
                        int var41 = var17 * (var34[1] - var2) + var6;
                        int var47 = var6 - var17 * (var34[0] - var1);
                        boolean var50 = true;
                        if (var41 >= 0 && var41 < var4 && var47 >= 0 && var47 < var4 && var50) {
                            var5[var41][var47] = (byte)(var5[var41][var47] | 4);
                        }
                    }

                    Enumeration var35 = ESGame.field_au[this.field_o - 1].elements();

                    while(var35.hasMoreElements()) {
                        byte[] var42 = (byte[])var35.nextElement();
                        int var48 = var17 * (var42[1] - var2) + var6;
                        int var51 = var6 - var17 * (var42[0] - var1);
                        boolean var52 = (var42[6] & 1) != 0;
                        if (var48 >= 0 && var48 < var4 && var51 >= 0 && var51 < var4 && var52) {
                            var5[var48][var51] = (byte)(var5[var48][var51] | 4);
                        }
                    }
                } else {
                    for(int var24 = 0; var24 < 7 && (var24 != 6 || class_k.field_d); ++var24) {
                        if (class_k.field_b[var24]) {
                            int var29 = var17 * (class_k.field_i[var24] - var2) + var6;
                            int var36 = var6 - var17 * (class_k.field_j[var24] - var1);
                            boolean var43 = true;
                            if (var29 >= 0 && var29 < var4 && var36 >= 0 && var36 < var4 && var43) {
                                var5[var29][var36] = (byte)(var5[var29][var36] | 4);
                            }
                        }
                    }
                }
            }
        } else {
            byte var7 = 0;
            if (var3 == 1) {
                var7 = 1;
            } else {
                var7 = -1;
            }

            for(int var8 = 0; var8 < var4; ++var8) {
                for(int var9 = 0; var9 < var4; ++var9) {
                    var5[var9][var8] = (byte)(this.method_i1(var1 + (var9 - var6) * var7, var2 + (var8 - var6) * var7) & 1);
                    if ((var5[var9][var8] & 1) == 0) {
                        var5[var9][var8] = (byte)(this.method_i1(var1 + (var9 - var6) * var7, var2 + (var8 - var6) * var7) & 8);
                    }
                }
            }

            if (this.field_o > 1) {
                Enumeration var20 = ESGame.field_G[this.field_o - 1].elements();

                while(var20.hasMoreElements()) {
                    byte[] var10 = (byte[])var20.nextElement();
                    class_d var11 = class_d.method_a(var10);
                    int var12 = var7 * (var11.field_o - var1) + var6;
                    int var13 = var7 * (var11.field_m - var2) + var6;
                    if (var12 >= 0 && var12 < var4 && var13 >= 0 && var13 < var4 && var11.field_i) {
                        var5[var12][var13] = (byte)(var5[var12][var13] | 2);
                    }
                }

                Enumeration var25 = ESGame.field_S[this.field_o - 1].elements();

                while(var25.hasMoreElements()) {
                    byte[] var30 = (byte[])var25.nextElement();
                    int var37 = var7 * (var30[0] - var1) + var6;
                    int var44 = var7 * (var30[1] - var2) + var6;
                    boolean var14 = true;
                    if (var37 >= 0 && var37 < var4 && var44 >= 0 && var44 < var4 && var14) {
                        var5[var37][var44] = (byte)(var5[var37][var44] | 4);
                    }
                }

                Enumeration var31 = ESGame.field_au[this.field_o - 1].elements();

                while(var31.hasMoreElements()) {
                    byte[] var38 = (byte[])var31.nextElement();
                    int var45 = var7 * (var38[0] - var1) + var6;
                    int var49 = var7 * (var38[1] - var2) + var6;
                    boolean var15 = (var38[6] & 1) != 0;
                    if (var45 >= 0 && var45 < var4 && var49 >= 0 && var49 < var4 && var15) {
                        var5[var45][var49] = (byte)(var5[var45][var49] | 4);
                    }
                }
            } else {
                for(int var21 = 0; var21 < 7 && (var21 != 6 || class_k.field_d); ++var21) {
                    if (class_k.field_b[var21]) {
                        int var26 = var7 * (class_k.field_j[var21] - var1) + var6;
                        int var32 = var7 * (class_k.field_i[var21] - var2) + var6;
                        boolean var39 = true;
                        if (var26 >= 0 && var26 < var4 && var32 >= 0 && var32 < var4 && var39) {
                            var5[var26][var32] = (byte)(var5[var26][var32] | 4);
                        }
                    }
                }
            }
        }

    }

    int[] method_a12(int var1, int var2, int var3, int var4, int var5) {
        int var6 = 0;
        int var7 = 0;
        if (var3 != 1 && var3 != 3) {
            if (var3 == 2 || var3 == 4) {
                byte var10 = 0;
                if (var3 == 2) {
                    var10 = 1;
                } else {
                    var10 = -1;
                }

                var6 = var10 * (var5 - var2) + 3;
                var7 = 3 - var10 * (var4 - var1);
            }
        } else {
            byte var8 = 0;
            if (var3 == 1) {
                var8 = 1;
            } else {
                var8 = -1;
            }

            var6 = var8 * (var4 - var1) + 3;
            var7 = var8 * (var5 - var2) + 3;
        }

        this.field_u[0] = var6;
        this.field_u[1] = var7;
        return this.field_u;
    }

    byte method_i1(int var1, int var2) {
        int var3 = var1;
        int var4 = var2;
        byte var5 = this.field_o;
        class_i var6 = null;
        if (var1 < 0) {
            var5 = this.field_x[3];
            if (var5 <= 0) {
                return 1;
            }

            var6 = ESGame.field_u[var5 - 1];
            if (var5 != 1 && this.field_o != 1) {
                var3 = (byte)(var6.field_g - 1);
            } else {
                var3 = (byte)(var6.field_g - 1);
                var4 = (byte)(var2 + (var6.field_y - this.field_y) / 2);
            }
        } else if (var1 >= this.field_g) {
            var5 = this.field_x[1];
            if (var5 <= 0) {
                return 1;
            }

            var6 = ESGame.field_u[var5 - 1];
            if (var5 != 1 && this.field_o != 1) {
                var3 = 0;
            } else {
                var3 = 0;
                var4 = (byte)(var2 + (var6.field_y - this.field_y) / 2);
            }
        } else if (var2 < 0) {
            var5 = this.field_x[0];
            if (var5 <= 0) {
                return 1;
            }

            var6 = ESGame.field_u[var5 - 1];
            if (var5 != 1 && this.field_o != 1) {
                var4 = (byte)(var6.field_y - 1);
            } else {
                var3 = (byte)(var1 + (var6.field_g - this.field_g) / 2);
                var4 = (byte)(var6.field_y - 1);
            }
        } else if (var2 >= this.field_y) {
            var5 = this.field_x[2];
            if (var5 <= 0) {
                return 1;
            }

            var6 = ESGame.field_u[var5 - 1];
            if (var5 != 1 && this.field_o != 1) {
                var4 = 0;
            } else {
                var3 = (byte)(var1 + (var6.field_g - this.field_g) / 2);
                var4 = 0;
            }
        }

        if (var5 != this.field_o) {
            if (var3 >= 0 && var3 < var6.field_g) {
                if (var4 >= 0 && var4 < var6.field_y) {
                    return var6.field_k ? var6.field_w[var3][var4] : 1;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        } else {
            return this.field_w[var1][var2];
        }
    }

    byte method_a13(int var1, int var2, byte[][] var3) {
        return var2 < 4 ? var3[var1 + var2 + 1][var2] : var3[var1 + var2][var2];
    }

    String[] method_a14() {
        return field_c[this.field_o - 1];
    }

    static void method_g1() throws Exception {
        DataInputStream var0 = class_f.method_a1("/dungnamesin.dat");
        field_c = new String[37][2];

        for(int var1 = 0; var1 < 37; ++var1) {
            for(int var2 = 0; var2 < 2; ++var2) {
                field_c[var1][var2] = var0.readUTF();
            }
        }

    }

    void method_a15(int var1, int var2) {
        int var3 = Math.max(var1 - 4, 0);
        int var4 = Math.min(var1 + 4, this.field_g - 1);
        int var5 = Math.max(var2 - 4, 0);
        int var6 = Math.min(var2 + 4, this.field_y - 1);

        for(int var7 = var3; var7 <= var4; ++var7) {
            for(int var8 = var5; var8 <= var6; ++var8) {
                byte var9 = this.field_w[var7][var8];
                if (!class_f.method_a8((byte)1, var9)) {
                    this.field_w[var7][var8] = class_f.method_c1((byte)2, var9);
                }
            }
        }

        Hashtable var13 = ESGame.field_G[this.field_o - 1];
        if (var13 != null) {
            Enumeration var14 = var13.elements();

            while(var14.hasMoreElements()) {
                byte[] var10 = (byte[])var14.nextElement();
                byte var11 = var10[4];
                byte var12 = var10[5];
                if (var11 >= var3 && var11 <= var4 && var12 >= var5 && var12 <= var6) {
                    byte[] var10000 = this.field_w[var11];
                    var10000[var12] = (byte)(var10000[var12] | 2);
                }
            }
        }

    }
}
