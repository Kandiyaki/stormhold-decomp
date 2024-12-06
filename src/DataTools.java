//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;

public class DataTools {
    private static Object field_b = new Object();
    static int field_a = 0;

    private DataTools() {
    }

    static byte[] method_a(int var0, InputStream var1) throws Exception {
        if (var0 > 0) {
            byte[] var5 = new byte[var0];
            var1.read(var5);
            return var5;
        } else {
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();

            int var3;
            while((var3 = var1.read()) != -1) {
                var2.write(var3);
            }

            byte[] var4 = var2.toByteArray();
            return var4;
        }
    }

    static String method_b(String var0) {
        return var0.startsWith("/") ? var0 : "/" + var0;
    }

    static DataInputStream method_a1(String var0) throws Exception {
        return ESGame.method_a10(var0);
    }

    //something to do with RNG
    static int method_a2(int var0) {
        return ESGame.method_f1(var0);
    }

    static int method_a3(Random var0, int var1) {
        return ESGame.method_a11(var0, var1);
    }

    static String commaBetweenInts(int var0, int var1) {
        return var0 + "," + var1;
    }

    //replace part of string. NOT replace piece of shit.
    static String replacePOSWithInt(String fullString, String partToReplace, int replaceWithInt) {
        String var3 = "" + replaceWithInt; //turn int replaceWithInt into a string
        return replacePartOfString(fullString, partToReplace, var3);
    }

    static String replacePartOfManyStrings(String fullString, String partToReplace, String[] var2) {
        int arrayLength = var2.length;
        String var4 = fullString;

        for(int var5 = 0; var5 < arrayLength; ++var5) {
            String var6 = var2[var5];
            var4 = replacePartOfString(var4, partToReplace, var6);
        }

        return var4;
    }

    static String replacePartOfString(String fullString, String partToReplace, String replaceWith) {
        if (fullString != null && partToReplace != null) {
            int replaceIndex = fullString.indexOf(partToReplace);
            if (replaceIndex < 0) {
                return fullString;
            } else {
                String preIndex = fullString.substring(0, replaceIndex);
                if (preIndex == null) {
                    preIndex = "";
                }

                String postIndex = fullString.substring(replaceIndex + partToReplace.length());
                if (postIndex == null) {
                    postIndex = "";
                }

                String replacedString = preIndex + replaceWith + postIndex;
                return replacedString;
            }
        } else {
            return fullString;
        }
    }


    static int setSingleBit(int position, int input) {
        input |= 1 << position;
        return input;
    }

    static int clearSingleBit(int position, int input) {
        input &= ~(1 << position);
        return input;
    }

    static byte setManyBits(byte setMask, byte input) {
        input = (byte)(input | setMask);
        return input;
    }

    static byte clearManyBits(byte clearMask, byte input) {
        input = (byte)(input & ~clearMask);
        return input;
    }

    //if the bytes do not share any bits, the & will be zero, and the output will be false
    //if the bytes do share any bits, the output will be true
    static boolean doBytesShareBits(byte var0, byte var1) {
        return (var1 & var0) != 0;
    }

    static long method_a9(byte[] var0, int var1) {
        long var2 = 0L;

        for(int i = 0; i < 8; ++i) {
            long var5 = (long)(var0[i + var1] & 255);
            int var7 = (7 - i) * 8;
            var2 |= var5 << var7;
        }

        return var2;
    }

    //this is for removing spaces or something? i think?
    public static String[] method_c2(String inputString) {
        //remove whitespace from string
        inputString = inputString.trim();
        int var1 = 1;
        int inputLength = inputString.length();
        boolean var3 = false;

        for(int i = 0; i < inputLength; ++i) {
            if (inputString.charAt(i) == ' ') {
                if (!var3) {
                    ++var1;
                    var3 = true;
                }
            } else {
                var3 = false;
            }
        }

        String[] var5 = new String[var1];
        int var6 = 0;
        int var7 = 0;

        for(int var8 = 0; var8 < inputLength; ++var8) {
            if (inputString.charAt(var8) == ' ') {
                if (!var3) {
                    var5[var7++] = inputString.substring(var6, var8);
                    var6 = var8 + 1;
                    var3 = true;
                } else {
                    ++var6;
                }
            } else {
                var3 = false;
            }
        }

        var5[var7] = inputString.substring(var6, inputLength);
        return var5;
    }
}
