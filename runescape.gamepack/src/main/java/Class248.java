import io.runebox.ObfInfo;

@ObfInfo(name = "jn")
public class Class248 extends Class245 {
	@ObfInfo(name = "aq", desc = "(Lvp;B)V", opaque = "5")
	public void method4832(Class562 var1) {
		int var3 = var1.method9902();
		if (var3 != Class265.field2731.field2728) {
			throw new IllegalStateException("");
		} else {
			super.field2570 = var1.method9902();
			super.field2578 = var1.method9902();
			super.field2580 = var1.method9997();
			super.field2572 = var1.method9997();
			super.field2568 = var1.method9997();
			super.field2569 = var1.method9997();
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
		if (Class267.field2745.field2742 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method9902();
			int var5 = var1.method9902();
			if (var4 == super.field2568 && super.field2569 == var5) {
				for (int var6 = 0; var6 < 64; ++var6) {
					for (int var7 = 0; var7 < 64; ++var7) {
						this.method4696(var6, var7, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof Class248)) {
			return false;
		} else {
			Class248 var2 = (Class248)var1;
			return super.field2568 == var2.field2568 && var2.field2569 == super.field2569;
		}
	}

	public int hashCode() {
		return super.field2568 | super.field2569 << 8;
	}
}
