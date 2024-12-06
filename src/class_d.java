//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Random;

public class class_d {
    private static int field_d;
    private static String[] field_h;
    private static byte[][] field_e;
    short field_a;
    byte field_l;
    byte field_g;
    byte field_o;
    byte field_m;
    boolean field_i;
    byte field_n;
    byte[] field_c;
    byte field_b;
    byte field_f;
    long field_k;
    static class_d field_p = new class_d();
    static short field_j;

    static short method_b() {
        ++field_j;
        return field_j;
    }

    byte[] method_f() {
        byte[] var1 = new byte[28];
        var1[0] = (byte)(this.field_a >>> 8 & 255);
        var1[1] = (byte)(this.field_a & 255);
        var1[2] = this.field_l;
        var1[3] = this.field_g;
        var1[4] = this.field_o;
        var1[5] = this.field_m;
        var1[6] = (byte)(this.field_i ? 1 : 0);
        var1[7] = this.field_n;
        var1[8] = this.field_b;
        var1[9] = this.field_f;
        var1[10] = (byte)((int)(this.field_k >>> 56 & 255L));
        var1[11] = (byte)((int)(this.field_k >>> 48 & 255L));
        var1[12] = (byte)((int)(this.field_k >>> 40 & 255L));
        var1[13] = (byte)((int)(this.field_k >>> 32 & 255L));
        var1[14] = (byte)((int)(this.field_k >>> 24 & 255L));
        var1[15] = (byte)((int)(this.field_k >>> 16 & 255L));
        var1[16] = (byte)((int)(this.field_k >>> 8 & 255L));
        var1[17] = (byte)((int)(this.field_k & 255L));

        for(int var2 = 0; var2 < 10; ++var2) {
            var1[18 + var2] = this.field_c[var2];
        }

        return var1;
    }

    public class_d() {
        this.field_c = new byte[10];
        this.field_i = false;
    }

    public class_d(int var1, int var2, int var3) {
        this.field_a = (short)var1;
        this.field_l = (byte)var2;
        this.field_g = field_e[this.field_l - 1][14];
        this.field_c = new byte[10];
        this.field_i = false;
        this.field_n = (byte)var3;
        this.field_f = 0;
    }

    static class_d method_a(byte[] var0) {
        short var1 = (short)(var0[0] & 255);
        short var2 = (short)(var0[1] & 255);
        field_p.field_a = (short)(var1 << 8 | var2);
        field_p.field_l = var0[2];
        field_p.field_g = var0[3];
        field_p.field_o = var0[4];
        field_p.field_m = var0[5];
        field_p.field_i = var0[6] != 0;
        field_p.field_n = var0[7];
        field_p.field_b = var0[8];
        field_p.field_f = var0[9];
        field_p.field_k = DataTools.method_a9(var0, 10);

        for(int var3 = 0; var3 < 10; ++var3) {
            field_p.field_c[var3] = var0[18 + var3];
        }

        return field_p;
    }

    static class_d method_a1(class_d var0, byte[] var1) {
        short var2 = (short)(var1[0] & 255);
        short var3 = (short)(var1[1] & 255);
        var0.field_a = (short)(var2 << 8 | var3);
        var0.field_l = var1[2];
        var0.field_g = var1[3];
        var0.field_o = var1[4];
        var0.field_m = var1[5];
        var0.field_i = var1[6] != 0;
        var0.field_n = var1[7];
        var0.field_b = var1[8];
        var0.field_f = var1[9];
        var0.field_k = DataTools.method_a9(var1, 10);

        for(int var4 = 0; var4 < 10; ++var4) {
            var0.field_c[var4] = var1[18 + var4];
        }

        return var0;
    }

    void method_d() {
        ESGame.field_G[this.field_n - 1].put(String.valueOf(this.field_a), this.method_f());
    }

    String method_a2() {
        return field_h[this.field_l - 1];
    }

    int method_c(int var1) {
        return field_e[this.field_l - 1][var1] & 255;
    }

    boolean method_e() {
        return this.field_l >= 6 && this.field_l <= 8;
    }

    void method_b1(int var1) {
        int var2 = this.field_g & 255;
        if (var1 > var2) {
            var1 = var2;
        }

        var2 -= var1;
        this.field_g = (byte)var2;
    }

    boolean method_a3(int var1) {
        byte var2 = 1;
        byte var3 = this.field_o;
        byte var4 = this.field_m;
        class_i var5 = ESGame.field_u[this.field_n - 1];
        switch (var1) {
            case 1:
                var2 = -1;
            case 3:
                var3 = this.field_o;
                var4 = (byte)(this.field_m + var2);
                break;
            case 4:
                var2 = -1;
            case 2:
                var4 = this.field_m;
                var3 = (byte)(this.field_o + var2);
                break;
            default:
                return false;
        }

        if (var3 >= 0 && var4 >= 0) {
            if (var3 < var5.field_g && var4 < var5.field_y) {
                if (this.method_a5(var3, var4)) {
                    return false;
                } else if (!var5.method_d2(var3, var4)) {
                    return false;
                } else {
                    var5.field_w[this.field_o][this.field_m] = DataTools.clearManyBits((byte)2, var5.field_w[this.field_o][this.field_m]);
                    var5.field_w[var3][var4] = DataTools.setManyBits((byte)2, var5.field_w[var3][var4]);
                    this.field_o = var3;
                    this.field_m = var4;
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    void method_a4(class_j var1) {
        if (this.method_d1(var1)) {
            if (this.field_b == 0) {
                this.method_e1(var1);
                ++this.field_b;
            } else if (this.field_b >= 4) {
                this.field_b = 0;
            } else {
                ++this.field_b;
            }
        }

    }

    private void method_e1(class_j var1) {
        int var6 = Math.abs(var1.field_l - this.field_o);
        int var7 = Math.abs(var1.field_k - this.field_m);
        byte var2;
        if (this.field_o < var1.field_l) {
            var2 = 2;
        } else if (this.field_o > var1.field_l) {
            var2 = 4;
        } else {
            var2 = -1;
        }

        byte var3;
        if (this.field_m < var1.field_k) {
            var3 = 3;
        } else if (this.field_m > var1.field_k) {
            var3 = 1;
        } else {
            var3 = -1;
        }

        byte var4;
        byte var5;
        if (var6 > var7) {
            var4 = var2;
            var5 = var3;
        } else if (var6 < var7) {
            var4 = var3;
            var5 = var2;
        } else {
            int var8 = ESGame.method_h1(2);
            if (var8 == 0) {
                var4 = var2;
                var5 = var3;
            } else {
                var4 = var3;
                var5 = var2;
            }
        }

        if (!this.method_a3(var4)) {
            if (!this.method_a3(var5)) {
                ;
            }
        }
    }

    private boolean method_a5(int var1, int var2) {
        class_i var3 = ESGame.field_u[this.field_n - 1];
        if (var3.field_s != 1 && var3.field_v != 1) {
            if (var3.field_s != 3 && var3.field_v != 3) {
                if (var3.field_s != 4 && var3.field_v != 4) {
                    if ((var3.field_s == 2 || var3.field_v == 2) && var1 == 30 && var2 == 17) {
                        return true;
                    }
                } else if (var1 == 5 && var2 == 17) {
                    return true;
                }
            } else if (var1 == 17 && var2 == 30) {
                return true;
            }
        } else if (var1 == 17 && var2 == 5) {
            return true;
        }

        return false;
    }

    boolean method_d1(class_j var1) {
        return this.method_c1(var1) <= 3;
    }

    int method_c1(class_j var1) {
        int var2 = Math.abs(var1.field_l - this.field_o);
        int var3 = Math.abs(var1.field_k - this.field_m);
        return var2 + var3;
    }

    boolean method_b2(class_j var1) {
        if (this.method_c1(var1) == 1) {
            return true;
        } else {
            this.field_f = 0;
            return false;
        }
    }

    void method_a6(class_j var1, long var2) {
        this.field_f = 2;
        this.field_k = var2;
        byte var4 = field_e[this.field_l - 1][4];
        int var5 = var1.method_f(true);
        int var6 = var5 - var4;
        var6 = Math.min(var6, field_e[this.field_l - 1][2]);
        int var7 = field_e[this.field_l - 1][3] - var6 * 5;
        int var8 = var1.method_I() + var6 * 5;
        var7 = Math.min(Math.max(var7, 10), 95);
        var8 = Math.min(Math.max(var8, 10), 95);
        int var9 = DataTools.method_a2(100);
        int var10 = DataTools.method_a2(100);
        boolean var11 = var9 <= var7;
        boolean var12 = var10 <= var8;
        byte var13 = 0;
        if (var11 && !var12) {
            var13 = 3;
        } else if (var11 && var12) {
            if (var9 >= var10) {
                var13 = 2;
            } else {
                var13 = 1;
            }
        } else if (!var11 && !var12) {
            if (var9 >= var10) {
                var13 = 2;
            } else {
                var13 = 1;
            }
        } else {
            var13 = 0;
        }

        if (var13 == 0) {
            this.field_f = 1;
        } else {
            byte var14 = field_e[this.field_l - 1][5];
            int var15 = var1.method_v();
            if (var13 == 1) {
                var15 = 2 * var15;
            }

            int var16 = var14 - var15;
            var16 = Math.max(var16, 4);
            int var17 = var16 * var1.field_U[3] / 100;
            short[] var10000 = var1.field_U;
            var10000[2] = (short)(var10000[2] - var17);
            var1.field_U[2] = (short)Math.max(var1.field_U[2], 0);
            if (var12) {
                var1.method_a12(var1.method_y(), 1);
            }

            if (var13 < 3) {
                this.field_f = 1;
            } else {
                if (DataTools.method_a2(100) <= 30) {
                    byte var18 = field_e[this.field_l - 1][11];
                    if (var18 > 0) {
                        int var19 = var18 - 1;
                        var1.field_A = (byte)(var1.field_A | 1 << var19);
                        if (var18 != 1) {
                            if (var18 == 2) {
                                class_i var20 = ESGame.field_u[this.field_n - 1];
                                var20.method_c1(3);
                            } else if (var18 != 3) {
                                if (var18 == 4) {
                                    var1.field_ah = 30000;
                                } else if (var18 == 5) {
                                    var1.field_F = 30000;
                                } else if (var18 != 6 && var18 != 7 && var18 == 8) {
                                }
                            }
                        }
                    }
                }

                this.field_f = 1;
            }
        }
    }

    static void method_g() throws Exception {
        DataInputStream var0 = DataTools.method_a1("/monstersin.dat");
        field_j = 0;
        field_d = var0.readInt();
        field_h = new String[field_d];
        field_e = new byte[field_d][17];

        for(int var1 = 0; var1 < field_d; ++var1) {
            field_h[var1] = var0.readUTF();
        }

        for(int var2 = 0; var2 < field_d; ++var2) {
            for(int var3 = 0; var3 < 17; ++var3) {
                field_e[var2][var3] = var0.readByte();
            }
        }

    }

    static class_d method_a7(DataInputStream var0) throws Exception {
        class_d var1 = new class_d();
        var1.field_a = var0.readShort();
        var1.field_l = var0.readByte();
        var1.field_g = var0.readByte();
        var1.field_o = var0.readByte();
        var1.field_m = var0.readByte();
        var1.field_i = var0.readBoolean();
        var1.field_n = var0.readByte();
        var1.field_b = var0.readByte();
        var1.field_f = var0.readByte();
        var1.field_k = var0.readLong();

        for(int var2 = 0; var2 < 10; ++var2) {
            var1.field_c[var2] = var0.readByte();
        }

        return var1;
    }

    void method_a8(DataOutputStream var1) throws Exception {
        var1.writeShort(this.field_a);
        var1.writeByte(this.field_l);
        var1.writeByte(this.field_g);
        var1.writeByte(this.field_o);
        var1.writeByte(this.field_m);
        var1.writeBoolean(this.field_i);
        var1.writeByte(this.field_n);
        var1.writeByte(this.field_b);
        var1.writeByte(this.field_f);
        var1.writeLong(this.field_k);

        for(int var2 = 0; var2 < 10; ++var2) {
            var1.writeByte(this.field_c[var2]);
        }

    }

    void method_c2() {
    }

    void method_a9(boolean var1) {
        byte var2 = field_e[this.field_l - 1][15];
        if (var1) {
            var2 = 100;
        }

        byte var3 = field_e[this.field_l - 1][16];
        int var4 = DataTools.method_a2(100);
        boolean var5 = var4 <= var2;
        if (var5 || var1) {
            class_i var6 = ESGame.field_u[this.field_n - 1];
            byte var7 = var6.field_a;
            int var8 = class_a.method_a4(ESGame.field_P, var7, var3);
            byte var9 = (byte)(var8 & 255);
            byte var10 = 0;
            if (var9 == 86) {
                var10 = (byte)(var8 >>> 8 & 255);
            }

            byte[] var11 = new byte[]{this.field_o, this.field_m, var9, 0, 0, var10, 0};
            short var12 = class_a.method_a();
            var9 = (byte)(var12 >>> 8 & 255);
            var10 = (byte)(var12 & 255);
            var11[3] = var9;
            var11[4] = var10;
            var11[6] = 1;
            if (var1) {
                var11[6] = (byte)(var11[6] | 4);
            }

            var6.method_c2(var11);
        }

    }

    static class_d method_a10(class_i var0) {
        return method_a11(ESGame.field_P, var0, -1);
    }

    static class_d method_a11(Random var0, class_i var1, int var2) {
        short var3 = method_b();
        int var4 = var2;
        if (var2 < 0) {
            int var5 = var1.field_a - 1;
            if (var5 < 0) {
                var5 = 0;
            }

            if (var5 > 36) {
                var5 = 36;
            }

            int var6 = ESGame.method_a11(var0, 10);
            byte var7 = 0;
            if (var6 <= 4) {
                var7 = 0;
            } else if (var6 <= 7) {
                var7 = 1;
            } else if (var6 <= 9) {
                var7 = 2;
            } else {
                var7 = 3;
            }

            var4 = class_i.field_l[var5][var7];
        }

        class_d var8 = new class_d(var3, var4, var1.field_o);
        return var8;
    }
}
