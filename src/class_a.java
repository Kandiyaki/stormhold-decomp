//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import java.io.DataInputStream;
import java.util.Random;

public class class_a {
    static int field_n;
    static String[] field_g;
    static int field_k;
    static String[] field_b;
    static byte[] field_j;
    static byte[] field_c;
    static byte[] field_m;
    static short[] field_f;
    static short[] field_a;
    static byte[] field_e;
    static String[][] field_l = new String[][]{{"Warp to camp", ""}, {"Cures ailment", ""}, {"Restores Health", ""}, {"Restores Magicka", ""}, {"", ""}, {"Grants level", "experience"}, {"Health & Magicka", ""}, {"Increase harm", ""}, {"Increase armor", ""}, {"Safe camping", ""}, {"Kill monster", ""}, {"Kill monster", ""}, {"Kill monster", ""}};
    static byte[][] field_h;
    static byte field_d;
    static short field_i;

    class_a() {
    }

    static short method_a() {
        ++field_i;
        return field_i;
    }

    static int method_e(int var0) {
        return var0 - 1;
    }

    static boolean method_c(int var0) {
        int var1 = method_e(var0);
        return field_e[var1] != -1;
    }

    static boolean method_b(int var0) {
        int var1 = method_e(var0);
        byte var2 = field_j[var1];
        switch (var2) {
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
                return true;
            default:
                return false;
        }
    }

    static int method_a1(int var0) {
        int var1 = method_e(var0);
        byte var2 = field_e[var1];
        return var2;
    }

    static String method_d(int var0) {
        int var1 = method_e(var0);
        return field_b[var1];
    }

    static int method_a2(int var0, int var1) {
        int var2 = method_e(var1);
        short var3;
        switch (var0) {
            case 1:
                var3 = field_j[var2];
                break;
            case 2:
                var3 = field_c[var2];
                break;
            case 3:
                var3 = field_m[var2];
                break;
            case 4:
                var3 = field_f[var2];
                break;
            case 5:
                var3 = field_a[var2];
                break;
            case 6:
                var3 = field_e[var2];
                break;
            default:
                var3 = -1;
        }

        return var3;
    }

    static void method_e1() throws Exception {
        field_i = 0;
        method_c1();
        method_d1();
    }

    static void method_c1() throws Exception {
        DataInputStream var0 = DataTools.method_a1("/itemsin.dat");
        field_n = var0.readShort();
        field_g = new String[field_n];

        for(int var1 = 0; var1 < field_n; ++var1) {
            field_g[var1] = var0.readUTF();
        }

        field_k = var0.readShort();
        field_b = new String[field_k];
        field_j = new byte[field_k];
        field_c = new byte[field_k];
        field_m = new byte[field_k];
        field_f = new short[field_k];
        field_a = new short[field_k];
        field_e = new byte[field_k];

        for(int var2 = 0; var2 < field_k; ++var2) {
            field_b[var2] = var0.readUTF();
        }

        for(int var3 = 0; var3 < field_k; ++var3) {
            field_j[var3] = var0.readByte();
        }

        for(int var4 = 0; var4 < field_k; ++var4) {
            field_c[var4] = var0.readByte();
        }

        for(int var5 = 0; var5 < field_k; ++var5) {
            field_m[var5] = var0.readByte();
        }

        for(int var6 = 0; var6 < field_k; ++var6) {
            field_f[var6] = var0.readShort();
        }

        for(int var7 = 0; var7 < field_k; ++var7) {
            field_a[var7] = var0.readShort();
        }

        for(int var8 = 0; var8 < field_k; ++var8) {
            field_e[var8] = var0.readByte();
        }

        var0.close();
    }

    static void method_d1() throws Exception {
        DataInputStream var0 = DataTools.method_a1("/droppeditemsin.dat");
        short var1 = var0.readShort();
        field_d = (byte)var1;
        System.out.println("numTableRows=" + field_d);
        short var2 = var0.readShort();
        field_h = new byte[var1][var2];

        for(int var3 = 0; var3 < var1; ++var3) {
            for(int var4 = 0; var4 < var2; ++var4) {
                field_h[var3][var4] = var0.readByte();
            }
        }

        var0.close();
    }

    static int method_a3(Random var0, int var1) {
        int var2 = -1;
        int var3 = -1;

        for(int var4 = 0; var4 < field_k; ++var4) {
            if (field_j[var4] == 11 && field_c[var4] == (byte)var1) {
                if (var2 == -1) {
                    var2 = var4;
                }

                var3 = var4;
            }
        }

        int var5 = var3 - var2 + 1;
        int var6 = var2 + Math.abs(var0.nextInt() % var5);
        return 1 + var6;
    }

    static int method_a4(Random var0, int var1, int var2) {
        int var3 = DataTools.method_a3(var0, 100);
        int var4 = var3;

        for(int var5 = 1; var5 < var2; ++var5) {
            var3 = DataTools.method_a3(var0, 100);
            if (var3 > var4) {
                var4 = var3;
            }
        }

        byte var6;
        if (var4 <= 64) {
            var6 = 0;
        } else if (var4 <= 75) {
            var6 = 1;
        } else if (var4 <= 90) {
            var6 = 3;
        } else {
            var6 = 4;
        }

        int var7 = DataTools.method_a3(var0, 10);
        var7 += var1 - 2;
        if (var7 > field_d - 1) {
            var7 = field_d - 1;
        }

        if (var7 < 0) {
            var7 = 0;
        }

        byte var8 = field_h[var7][var6];
        int var9 = var8;
        if (var6 == 1) {
            byte var10 = field_h[var7][2];
            var9 = var8 | var10 << 8;
        }

        System.out.println("in getRandomItem, res = " + var9);
        return var9;
    }

    static String[] method_b1() {
        String[] var0 = new String[13];

        for(int var1 = 0; var1 < 13; ++var1) {
            var0[var1] = field_b[86 + var1];
        }

        return var0;
    }
}
