import io.runebox.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "iz")
public class Class234 {
	@ObfInfo(name = "ad", desc = "Liz;")
	public static final Class234 field2477;
	@ObfInfo(name = "aq", desc = "Liz;")
	public static final Class234 field2478;
	@ObfInfo(name = "ag", desc = "Liz;")
	public static final Class234 field2479;
	@ObfInfo(name = "ap", desc = "Liz;")
	public static final Class234 field2480;
	@ObfInfo(name = "an", desc = "Liz;")
	public static final Class234 field2481;
	@ObfInfo(name = "aj", desc = "Liz;")
	public static final Class234 field2482;
	@ObfInfo(name = "ak", desc = "Liz;")
	public static final Class234 field2485;
	@ObfInfo(name = "ae", desc = "[Liz;")
	public static final Class234[] field2486;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -120925093)
	public final int field2476;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1780844367)
	public final int field2483;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1921123689)
	public final int field2484;

	static {
		field2478 = new Class234(0, 8, 8);
		field2477 = new Class234(5, 16, 16);
		field2479 = new Class234(3, 32, 32);
		field2485 = new Class234(2, 48, 48);
		field2480 = new Class234(1, 64, 64);
		field2481 = new Class234(4, 96, 96);
		field2482 = new Class234(6, 128, 128);
		field2486 = method2650();
		Arrays.sort(field2486, new Class243());
	}

	public Class234(int var1, int var2, int var3) {
		this.field2483 = var1;
		this.field2484 = var2;
		this.field2476 = var3;
	}

	@ObfInfo(name = "ad", desc = "(B)I")
	public int method4451() {
		return this.field2484 * this.field2476;
	}

	@ObfInfo(owner = "dw", name = "aq", desc = "(I)[Liz;")
	public static Class234[] method2650() {
		return new Class234[]{field2478, field2480, field2485, field2479, field2481, field2477, field2482};
	}
}
