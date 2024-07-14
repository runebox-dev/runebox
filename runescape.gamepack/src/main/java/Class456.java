import io.runebox.ObfInfo;

@ObfInfo(name = "rn")
public class Class456 extends Class476 {
	@ObfInfo(name = "aq", desc = "Z")
	public boolean field4886;
	@ObfInfo(name = "ad", desc = "Z")
	public boolean field4887;

	@ObfInfo(name = "aq", desc = "(Lrn;B)I", opaque = "50")
	public int method8392(Class456 var1) {
		if (Client.field525 == super.field4971 && Client.field525 != var1.field4971) {
			return -1;
		} else if (Client.field525 == var1.field4971 && Client.field525 != super.field4971) {
			return 1;
		} else if (super.field4971 != 0 && var1.field4971 == 0) {
			return -1;
		} else if (var1.field4971 != 0 && super.field4971 == 0) {
			return 1;
		} else if (this.field4886 && !var1.field4886) {
			return -1;
		} else if (!this.field4886 && var1.field4886) {
			return 1;
		} else if (this.field4887 && !var1.field4887) {
			return -1;
		} else if (!this.field4887 && var1.field4887) {
			return 1;
		} else {
			return super.field4971 != 0 ? super.field4970 - var1.field4970 : var1.field4970 - super.field4970;
		}
	}

	@ObfInfo(name = "ad", desc = "(Lsk;B)I")
	public int method8393(Class479 var1) {
		return this.method8392((Class456)var1);
	}

	public int compareTo(Object var1) {
		return this.method8392((Class456)var1);
	}
}
