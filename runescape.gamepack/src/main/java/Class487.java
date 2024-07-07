import io.runebox.ObfInfo;

@ObfInfo(name = "ss")
public abstract class Class487 extends Class305 implements Class567 {
	public Class487(Class370 var1, Class395 var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfInfo(name = "aq", desc = "(II)Lsm;")
	public abstract Class481 method8824(int var1);

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method8813() {
		return super.field3126;
	}

	@ObfInfo(name = "ag", desc = "(II)Ljava/lang/Object;", opaque = "-1988642981")
	public Object method8821(int var1) {
		Class481 var3 = this.method8824(var1);
		return var3 != null && var3.method8714() ? var3.method8715() : null;
	}

	@ObfInfo(name = "ak", desc = "(Lvp;I)Lvt;", opaque = "1218504173")
	public Class566 method8816(Class562 var1) {
		int var3 = var1.method9997();
		Class481 var4 = this.method8824(var3);
		Class566 var5 = new Class566(var3);
		Class var6 = var4.field4991.field5251;
		if (var6 == Integer.class) {
			var5.field5492 = var1.method9832();
		} else if (var6 == Long.class) {
			var5.field5492 = var1.method9833();
		} else if (var6 == String.class) {
			var5.field5492 = var1.method9980();
		} else {
			if (!Class557.class.isAssignableFrom(var6)) {
				throw new IllegalStateException();
			}

			try {
				Class557 var7 = (Class557)var6.newInstance();
				var7.method9767(var1);
				var5.field5492 = var7;
			} catch (InstantiationException var8) {
			} catch (IllegalAccessException var9) {
			}
		}

		return var5;
	}
}
