//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import java.io.DataInputStream;

public class ESPersonality {
    static String[] field_s = new String[]{"Arantamo", "Celegil", "Favela Dralor", "Vander", "Beneca", "Helga", "Varus"};
    static byte[] field_e = new byte[]{1, 1, 1, 1, 2, 2, 3};
    static byte[] field_j = new byte[]{12, 3, 15, 6, 7, 12, 9};
    static byte[] field_i = new byte[]{3, 7, 7, 13, 2, 13, 9};
    static boolean[] field_b;
    static boolean[] field_q;
    static byte field_f = 0;
    static boolean field_d = false;
    static byte[] field_c;
    static byte[] field_n;
    static short[] field_r;
    static short[] field_p;
    static short[] field_h;
    static short field_a;
    static short field_g;
    static boolean field_l;
    static String[][] message;
    static int[] field_o = new int[]{20, 20, 20, 20, 5, 22, 5, 41};
    static boolean field_m = false;

    public ESPersonality() {
    }

    static void method_e() {
        method_a("/npcstrings.dat");
    }

    static void method_a(String path) {
        try {
            DataInputStream var1 = DataTools.readDatFileAsInputStream(path);
            byte var2 = 8;
            message = new String[var2][];

            for(int var3 = 0; var3 < var2; ++var3) {
                method_a3(var3, field_o[var3], var1);
            }

            field_m = true;
        } catch (Exception var4) {
            System.out.println("ERROR loading NPC and generic strings!");
            field_m = false;
        }

    }

    static boolean method_a1(int var0) {
        if (field_f == 0 && !field_d && var0 >= 13) {
            return true;
        } else if (field_f == 1 && !field_d && var0 >= 26) {
            return true;
        } else {
            return field_f == 2 && !field_d && var0 >= 39;
        }
    }

    static void method_c() {
        System.out.println("WARDEN VISITS!!");
        field_d = true;
        ++field_f;
        byte var0 = field_j[6];
        byte var1 = field_i[6];
        byte[] var10000 = ESGame.field_u[0].field_w[var0];
        var10000[var1] = (byte)(var10000[var1] | 32);
    }

    static void method_a2() {
        System.out.println("WARDEN LEAVES!!");
        byte var0 = field_j[6];
        byte var1 = field_i[6];
        field_d = false;
        byte var2 = ESGame.field_u[1].field_w[var0][var1];
        ESGame.field_u[0].field_w[var0][var1] = DataTools.clearManyBits((byte)32, var2);
    }

    static void method_a3(int var0, int var1, DataInputStream var2) throws Exception {
        int var3 = var2.readInt();
        if (var3 != var1) {
            System.out.println("Unexpected number of messages for whichNPC = " + var0);
            throw new Exception("Error in readNPCMessages: npc is " + var0);
        } else {
            message[var0] = new String[var3];

            for(int var4 = 0; var4 < var3; ++var4) {
                message[var0][var4] = var2.readUTF();
            }

        }
    }

    static void method_b() {
        field_b = new boolean[7];
        field_q = new boolean[7];

        for(int var0 = 0; var0 < 7; ++var0) {
            field_b[var0] = true;
            field_q[var0] = true;
        }

        field_r = new short[4];
        field_p = new short[4];
        field_h = new short[4];
        field_c = new byte[4];
        field_n = new byte[4];

        for(int var1 = 0; var1 < 4; ++var1) {
            field_r[var1] = 0;
            field_p[var1] = 0;
            field_h[var1] = 0;
            field_c[var1] = 0;
            field_n[var1] = 0;
        }

        field_a = 0;
        field_g = 0;
        field_l = false;
    }

    static void method_d() {
        for(int var0 = 0; var0 < 4; ++var0) {
            field_c[var0] = 0;
            field_n[var0] = 0;
        }

    }

    static boolean method_b1(int var0) {
        return field_e[var0] == 1;
    }

    static int method_a4(int var0, int var1) {
        for(int var2 = 0; var2 < 7; ++var2) {
            if (var0 == field_j[var2] && var1 == field_i[var2] && field_b[var2]) {
                return var2;
            }
        }

        return -1;
    }

    static int method_d1(int var0, int var1) {
        int var2 = class_a.method_a2(3, var1);
        if (var0 == 0) {
            return var2 >>> 6 & 3;
        } else if (var0 == 1) {
            return var2 >>> 4 & 3;
        } else if (var0 == 2) {
            return var2 >>> 2 & 3;
        } else {
            return var0 == 3 ? var2 & 3 : 0;
        }
    }

    static String method_a5(class_j var0, int var1) {
        short var2 = var0.field_R[var1][0];
        if (var2 == 0) {
            var0.field_R[var1][0] = 1;
            String var6 = message[7][1];
            var6 = DataTools.replacePartOfString(var6, "<TAG>", class_j.charSkills[var1]);
            return var6;
        } else {
            var0.field_R[var1][0] = (short)(var2 + 1);
            String var3 = message[7][2];
            String[] var4 = new String[]{class_j.charSkills[var1], String.valueOf(var2), String.valueOf(var2 + 1)};
            var3 = DataTools.replacePartOfManyStrings(var3, "<TAG>", var4);
            return var3;
        }
    }

    static String method_a6(class_j var0, int iNPC, int var2, int var3) {
        switch (iNPC) {
            case 0:
            case 1:
            case 2:
            case 3:
                if (var2 == 1) {
                    if (field_q[iNPC]) {
                        field_q[iNPC] = false;
                        return message[iNPC][0];
                    } else if (field_h[iNPC] > 50) {
                        return message[iNPC][1];
                    } else {
                        if (var0.field_U[8] > 50) {
                            return message[iNPC][2];
                        }

                        int var10 = ESGame.randomIntZeroToLessThanN(3);
                        return message[iNPC][3 + var10];
                    }
                } else if (var2 == 2) {
                    if (field_c[iNPC] != 0) {
                        return message[iNPC][6];
                    }

                    int var9 = var0.method_b9(iNPC, var2);
                    if (var9 == 0) {
                        field_c[iNPC] = 1;
                    } else if (var9 == 1) {
                        short[] var28 = var0.field_R[13];
                        var28[2] = (short)(var28[2] + 2);
                    } else if (var9 == 2) {
                        short[] var29 = var0.field_R[13];
                        var29[2] = (short)(var29[2] + 5);
                        ++field_p[iNPC];
                        field_c[iNPC] = 1;
                    } else if (var9 == 3) {
                        short[] var31 = var0.field_R[13];
                        var31[2] = (short)(var31[2] + 8);
                        ++field_p[iNPC];
                        field_c[iNPC] = 1;
                    }

                    ++field_r[iNPC];
                    return message[iNPC][7 + var9];
                } else if (var2 == 3) {
                    if (field_n[iNPC] != 0) {
                        return message[iNPC][6];
                    }

                    int var8 = var0.method_b9(iNPC, var2);
                    int var15 = var3 <= 1 ? 0 : 1;
                    if (var8 == 0) {
                        field_n[iNPC] = 2;
                    } else if (var8 == 1) {
                        short[] var22 = var0.field_R[13];
                        var22[2] = (short)(var22[2] + 2);
                        field_n[iNPC] = 2;
                    } else if (var8 == 2) {
                        short[] var23 = var0.field_R[13];
                        var23[2] = (short)(var23[2] + 5);
                        ++field_p[iNPC];
                        field_n[iNPC] = 1;
                    } else if (var8 == 3) {
                        short[] var25 = var0.field_R[13];
                        var25[2] = (short)(var25[2] + 8);
                        ++field_p[iNPC];
                        field_n[iNPC] = 1;
                    }

                    ++field_r[iNPC];
                    return message[iNPC][11 + var15];
                } else if (var2 == 4) {
                    if (field_c[iNPC] != 2 && field_n[iNPC] != 2) {
                        int var14 = Math.abs(var0.field_H[var3]);
                        if (class_a.method_a2(1, var14) == 15) {
                            var0.method_y1(var3);
                            int var19 = class_a.method_a2(3, var14);
                            short[] var21 = field_h;
                            var21[iNPC] = (short)(var21[iNPC] - var19);
                            field_h[iNPC] = (short)Math.max(field_h[iNPC], 0);
                            return message[iNPC][17];
                        }

                        if (class_a.method_a2(1, var14) == 11) {
                            int var18 = method_d1(iNPC, var14);
                            if (var18 > 0) {
                                var0.method_y1(var3);
                                short[] var20 = field_p;
                                var20[iNPC] = (short)(var20[iNPC] + var18);
                                field_c[iNPC] = 0;
                                field_n[iNPC] = 0;
                            }

                            return message[iNPC][13 + var18];
                        }

                        return message[iNPC][13];
                    }

                    return message[iNPC][13];
                } else if (var2 == 5) {
                    if (field_p[iNPC] == 0) {
                        return message[iNPC][18];
                    } else if (field_h[iNPC] > 50) {
                        return message[iNPC][1];
                    } else {
                        if (var0.field_U[8] > 50) {
                            return message[iNPC][2];
                        }

                        --field_p[iNPC];
                        return method_a5(var0, var3);
                    }
                } else {
                    if (var2 == 6) {
                        field_b[iNPC] = false;
                        class_i var7 = ESGame.field_u[0];
                        var7.field_w[field_j[iNPC]][field_i[iNPC]] = DataTools.clearManyBits((byte)32, var7.field_w[field_j[iNPC]][field_i[iNPC]]);
                        return message[iNPC][19];
                    }

                    return null;
                }
            case 4:
                if (var2 == 1) {
                    if (field_q[iNPC]) {
                        field_q[iNPC] = false;
                        return message[iNPC][0];
                    }

                    return null;
                } else if (var2 == 4) {
                    int var13 = Math.abs(var0.field_H[var3]);
                    int var17 = class_a.method_a2(1, var13);
                    if (var17 != 13 && var17 != 15 && var17 != 17) {
                        ++field_a;
                        var0.method_y1(var3);
                        return message[iNPC][2];
                    }

                    return message[iNPC][1];
                } else {
                    if (var2 == 7) {
                        if (field_a / 3 > 0) {
                            short var12 = class_a.method_a();
                            boolean var16 = var0.method_b6(var3, var12, 0);
                            if (!var16) {
                                return message[7][0];
                            }

                            field_a = (short)(field_a - 3);
                            return message[iNPC][3];
                        }

                        return message[iNPC][4];
                    }

                    return null;
                }
            case 5:
                if (var2 == 1) {
                    System.out.println("Greeting Helga");
                    if (field_q[iNPC]) {
                        System.out.println("first meeting");
                        field_q[iNPC] = false;
                        var0.field_Y = 0;
                        System.out.println("message[iNPC] length is " + message[iNPC].length);
                        System.out.println(message[iNPC][0]);
                        System.out.println(message[iNPC][2]);
                        if (field_l) {
                            field_l = false;
                            return message[5][21] + "\n" + message[iNPC][0] + "\n" + message[iNPC][2];
                        }

                        return message[iNPC][0] + "\n" + message[iNPC][2];
                    } else {
                        int var4 = ESGame.getGameAdvancementLevel(var0.field_W);
                        if (var4 > var0.field_Y) {
                            ++var0.field_Y;
                            if (field_l) {
                                field_l = false;
                                return message[5][21] + "\n" + message[iNPC][2 + var0.field_Y];
                            }

                            return message[iNPC][2 + var0.field_Y];
                        } else {
                            if (field_l) {
                                field_l = false;
                                return message[5][21];
                            }

                            return null;
                        }
                    }
                } else if (var2 == 13) {
                    return message[iNPC][2 + var0.field_Y];
                } else if (var2 == 4) {
                    int var11 = Math.abs(var0.field_H[var3]);
                    if (class_a.method_a2(1, var11) == 13) {
                        int var6 = var0.method_D(var3);
                        if (var6 > 3) {
                            field_g = (short)(field_g + 5);
                        } else {
                            field_g = (short)(field_g + 3);
                        }

                        var0.method_y1(var3);
                        return message[iNPC][11];
                    }

                    return message[iNPC][12];
                } else if (var2 == 8) {
                    if (field_g < 7) {
                        return message[iNPC][1];
                    } else {
                        int var5 = Math.abs(var0.field_H[var3]);
                        if (class_a.method_b(var5) && !var0.method_j(var3)) {
                            field_g = (short)(field_g - 7);
                            var0.method_h2(var3);
                            return message[iNPC][13];
                        }

                        return message[iNPC][14];
                    }
                } else if (var2 == 9) {
                    if (field_g < 2) {
                        return message[iNPC][1];
                    } else {
                        if (var0.field_f) {
                            return message[iNPC][15];
                        }

                        var0.field_f = true;
                        field_g = (short)(field_g - 2);
                        return message[iNPC][16];
                    }
                } else if (var2 == 10) {
                    if (field_g < 1) {
                        return message[iNPC][1];
                    }

                    var0.field_A = 0;
                    --field_g;
                    return message[iNPC][17];
                } else if (var2 == 11) {
                    if (field_g < 1) {
                        return message[iNPC][1];
                    } else {
                        if (!var0.method_x1()) {
                            return message[iNPC][18];
                        }

                        --field_g;
                        var0.method_e1();
                        return message[iNPC][19];
                    }
                } else {
                    if (var2 == 12) {
                        var0.field_U[2] = var0.field_U[3];
                        var0.field_U[4] = var0.field_U[5];
                        return message[iNPC][20];
                    }

                    return null;
                }
            case 6:
                if (field_f == 0) {
                    return null;
                } else if (field_f == 1 && var0.field_m == 0) {
                    var0.field_m = 1;
                    return message[iNPC][0];
                } else if (field_f == 2 && var0.field_m <= 1) {
                    var0.field_m = 2;
                    return message[iNPC][1];
                } else if (field_f == 3 && var0.field_m <= 2) {
                    var0.field_m = 3;
                    return message[iNPC][2];
                } else {
                    if (field_f == 4 && var0.field_m <= 3) {
                        var0.field_m = 4;
                        return message[iNPC][3] + "\n" + message[iNPC][4];
                    }

                    return null;
                }
            default:
                return null;
        }
    }

    static boolean method_a7(class_j var0) {
        if (var0.field_j != 1) {
            return false;
        } else {
            int var1 = Math.abs(var0.field_l - field_j[6]);
            int var2 = Math.abs(var0.field_k - field_i[6]);
            return var1 + var2 == 1;
        }
    }

    static boolean method_c1(int var0, int var1) {
        switch (var0) {
            case 0:
                switch (var1) {
                    case 3:
                    case 4:
                    case 13:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (var1) {
                    case 7:
                    case 8:
                    case 10:
                        return true;
                    case 9:
                    default:
                        return false;
                }
            case 2:
                switch (var1) {
                    case 1:
                    case 6:
                    case 12:
                        return true;
                    default:
                        return false;
                }
            case 3:
                switch (var1) {
                    case 0:
                    case 2:
                    case 5:
                        return true;
                    default:
                        return false;
                }
            default:
                return false;
        }
    }

    static int method_b2(int var0, int var1) {
        switch (var0) {
            case 0:
                switch (var1) {
                    case 0:
                        return 3;
                    case 1:
                        return 4;
                    case 2:
                        return 13;
                    default:
                        return -1;
                }
            case 1:
                switch (var1) {
                    case 0:
                        return 7;
                    case 1:
                        return 8;
                    case 2:
                        return 10;
                    default:
                        return -1;
                }
            case 2:
                switch (var1) {
                    case 0:
                        return 1;
                    case 1:
                        return 6;
                    case 2:
                        return 12;
                    default:
                        return -1;
                }
            case 3:
                switch (var1) {
                    case 0:
                        return 0;
                    case 1:
                        return 2;
                    case 2:
                        return 5;
                    default:
                        return -1;
                }
            default:
                return -1;
        }
    }

    static {
        method_b();
    }
}
