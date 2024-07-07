import io.runebox.ObfInfo;

@ObfInfo(name = "bl")
public class Class38 extends Class72 {
	@ObfInfo(name = "ap", desc = "Z")
	public boolean field202;
	@ObfInfo(name = "ad", desc = "[B")
	public byte[] field198;
	@ObfInfo(name = "ak", desc = "I")
	public int field199;
	@ObfInfo(name = "ag", desc = "I")
	public int field200;
	@ObfInfo(name = "aq", desc = "I")
	public int field201;

	public Class38(int var1, byte[] var2, int var3, int var4) {
		this.field201 = var1;
		this.field198 = var2;
		this.field200 = var3;
		this.field199 = var4;
	}

	public Class38(int var1, byte[] var2, int var3, int var4, boolean var5) {
		this.field201 = var1;
		this.field198 = var2;
		this.field200 = var3;
		this.field199 = var4;
		this.field202 = var5;
	}

	@ObfInfo(name = "aq", desc = "(Lcu;)Lbl;")
	public Class38 method549(Class73 var1) {
		this.field198 = var1.method2133(this.field198);
		this.field201 = var1.method2134(this.field201);
		if (this.field200 == this.field199) {
			this.field200 = this.field199 = var1.method2135(this.field200);
		} else {
			this.field200 = var1.method2135(this.field200);
			this.field199 = var1.method2135(this.field199);
			if (this.field200 == this.field199) {
				--this.field200;
			}
		}

		return this;
	}
}
