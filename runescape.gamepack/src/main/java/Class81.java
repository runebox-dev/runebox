import io.runebox.ObfInfo;

@ObfInfo(name = "dc")
public class Class81 implements Class393 {
	@ObfInfo(desc = "[[B")
	public static byte[][] field1910;
	@ObfInfo(desc = "I", intMultiplier = -1228172183)
	public static int field3966;
	@ObfInfo(desc = "I", intMultiplier = 1129412543)
	public static int field5375;
	@ObfInfo(desc = "I", intMultiplier = 1658667547)
	public static int field5378;
	@ObfInfo(desc = "[I")
	public static int[] field1371;
	@ObfInfo(desc = "[I")
	public static int[] field5374;
	@ObfInfo(desc = "[I")
	public static int[] field5376;
	@ObfInfo(desc = "[I")
	public static int[] field5377;
	@ObfInfo(desc = "[I")
	public static int[] field5379;
	@ObfInfo(name = "az", desc = "Ldc;")
	public static final Class81 field989;
	@ObfInfo(name = "al", desc = "Ldc;")
	public static final Class81 field990;
	@ObfInfo(name = "aa", desc = "Ldc;")
	public static final Class81 field992;
	@ObfInfo(name = "af", desc = "Ldc;")
	public static final Class81 field993;
	@ObfInfo(name = "aj", desc = "Ldc;")
	public static final Class81 field994;
	@ObfInfo(name = "ak", desc = "Ldc;")
	public static final Class81 field996;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -92361051)
	public final int field991;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1019212589)
	public final int field995;

	static {
		field996 = new Class81(0, -1);
		field990 = new Class81(1, 2);
		field994 = new Class81(2, 3);
		field989 = new Class81(3, 4);
		field993 = new Class81(4, 5);
		field992 = new Class81(5, 6);
	}

	public Class81(int var1, int var2) {
		this.field995 = var1;
		this.field991 = var2;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field991;
	}

	@ObfInfo(desc = "()[LClass81;")
	public static Class81[] method8884() {
		return new Class81[]{field994, field990, field996, field992, field989, field993};
	}

	@ObfInfo(name = "ab", desc = "(B)[Lvl;", opaque = "69")
	public static Class557[] method2244() {
		Class557[] var1 = new Class557[field5378];

		for (int var2 = 0; var2 < field5378; ++var2) {
			Class557 var3 = var1[var2] = new Class557();
			var3.field5396 = field5375;
			var3.field5399 = field3966;
			var3.field5398 = field5374[var2];
			var3.field5397 = field5377[var2];
			var3.field5392 = field5376[var2];
			var3.field5395 = field5379[var2];
			var3.field5394 = field1371;
			var3.field5393 = field1910[var2];
		}

		field5374 = null;
		field5377 = null;
		field5376 = null;
		field5379 = null;
		field1371 = null;
		field1910 = (byte[][])null;
		return var1;
	}
}
