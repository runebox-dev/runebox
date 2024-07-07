import io.runebox.ObfInfo;

@ObfInfo(name = "di")
public class Class87 implements Runnable {
	@ObfInfo(name = "aq", desc = "Z")
	public boolean field1089;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1670544525)
	public int field1091;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field1093;
	@ObfInfo(name = "ap", desc = "[I")
	public int[] field1094;
	@ObfInfo(name = "ad", desc = "Ljava/lang/Object;")
	public Object field1090;
	@ObfInfo(name = "an", desc = "[J")
	public long[] field1092;

	public Class87() {
		this.field1089 = true;
		this.field1090 = new Object();
		this.field1091 = 0;
		this.field1093 = new int[500];
		this.field1094 = new int[500];
		this.field1092 = new long[500];
	}

	public void run() {
		for (; this.field1089; Class336.method3895(50L)) {
			synchronized(this.field1090) {
				if (this.field1091 < 500) {
					this.field1093[this.field1091] = Class42.field231;
					this.field1094[this.field1091] = Class42.field221;
					this.field1092[this.field1091] = Class42.field211;
					++this.field1091;
				}
			}
		}

	}
}
