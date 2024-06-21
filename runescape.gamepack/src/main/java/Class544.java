import io.runebox.ObfInfo;

@ObfInfo(name = "ux")
public class Class544 {
	@ObfInfo(name = "aj", desc = "Lux;")
	public static final Class544 field5322;
	@ObfInfo(name = "ak", desc = "Lux;")
	public static final Class544 field5324;
	@ObfInfo(name = "az", desc = "Lux;")
	public static final Class544 field5325;
	@ObfInfo(name = "al", desc = "Lux;")
	public static final Class544 field5326;
	@ObfInfo(name = "aa", desc = "Lux;")
	public static final Class544 field5327;
	@ObfInfo(name = "at", desc = "Lux;")
	public static final Class544 field5328;
	@ObfInfo(name = "ab", desc = "Lux;")
	public static final Class544 field5329;
	@ObfInfo(name = "ac", desc = "Lux;")
	public static final Class544 field5330;
	@ObfInfo(name = "af", desc = "Lux;")
	public static final Class544 field5331;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 781445249)
	public final int field5323;
	@ObfInfo(name = "ah", desc = "Ljava/lang/String;")
	public final String field5332;

	static {
		field5324 = new Class544(2, 0, "", "");
		field5326 = new Class544(6, 1, "", "");
		field5322 = new Class544(8, 2, "", "");
		field5325 = new Class544(7, 3, "", "");
		field5331 = new Class544(4, 4, "", "");
		field5327 = new Class544(5, 5, "", "");
		field5328 = new Class544(0, 6, "", "");
		field5329 = new Class544(1, 7, "", "");
		field5330 = new Class544(3, -1, "", "", true, new Class544[]{field5324, field5326, field5322, field5331, field5325});
	}

	public Class544(int var1, int var2, String var3, String var4) {
		this.field5323 = var1;
		this.field5332 = var4;
	}

	public Class544(int var1, int var2, String var3, String var4, boolean var5, Class544[] var6) {
		this.field5323 = var1;
		this.field5332 = var4;
	}

	@ObfInfo(desc = "()Ljava/lang/String;")
	public String toString() {
		return this.field5332;
	}
}
