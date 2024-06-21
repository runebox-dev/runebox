import io.runebox.ObfInfo;

@ObfInfo(name = "du")
public class Class99 implements Class393 {
	@ObfInfo(name = "ak", desc = "Ldu;")
	public static final Class99 field1305;
	@ObfInfo(name = "al", desc = "Ldu;")
	public static final Class99 field1306;
	@ObfInfo(name = "az", desc = "Ldu;")
	public static final Class99 field1308;
	@ObfInfo(name = "af", desc = "Ldu;")
	public static final Class99 field1309;
	@ObfInfo(name = "aj", desc = "Ldu;")
	public static final Class99 field1310;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1128902541)
	public final int field1311;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1164261959)
	public final int field1312;

	static {
		field1305 = new Class99(0, -1);
		field1306 = new Class99(1, 1);
		field1310 = new Class99(2, 7);
		field1308 = new Class99(3, 8);
		field1309 = new Class99(4, 9);
	}

	public Class99(int var1, int var2) {
		this.field1312 = var1;
		this.field1311 = var2;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field1311;
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/CharSequence;I)Ljava/lang/String;", opaque = "-1718530262")
	public static String method2520(CharSequence var0) {
		int var2 = var0.length();
		StringBuilder var3 = new StringBuilder(var2);

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0' || var5 > '9') && var5 != '.' && var5 != '-' && var5 != '*' && var5 != '_') {
				if (var5 == ' ') {
					var3.append('+');
				} else {
					byte var6 = Class405.method2753(var5);
					var3.append('%');
					int var7 = var6 >> 4 & 15;
					if (var7 >= 10) {
						var3.append((char)(var7 + 55));
					} else {
						var3.append((char)(var7 + 48));
					}

					var7 = var6 & 15;
					if (var7 >= 10) {
						var3.append((char)(var7 + 55));
					} else {
						var3.append((char)(var7 + 48));
					}
				}
			} else {
				var3.append(var5);
			}
		}

		return var3.toString();
	}

	@ObfInfo(owner = "rf", name = "az", desc = "(I)[Ldu;")
	public static Class99[] method8414() {
		return new Class99[]{field1309, field1305, field1310, field1308, field1306};
	}
}
