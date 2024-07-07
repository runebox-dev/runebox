import io.runebox.ObfInfo;

@ObfInfo(name = "eg")
public class Class111 {
	@ObfInfo(name = "ag", desc = "Ljava/lang/String;")
	public static String field1389;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public static String field1390;
	@ObfInfo(name = "ap", desc = "Ljava/lang/String;")
	public static String field1391;
	@ObfInfo(name = "an", desc = "Ljava/lang/String;")
	public static String field1392;
	@ObfInfo(name = "aj", desc = "Ljava/lang/String;")
	public static String field1393;
	@ObfInfo(name = "av", desc = "Ljava/lang/String;")
	public static String field1394;
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public static String field1396;
	@ObfInfo(name = "aq", desc = "Ljava/lang/String;")
	public static String field1399;

	static {
		field1399 = "true";
		field1396 = ",";
		field1389 = "|";
		field1390 = " (";
		field1391 = ")";
		field1392 = "->";
		field1393 = "<br>";
		field1394 = "</col>";
	}

	@ObfInfo(owner = "ol", name = "aq", desc = "(II)Ljava/lang/String;")
	public static String method7220(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfInfo(owner = "hh", name = "ad", desc = "(II)Ljava/lang/String;")
	public static String method3839(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}
