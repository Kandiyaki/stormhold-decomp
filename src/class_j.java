//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class class_j {
    static boolean field_g = false;
    private static boolean field_D;
    static Vector field_ad = method_G();
    private static final Integer field_aj = new Integer(0);
    private static final Integer field_am = new Integer(1);
    private static final Integer field_o = new Integer(-1);
    static boolean field_S = false;
    static short field_B;
    static short field_al;
    static String[] field_K;
    static String[] field_r;
    static String[] field_E;
    static short[][] field_M;
    static String[] field_h;
    static String[] field_y;
    static short[] field_c;
    static int[][] field_ac = new int[][]{{1, 27}, {7, 27}, {7, 22}, {17, 27}, {12, 22}, {17, 27}, {12, 22}};
    private static final String[] field_af = new String[]{"Stone Blood", "Delusions", "Blind", "Vampirism", "Mana Burn", "Grievous Harm", "Terrified", "Haunted"};
    public static int field_ag = -1;
    ESGame field_ai;
    public static String field_X = null;
    String field_v;
    short field_ar;
    short field_q;
    short[] field_U;
    byte field_N;
    int field_n;
    short[] field_J;
    short field_V;
    short[] field_aq;
    short[][] field_R;
    byte field_p;
    byte[] field_H;
    int[] field_P;
    byte[] field_T;
    int field_x;
    byte field_b;
    short field_W;
    short field_Y;
    short field_m;
    byte field_A;
    short field_ah;
    short field_F;
    short field_ap;
    boolean field_f;
    byte field_j;
    byte field_l;
    byte field_k;
    byte field_ak;
    byte field_C;
    byte field_ao;
    byte field_an;
    byte field_Z;
    byte[] field_G;
    short field_t;
    short field_aa;
    boolean field_s = false;
    boolean field_L = false;
    boolean field_I = false;
    byte field_z;
    byte field_w;
    byte field_e;
    byte field_ab;
    boolean field_i;
    boolean field_Q;
    boolean field_u;
    boolean field_O;
    byte[][] field_ae;
    byte field_d;
    byte field_a;

    int method_b(boolean var1) {
        return var1 ? 400 : 200;
    }

    public class_j(ESGame var1) {
        field_g = false;
        method_u();
        this.field_v = null;
        this.field_U = new short[10];
        this.field_J = new short[16];
        this.field_aq = new short[2];
        this.field_R = new short[14][3];
        this.field_p = 0;
        this.field_H = new byte[24];
        this.field_P = new int[24];
        this.field_T = new byte[7];
        this.field_G = new byte[25];
        this.field_ae = new byte[9][5];
        this.field_ai = var1;
        this.field_Q = false;
    }

    void method_a(short[] var1) {
        var1[2] = var1[3];
        var1[4] = var1[5];
        var1[6] = var1[7];
        var1[8] = 0;
    }

    void method_c(int var1) {
        this.field_ar = (short)var1;
        this.field_q = field_M[this.field_ar][1];
        byte var2 = 8;

        for(int var3 = 0; var3 < var2; ++var3) {
            int var4 = 2 * var3;
            this.field_J[var4] = field_M[this.field_ar][2 + var3];
            this.field_J[var4 + 1] = 0;
        }

        this.field_V = field_M[this.field_ar][10];
        this.field_aq[0] = field_M[this.field_ar][11];
        this.field_aq[1] = field_M[this.field_ar][12];
        this.field_U[0] = 1;
        this.field_U[1] = 0;
        this.method_g();
        this.field_U[2] = this.field_U[3];
        this.field_U[4] = this.field_U[5];
        this.field_U[6] = this.field_U[7];
        this.field_U[8] = 0;
        this.field_U[9] = 0;
        this.field_N = 0;
        this.field_n = 0;
        int var8 = 13;

        for(int var5 = 0; var5 < 14; ++var5) {
            this.field_R[var5][0] = field_M[this.field_ar][var8++];
            this.field_R[var5][1] = field_M[this.field_ar][var8++];
            this.field_R[var5][2] = 0;
        }

        for(int var6 = 0; var6 < 24; ++var6) {
            this.field_H[var6] = 0;
            this.field_P[var6] = 0;
        }

        for(int var7 = 0; var7 < 7; ++var7) {
            this.field_T[var7] = 0;
        }

        this.field_x = this.method_A();
    }

    void method_g() {
        this.field_U[3] = (short)((this.field_J[0] + this.field_J[10]) / 2);
        this.field_U[5] = (short)(this.field_V * this.field_J[2] / 4);
        this.field_U[7] = (short)(this.field_J[0] + this.field_J[4] + this.field_J[6] + this.field_J[10]);
    }

    private int method_A() {
        int var1 = 0;
        int var2 = 13;
        byte var3 = -1;
        boolean var4 = true;

        for(int var5 = 0; var5 < 14; ++var5) {
            short var6 = field_M[this.field_ar][var2++];
            short var7 = field_M[this.field_ar][var2++];
            switch (var5) {
                case 1:
                    var3 = 0;
                    break;
                case 2:
                case 5:
                case 7:
                case 8:
                case 9:
                default:
                    var3 = -1;
                    break;
                case 3:
                    var3 = 5;
                    break;
                case 4:
                    var3 = 10;
                    break;
                case 6:
                    var3 = 15;
                    break;
                case 10:
                    var3 = 20;
            }

            if (var3 != -1 && var6 > 0) {
                var1 |= 1 << var3;
                if (var4) {
                    this.field_b = (byte)(var3 + 1);
                    var4 = false;
                }
            }
        }

        return var1;
    }

    public void method_d(int var1) {
        this.method_c1(var1, false);
    }

    public void method_c1(int var1, boolean var2) {
        if (!var2) {
            this.field_W = 0;
            this.field_Y = 0;
            this.field_m = 0;
        }

        this.field_A = 0;
        this.field_ah = 0;
        this.field_F = 0;
        this.field_ap = 0;
        this.field_f = false;
        this.method_c2(var2);
        this.method_w1();
        if (!var2) {
            this.field_C = 0;
            this.field_ao = 0;
            this.field_an = 0;
            this.field_Z = 0;
        }

        for(int var3 = 0; var3 < 25; ++var3) {
            this.field_G[var3] = 0;
        }

        this.field_t = 0;
        this.field_aa = 0;
        this.field_s = false;
        this.field_L = false;
        this.field_I = false;
        if (!var2) {
            this.method_C1();
        }

    }

    private void method_c2(boolean var1) {
        if (!var1) {
            this.field_j = this.field_ab = 1;
            this.field_l = this.field_z = 9;
            this.field_k = this.field_w = 10;
            this.field_ak = this.field_e = 1;
        } else {
            this.field_j = this.field_ab = 1;
            this.field_l = this.field_z = 12;
            this.field_k = this.field_w = 14;
            this.field_ak = this.field_e = 1;
        }

    }

    String method_m() {
        StringBuffer var1 = new StringBuffer(300);
        String var2 = " ";
        String var3 = ": ";
        var1.append(field_r[this.field_q]);
        var1.append(var2);
        var1.append(field_K[this.field_ar]);
        var1.append('\n');
        var1.append(field_h[0]);
        var1.append(var3);
        var1.append(this.field_U[0]);
        var1.append('\n');
        var1.append(field_h[2]);
        var1.append(var3);
        var1.append(this.method_n1(2));
        var1.append('\n');
        var1.append(field_h[4]);
        var1.append(var3);
        var1.append(this.method_n1(4));
        var1.append('\n');
        var1.append(field_h[6]);
        var1.append(var3);
        var1.append(this.method_n1(6));
        var1.append('\n');

        for(int var4 = 0; var4 < 8; ++var4) {
            int var5 = 2 * var4;
            var1.append(field_y[var5]);
            var1.append(var3);
            var1.append(this.field_J[var5]);
            var1.append('\n');
        }

        for(int var7 = 0; var7 < 14; ++var7) {
            if (this.field_R[var7][0] > 0) {
                var1.append(field_E[var7]);
                var1.append(var3);
                var1.append(this.field_R[var7][0]);
                var1.append('\n');
            }
        }

        String var6 = var1.toString();
        return var6;
    }

    static void method_u() {
        if (!field_S) {
            try {
                method_a1("/charin.dat");
                field_S = true;
            } catch (Exception var1) {
                System.out.println("Error: could not load character data");
                System.out.println("Exception: " + var1);
            }
        }

    }

    private static void method_a1(String var0) throws Exception {
        DataInputStream var1 = ESGame.method_a10(var0);
        int var2 = var1.available();
        field_h = method_a2(var1);
        field_y = method_a2(var1);
        field_K = method_a2(var1);
        field_B = (short)field_K.length;
        field_r = method_a2(var1);
        field_al = (short)field_K.length;
        field_E = method_a2(var1);
        short var3 = (short)field_E.length;
        if (var3 != 14) {
            throw new Exception("Error: mismatch between input number of skill types and that specified in code");
        } else {
            field_c = new short[var3];

            for(int var4 = 0; var4 < var3; ++var4) {
                field_c[var4] = var1.readShort();
            }

            int var5 = 13 + 2 * var3;
            field_M = new short[field_B][var5];

            for(int var6 = 0; var6 < field_B; ++var6) {
                for(int var7 = 0; var7 < var5; ++var7) {
                    field_M[var6][var7] = var1.readShort();
                }
            }

        }
    }

    private static String[] method_a2(DataInputStream var0) throws Exception {
        short var1 = var0.readShort();
        String[] var2 = new String[var1];

        for(int var3 = 0; var3 < var1; ++var3) {
            var2[var3] = var0.readUTF();
        }

        return var2;
    }

    static class_j method_a3(byte[] var0, boolean var1) throws Exception {
        class_j var2 = null;
        DataInputStream var3 = new DataInputStream(new ByteArrayInputStream(var0, 0, var0.length));
        var2 = new class_j((ESGame)null);
        var2.field_v = var3.readUTF();
        var2.field_ar = var3.readShort();
        if (!var1) {
            var2.method_c(var2.field_ar);
            var2.method_d(var2.field_ar);
        }

        var2.field_q = var3.readShort();

        for(int var4 = 0; var4 < 10; ++var4) {
            var2.field_U[var4] = var3.readShort();
        }

        if (var1) {
            var2.field_N = var3.readByte();
        }

        var2.field_n = var3.readInt();

        for(int var5 = 0; var5 < 16; ++var5) {
            var2.field_J[var5] = var3.readShort();
        }

        var2.field_V = var3.readShort();
        var2.field_aq[0] = var3.readShort();
        var2.field_aq[1] = var3.readShort();

        for(int var6 = 0; var6 < 14; ++var6) {
            for(int var7 = 0; var7 < 3; ++var7) {
                var2.field_R[var6][var7] = var3.readShort();
            }
        }

        if (var1) {
            var2.field_p = var3.readByte();

            for(int var11 = 0; var11 < 24; ++var11) {
                var2.field_H[var11] = var3.readByte();
            }

            for(int var8 = 0; var8 < 24; ++var8) {
                var2.field_P[var8] = var3.readInt();
            }

            for(int var9 = 0; var9 < 7; ++var9) {
                var2.field_T[var9] = var3.readByte();
            }

            var2.field_x = var3.readInt();
            var2.field_b = var3.readByte();
        } else {
            var2.field_x = var3.readInt();
        }

        if (var1) {
            var2.field_W = var3.readShort();
            var2.field_Y = var3.readShort();
            var2.field_m = var3.readShort();
            var2.field_A = var3.readByte();
            var2.field_ah = var3.readShort();
            var2.field_F = var3.readShort();
            var2.field_ap = var3.readShort();
            var2.field_f = var3.readBoolean();
            var2.field_j = var3.readByte();
            var2.field_l = var3.readByte();
            var2.field_k = var3.readByte();
            var2.field_ak = var3.readByte();
            var2.field_C = var3.readByte();
            var2.field_ao = var3.readByte();
            var2.field_an = var3.readByte();
            var2.field_Z = var3.readByte();

            for(int var12 = 0; var12 < 25; ++var12) {
                var2.field_G[var12] = var3.readByte();
            }

            var2.field_t = var3.readShort();
            var2.field_aa = var3.readShort();
            var2.field_s = var3.readBoolean();
            var2.field_L = var3.readBoolean();
            var2.field_I = var3.readBoolean();
        }

        return var2;
    }

    byte[] method_g1(boolean var1) throws Exception {
        int var2 = this.method_b(var1);
        ByteArrayOutputStream var3 = new ByteArrayOutputStream(var2);
        DataOutputStream var4 = new DataOutputStream(var3);
        var4.writeUTF(this.field_v);
        var4.writeShort(this.field_ar);
        var4.writeShort(this.field_q);
        if (var1) {
            for(int var5 = 0; var5 < 10; ++var5) {
                var4.writeShort(this.field_U[var5]);
            }

            var4.writeByte(this.field_N);
        } else {
            short[] var10 = new short[10];

            for(int var6 = 0; var6 < 10; ++var6) {
                var10[var6] = this.field_U[var6];
            }

            this.method_a(var10);

            for(int var7 = 0; var7 < 10; ++var7) {
                var4.writeShort(var10[var7]);
            }
        }

        var4.writeInt(this.field_n);

        for(int var11 = 0; var11 < 16; ++var11) {
            var4.writeShort(this.field_J[var11]);
        }

        var4.writeShort(this.field_V);
        var4.writeShort(this.field_aq[0]);
        var4.writeShort(this.field_aq[1]);

        for(int var12 = 0; var12 < 14; ++var12) {
            for(int var13 = 0; var13 < 3; ++var13) {
                var4.writeShort(this.field_R[var12][var13]);
            }
        }

        if (var1) {
            var4.writeByte(this.field_p);

            for(int var14 = 0; var14 < 24; ++var14) {
                var4.writeByte(this.field_H[var14]);
            }

            for(int var8 = 0; var8 < 24; ++var8) {
                var4.writeInt(this.field_P[var8]);
            }

            for(int var9 = 0; var9 < 7; ++var9) {
                var4.writeByte(this.field_T[var9]);
            }

            var4.writeInt(this.field_x);
            var4.writeByte(this.field_b);
        } else {
            int var15 = this.method_A();
            var4.writeInt(var15);
        }

        if (var1) {
            var4.writeShort(this.field_W);
            var4.writeShort(this.field_Y);
            var4.writeShort(this.field_m);
            var4.writeByte(this.field_A);
            var4.writeShort(this.field_ah);
            var4.writeShort(this.field_F);
            var4.writeShort(this.field_ap);
            var4.writeBoolean(this.field_f);
            var4.writeByte(this.field_j);
            var4.writeByte(this.field_l);
            var4.writeByte(this.field_k);
            var4.writeByte(this.field_ak);
            var4.writeByte(this.field_C);
            var4.writeByte(this.field_ao);
            var4.writeByte(this.field_an);
            var4.writeByte(this.field_Z);

            for(int var16 = 0; var16 < 25; ++var16) {
                var4.writeByte(this.field_G[var16]);
            }

            var4.writeShort(this.field_t);
            var4.writeShort(this.field_aa);
            var4.writeBoolean(this.field_s);
            var4.writeBoolean(this.field_L);
            var4.writeBoolean(this.field_I);
        }

        byte[] var17 = var3.toByteArray();
        return var17;
    }

    void method_g2(int var1) {
        byte var2 = -1;
        switch (var1) {
            case 1:
                var2 = 1;
            case 2:
                this.field_e = this.field_ak;
                if (this.field_ak == 1) {
                    this.field_z = this.field_l;
                    this.field_w = (byte)(this.field_k - var2);
                } else if (this.field_ak == 3) {
                    this.field_z = this.field_l;
                    this.field_w = (byte)(this.field_k + var2);
                } else if (this.field_ak == 2) {
                    this.field_z = (byte)(this.field_l + var2);
                    this.field_w = this.field_k;
                } else if (this.field_ak == 4) {
                    this.field_z = (byte)(this.field_l - var2);
                    this.field_w = this.field_k;
                }

                class_i var3 = ESGame.field_u[this.field_j - 1];
                if (this.field_z < 0) {
                    this.field_i = true;
                    this.field_ab = var3.field_x[3];
                    class_i var4 = ESGame.field_u[this.field_ab - 1];
                    if (this.field_ab != 1 && this.field_j != 1) {
                        this.field_z = (byte)(var4.field_g - 1);
                    } else {
                        this.field_z = (byte)(var4.field_g - 1);
                        this.field_w = (byte)(this.field_w + (var4.field_y - var3.field_y) / 2);
                    }
                } else if (this.field_z >= var3.field_g) {
                    this.field_i = true;
                    this.field_ab = var3.field_x[1];
                    class_i var5 = ESGame.field_u[this.field_ab - 1];
                    if (this.field_ab != 1 && this.field_j != 1) {
                        this.field_z = 0;
                    } else {
                        this.field_z = 0;
                        this.field_w = (byte)(this.field_w + (var5.field_y - var3.field_y) / 2);
                    }
                } else if (this.field_w < 0) {
                    this.field_i = true;
                    this.field_ab = var3.field_x[0];
                    class_i var6 = ESGame.field_u[this.field_ab - 1];
                    if (this.field_ab != 1 && this.field_j != 1) {
                        this.field_w = (byte)(var6.field_y - 1);
                    } else {
                        this.field_z = (byte)(this.field_z + (var6.field_g - var3.field_g) / 2);
                        this.field_w = (byte)(var6.field_y - 1);
                    }
                } else if (this.field_w >= var3.field_y) {
                    this.field_i = true;
                    this.field_ab = ESGame.field_u[this.field_j - 1].field_x[2];
                    class_i var7 = ESGame.field_u[this.field_ab - 1];
                    if (this.field_ab != 1 && this.field_j != 1) {
                        this.field_w = 0;
                    } else {
                        this.field_z = (byte)(this.field_z + (var7.field_g - var3.field_g) / 2);
                        this.field_w = 0;
                    }
                } else {
                    this.field_i = false;
                    this.field_ab = this.field_j;
                }
                break;
            case 3:
                this.field_ab = this.field_j;
                this.field_i = false;
                this.field_e = (byte)(this.field_ak + 1);
                if (this.field_e > 4) {
                    this.field_e = 1;
                }

                this.field_z = this.field_l;
                this.field_w = this.field_k;
                break;
            case 4:
                this.field_ab = this.field_j;
                this.field_i = false;
                this.field_e = (byte)(this.field_ak - 1);
                if (this.field_e < 1) {
                    this.field_e = 4;
                }

                this.field_z = this.field_l;
                this.field_w = this.field_k;
        }

    }

    boolean method_a4(int var1, boolean var2) {
        class_i var3 = this.method_b8();
        var3.method_a15(this.field_l, this.field_k);
        if (this.field_U[6] <= 0) {
            return false;
        } else {
            boolean var4 = false;
            if (var2 && var1 == 4) {
                this.method_q(4);
                boolean var9 = this.method_q(1);
                var4 = this.field_i;
                var9 = this.method_q(3);
                this.field_i = var4;
                return var9;
            } else if (var2 && var1 == 3) {
                this.method_q(3);
                boolean var5 = this.method_q(1);
                var4 = this.field_i;
                var5 = this.method_q(4);
                this.field_i = var4;
                return var5;
            } else {
                return this.method_q(var1);
            }
        }
    }

    boolean method_q(int var1) {
        if (this.field_U[6] <= 0) {
            return false;
        } else if (var1 == 0) {
            return false;
        } else {
            this.method_g2(var1);
            boolean var2 = false;
            if (var1 == 1 || var1 == 2) {
                var2 = true;
            }

            if (this.field_ab <= 0) {
                return false;
            } else {
                class_i var3 = ESGame.field_u[this.field_ab - 1];
                if (!var3.field_k) {
                    return false;
                } else {
                    byte var4 = var3.field_w[this.field_z][this.field_w];
                    if (!this.method_a5(var4)) {
                        return false;
                    } else {
                        if (this.field_ab == 37 && this.field_j != 37) {
                            Enumeration var5 = ESGame.field_G[this.field_ab - 1].elements();

                            while(var5.hasMoreElements()) {
                                byte[] var6 = (byte[])var5.nextElement();
                                class_d var7 = class_d.method_a(var6);
                                if (var7.field_l == 41) {
                                    var7.field_g = (byte)var7.method_c(14);
                                    var7.method_d();
                                }
                            }

                            Object var12 = null;
                        }

                        if (!this.method_a17(this.field_j, this.field_l, this.field_k) && this.method_a17(this.field_ab, this.field_z, this.field_w)) {
                            this.field_u = true;
                        } else {
                            this.field_u = false;
                        }

                        if (this.method_a17(this.field_j, this.field_l, this.field_k) && !this.method_a17(this.field_ab, this.field_z, this.field_w)) {
                            this.field_O = true;
                        } else {
                            this.field_O = false;
                        }

                        this.field_j = this.field_ab;
                        this.field_d = this.field_l;
                        this.field_a = this.field_k;
                        this.field_l = this.field_z;
                        this.field_k = this.field_w;
                        this.field_ak = this.field_e;
                        var3.field_h = true;
                        if (var1 == 1 || var1 == 2) {
                            if (class_k.field_l) {
                                class_k.field_l = false;
                            }

                            short[] var10000 = this.field_U;
                            var10000[6] = (short)(var10000[6] - 1 * this.method_c5());
                            this.field_U[6] = (short)Math.max(this.field_U[6], 0);
                        }

                        boolean var13 = (var4 & 4) != 0;
                        if (var13) {
                            int var14 = var3.method_f1(this.field_l, this.field_k);
                            if (var14 == 1) {
                                byte[] var15 = var3.method_e1(this.field_l, this.field_k);
                                if ((var15[6] & 4) != 0) {
                                    field_g = true;
                                    this.method_w1();
                                    return true;
                                }

                                System.out.println(">>>>>>Found a dropped item item: " + method_d4(var15));
                                boolean var8 = this.method_c3(var15);
                                if (var8) {
                                    var3.method_d3(var15);
                                    if ((var15[6] & 2) == 0) {
                                        System.out.println("Dropped item not possessed before");
                                        int var9 = var15[2] - 1;
                                        System.out.println("item index=" + var9);
                                        if (class_a.field_j[var9] == 11) {
                                            this.field_W += (short)class_a.field_c[var9];
                                            int var10 = ESGame.getGameAdvancementLevel(this.field_W);
                                            this.field_ai.checkOpenAndPopulateDungeons(var10);
                                        }
                                    }
                                }
                            } else if (var14 > 1) {
                                System.out.println("Found several items in square");
                                Vector var16 = var3.method_b4(this.field_l, this.field_k);
                                Enumeration var17 = var16.elements();

                                while(var17.hasMoreElements()) {
                                    byte[] var18 = (byte[])var17.nextElement();
                                    if ((var18[6] & 4) != 0) {
                                        field_g = true;
                                        this.method_w1();
                                        return true;
                                    }

                                    boolean var19 = this.method_c3(var18);
                                    if (var19) {
                                        var3.method_d3(var18);
                                        if ((var18[6] & 2) != 0) {
                                            int var11 = var18[2] - 1;
                                            System.out.println("item index=" + var11);
                                            if (class_a.field_j[var11] == 11) {
                                                this.field_W += (short)class_a.field_c[var11];
                                                this.field_ai.checkOpenAndPopulateDungeons(ESGame.getGameAdvancementLevel(this.field_W));
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        this.method_w1();
                        if (var2 && (var4 & 8) != 0) {
                            this.method_p1();
                        }

                        return true;
                    }
                }
            }
        }
    }

    boolean method_a5(byte var1) {
        if ((var1 & 1) != 0) {
            return false;
        } else if ((var1 & 32) != 0) {
            return false;
        } else {
            return (var1 & 2) == 0;
        }
    }

    void method_a6(class_d var1) {
        this.field_t = var1.field_a;
        byte var2 = var1.field_l;
        int var3 = this.method_h(true);
        int var4 = var1.method_c(7);
        int var5 = var3 - var4;
        var5 = Math.min(var5, var1.method_c(2));
        if (this.method_t1(10)) {
            if (var1.field_c[8] == 0) {
                this.method_x(10);
            } else {
                var5 += var1.field_c[8];
            }
        }

        int var6 = var1.method_c(6) - var5 * 5;
        int var7 = this.method_s() + var5 * 5;
        var6 = Math.min(Math.max(var6, 10), 95);
        var7 = Math.min(Math.max(var7, 10), 95);
        int var8 = method_d2(var7, var6);
        if (var8 != 0) {
            int var9 = this.method_z1();
            int var10 = var1.method_c(8);
            if (this.method_t1(13)) {
                if (var1.field_c[5] == 0) {
                    this.field_G[12] = 0;
                } else {
                    var10 -= var1.field_c[5];
                }
            }

            if (var8 == 1) {
                var10 = 2 * var10;
            } else if (var8 == 3) {
                var9 = 2 * var9;
            }

            int var11 = var9 - var10;
            var11 = Math.max(var11, 4);
            int var12 = var11 * var1.method_c(14) / 100;
            var1.method_b1(var12);
            var1.method_d();
            if (this.method_t1(7)) {
                if (var1.field_c[1] == 0) {
                    this.method_x(7);
                } else {
                    var11 = var1.field_c[1];
                    var11 = Math.max(var11, 4);
                    var12 = var11 * var1.method_c(14) / 100;
                    var1.method_b1(var12);
                }
            }

            if (var8 >= 2) {
                this.method_a12(this.method_F(), 1);
            }

            if (!this.method_t1(7)) {
                short[] var10000 = this.field_U;
                var10000[6] = (short)(var10000[6] - 7 * this.method_c5());
                this.field_U[6] = (short)Math.max(this.field_U[6], 0);
            }

            if (this.method_k1(6)) {
                int var13 = 2 * this.field_U[3] / 100;
                if (var13 < 1) {
                    var13 = 1;
                }

                short[] var21 = this.field_U;
                var21[2] -= (short)var13;
            }

        }
    }

    int method_b1(Object var1) {
        byte var2 = 0;
        byte var3 = 0;
        Object var4 = null;
        int var5 = Integer.MAX_VALUE;
        byte[] var9 = (byte[])var1;
        if (var9.length == 28) {
            class_d var6 = class_d.method_a(var9);
            var2 = var6.field_o;
            var3 = var6.field_m;
        } else {
            var2 = var9[0];
            var3 = var9[1];
        }

        if (this.field_ak == 1) {
            var5 = this.field_k - var3;
        } else if (this.field_ak == 3) {
            var5 = var3 - this.field_k;
        } else if (this.field_ak == 2) {
            var5 = var2 - this.field_l;
        } else {
            var5 = this.field_l - var2;
        }

        if (var5 < 0) {
            var5 = Integer.MAX_VALUE;
        }

        return var5;
    }

    void method_b2(int var1, Object var2) {
        Object var3 = null;
        Object var4 = null;
        switch (var1) {
            case 1:
                byte[] var7 = (byte[])var2;
                var7[6] = 1;
                class_d var5 = class_d.method_a(var7);
                String var8 = String.valueOf(var5.field_a);
                var5.field_i = true;
                var5.method_d();
                break;
            case 2:
                byte[] var6 = (byte[])var2;
                var6[6] = (byte)(var6[6] | 1);
        }

    }

    void method_d1(boolean var1) {
        this.method_i();
        Vector var2 = ESGame.field_au[this.field_j - 1];
        if (var2 != null) {
            Enumeration var3 = var2.elements();

            while(var3.hasMoreElements()) {
                byte[] var4 = (byte[])var3.nextElement();
                this.method_a7(2, var4, var1);
            }
        }

        Hashtable var7 = ESGame.field_S[this.field_j - 1];
        if (var7 != null) {
            Enumeration var8 = var7.elements();

            while(var8.hasMoreElements()) {
                byte[] var5 = (byte[])var8.nextElement();
                this.method_a7(4, var5, var1);
            }
        }

        Hashtable var9 = ESGame.field_G[this.field_j - 1];
        if (var9 != null) {
            Enumeration var10 = var9.elements();

            while(var10.hasMoreElements()) {
                byte[] var6 = (byte[])var10.nextElement();
                this.method_a7(1, var6, var1);
            }
        }

        if (this.field_j == 1 && class_k.field_d) {
            this.method_a8(5, "W");
        }

    }

    boolean method_a7(int var1, Object var2, boolean var3) {
        Object var4 = null;
        Object var5 = null;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        int var9 = this.method_b1(var2);
        boolean var10 = this.method_a8(var1, var2);
        if (!var10) {
            return false;
        } else if (var1 != 4 && var9 != 1) {
            this.method_b2(var1, var2);
            return true;
        } else {
            this.method_b2(var1, var2);
            return true;
        }
    }

    void method_i() {
        class_i var1 = this.method_b8();
        byte var2 = 0;

        for(int var3 = 0; var3 < 13; ++var3) {
            field_ad.setElementAt(field_aj, var3);
        }

        var2 = var1.method_a13(-1, 1, this.field_ae);
        if (class_f.method_a8((byte)1, var2)) {
            field_ad.setElementAt(field_am, 0);
        }

        var2 = var1.method_a13(0, 1, this.field_ae);
        if (class_f.method_a8((byte)1, var2)) {
            field_ad.setElementAt(field_am, 1);
        }

        var2 = var1.method_a13(1, 1, this.field_ae);
        if (class_f.method_a8((byte)1, var2)) {
            field_ad.setElementAt(field_am, 2);
        }

        var2 = var1.method_a13(-2, 2, this.field_ae);
        if (class_f.method_a8((byte)1, var2)) {
            field_ad.setElementAt(field_am, 3);
        }

        var2 = var1.method_a13(-1, 2, this.field_ae);
        if (class_f.method_a8((byte)1, var2)) {
            field_ad.setElementAt(field_am, 4);
        }

        var2 = var1.method_a13(0, 2, this.field_ae);
        if (class_f.method_a8((byte)1, var2)) {
            field_ad.setElementAt(field_am, 5);
        }

        var2 = var1.method_a13(1, 2, this.field_ae);
        if (class_f.method_a8((byte)1, var2)) {
            field_ad.setElementAt(field_am, 6);
        }

        var2 = var1.method_a13(2, 2, this.field_ae);
        if (class_f.method_a8((byte)1, var2)) {
            field_ad.setElementAt(field_am, 7);
        }

        var2 = var1.method_a13(-2, 3, this.field_ae);
        if (class_f.method_a8((byte)1, var2)) {
            field_ad.setElementAt(field_am, 8);
        }

        var2 = var1.method_a13(-1, 3, this.field_ae);
        if (class_f.method_a8((byte)1, var2)) {
            field_ad.setElementAt(field_am, 9);
        }

        var2 = var1.method_a13(0, 3, this.field_ae);
        if (class_f.method_a8((byte)1, var2)) {
            field_ad.setElementAt(field_am, 10);
        }

        var2 = var1.method_a13(1, 3, this.field_ae);
        if (class_f.method_a8((byte)1, var2)) {
            field_ad.setElementAt(field_am, 11);
        }

        var2 = var1.method_a13(2, 3, this.field_ae);
        if (class_f.method_a8((byte)1, var2)) {
            field_ad.setElementAt(field_am, 12);
        }

        if (method_a10(field_ad.elementAt(0))) {
            field_ad.setElementAt(field_o, 4);
            field_ad.setElementAt(field_o, 8);
            field_ad.setElementAt(field_o, 9);
        }

        if (method_a10(field_ad.elementAt(1))) {
            for(int var4 = 0; var4 < 13; ++var4) {
                if (var4 != 1) {
                    field_ad.setElementAt(field_o, var4);
                }
            }
        }

        if (method_a10(field_ad.elementAt(2))) {
            field_ad.setElementAt(field_o, 6);
            field_ad.setElementAt(field_o, 11);
            field_ad.setElementAt(field_o, 12);
        }

        if (method_a10(field_ad.elementAt(3))) {
            field_ad.setElementAt(field_o, 8);
        }

        if (method_a10(field_ad.elementAt(4))) {
            field_ad.setElementAt(field_o, 8);
            field_ad.setElementAt(field_o, 9);
        }

        if (method_a10(field_ad.elementAt(5))) {
            field_ad.setElementAt(field_o, 9);
            field_ad.setElementAt(field_o, 10);
            field_ad.setElementAt(field_o, 11);
            field_ad.setElementAt(field_o, 4);
            field_ad.setElementAt(field_o, 6);
        }

        if (method_a10(field_ad.elementAt(6))) {
            field_ad.setElementAt(field_o, 11);
            field_ad.setElementAt(field_o, 12);
        }

        if (method_a10(field_ad.elementAt(7))) {
            field_ad.setElementAt(field_o, 12);
        }

        if (method_a10(field_ad.elementAt(9))) {
            field_ad.setElementAt(field_o, 8);
        }

        if (method_a10(field_ad.elementAt(10))) {
            field_ad.setElementAt(field_o, 9);
            field_ad.setElementAt(field_o, 11);
        }

        if (method_a10(field_ad.elementAt(11))) {
            field_ad.setElementAt(field_o, 12);
        }

    }

    boolean method_a8(int var1, Object var2) {
        class_i var3 = this.method_b8();
        Object var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        byte var8 = 0;
        byte var9 = 0;
        if (var1 == 1) {
            byte[] var12 = (byte[])var2;
            var8 = var12[4];
            var9 = var12[5];
        } else if (var1 == 4) {
            byte[] var14 = (byte[])var2;
            var8 = var14[0];
            var9 = var14[1];
        } else if (var1 == 5) {
            var8 = class_k.field_j[6];
            var9 = class_k.field_i[6];
        } else {
            byte[] var13 = (byte[])var2;
            var8 = var13[0];
            var9 = var13[1];
        }

        int[] var10 = var3.method_a12(this.field_l, this.field_k, this.field_ak, var8, var9);
        boolean var11 = false;
        if (method_a9(var10[0], var10[1], 3, 2)) {
            var11 = true;
            field_ad.setElementAt(var2, 1);
        } else if (method_a9(var10[0], var10[1], 2, 1)) {
            if (!method_a10(field_ad.elementAt(0)) && !method_a10(field_ad.elementAt(1)) && !method_a10(field_ad.elementAt(5))) {
                var11 = true;
                field_ad.setElementAt(var2, 4);
            }
        } else if (method_a9(var10[0], var10[1], 3, 1)) {
            if (!method_a10(field_ad.elementAt(1))) {
                var11 = true;
                field_ad.setElementAt(var2, 5);
            }
        } else if (method_a9(var10[0], var10[1], 4, 1)) {
            if (!method_a10(field_ad.elementAt(1)) && !method_a10(field_ad.elementAt(2)) && !method_a10(field_ad.elementAt(5))) {
                var11 = true;
                field_ad.setElementAt(var2, 6);
            }
        } else if (method_a9(var10[0], var10[1], 1, 0)) {
            if (!method_a10(field_ad.elementAt(0)) && !method_a10(field_ad.elementAt(1)) && !method_a10(field_ad.elementAt(3)) && !method_a10(field_ad.elementAt(4)) && !method_a10(field_ad.elementAt(9))) {
                var11 = true;
                field_ad.setElementAt(var2, 8);
            }
        } else if (method_a9(var10[0], var10[1], 2, 0)) {
            if (!method_a10(field_ad.elementAt(0)) && !method_a10(field_ad.elementAt(1)) && !method_a10(field_ad.elementAt(4)) && !method_a10(field_ad.elementAt(5)) && !method_a10(field_ad.elementAt(10))) {
                var11 = true;
                field_ad.setElementAt(var2, 9);
            }
        } else if (method_a9(var10[0], var10[1], 3, 0)) {
            if (!method_a10(field_ad.elementAt(1)) && !method_a10(field_ad.elementAt(5))) {
                var11 = true;
                field_ad.setElementAt(var2, 10);
            }
        } else if (method_a9(var10[0], var10[1], 4, 0)) {
            if (!method_a10(field_ad.elementAt(1)) && !method_a10(field_ad.elementAt(2)) && !method_a10(field_ad.elementAt(5)) && !method_a10(field_ad.elementAt(6)) && !method_a10(field_ad.elementAt(10))) {
                var11 = true;
                field_ad.setElementAt(var2, 11);
            }
        } else if (method_a9(var10[0], var10[1], 5, 0) && !method_a10(field_ad.elementAt(1)) && !method_a10(field_ad.elementAt(2)) && !method_a10(field_ad.elementAt(6)) && !method_a10(field_ad.elementAt(7)) && !method_a10(field_ad.elementAt(11))) {
            var11 = true;
            field_ad.setElementAt(var2, 12);
        }

        return var11;
    }

    private static boolean method_a9(int var0, int var1, int var2, int var3) {
        return var0 == var2 && var1 == var3;
    }

    private static boolean method_a10(Object var0) {
        if (var0 instanceof Integer) {
            Integer var1 = (Integer)var0;
            if (var1 == 1) {
                return true;
            }

            if (var1 == -1) {
                return true;
            }
        }

        return false;
    }

    void method_a11(byte[] var1) {
        class_i var2 = ESGame.field_u[this.field_j - 1];
        var2.method_c2(var1);
    }

    static int method_d2(int var0, int var1) {
        int var2 = class_f.method_a2(100);
        int var3 = class_f.method_a2(100);
        boolean var4 = var2 <= var1;
        field_D = var3 <= var0;
        byte var5 = 0;
        if (field_D && !var4) {
            var5 = 3;
        } else if (field_D && var4) {
            if (var3 >= var2) {
                var5 = 2;
            } else {
                var5 = 1;
            }
        } else if (!field_D && !var4) {
            if (var3 >= var2) {
                var5 = 2;
            } else {
                var5 = 1;
            }
        } else {
            var5 = 0;
        }

        return var5;
    }

    int method_b3(int var1, boolean var2) {
        int var3 = this.field_R[var1][0];
        if (var2) {
            int var4 = 1 + field_c[var1];
            var3 += this.field_J[var4] / 3;
        }

        if (var1 == 11 && this.method_t1(3)) {
            var3 += this.field_R[1][0];
        }

        if (this.field_U[6] < 7) {
            --var3;
        }

        return var3;
    }

    int method_z(int var1) {
        short var2 = this.field_R[var1][1];
        return var2;
    }

    int method_f(boolean var1) {
        if (this.field_T[1] != 0) {
            int var2 = class_a.method_a2(1, this.field_T[1]);
            var2 = Math.abs(var2);
            return var2 == 5 ? this.method_b3(5, var1) : this.method_b3(7, var1);
        } else {
            return 0;
        }
    }

    int method_I() {
        if (this.field_T[1] != 0) {
            int var1 = class_a.method_a2(1, this.field_T[1]);
            var1 = Math.abs(var1);
            return var1 == 5 ? this.method_z(5) : this.method_z(7);
        } else {
            return 20;
        }
    }

    int method_t() {
        byte var1 = 0;
        int var2 = this.method_b3(0, false);
        int var3 = this.method_b3(2, false);
        if (var3 > var2) {
            var2 = var3;
            var1 = 2;
        }

        var3 = this.method_b3(8, false);
        if (var3 > var2) {
            var2 = var3;
            var1 = 8;
        }

        var3 = this.method_b3(12, false);
        if (var3 > var2) {
            var1 = 12;
        }

        return var1;
    }

    int method_F() {
        if (this.method_t1(6)) {
            return this.method_t();
        } else if (this.field_T[0] != 0) {
            int var1 = class_a.method_a2(1, this.field_T[0]);
            var1 = Math.abs(var1);
            if (var1 == 1) {
                return 0;
            } else if (var1 == 2) {
                return 2;
            } else {
                return var1 == 3 ? 8 : 12;
            }
        } else {
            return -1;
        }
    }

    int method_h(boolean var1) {
        if (this.method_t1(14)) {
            return 5 + this.method_b3(4, false);
        } else if (this.method_t1(6)) {
            int var5 = this.method_t();
            return this.method_b3(var5, var1);
        } else {
            int var2 = 0;
            if (this.field_T[0] != 0) {
                int var3 = class_a.method_a2(1, this.field_T[0]);
                var3 = Math.abs(var3);
                if (var3 == 1) {
                    var2 = this.method_b3(0, var1);
                } else if (var3 == 2) {
                    var2 = this.method_b3(2, var1);
                } else if (var3 == 3) {
                    var2 = this.method_b3(8, var1);
                } else {
                    var2 = this.method_b3(12, var1);
                }
            } else {
                var2 = 0;
            }

            if (this.method_t1(5)) {
                var2 += this.method_b3(1, false);
            }

            return var2;
        }
    }

    int method_s() {
        if (!this.method_t1(6) && !this.method_t1(14)) {
            if (this.field_T[0] != 0) {
                int var2 = class_a.method_a2(1, this.field_T[0]);
                var2 = Math.abs(var2);
                if (var2 == 1) {
                    return this.method_z(0);
                } else if (var2 == 2) {
                    return this.method_z(2);
                } else {
                    return var2 == 3 ? this.method_z(8) : this.method_z(12);
                }
            } else {
                return 20;
            }
        } else {
            int var1 = this.method_t();
            return this.method_z(var1);
        }
    }

    int method_z1() {
        int var1 = 0;
        if (this.method_t1(14)) {
            var1 = 5 + this.method_b3(4, false);
        } else if (this.method_t1(6)) {
            var1 = 20 + this.method_b3(3, false);
        } else if (this.field_T[0] != 0) {
            var1 = class_a.method_a2(3, this.field_T[0]);
        } else {
            var1 = 0;
        }

        if (this.method_t1(1)) {
            var1 += 10 + this.method_b3(1, false);
        }

        if (this.field_s) {
            var1 += 25;
        }

        return var1;
    }

    int method_y() {
        if (this.field_T[1] != 0) {
            int var1 = class_a.method_a2(1, this.field_T[1]);
            var1 = Math.abs(var1);
            return var1 == 5 ? 5 : 7;
        } else {
            return -1;
        }
    }

    int method_v() {
        int var1 = 0;
        int var2 = 0;
        if (this.field_T[1] != 0) {
            var2 = class_a.method_a2(3, this.field_T[1]);
            var1 += 4 * var2;
        }

        if (this.field_T[2] != 0) {
            var2 = class_a.method_a2(3, this.field_T[2]);
            var1 += 2 * var2;
        }

        if (this.field_T[3] != 0) {
            var2 = class_a.method_a2(3, this.field_T[3]);
            var1 += 2 * var2;
        }

        if (this.field_T[4] != 0) {
            var2 = class_a.method_a2(3, this.field_T[4]);
            var1 += var2;
        }

        if (this.field_T[5] != 0) {
            var2 = class_a.method_a2(3, this.field_T[5]);
            var1 += var2;
        }

        var1 /= 10;
        if (this.method_t1(2)) {
            var1 += 10 + this.method_b3(1, false);
        }

        if (this.method_t1(17)) {
            var1 += this.field_aa;
        }

        if (this.field_L) {
            var1 += 15;
        }

        return var1;
    }

    int method_b4(byte[] var1) {
        var1[2] = 2;
        if (this.method_k()) {
            byte var7 = var1[4];
            int var3 = (var1[5] << 8) + var1[6];
            byte var4 = var1[7];
            this.method_b6(var7, var3, var4);
            ESGame.field_u[this.field_j - 1].method_b3(var1);
            System.out.println("Chest item not possessed before");
            int var5 = var7 - 1;
            System.out.println("item index=" + var5);
            if (class_a.field_j[var5] == 11) {
                this.field_W += (short)class_a.field_c[var5];
                int var6 = ESGame.getGameAdvancementLevel(this.field_W);
                this.field_ai.checkOpenAndPopulateDungeons(var6);
            }

            return 1;
        } else {
            byte[] var2 = new byte[]{var1[0], var1[1], var1[4], var1[5], var1[6], var1[7], 1};
            this.method_a11(var2);
            ESGame.field_u[this.field_j - 1].method_b3(var1);
            return 0;
        }
    }

    private boolean method_t1(int var1) {
        if (this.field_G[var1 - 1] == -1) {
            return true;
        } else if (this.field_G[var1 - 1] == -2) {
            return this.field_t != 0;
        } else {
            return this.field_G[var1 - 1] > 0;
        }
    }

    void method_x(int var1) {
        this.field_G[var1 - 1] = 0;
    }

    class_d method_n() {
        this.method_g2(1);
        if (this.field_ab <= 0) {
            return null;
        } else {
            class_i var1 = ESGame.field_u[this.field_ab - 1];
            class_d var2 = var1.method_c3(this.field_z, this.field_w);
            if (var2 != null) {
                var2.method_c2();
            }

            return var2;
        }
    }

    byte[] method_h1() {
        this.method_g2(1);
        if (this.field_ab <= 0) {
            return null;
        } else {
            byte var1 = this.field_ab;
            Hashtable var2 = ESGame.field_S[var1 - 1];
            if (var2 == null) {
                return null;
            } else {
                Object var3 = var2.get(class_f.method_b1(this.field_z, this.field_w));
                if (var3 == null) {
                    return null;
                } else {
                    byte[] var4 = (byte[])var3;
                    return var4;
                }
            }
        }
    }

    int method_r() {
        this.method_g2(1);
        if (this.field_ab <= 0) {
            return -1;
        } else {
            byte var1 = this.field_ab;
            return var1 != 1 ? -1 : class_k.method_a4(this.field_z, this.field_w);
        }
    }

    int method_u1(int var1) {
        if (var1 <= 5) {
            return 1;
        } else if (var1 <= 10) {
            return 3;
        } else if (var1 <= 15) {
            return 4;
        } else {
            return var1 <= 20 ? 6 : 10;
        }
    }

    void method_p(int var1) {
        System.out.println("start of castSpell");
        int var2 = this.method_u1(var1);
        int var3 = this.method_b3(var2, true);
        int var4 = this.method_z(var2);
        byte var5 = class_b.method_c(var1).field_g;
        byte var6 = class_b.method_c(var1).field_j;
        byte var7 = class_b.method_c(var1).field_e;
        byte var8 = class_b.method_c(var1).field_f;
        int var9 = var3 - var5;
        int var10 = var4 + var9 * 5;
        int var11 = var6 - var9 * 5;
        var10 = Math.min(Math.max(var10, 10), 95);
        var11 = Math.min(Math.max(var11, 10), 95);
        int var12 = method_d2(var10, var11);
        byte var13 = 1;
        if (var12 == 0) {
            short[] var10000 = this.field_U;
            var10000[4] = (short)(var10000[4] - 3 * var7);
        } else if (var12 == 1) {
            short[] var20 = this.field_U;
            var20[4] = (short)(var20[4] - 3 * var7 / 2);
        } else if (var12 == 2) {
            short[] var21 = this.field_U;
            var21[4] = (short)(var21[4] - var7);
        } else if (var12 == 3) {
            short[] var22 = this.field_U;
            var22[4] = (short)(var22[4] - var7);
            var13 = 2;
        }

        this.field_U[4] = (short)Math.max(this.field_U[4], 0);
        if (var12 >= 2) {
            this.method_a12(var2, 1);
        }

        switch (var1) {
            case 1:
            case 2:
            case 3:
            case 5:
                this.field_G[var1 - 1] = (byte)(var8 * var13);
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            default:
                break;
            case 6:
                byte var14 = 0;
                if (this.method_c4(109, var14) && this.method_a13(true)) {
                    this.field_G[var1 - 1] = (byte)(var8 * var13);
                }
                break;
            case 21:
                int var15 = 6 + this.method_b3(10, false);
                short[] var23 = this.field_U;
                var23[2] = (short)(var23[2] + var13 * var15);
                this.field_U[2] = (short)Math.min(this.field_U[2], this.field_U[3]);
                break;
            case 23:
                this.field_G[var1 - 1] = -2;
                break;
            case 24:
                this.field_G[var1 - 1] = -4;
                break;
            case 25:
                for(int var16 = 1; var16 <= var13; ++var16) {
                    this.method_H();
                }
        }

        short[] var24 = this.field_U;
        var24[6] = (short)(var24[6] - 5 * this.method_c5());
        this.field_U[6] = (short)Math.max(this.field_U[6], 0);
        if (this.method_k1(6)) {
            int var17 = 2 * this.field_U[3] / 100;
            if (var17 < 1) {
                var17 = 1;
            }

            var24 = this.field_U;
            var24[2] -= (short)var17;
        }

    }

    void method_b5(int var1, class_d var2) {
        int var3 = this.method_u1(var1);
        int var4 = this.method_b3(var3, true);
        int var5 = this.method_z(var3);
        int var6 = var2.method_c(10);
        int var7 = var2.method_c(9);
        byte var8 = class_b.method_c(var1).field_e;
        byte var9 = class_b.method_c(var1).field_f;
        int var10 = var4 - var6;
        int var11 = var2.method_c(2);
        var10 = Math.min(var10, var11);
        int var12 = var5 + var10 * 5;
        int var13 = var7 - var10 * 5;
        var12 = Math.min(Math.max(var12, 10), 95);
        var13 = Math.min(Math.max(var13, 10), 95);
        int var14 = method_d2(var12, var13);
        byte var15 = 1;
        if (var14 == 0) {
            short[] var10000 = this.field_U;
            var10000[4] = (short)(var10000[4] - 3 * var8);
        } else if (var14 == 1) {
            short[] var45 = this.field_U;
            var45[4] = (short)(var45[4] - 3 * var8 / 2);
        } else if (var14 == 2) {
            short[] var46 = this.field_U;
            var46[4] = (short)(var46[4] - var8);
        } else if (var14 == 3) {
            short[] var47 = this.field_U;
            var47[4] = (short)(var47[4] - var8);
            var15 = 2;
        }

        this.field_U[4] = (short)Math.max(this.field_U[4], 0);
        if (var14 >= 2) {
            this.method_a12(var3, 1);
        }

        switch (var1) {
            case 4:
                var2.field_c[9] = -2;
                var2.method_d();
            case 5:
            case 6:
            default:
                break;
            case 7:
                int var34 = 10 + this.method_b3(3, false);
                var2.field_c[1] = (byte)var34;
                break;
            case 8:
                int var33 = this.method_b3(3, false);
                int var39 = 12 + 2 * var33;
                var2.method_b1(var39);
                short[] var48 = this.field_U;
                var48[6] = (short)(var48[6] + var33);
                this.field_U[6] = (short)Math.min(this.field_U[6], this.field_U[7]);
                var48 = this.field_U;
                var48[2] = (short)(var48[2] + var33);
                this.field_U[2] = (short)Math.min(this.field_U[2], this.field_U[3]);
                var48 = this.field_U;
                var48[4] = (short)(var48[4] + 12);
                this.field_U[4] = (short)Math.min(this.field_U[4], this.field_U[5]);
                break;
            case 9:
                if (var2.method_e()) {
                    int var32 = 60 * var15;
                    int var37 = var32 - var2.method_c(8);
                    var37 = Math.max(var37, 4);
                    int var42 = var37 * var2.method_c(14) / 100;
                    var2.method_b1(var42);
                }
                break;
            case 10:
                this.field_G[var1 - 1] = -2;
                var2.field_c[8] = (byte)(2 * var15);
                break;
            case 11:
                int var31 = 25 + this.method_b3(4, false);
                int var36 = var31 * var15;
                int var40 = var36 - var2.method_c(8);
                var40 = Math.max(var40, 4);
                int var43 = var40 * var2.method_c(14) / 100;
                var2.method_b1(var43);
                var2.method_d();
                break;
            case 12:
                this.field_G[var1 - 1] = -2;
                int var29 = var15 * (10 + this.method_b3(4, false));
                var29 = Math.min(var29, 255);
                var2.field_c[4] = (byte)var29;
                var2.method_d();
                break;
            case 13:
                this.field_G[var1 - 1] = -2;
                int var27 = var15 * (10 + this.method_b3(4, false));
                var27 = Math.min(var27, 255);
                var2.field_c[5] = (byte)var27;
                var2.method_d();
                break;
            case 14:
                this.field_G[var1 - 1] = -1;
                this.method_a6(var2);
                this.field_G[var1 - 1] = 0;
                break;
            case 15:
                this.field_G[var1 - 1] = -2;
                var2.field_c[2] = 1;
                var2.method_d();
                break;
            case 16:
                int var16 = 10 - var6;
                if (var16 > 0) {
                    var16 = var15 * var16;
                    this.field_G[var1 - 1] = (byte)var16;
                    var2.field_c[6] = 1;
                }
                break;
            case 17:
                this.field_G[var1 - 1] = -2;
                this.field_aa = (short)(10 + this.method_b3(6, false));
                break;
            case 18:
                this.field_G[var1 - 1] = -2;
                var2.field_c[0] = (byte)(3 * var15);
                break;
            case 19:
                this.field_G[var1 - 1] = -2;
                int var17 = var15 * (60 - 5 * var6);
                var17 = Math.min(Math.max(var17, 0), 100);
                var2.field_c[3] = (byte)var17;
                break;
            case 20:
                int var18 = 80 - 5 * var6;
                int var19 = var18 * var15;
                int var20 = var19 - var2.method_c(8);
                var20 = Math.max(var20, 4);
                int var21 = var20 * var2.method_c(14) / 100;
                var2.method_b1(var21);
        }

        short[] var51 = this.field_U;
        var51[6] = (short)(var51[6] - 5 * this.method_c5());
        this.field_U[6] = (short)Math.max(this.field_U[6], 0);
        if (this.method_k1(6)) {
            int var22 = 2 * this.field_U[3] / 100;
            if (var22 < 1) {
                var22 = 1;
            }

            var51 = this.field_U;
            var51[2] -= (short)var22;
        }

    }

    void method_a12(int var1, int var2) {
        if (var1 >= 0) {
            short[] var10000 = this.field_R[var1];
            var10000[2] = (short)(var10000[2] + var2);
        }

    }

    boolean method_c3(byte[] var1) {
        byte var2 = var1[2];
        int var3 = (var1[3] << 8) + var1[4];
        byte var4 = var1[5];
        return this.method_b6(var2, var3, var4);
    }

    boolean method_c4(int var1, int var2) {
        return this.method_b6(var1, var2, 0);
    }

    boolean method_b6(int var1, int var2, int var3) {
        if (this.field_p < 24) {
            this.field_H[this.field_p] = (byte)var1;
            int var4 = (var2 << 16) + (byte)var3;
            this.field_P[this.field_p] = var4;
            ++this.field_p;
            return true;
        } else {
            return false;
        }
    }

    boolean method_y1(int var1) {
        if (var1 >= this.field_p) {
            return false;
        } else {
            this.method_A1(var1);
            this.field_H[var1] = 0;

            for(int var2 = var1; var2 < this.field_p - 1; ++var2) {
                this.field_H[var2] = this.field_H[var2 + 1];
                this.field_P[var2] = this.field_P[var2 + 1];
            }

            --this.field_p;
            return true;
        }
    }

    void method_i1(int var1) {
        int var2 = Math.abs(this.field_H[var1]);
        if (var2 != 109) {
            byte[] var3 = new byte[]{this.field_l, this.field_k, (byte)var2, 0, 0, (byte)(this.field_P[var1] & 255), 0};
            int var4 = this.field_P[var1] >>> 16 & '\uffff';
            var3[3] = (byte)(var4 >> 8 & 255);
            var3[4] = (byte)(var4 & 255);
            var3[6] = 3;
            this.method_b8().method_c2(var3);
            this.method_y1(var1);
        } else {
            this.method_y1(var1);
        }

    }

    boolean method_C(int var1) {
        byte var2 = this.field_H[var1];
        if (!class_a.method_c(Math.abs(var2))) {
            return false;
        } else {
            return var2 < 0;
        }
    }

    boolean method_d3(int var1, boolean var2) {
        byte var3 = this.field_H[var1];
        if (var3 < 0) {
            return false;
        } else if (!class_a.method_c(var3)) {
            return false;
        } else {
            int var4 = class_a.method_a1(var3);
            if (this.field_T[var4] != 0) {
                if (!var2) {
                    return false;
                }

                this.method_f1(var4);
            }

            this.field_T[var4] = var3;
            this.field_H[var1] = (byte)(-Math.abs(this.field_H[var1]));
            return true;
        }
    }

    private void method_f1(int var1) {
        for(int var2 = 0; var2 < this.field_p; ++var2) {
            byte var3 = this.field_H[var2];
            var3 = (byte)Math.abs(var3);
            int var4 = class_a.method_a1(var3);
            if (var4 == var1) {
                this.method_A1(var2);
            }
        }

    }

    boolean method_a13(boolean var1) {
        int var2 = this.field_p - 1;
        return this.method_d3(var2, var1);
    }

    void method_A1(int var1) {
        if (this.method_C(var1)) {
            if (var1 >= 0 && var1 <= 23) {
                byte var2 = this.field_H[var1];
                var2 = (byte)Math.abs(var2);
                this.field_H[var1] = var2;

                for(int var3 = 0; var3 < 7; ++var3) {
                    if (this.field_T[var3] == var2) {
                        this.field_T[var3] = 0;
                        break;
                    }
                }

            }
        }
    }

    boolean method_h2(int var1) {
        byte var2 = this.field_H[var1];
        var2 = (byte)Math.abs(var2);
        if (class_a.method_b(var2)) {
            byte var3 = (byte)(this.field_P[var1] & 255);
            var3 = 3;
            int[] var10000 = this.field_P;
            var10000[var1] &= -256;
            var10000 = this.field_P;
            var10000[var1] |= var3;
            return true;
        } else {
            return false;
        }
    }

    boolean method_j(int var1) {
        byte var2 = this.field_H[var1];
        var2 = (byte)Math.abs(var2);
        byte var3 = (byte)(this.field_P[var1] & 255);
        return var3 == 3;
    }

    int method_D(int var1) {
        byte var2 = this.field_H[var1];
        var2 = (byte)Math.abs(var2);
        return class_a.field_c[var2 - 1];
    }

    int method_o(int var1) {
        int var2 = -1;
        int var3 = -Math.abs(var1);

        for(int var4 = 0; var4 < this.field_p; ++var4) {
            if (var3 == this.field_H[var4]) {
                var2 = var4;
                break;
            }
        }

        return var2;
    }

    boolean method_k() {
        return this.field_p < 24;
    }

    String method_b7(int var1) {
        int var2 = Math.abs(this.field_H[var1]);
        byte var3 = class_a.field_j[var2 - 1];
        Object var4 = null;
        String var13;
        switch (var3) {
            case 1:
            case 2:
            case 3:
            case 4:
                var13 = class_a.field_b[var2 - 1] + '\n' + class_a.field_g[var3 - 1];
                int var5 = class_a.field_m[var2 - 1] + (this.field_P[var1] & 255);
                var13 = var13 + "\nWeapon value: " + var5;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                var13 = class_a.field_b[var2 - 1] + '\n' + class_a.field_g[var3 - 1];
                int var6 = class_a.field_m[var2 - 1] + (this.field_P[var1] & 255);
                var13 = var13 + "\nArmor value: " + var6;
                break;
            case 11:
                var13 = class_a.field_b[var2 - 1] + '\n' + class_a.field_g[var3 - 1];
                break;
            case 12:
                var13 = class_a.field_b[var2 - 1] + '\n' + "Spell: ";
                int var7 = this.field_P[var1] & 255;
                var13 = var13 + class_b.field_b[var7 - 1].field_c;
                break;
            case 13:
                int var8 = var2 - 87;
                String[] var9 = class_a.field_l[var8];
                var13 = class_a.field_b[var2 - 1] + '\n' + class_a.field_g[var3 - 1] + '\n' + var9[0];
                if (var9[1].length() > 0) {
                    var13 = var13 + '\n' + var9[1];
                }
                break;
            case 14:
            case 15:
            case 16:
            default:
                var13 = class_a.field_b[var2 - 1] + '\n' + class_a.field_g[var3 - 1];
                break;
            case 17:
                var13 = class_a.field_b[var2 - 1] + '\n' + class_a.field_g[var3 - 1];
                int var10 = this.method_b3(3, false);
                int var11 = 20 + var10;
                var13 = var13 + "\nWeapon value: " + var11;
        }

        return var13;
    }

    boolean method_r1(int var1) {
        int var2 = Math.abs(this.field_H[var1]);
        byte var10000 = class_a.field_j[var2 - 1];
        int var4 = this.field_P[var1] & 255;
        int var5 = var4 - 1;
        this.field_x = class_f.method_a7(var5, this.field_x);
        this.method_y1(var1);
        return true;
    }

    void method_a14(int var1) {
        this.method_a15(var1, class_e.field_j);
    }

    boolean method_w(int var1) {
        int var2 = Math.abs(this.field_H[var1]);
        byte var3 = class_a.field_j[var2 - 1];
        switch (var3) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 17:
                return true;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            default:
                return false;
        }
    }

    boolean method_v1(int var1) {
        int var2 = Math.abs(this.field_H[var1]);
        byte var3 = class_a.field_j[var2 - 1];
        switch (var3) {
            case 13:
            case 15:
                return true;
            default:
                return false;
        }
    }

    boolean method_e(int var1) {
        int var2 = Math.abs(this.field_H[var1]);
        byte var3 = class_a.field_j[var2 - 1];
        switch (var3) {
            case 12:
                int var4 = this.field_P[var1] & 255;
                byte var5 = class_b.field_b[var4 - 1].field_h;
                if (this.field_R[var5][0] > 0) {
                    return true;
                }

                return false;
            default:
                return false;
        }
    }

    int method_n1(int var1) {
        int var2 = this.field_U[var1];
        if (this.method_t1(23)) {
            if (var1 == 2) {
                var2 += this.method_b3(10, false);
                if (var2 > this.field_U[3]) {
                    var2 = this.field_U[3];
                }
            } else if (var1 == 6) {
                var2 += this.method_b3(10, false);
                if (var2 > this.field_U[7]) {
                    var2 = this.field_U[7];
                }
            } else if (var1 == 4) {
                var2 += this.method_b3(10, false);
                if (var2 > this.field_U[5]) {
                    var2 = this.field_U[5];
                }
            }
        }

        return var2;
    }

    boolean method_x1() {
        return this.field_C > 0;
    }

    void method_D1() {
        this.field_C = this.field_j;
        this.field_ao = this.field_l;
        this.field_an = this.field_k;
        this.field_Z = this.field_ak;
        this.method_c2(true);
        this.method_w1();
        this.field_Q = true;
    }

    void method_e1() {
        this.field_j = this.field_ab = this.field_C;
        this.field_l = this.field_z = this.field_ao;
        this.field_k = this.field_w = this.field_an;
        this.method_w1();
        this.field_Q = true;
    }

    int method_E() {
        int var1 = 0;

        for(int var2 = 0; var2 < 8; ++var2) {
            int var3 = this.field_A >> var2 & 1;
            if (var3 != 0) {
                ++var1;
            }
        }

        return var1;
    }

    void method_H() {
        int var1 = this.method_E();
        if (var1 > 0) {
            int var2 = 0;
            if (var1 == 1) {
                var2 = 1;
            } else {
                var2 = class_f.method_a2(var1);
            }

            int var3 = 0;

            for(int var4 = 0; var4 < 8; ++var4) {
                int var5 = this.field_A >> var4 & 1;
                if (var5 == 1) {
                    ++var3;
                    if (var3 == var2) {
                        this.field_A = (byte)class_f.method_c(var4, this.field_A);
                        break;
                    }
                }
            }
        }

    }

    int method_c5() {
        return (this.field_A & 1) == 1 ? 3 : 1;
    }

    class_i method_b8() {
        return ESGame.field_u[this.field_j - 1];
    }

    void method_w1() {
        this.method_b8().method_b5(this.field_l, this.field_k, this.field_ak, this.field_ae);
    }

    String method_j1() {
        StringBuffer var1 = new StringBuffer(450);
        String var2 = " ";
        String var3 = ": ";
        var1.append(this.field_v);
        var1.append('\n');
        var1.append(field_K[this.field_ar]);
        var1.append('\n');
        var1.append("Level ");
        var1.append(this.field_U[0]);
        var1.append(" (");
        var1.append(this.field_U[1]);
        var1.append("/10)");
        var1.append('\n');
        var1.append("Health: ");
        var1.append(this.method_n1(2));
        var1.append('/');
        var1.append(this.field_U[3]);
        var1.append('\n');
        var1.append("Magic: ");
        var1.append(this.method_n1(4));
        var1.append('/');
        var1.append(this.field_U[5]);
        var1.append('\n');
        var1.append("Fatigue: ");
        var1.append(this.method_n1(6));
        var1.append('/');
        var1.append(this.field_U[7]);
        var1.append('\n');
        var1.append('\n');
        var1.append("Status ailments: ");
        int var4 = 0;

        for(int var5 = 1; var5 <= 8; ++var5) {
            if (this.method_k1(var5)) {
                var1.append('\n');
                var1.append(field_af[var5 - 1]);
                ++var4;
            }
        }

        if (var4 == 0) {
            var1.append('\n');
            var1.append("None");
        }

        var1.append('\n');
        var1.append('\n');
        var1.append("Gift points found: ");
        var1.append(this.field_W);
        var1.append('\n');
        var1.append('\n');
        var1.append("Attributes:");
        var1.append('\n');

        for(int var6 = 0; var6 < 8; ++var6) {
            int var7 = 2 * var6;
            var1.append(field_y[var7]);
            var1.append(var3);
            var1.append(this.field_J[var7]);
            var1.append('\n');
        }

        String var8 = var1.toString();
        System.out.println("Length of stats string is " + var8.length());
        return var8;
    }

    static Vector method_G() {
        Vector var0 = new Vector();

        for(int var1 = 0; var1 < 13; ++var1) {
            var0.addElement(new Object());
        }

        return var0;
    }

    static String method_d4(byte[] var0) {
        String var1 = "X = " + var0[0] + '\n';
        var1 = var1 + "Y = " + var0[1] + '\n';
        var1 = var1 + "Type = " + var0[2] + '\n';
        var1 = var1 + "ID(MSB) = " + var0[3] + '\n';
        var1 = var1 + "ID(LSB) = " + var0[4] + '\n';
        var1 = var1 + "value = " + var0[5] + '\n';
        var1 = var1 + "flags = " + var0[6] + '\n';
        return var1;
    }

    Vector method_f2() {
        Vector var1 = new Vector();

        for(int var2 = 0; var2 < 14; ++var2) {
            if (this.field_R[var2][0] > 0) {
                String var3 = field_E[var2] + ": " + this.field_R[var2][0];
                var1.addElement(var3);
            }
        }

        return var1;
    }

    int method_l(int var1) {
        int var2 = 0;

        for(int var3 = 0; var3 < 14; ++var3) {
            if (this.field_R[var3][0] > 0) {
                if (var2 == var1) {
                    return var3;
                }

                ++var2;
            }
        }

        return -1;
    }

    String method_m1(int var1) {
        String var2 = field_E[var1] + '\n' + "Rank: " + this.field_R[var1][0] + '\n' + "Exp: " + this.field_R[var1][2] + "/10";
        return var2;
    }

    Vector method_J() {
        Vector var1 = new Vector();

        for(int var2 = 0; var2 < class_b.field_i; ++var2) {
            if ((this.field_x & 1 << var2) != 0) {
                int var3 = var2 + 1;
                String var4 = class_b.field_b[var2].field_c;
                if (var3 == this.field_b) {
                    var4 = "R: " + var4;
                }

                var1.addElement(var4);
            }
        }

        return var1;
    }

    int method_B(int var1) {
        int var2 = 0;

        for(int var3 = 0; var3 < class_b.field_i; ++var3) {
            if ((this.field_x & 1 << var3) != 0) {
                int var4 = var3 + 1;
                if (var2 == var1) {
                    return var3;
                }

                ++var2;
            }
        }

        return -1;
    }

    int method_l1() {
        if (!class_b.method_a(this.field_b)) {
            int var3 = this.method_B(0);
            return var3 < 0 ? 0 : var3 + 1;
        } else {
            int var1 = this.field_b - 1;
            int var2 = var1 + 1;
            if (var2 == class_b.field_i) {
                var2 = 0;
            }

            while(var2 != var1) {
                if ((this.field_x & 1 << var2) != 0) {
                    return var2 + 1;
                }

                ++var2;
                if (var2 == class_b.field_i) {
                    var2 = 0;
                }
            }

            return this.field_b;
        }
    }

    String method_s1(int var1) {
        String var3 = class_b.field_b[var1].field_c + '\n';
        var3 = var3 + field_E[class_b.field_b[var1].field_h] + '\n';
        var3 = var3 + "Cost: " + class_b.field_b[var1].field_e + '\n';
        var3 = var3 + class_b.field_b[var1].field_a;
        return var3;
    }

    void method_e2(boolean var1) {
        short var2 = (short)(this.field_U[3] - this.field_U[2]);
        short var3 = (short)(this.field_U[5] - this.field_U[4]);
        short var4 = (short)(this.field_U[7] - this.field_U[6]);
        if (!var1) {
            var2 = (short)(2 * var2 / 3);
            var3 = (short)(2 * var3 / 3);
            var4 = (short)(2 * var4 / 3);
        }

        if (this.method_k1(8)) {
            var2 = (short)(3 * var2 / 4);
            var3 = (short)(3 * var3 / 4);
            var4 = (short)(3 * var4 / 4);
        }

        short[] var10000 = this.field_U;
        var10000[2] += var2;
        var10000 = this.field_U;
        var10000[4] += var3;
        var10000 = this.field_U;
        var10000[6] += var4;
        this.field_s = false;
        this.field_L = false;
        this.field_I = false;
        int var5 = class_f.method_a2(100);
        if (var5 <= 10) {
            for(int var6 = 0; var6 < this.field_p; ++var6) {
                int var7 = Math.abs(this.field_H[var6]);
                if (var7 == 96) {
                    this.method_y1(var6);
                    break;
                }
            }
        }

        for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = var9 + 1;
            if (var10 != 4 && var10 != 5) {
                var5 = class_f.method_a2(100);
                if (var5 <= 25) {
                    this.field_A = (byte)class_f.method_c(var9, this.field_A);
                }
            }
        }

    }

    boolean method_k1(int var1) {
        int var2 = var1 - 1;
        return (this.field_A & 1 << var2) != 0;
    }

    void method_a15(int var1, class_d var2) {
        int var3 = Math.abs(this.field_H[var1]);
        byte var4 = class_a.field_j[var3 - 1];
        if (var4 == 13 || var4 == 15) {
            boolean var5 = true;
            switch (var3) {
                case 87:
                    if (this.field_j == 1 && this.method_x1()) {
                        this.method_e1();
                        break;
                    }

                    this.method_D1();
                    break;
                case 88:
                    this.method_H();
                    break;
                case 89:
                    this.field_U[2] = this.field_U[3];
                    break;
                case 90:
                    this.field_U[4] = this.field_U[5];
                    break;
                case 91:
                    short[] var12 = this.field_U;
                    var12[6] = (short)(var12[6] + 3 * this.field_U[5]);
                    break;
                case 92:
                    ++this.field_U[1];
                    break;
                case 93:
                    this.field_U[2] = this.field_U[3];
                    this.field_U[4] = this.field_U[5];
                    break;
                case 94:
                    this.field_s = true;
                    break;
                case 95:
                    this.field_L = true;
                    break;
                case 96:
                    this.field_I = true;
                    var5 = false;
                    break;
                case 97:
                    if (var2 != null) {
                        int var9 = var2.method_c(4);
                        int var11 = var2.method_c(10);
                        if (var9 <= 13 && var11 <= 13) {
                            var2.field_g = 0;
                            var2.method_d();
                        }
                    }
                    break;
                case 98:
                    if (var2 != null) {
                        int var8 = var2.method_c(4);
                        int var10 = var2.method_c(10);
                        if (var8 <= 22 && var10 <= 22) {
                            var2.field_g = 0;
                            var2.method_d();
                        }
                    }
                    break;
                case 99:
                    if (var2 != null) {
                        int var6 = var2.method_c(4);
                        int var7 = var2.method_c(10);
                        if (var6 <= 29 && var7 <= 29) {
                            var2.field_g = 0;
                            var2.method_d();
                        }
                    }
            }

            if (var5) {
                this.method_y1(var1);
            }
        }

    }

    boolean method_o1() {
        for(int var1 = 0; var1 < 14; ++var1) {
            if (this.field_R[var1][2] >= 10) {
                short[] var10000 = this.field_R[var1];
                var10000[2] = (short)(var10000[2] - 10);
                ++this.field_R[var1][0];
                short var2 = field_c[var1];
                int var3 = var2 / 2;
                this.field_N = (byte)(this.field_N | 1 << var3);
                ++this.field_U[1];
            }
        }

        if (this.field_U[1] >= 10) {
            ++this.field_U[0];
            return true;
        } else {
            return false;
        }
    }

    void method_d5() {
        class_k.method_d();
        short[] var10000 = this.field_U;
        var10000[1] = (short)(var10000[1] - 10);
    }

    String[] method_q1() {
        Vector var1 = new Vector();

        for(int var2 = 0; var2 < 8; ++var2) {
            if ((this.field_N & 1 << var2) != 0) {
                int var3 = var2 * 2;
                var1.addElement(field_y[var3]);
            }
        }

        int var6 = var1.size();
        if (var6 == 0) {
            return null;
        } else {
            String[] var4 = new String[var6];

            for(int var5 = 0; var5 < var6; ++var5) {
                var4[var5] = (String)var1.elementAt(var5);
            }

            return var4;
        }
    }

    private void method_C1() {
        short var1 = class_a.method_a();
        int[] var2 = field_ac[this.field_ar];

        for(int var3 = 0; var3 < var2.length; ++var3) {
            this.method_c4(var2[var3], var1);
            int var4 = this.field_p - 1;
            this.method_d3(var4, true);
        }

    }

    void method_a16(long var1) {
        int var3 = (int)(var1 * (long)(this.field_J[10] + this.field_J[11]) / 2000L);
        short[] var10000 = this.field_U;
        var10000[6] = (short)(var10000[6] + var3);
        if (this.field_U[6] > this.field_U[7]) {
            this.field_U[6] = this.field_U[7];
        }

    }

    private boolean method_a17(int var1, int var2, int var3) {
        if (var1 != 1) {
            return false;
        } else if (var2 >= 6 && var2 <= 12) {
            return var3 >= 6 && var3 <= 12;
        } else {
            return false;
        }
    }

    private void method_p1() {
        this.method_D1();
        if (this.field_Q) {
            this.field_Q = false;
        }

    }

    int method_b9(int var1, int var2) {
        int var3 = this.method_b3(13, true);
        if (var2 == 3) {
            var3 += 3;
        }

        short var4 = class_k.field_r[var1];
        int var5 = var3 - var4;
        int var6 = 20 - var5 * 5;
        int var7 = 20 + this.field_J[12] / 2 + var5 * 5;
        var6 = Math.min(Math.max(var6, 10), 95);
        var7 = Math.min(Math.max(var7, 10), 95);
        int var8 = method_d2(var7, var6);
        return var8;
    }

    private void method_B1() {
        --this.field_ak;
        if (this.field_ak <= 0) {
            this.field_ak = 4;
        }

    }

    private void method_a18() {
        ++this.field_ak;
        if (this.field_ak >= 5) {
            this.field_ak = 1;
        }

    }

    String method_K() {
        byte var1 = this.field_ak;
        StringBuffer var2 = new StringBuffer(1000);
        System.out.println("here 1");
        String[] var3 = this.method_b8().method_a14();
        var2.append("Current dungeon is " + var3[0] + " " + var3[1] + "\n");

        for(int var4 = 1; var4 <= 4; ++var4) {
            if (var4 <= 2) {
                this.method_g2(var4);
            } else if (var4 == 3) {
                this.method_a18();
                this.method_g2(1);
            } else if (var4 == 4) {
                this.method_B1();
                this.method_g2(1);
            }

            System.out.println("here 2, i =" + var4);
            if (var4 == 1) {
                var2.append("FORWARD SQUARE: \n");
            } else if (var4 == 2) {
                var2.append("BACKWARD SQUARE: \n");
            } else if (var4 == 3) {
                var2.append("RIGHT SIDE SQUARE: \n");
            } else if (var4 == 4) {
                var2.append("LEFT SIDE SQUARE: \n");
            }

            var2.append("x,y = " + this.field_z + ", " + this.field_w + "\n");
            System.out.println("New a and y are " + this.field_z + ", " + this.field_w);
            var2.append("map value = " + this.method_b8().field_w[this.field_z][this.field_w] + "\n");
            System.out.println("New dungeon id is " + this.field_ab);
            Hashtable var5 = ESGame.field_G[this.field_ab - 1];
            if (var5 != null) {
                Enumeration var6 = var5.elements();

                while(var6.hasMoreElements()) {
                    byte[] var7 = (byte[])var6.nextElement();
                    System.out.println("Found a monster");
                    if (var7[4] == this.field_z && var7[5] == this.field_w) {
                        var2.append("Found monster in square \n");
                        var2.append("type=" + var7[2] + ", health=" + var7[3] + ", dungeon id = " + var7[7] + "\n");
                    }
                }
            }

            System.out.println("here 3, i =" + var4);
            var5 = ESGame.field_S[this.field_ab - 1];
            if (var5 != null) {
                Enumeration var9 = var5.elements();

                while(var9.hasMoreElements()) {
                    byte[] var11 = (byte[])var9.nextElement();
                    if (var11[0] == this.field_z && var11[1] == this.field_w) {
                        var2.append("Found chest in square \n");
                        var2.append("item type=" + var11[4] + ", value=" + var11[7] + "\n");
                    }
                }
            }

            System.out.println("here 4, i =" + var4);
            Enumeration var10 = ESGame.field_au[this.field_ab - 1].elements();

            while(var10.hasMoreElements()) {
                byte[] var12 = (byte[])var10.nextElement();
                if (var12[0] == this.field_z && var12[1] == this.field_w) {
                    var2.append("Found dropped item in square \n");
                    var2.append("item type=" + var12[2] + ", value=" + var12[5] + " flags = " + var12[6] + "\n");
                }
            }

            this.field_ak = var1;
        }

        if (class_k.field_d) {
            var2.append("Warden IS visiting now\n");
        } else {
            var2.append("Warden IS NOT visiting now\n");
        }

        var2.append("Player inventory: nitems=" + this.field_p);
        return var2.toString();
    }
}
