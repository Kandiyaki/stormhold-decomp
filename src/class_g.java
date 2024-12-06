//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import java.io.InputStream;

public class class_g {
    int field_e;
    int field_a;
    int field_h;
    boolean field_c;
    short field_d;
    short field_f;
    short[] field_g;
    static short[] field_b = new short[256];

    private class_g() {
        this.field_e = this.field_a = 0;
        this.field_g = null;
        this.field_f = -1;
    }

    //allocates sprites for things that look different based on distance?
    static class_g makeMovingSprite(String var0) throws Exception {
        InputStream var1 = (new Object()).getClass().getResourceAsStream(method_a1(var0));
        if (var1 == null) {
            throw new Exception("Image " + var0 + " is null!");
        } else {
            class_g var2 = new class_g();
            var2.field_e = method_b2(var1);
            var2.field_a = method_b2(var1);
            var2.field_h = var2.field_e;
            int var3 = var1.read() & 255;
            if (var3 != 0) {
                var2.field_c = true;
            } else {
                var2.field_c = false;
            }

            var2.field_d = method_a2(var1);
            int var4 = var1.read() & 255;
            if (var4 > 255) {
                throw new Exception("Too many colors in image " + var0);
            } else {
                for(int var5 = 0; var5 < var4; ++var5) {
                    short var6 = method_a2(var1);
                    field_b[var5] = var6;
                    if (var2.field_c && var2.field_f < 0 && var2.field_d == var6) {
                        var2.field_f = (short)var5;
                    }
                }

                int var10 = var2.field_e * var2.field_a;
                var2.field_g = new short[var10];

                for(int var7 = 0; var7 < var10; ++var7) {
                    int var8 = var1.read() & 255;
                    short var9 = field_b[var8];
                    if (var2.field_c && var8 == var2.field_f) {
                        var9 = (short)(var9 & -61441);
                    } else {
                        var9 = (short)(var9 | '\uf000');
                    }

                    var2.field_g[var7] = var9;
                }

                return var2;
            }
        }
    }

    int method_a() {
        return this.field_e;
    }

    int method_b1() {
        return this.field_a;
    }

    private static String method_a1(String var0) {
        return var0.startsWith("/") ? var0 : "/" + var0;
    }

    private static int method_b2(InputStream var0) throws Exception {
        int var5 = 0;
        int var1 = var0.read();
        var5 |= var1 << 24;
        int var2 = var0.read();
        var5 |= var2 << 16;
        int var3 = var0.read();
        var5 |= var3 << 8;
        int var4 = var0.read();
        var5 |= var4;
        return var5;
    }

    private static short method_a2(InputStream var0) throws Exception {
        int var5 = 0;
        int var1 = var0.read();
        var5 |= var1 << 8;
        int var2 = var0.read();
        var5 |= var2;
        var5 &= 65535;
        return (short)var5;
    }
}
