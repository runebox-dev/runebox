import io.runebox.ObfInfo;

@ObfInfo(name = "fb")
public class Class132 implements Class393 {
	@ObfInfo(name = "ab", desc = "Lfb;")
	public static final Class132 field1534;
	@ObfInfo(name = "ag", desc = "Lfb;")
	public static final Class132 field1535;
	@ObfInfo(name = "ae", desc = "Lfb;")
	public static final Class132 field1536;
	@ObfInfo(name = "ap", desc = "Lfb;")
	public static final Class132 field1537;
	@ObfInfo(name = "an", desc = "Lfb;")
	public static final Class132 field1538;
	@ObfInfo(name = "aj", desc = "Lfb;")
	public static final Class132 field1539;
	@ObfInfo(name = "av", desc = "Lfb;")
	public static final Class132 field1540;
	@ObfInfo(name = "ad", desc = "Lfb;")
	public static final Class132 field1542;
	@ObfInfo(name = "aq", desc = "Lfb;")
	public static final Class132 field1543;
	@ObfInfo(name = "au", desc = "Lfb;")
	public static final Class132 field1544;
	@ObfInfo(name = "ah", desc = "Lfb;")
	public static final Class132 field1545;
	@ObfInfo(name = "az", desc = "Lfb;")
	public static final Class132 field1546;
	@ObfInfo(name = "ax", desc = "Lfb;")
	public static final Class132 field1547;
	@ObfInfo(name = "ac", desc = "Lfb;")
	public static final Class132 field1548;
	@ObfInfo(name = "al", desc = "Lfb;")
	public static final Class132 field1549;
	@ObfInfo(name = "ai", desc = "Lfb;")
	public static final Class132 field1552;
	@ObfInfo(name = "ak", desc = "Lfb;")
	public static final Class132 field1555;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 270551211)
	public final int field1541;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = 1514933645)
	public final int field1550;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -2043571075)
	public final int field1554;

	static {
		field1543 = new Class132(0, 0, (String)null, -1, -1);
		field1542 = new Class132(1, 1, (String)null, 0, 2);
		field1535 = new Class132(2, 2, (String)null, 1, 2);
		field1555 = new Class132(3, 3, (String)null, 2, 2);
		field1537 = new Class132(4, 4, (String)null, 3, 1);
		field1538 = new Class132(5, 5, (String)null, 4, 1);
		field1539 = new Class132(6, 6, (String)null, 5, 1);
		field1540 = new Class132(7, 7, (String)null, 6, 3);
		field1534 = new Class132(8, 8, (String)null, 7, 3);
		field1552 = new Class132(9, 9, (String)null, 8, 3);
		field1536 = new Class132(10, 10, (String)null, 0, 7);
		field1544 = new Class132(11, 11, (String)null, 1, 7);
		field1545 = new Class132(12, 12, (String)null, 2, 7);
		field1546 = new Class132(13, 13, (String)null, 3, 7);
		field1547 = new Class132(14, 14, (String)null, 4, 7);
		field1548 = new Class132(15, 15, (String)null, 5, 7);
		field1549 = new Class132(16, 16, (String)null, 0, 5);
	}

	public Class132(int var1, int var2, String var3, int var4, int var5) {
		this.field1550 = var1;
		this.field1554 = var2;
		this.field1541 = var4;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field1554;
	}

	@ObfInfo(name = "ag", desc = "(I)I")
	public int method3066() {
		return this.field1541;
	}

	@ObfInfo(owner = "tg", name = "ak", desc = "(II)Lfb;", opaque = "-293479554")
	public static Class132 method8896(int var0) {
		Class132[] var2 = new Class132[]{field1543, field1542, field1535, field1555, field1537, field1538, field1539, field1540, field1534, field1552, field1536, field1544, field1545, field1546, field1547, field1548, field1549};
		Class132 var3 = (Class132)Class406.method4071(var2, var0);
		if (var3 == null) {
			var3 = field1543;
		}

		return var3;
	}

	@ObfInfo(name = "nq", desc = "(II)V", opaque = "-568500905")
	public static void method3064(int var0) {
		if (Client.field4644.method6412(var0)) {
			Class362[] var2 = Client.field4644.field3698[var0];

			for (int var3 = 0; var3 < var2.length; ++var3) {
				Class362 var4 = var2[var3];
				if (var4 != null) {
					var4.field3853 = 0;
					var4.field3926 = 0;
				}
			}

		}
	}
}
