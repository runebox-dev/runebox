import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfInfo(name = "rc")
public class Class445 {
	@ObfInfo(name = "ac", desc = "[[B")
	public static byte[][] field4818;
	@ObfInfo(name = "az", desc = "[[B")
	public static byte[][] field4827;
	@ObfInfo(name = "ax", desc = "[[B")
	public static byte[][] field4828;
	@ObfInfo(name = "al", desc = "[[B")
	public static byte[][] field4830;
	@ObfInfo(owner = "aa", name = "aa", desc = "[[[B")
	public static byte[][][] field1;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1538023343)
	public static int field4815;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1386334113)
	public static int field4819;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -2045503449)
	public static int field4820;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 1337920469)
	public static int field4821;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1262218377)
	public static int field4822;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1356136809)
	public static int field4824;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -1171539117)
	public static int field4826;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -870884913)
	public static int field4831;
	@ObfInfo(owner = "fy", name = "ay", desc = "[I")
	public static int[] field1743;
	@ObfInfo(owner = "rs", name = "ao", desc = "[I")
	public static int[] field4899;
	@ObfInfo(name = "as", desc = "Ljava/util/ArrayList;")
	public static ArrayList field4829;
	@ObfInfo(name = "ap", desc = "Ljava/lang/Object;")
	public static final Object field4817;

	static {
		field4817 = new Object();
		field4819 = 0;
		field4820 = 0;
		field4821 = 0;
		field4822 = 0;
		field4831 = 1000;
		field4824 = 250;
		field4815 = 100;
		field4826 = 50;
		field4827 = new byte[1000][];
		field4828 = new byte[250][];
		field4818 = new byte[100][];
		field4830 = new byte[50][];
		field4829 = new ArrayList();
		method6075();
		new HashMap();
	}

	@ObfInfo(owner = "ds", name = "aq", desc = "([I[II)V", opaque = "1412113064")
	public static void method2630(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			field1743 = var0;
			field4899 = new int[var0.length];
			field1 = new byte[var0.length][][];

			for (int var3 = 0; var3 < field1743.length; ++var3) {
				field1[var3] = new byte[var1[var3]][];
				field4829.add(var0[var3]);
			}

			Collections.sort(field4829);
		} else {
			field1743 = null;
			field4899 = null;
			field1 = (byte[][][])null;
			method6075();
		}
	}

	@ObfInfo(owner = "ma", name = "ad", desc = "(B)V")
	public static void method6075() {
		field4829.clear();
		field4829.add(100);
		field4829.add(5000);
		field4829.add(10000);
		field4829.add(30000);
	}

	@ObfInfo(owner = "ku", name = "ag", desc = "(IZI)[B", opaque = "-1167369592")
	public static byte[] method5601(int var0, boolean var1) {
		synchronized(field4817) {
			byte[] var8;
			if ((var0 == 100 || var0 < 100 && var1) && field4819 > 0) {
				var8 = field4827[--field4819];
				field4827[field4819] = null;
				return var8;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && field4820 > 0) {
				var8 = field4828[--field4820];
				field4828[field4820] = null;
				return var8;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && field4821 > 0) {
				var8 = field4818[--field4821];
				field4818[field4821] = null;
				return var8;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && field4822 > 0) {
				var8 = field4830[--field4822];
				field4830[field4822] = null;
				return var8;
			}

			int var4;
			if (field1 != null) {
				for (var4 = 0; var4 < field1743.length; ++var4) {
					if ((field1743[var4] == var0 || var0 < field1743[var4] && var1) && field4899[var4] > 0) {
						byte[] var5 = field1[var4][--field4899[var4]];
						field1[var4][field4899[var4]] = null;
						return var5;
					}
				}
			}

			if (var1 && field1743 != null) {
				for (var4 = 0; var4 < field1743.length; ++var4) {
					if (var0 <= field1743[var4] && field4899[var4] < field1[var4].length) {
						return new byte[field1743[var4]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfInfo(owner = "db", name = "ak", desc = "([BB)V", opaque = "105")
	public static void method2280(byte[] var0) {
		synchronized(field4817) {
			if (100 == var0.length && field4819 < field4831) {
				field4827[++field4819 - 1] = var0;
			} else if (5000 == var0.length && field4820 < field4824) {
				field4828[++field4820 - 1] = var0;
			} else if (10000 == var0.length && field4821 < field4815) {
				field4818[++field4821 - 1] = var0;
			} else if (var0.length == 30000 && field4822 < field4826) {
				field4830[++field4822 - 1] = var0;
			} else {
				if (field1 != null) {
					for (int var3 = 0; var3 < field1743.length; ++var3) {
						if (var0.length == field1743[var3] && field4899[var3] < field1[var3].length) {
							field1[var3][field4899[var3]++] = var0;
							return;
						}
					}
				}

			}
		}
	}
}
