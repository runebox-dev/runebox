import io.runebox.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "im")
public class Class221 {
	@ObfInfo(name = "aa", desc = "Lim;")
	public static final Class221 field2225;
	@ObfInfo(name = "ak", desc = "Lim;")
	public static final Class221 field2226;
	@ObfInfo(name = "aj", desc = "Lim;")
	public static final Class221 field2227;
	@ObfInfo(name = "az", desc = "Lim;")
	public static final Class221 field2228;
	@ObfInfo(name = "af", desc = "Lim;")
	public static final Class221 field2229;
	@ObfInfo(name = "al", desc = "Lim;")
	public static final Class221 field2231;
	@ObfInfo(name = "at", desc = "Lim;")
	public static final Class221 field2236;
	@ObfInfo(name = "ah", desc = "[Lim;")
	public static final Class221[] field2235;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -54152801)
	public final int field2230;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1004792327)
	public final int field2232;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -620293915)
	public final int field2234;

	static {
		field2226 = new Class221(0, 8, 8);
		field2231 = new Class221(5, 16, 16);
		field2227 = new Class221(4, 32, 32);
		field2228 = new Class221(3, 48, 48);
		field2229 = new Class221(6, 64, 64);
		field2225 = new Class221(1, 96, 96);
		field2236 = new Class221(2, 128, 128);
		Class221[] var0 = new Class221[]{field2226, field2225, field2236, field2228, field2227, field2231, field2229};
		field2235 = var0;
		Arrays.sort(field2235, new Class251());
	}

	public Class221(int var1, int var2, int var3) {
		this.field2232 = var1;
		this.field2230 = var2;
		this.field2234 = var3;
	}

	@ObfInfo(name = "ak", desc = "(B)I")
	public int method4166() {
		return this.field2230 * this.field2234;
	}

	@ObfInfo(name = "pg", desc = "(I)Z", opaque = "458391555")
	public static boolean method4169() {
		return Client.field626 >= 2;
	}
}
