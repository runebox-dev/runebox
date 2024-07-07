import io.runebox.ObfInfo;

@ObfInfo(name = "ps")
public class Class409 {
	@ObfInfo(name = "aq", desc = "B")
	public byte field4660;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1840881785)
	public int field4661;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -74676455)
	public int field4662;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1879979743)
	public int field4663;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1937218483)
	public int field4664;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -406242341)
	public int field4665;

	public Class409() {
	}

	public Class409(Class562 var1, boolean var2) {
		this.field4660 = var1.method9955();
		this.field4663 = var1.method9997();
		this.field4662 = var1.method9832();
		this.field4661 = var1.method9832();
		this.field4664 = var1.method9832();
		this.field4665 = var1.method9832();
		if (var2) {
			this.method7539(method4713(var1));
		}

	}

	@ObfInfo(name = "ad", desc = "(Ljava/lang/Integer;B)V")
	public void method7539(Integer var1) {
	}

	@ObfInfo(name = "ag", desc = "(B)I")
	public int method7540() {
		return this.field4660 & 7;
	}

	@ObfInfo(name = "ak", desc = "(I)I", opaque = "-1747235122")
	public int method7541() {
		return 8 == (this.field4660 & 8) ? 1 : 0;
	}

	@ObfInfo(name = "ap", desc = "(IB)V")
	public void method7542(int var1) {
		this.field4660 &= -8;
		this.field4660 = (byte)(this.field4660 | var1 & 7);
	}

	@ObfInfo(name = "an", desc = "(II)V")
	public void method7545(int var1) {
		this.field4660 &= -9;
		if (var1 == 1) {
			this.field4660 = (byte)(this.field4660 | 8);
		}

	}

	@ObfInfo(owner = "jk", name = "aq", desc = "(Lvp;I)Ljava/lang/Integer;", opaque = "2086259071")
	public static Integer method4713(Class562 var0) {
		int var2 = 0;
		boolean var3 = false;

		while (true) {
			int var4 = var0.method9902();
			if (var4 == 255) {
				return var3 ? var2 : null;
			}

			if (var4 != 0) {
				throw new IllegalStateException("");
			}

			while (true) {
				int var5 = var0.method9902();
				if (var5 == 255) {
					break;
				}

				--var0.field5471;
				if (var0.method9997() != 0) {
					throw new IllegalStateException("");
				}

				if (var3) {
					throw new IllegalStateException("");
				}

				var2 = var0.method9832();
				var3 = true;
			}
		}
	}
}
