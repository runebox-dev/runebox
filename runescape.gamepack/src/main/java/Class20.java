import io.runebox.ObfInfo;

@ObfInfo(name = "at")
public class Class20 implements Class393 {
	@ObfInfo(name = "ak", desc = "Lat;")
	public static final Class20 field102;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 234575775)
	public final int field100;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -504213815)
	public final int field99;

	static {
		field102 = new Class20(0, 0);
	}

	public Class20(int var1, int var2) {
		this.field99 = var1;
		this.field100 = var2;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field100;
	}
}
