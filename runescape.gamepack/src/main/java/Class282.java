import io.runebox.ObfInfo;

@ObfInfo(name = "kv")
public class Class282 extends Class303 {
	@ObfInfo(name = "ak", desc = "(Lua;I)V", opaque = "-341678494")
	public void method5718(Class521 var1) {
		int var3 = var1.method9405();
		if (var3 != Class300.field3200.field3202) {
			throw new IllegalStateException("");
		} else {
			super.field3214 = var1.method9405();
			super.field3215 = var1.method9405();
			super.field3212 = var1.method9407();
			super.field3211 = var1.method9407();
			super.field3223 = var1.method9407();
			super.field3213 = var1.method9407();
			super.field3217 = var1.method9423();
			super.field3216 = var1.method9423();
		}
	}

	@ObfInfo(name = "al", desc = "(Lua;I)V", opaque = "-1130621028")
	public void method5697(Class521 var1) {
		super.field3215 = Math.min(super.field3215, 4);
		super.field3218 = new short[1][64][64];
		super.field3219 = new short[super.field3215][64][64];
		super.field3210 = new byte[super.field3215][64][64];
		super.field3221 = new byte[super.field3215][64][64];
		super.field3222 = new Class291[super.field3215][64][64][];
		int var3 = var1.method9405();
		if (var3 != Class293.field3169.field3168) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method9405();
			int var5 = var1.method9405();
			if (super.field3223 == var4 && super.field3213 == var5) {
				for (int var6 = 0; var6 < 64; ++var6) {
					for (int var7 = 0; var7 < 64; ++var7) {
						this.method6051(var6, var7, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof Class282)) {
			return false;
		} else {
			Class282 var2 = (Class282)var1;
			return var2.field3223 == super.field3223 && super.field3213 == var2.field3213;
		}
	}

	public int hashCode() {
		return super.field3223 | super.field3213 << 8;
	}
}
