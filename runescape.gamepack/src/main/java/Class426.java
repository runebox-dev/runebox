import io.runebox.ObfInfo;

public class Class426 extends Class447 {
	@ObfInfo(name = "al", desc = "I", intMultiplier = -1905821101)
	public int field4692;
	@ObfInfo(name = "ak", desc = "J", longMultiplier = -8846500232165804043L)
	public long field4693;

	public Class426(Class447 var1, int var2) {
		super(var1);
		this.field4692 = var2;
		super.field4807 = "DelayFadeTask";
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "709593494")
	public boolean method7832() {
		if (this.field4693 < (long)this.field4692) {
			++this.field4693;
			return false;
		} else {
			return true;
		}
	}
}
