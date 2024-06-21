import io.runebox.ObfInfo;

public class Class448 extends Class483 {
	@ObfInfo(name = "al", desc = "Z")
	public boolean field4813;
	@ObfInfo(name = "ak", desc = "Z")
	public boolean field4814;

	@ObfInfo(name = "ak", desc = "(Lrf;B)I", opaque = "0")
	public int method8405(Class448 var1) {
		if (super.field4959 == Client.field557 && var1.field4959 != Client.field557) {
			return -1;
		} else if (var1.field4959 == Client.field557 && Client.field557 != super.field4959) {
			return 1;
		} else if (0 != super.field4959 && 0 == var1.field4959) {
			return -1;
		} else if (0 != var1.field4959 && 0 == super.field4959) {
			return 1;
		} else if (this.field4814 && !var1.field4814) {
			return -1;
		} else if (!this.field4814 && var1.field4814) {
			return 1;
		} else if (this.field4813 && !var1.field4813) {
			return -1;
		} else if (!this.field4813 && var1.field4813) {
			return 1;
		} else {
			return 0 != super.field4959 ? super.field4960 - var1.field4960 : var1.field4960 - super.field4960;
		}
	}

	@ObfInfo(name = "al", desc = "(Lsg;I)I")
	public int method8409(Class475 var1) {
		return this.method8405((Class448)var1);
	}

	public int compareTo(Object var1) {
		return this.method8405((Class448)var1);
	}
}
