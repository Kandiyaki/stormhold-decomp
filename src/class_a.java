//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ;

import java.io.DataInputStream;
import java.util.Random;

public class class_a {
    static int numItemTypes;
    static String[] itemTypesArray;
    static int numItems;
    static String[] itemName;
    static byte[] itemType;
    static byte[] field_c;
    static byte[] itemValue;
    static short[] field_f;
    static short[] field_a;
    static byte[] field_e;
    static String[][] field_l = new String[][]{{"Warp to camp", ""}, {"Cures ailment", ""}, {"Restores Health", ""}, {"Restores Magicka", ""}, {"", ""}, {"Grants level", "experience"}, {"Health & Magicka", ""}, {"Increase harm", ""}, {"Increase armor", ""}, {"Safe camping", ""}, {"Kill monster", ""}, {"Kill monster", ""}, {"Kill monster", ""}};
    static byte[][] droppedItemsTable;
    static byte numTableRows;
    static short field_i;

    //more static methods. another tools class?
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
        byte var2 = itemType[var1];
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
        return itemName[var1];
    }

    static int method_a2(int var0, int var1) {
        int var2 = method_e(var1);
        short var3;
        switch (var0) {
            case 1:
                var3 = itemType[var2];
                break;
            case 2:
                var3 = field_c[var2];
                break;
            case 3:
                var3 = itemValue[var2];
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

    //never called????? seems important
    static void initItemList() throws Exception {
        field_i = 0;
        initItemsTable();
        initDroppedItemsTable();
    }

    static void initItemsTable() throws Exception {
        DataInputStream itemsTableStream = DataTools.readDatFileAsInputStream("/itemsin.dat");
        numItemTypes = itemsTableStream.readShort(); //from reading dat file, i think numStrings is 17
        itemTypesArray = new String[numItemTypes];

        for(int i = 0; i < numItemTypes; ++i) {
            itemTypesArray[i] = itemsTableStream.readUTF();
        }

        numItems = itemsTableStream.readShort();//from reading dat file, should be 109
        itemName = new String[numItems];
        itemType = new byte[numItems];
        field_c = new byte[numItems];
        itemValue = new byte[numItems];
        field_f = new short[numItems];
        field_a = new short[numItems];
        field_e = new byte[numItems];

        for(int i = 0; i < numItems; ++i) {
            itemName[i] = itemsTableStream.readUTF();
        }

        for(int i = 0; i < numItems; ++i) {
            itemType[i] = itemsTableStream.readByte();
        }

        //TODO: do unplug reverse engineering on these.
        for(int i = 0; i < numItems; ++i) {
            //starts pos 1872, ends pos 1981. ranges from 00 to 05
            field_c[i] = itemsTableStream.readByte();
            //field_c[i] = (byte)'E';//something like this? replacing the prev line will stop us from moving to next byte

        }

        for(int i = 0; i < numItems; ++i) {
            itemValue[i] = itemsTableStream.readByte();
        }

        for(int i = 0; i < numItems; ++i) {
            field_f[i] = itemsTableStream.readShort();
        }

        for(int i = 0; i < numItems; ++i) {
            field_a[i] = itemsTableStream.readShort();
        }

        for(int i = 0; i < numItems; ++i) {
            field_e[i] = itemsTableStream.readByte();
        }

        itemsTableStream.close();
    }

    static void initDroppedItemsTable() throws Exception {
        DataInputStream droppedItemsTableStream = DataTools.readDatFileAsInputStream("/droppeditemsin.dat");
        //i assume the first 2 shorts of this .dat file are a row and column number respectively?
        short rows = droppedItemsTableStream.readShort();
        numTableRows = (byte)rows;
        System.out.println("numTableRows=" + numTableRows);
        short columns = droppedItemsTableStream.readShort();
        droppedItemsTable = new byte[rows][columns];

        //populate table from dat file
        for(int rowN = 0; rowN < rows; ++rowN) {
            for(int colN = 0; colN < columns; ++colN) {
                droppedItemsTable[rowN][colN] = droppedItemsTableStream.readByte();
            }
        }

        droppedItemsTableStream.close();
    }

    static int method_a3(Random var0, int var1) {
        int var2 = -1;
        int var3 = -1;

        for(int var4 = 0; var4 < numItems; ++var4) {
            if (itemType[var4] == 11 && field_c[var4] == (byte)var1) {
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

    static int getRandomItem(Random rngSeed, int var1, int var2) {
        int var3 = DataTools.seededRandomIntOneToN(rngSeed, 100);
        int var4 = var3;

        for(int var5 = 1; var5 < var2; ++var5) {
            var3 = DataTools.seededRandomIntOneToN(rngSeed, 100);
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

        int var7 = DataTools.seededRandomIntOneToN(rngSeed, 10);
        var7 += var1 - 2;
        if (var7 > numTableRows - 1) {
            var7 = numTableRows - 1;
        }

        if (var7 < 0) {
            var7 = 0;
        }

        byte var8 = droppedItemsTable[var7][var6];
        int res = var8;
        if (var6 == 1) {
            byte var10 = droppedItemsTable[var7][2];
            res = var8 | var10 << 8;
        }

        System.out.println("in getRandomItem, res = " + res);
        return res;
    }

    static String[] method_b1() {
        String[] var0 = new String[13];

        for(int var1 = 0; var1 < 13; ++var1) {
            var0[var1] = itemName[86 + var1];
        }

        return var0;
    }
}
