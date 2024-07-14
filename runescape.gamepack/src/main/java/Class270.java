import io.runebox.ObfInfo;

@ObfInfo(name = "kj")
public class Class270 {
	@ObfInfo(name = "ad", desc = "[Lfv;")
	public Class152[] field2779;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1044726639)
	public int field2782;

	public Class270(Class562 var1, int var2) {
		this.field2779 = new Class152[var2];
		this.field2782 = var1.method9902();

		for (int var3 = 0; var3 < this.field2779.length; ++var3) {
			Class152 var4 = new Class152(this.field2782, var1, false);
			this.field2779[var3] = var4;
		}

		this.method5088();
	}

	@ObfInfo(name = "aq", desc = "(I)V", opaque = "558827105")
	public void method5088() {
		Class152[] var2 = this.field2779;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Class152 var4 = var2[var3];
			if (var4.field1706 >= 0) {
				var4.field1714 = this.field2779[var4.field1706];
			}
		}

	}

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method5100() {
		return this.field2779.length;
	}

	@ObfInfo(name = "ag", desc = "(II)Lfv;", opaque = "-61724155")
	public Class152 method5087(int var1) {
		return var1 >= this.method5100() ? null : this.field2779[var1];
	}

	@ObfInfo(name = "ak", desc = "(B)[Lfv;")
	public Class152[] method5086() {
		return this.field2779;
	}

	@ObfInfo(name = "ap", desc = "(Lft;IB)V")
	public void method5089(Class150 var1, int var2) {
		this.method5090(var1, var2, (boolean[])null, false);
	}

	@ObfInfo(name = "an", desc = "(Lft;I[ZZI)V", opaque = "-297669474")
	public void method5090(Class150 var1, int var2, boolean[] var3, boolean var4) {
		int var6 = var1.method3216();
		int var7 = 0;
		Class152[] var8 = this.method5086();

		for (int var9 = 0; var9 < var8.length; ++var9) {
			Class152 var10 = var8[var9];
			if (var3 == null || var3[var7] == var4) {
				var1.method3222(var2, var10, var7, var6);
			}

			++var7;
		}

	}
}
