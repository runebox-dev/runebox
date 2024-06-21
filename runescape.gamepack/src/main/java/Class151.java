import io.runebox.ObfInfo;

@ObfInfo(name = "fu")
public class Class151 {
	@ObfInfo(name = "aj", desc = "Lps;")
	public Class409 field1700;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1680514671)
	public int field1695;
	@ObfInfo(name = "ak", desc = "J", longMultiplier = -8184252867772202709L)
	public long field1699;

	public Class151(Class521 var1) {
		this.field1695 = -1;
		this.field1700 = new Class409();
		this.method3271(var1);
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V", opaque = "-1888371039")
	public void method3271(Class521 var1) {
		this.field1699 = var1.method9411();
		this.field1695 = var1.method9410();

		for (int var3 = var1.method9405(); var3 != 0; var3 = var1.method9405()) {
			Object var4;
			if (var3 == 3) {
				var4 = new Class167(this);
			} else if (var3 == 1) {
				var4 = new Class146(this);
			} else if (var3 == 13) {
				var4 = new Class175(this);
			} else if (var3 == 4) {
				var4 = new Class139(this);
			} else if (var3 == 6) {
				var4 = new Class170(this);
			} else if (var3 == 5) {
				var4 = new Class144(this);
			} else if (var3 == 2) {
				var4 = new Class147(this);
			} else if (var3 == 7) {
				var4 = new Class132(this);
			} else if (var3 == 14) {
				var4 = new Class142(this);
			} else if (var3 == 8) {
				var4 = new Class157(this);
			} else if (var3 == 9) {
				var4 = new Class158(this);
			} else if (var3 == 10) {
				var4 = new Class176(this);
			} else if (var3 == 11) {
				var4 = new Class134(this);
			} else if (var3 == 12) {
				var4 = new Class162(this);
			} else {
				if (var3 != 15) {
					throw new RuntimeException("");
				}

				var4 = new Class163(this);
			}

			((Class149)var4).method3066(var1);
			this.field1700.method7597((Class506)var4);
		}

	}

	@ObfInfo(name = "al", desc = "(Lgc;I)V", opaque = "143754529")
	public void method3280(Class159 var1) {
		if (this.field1699 == var1.field1787 && var1.field1766 == this.field1695) {
			for (Class149 var3 = (Class149)this.field1700.method7600(); var3 != null; var3 = (Class149)this.field1700.method7637()) {
				var3.method3067(var1);
			}

			++var1.field1766;
		} else {
			throw new RuntimeException("");
		}
	}
}
