import io.runebox.ObfInfo;

public abstract class Class469 extends Class310 implements Class552 {
	public Class469(Class390 var1, Class402 var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfInfo(name = "ak", desc = "(IB)Lsp;")
	public abstract Class484 method8608(int var1);

	@ObfInfo(name = "al", desc = "(I)I")
	public int method8609() {
		return super.field3257;
	}

	@ObfInfo(name = "aj", desc = "(IB)Ljava/lang/Object;", opaque = "2")
	public Object method8610(int var1) {
		Class484 var3 = this.method8608(var1);
		return var3 != null && var3.method8874() ? var3.method8880() : null;
	}

	@ObfInfo(name = "az", desc = "(Lua;I)Lvf;", opaque = "-1249756219")
	public Class551 method8611(Class521 var1) {
		int var3 = var1.method9407();
		Class484 var4 = this.method8608(var3);
		Class551 var5 = new Class551(var3);
		Class var6 = var4.field4962.field5338;
		if (var6 == Integer.class) {
			var5.field5369 = var1.method9410();
		} else if (var6 == Long.class) {
			var5.field5369 = var1.method9411();
		} else if (var6 == String.class) {
			var5.field5369 = var1.method9577();
		} else {
			if (!Class547.class.isAssignableFrom(var6)) {
				throw new IllegalStateException();
			}

			try {
				Class547 var7 = (Class547)var6.newInstance();
				var7.method9910(var1);
				var5.field5369 = var7;
			} catch (InstantiationException var8) {
			} catch (IllegalAccessException var9) {
			}
		}

		return var5;
	}

	public static void abs(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.field701; ++var4) {
			if (Client.field708[var4] + Client.field722[var4] > var0 && Client.field722[var4] < var2 + var0 && Client.field707[var4] + Client.field757[var4] > var1 && Client.field707[var4] < var3 + var1) {
				Client.field614[var4] = true;
			}
		}

	}
}
