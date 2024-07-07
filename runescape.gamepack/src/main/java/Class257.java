import io.runebox.ObfInfo;

@ObfInfo(name = "jw")
public class Class257 extends Class245 {
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -517178829)
	public int field2676;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1038170723)
	public int field2677;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 271183347)
	public int field2678;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1161199065)
	public int field2679;

	@ObfInfo(name = "aq", desc = "(Lvp;I)V", opaque = "1851595354")
	public void method4950(Class562 var1) {
		int var3 = var1.method9902();
		if (var3 != Class265.field2730.field2728) {
			throw new IllegalStateException("");
		} else {
			super.field2570 = var1.method9902();
			super.field2578 = var1.method9902();
			super.field2580 = var1.method9997();
			super.field2572 = var1.method9997();
			this.field2679 = var1.method9902();
			this.field2676 = var1.method9902();
			super.field2568 = var1.method9997();
			super.field2569 = var1.method9997();
			this.field2678 = var1.method9902();
			this.field2677 = var1.method9902();
			super.field2581 = var1.method9871();
			super.field2573 = var1.method9871();
		}
	}

	@ObfInfo(name = "ad", desc = "(Lvp;B)V", opaque = "-1")
	public void method4699(Class562 var1) {
		super.field2578 = Math.min(super.field2578, 4);
		super.field2571 = new short[1][64][64];
		super.field2575 = new short[super.field2578][64][64];
		super.field2576 = new byte[super.field2578][64][64];
		super.field2577 = new byte[super.field2578][64][64];
		super.field2566 = new Class259[super.field2578][64][64][];
		int var3 = var1.method9902();
		if (Class267.field2741.field2742 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method9902();
			int var5 = var1.method9902();
			int var6 = var1.method9902();
			int var7 = var1.method9902();
			if (super.field2568 == var4 && var5 == super.field2569 && var6 == this.field2678 && this.field2677 == var7) {
				for (int var8 = 0; var8 < 8; ++var8) {
					for (int var9 = 0; var9 < 8; ++var9) {
						this.method4696(this.field2678 * 8 + var8, this.field2677 * 8 + var9, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof Class257)) {
			return false;
		} else {
			Class257 var2 = (Class257)var1;
			if (super.field2568 == var2.field2568 && super.field2569 == var2.field2569) {
				return var2.field2678 == this.field2678 && this.field2677 == var2.field2677;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.field2568 | super.field2569 << 8 | this.field2678 << 16 | this.field2677 << 24;
	}

	@ObfInfo(name = "ag", desc = "(I)I")
	public int method4954() {
		return this.field2679;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method4974() {
		return this.field2676;
	}

	@ObfInfo(name = "ap", desc = "(I)I")
	public int method4956() {
		return this.field2678;
	}

	@ObfInfo(name = "ai", desc = "(I)I")
	public int method4957() {
		return this.field2677;
	}
}
