import io.runebox.ObfInfo;

@ObfInfo(name = "sn")
public class Class482 extends Class479 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1293642757)
	public int field4992;

	@ObfInfo(name = "aq", desc = "(Lsn;I)I")
	public int method8728(Class482 var1) {
		return this.field4992 - var1.field4992;
	}

	@ObfInfo(name = "ad", desc = "(Lsk;B)I")
	public int method8393(Class479 var1) {
		return this.method8728((Class482)var1);
	}

	public int compareTo(Object var1) {
		return this.method8728((Class482)var1);
	}
}
