import io.runebox.ObfInfo;

@ObfInfo(name = "ei")
public class Class113 {
	@ObfInfo(name = "ab", desc = "Ljava/lang/String;")
	public static String field1421;
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public static String field1422;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	public static String field1423;
	@ObfInfo(name = "aa", desc = "Ljava/lang/String;")
	public static String field1424;
	@ObfInfo(name = "aj", desc = "Ljava/lang/String;")
	public static String field1425;
	@ObfInfo(name = "at", desc = "Ljava/lang/String;")
	public static String field1427;
	@ObfInfo(name = "af", desc = "Ljava/lang/String;")
	public static String field1428;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public static String field1429;

	static {
		field1429 = "true";
		field1422 = ",";
		field1425 = "|";
		field1423 = " (";
		field1428 = ")";
		field1424 = "->";
		field1427 = "<br>";
		field1421 = "</col>";
	}

	@ObfInfo(name = "al", desc = "(II)Lvh;", opaque = "-1988385472")
	public static Class553 method2877(int var0) {
		Class553[] var2 = Class553.method3987();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Class553 var4 = var2[var3];
			if (var0 == var4.field5370) {
				return var4;
			}
		}

		return null;
	}
}
