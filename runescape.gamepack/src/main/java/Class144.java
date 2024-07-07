import io.runebox.ObfInfo;

@ObfInfo(name = "fn")
public class Class144 {
	@ObfInfo(name = "ag", desc = "Lpi;")
	public Class399 field1649;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -356524575)
	public int field1648;
	@ObfInfo(name = "aq", desc = "J", longMultiplier = -7654640470494452803L)
	public long field1650;

	public Class144(Class562 var1) {
		this.field1648 = -1;
		this.field1649 = new Class399();
		this.method3177(var1);
	}

	@ObfInfo(name = "aq", desc = "(Lvp;I)V", opaque = "-1360255523")
	public void method3177(Class562 var1) {
		this.field1650 = var1.method9833();
		this.field1648 = var1.method9832();

		for (int var3 = var1.method9902(); var3 != 0; var3 = var1.method9902()) {
			Object var4;
			if (var3 == 3) {
				var4 = new Class169(this);
			} else if (var3 == 1) {
				var4 = new Class133(this);
			} else if (var3 == 13) {
				var4 = new Class159(this);
			} else if (var3 == 4) {
				var4 = new Class154(this);
			} else if (var3 == 6) {
				var4 = new Class177(this);
			} else if (var3 == 5) {
				var4 = new Class151(this);
			} else if (var3 == 2) {
				var4 = new Class147(this);
			} else if (var3 == 7) {
				var4 = new Class141(this);
			} else if (var3 == 14) {
				var4 = new Class143(this);
			} else if (var3 == 8) {
				var4 = new Class170(this);
			} else if (var3 == 9) {
				var4 = new Class162(this);
			} else if (var3 == 10) {
				var4 = new Class173(this);
			} else if (var3 == 11) {
				var4 = new Class145(this);
			} else if (var3 == 12) {
				var4 = new Class175(this);
			} else {
				if (var3 != 15) {
					throw new RuntimeException("");
				}

				var4 = new Class172(this);
			}

			((Class149)var4).method3079(var1);
			this.field1649.method7449((Class520)var4);
		}

	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V", opaque = "31")
	public void method3180(Class167 var1) {
		if (this.field1650 == var1.field1819 && this.field1648 == var1.field1820) {
			for (Class149 var3 = (Class149)this.field1649.method7401(); var3 != null; var3 = (Class149)this.field1649.method7403()) {
				var3.method3080(var1);
			}

			++var1.field1820;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfInfo(name = "aq", desc = "(III)Ljp;")
	public static Class250 method3178(int var0, int var1) {
		int var3 = var0 - var1 & 2047;
		Class255 var4 = Class255.field2667;
		if (var3 > 1024) {
			var3 = 2048 - var3;
			var4 = Class255.field2666;
		}

		return new Class250(var4, var3);
	}
}
