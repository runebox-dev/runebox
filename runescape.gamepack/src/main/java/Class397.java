import io.runebox.ObfInfo;

public class Class397 {
	@ObfInfo(name = "ak", desc = "B")
	public byte field4593;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 467418017)
	public int field4588;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -657879925)
	public int field4589;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -2070091891)
	public int field4590;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 2010946641)
	public int field4591;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 934961267)
	public int field4592;

	public Class397() {
	}

	public Class397(Class521 var1, boolean var2) {
		this.field4593 = var1.method9406();
		this.field4589 = var1.method9407();
		this.field4590 = var1.method9410();
		this.field4591 = var1.method9410();
		this.field4592 = var1.method9410();
		this.field4588 = var1.method9410();
		if (var2) {
			int var4 = 0;
			boolean var5 = false;

			while (true) {
				int var6 = var1.method9405();
				if (var6 == 255) {
					Integer var3 = var5 ? var4 : null;
					this.method7440(var3);
					break;
				}

				if (var6 != 0) {
					throw new IllegalStateException("");
				}

				while (true) {
					int var7 = var1.method9405();
					if (var7 == 255) {
						break;
					}

					--var1.field5219;
					if (var1.method9407() != 0) {
						throw new IllegalStateException("");
					}

					if (var5) {
						throw new IllegalStateException("");
					}

					var4 = var1.method9410();
					var5 = true;
				}
			}
		}

	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/Integer;B)V")
	public void method7440(Integer var1) {
	}

	@ObfInfo(name = "al", desc = "(B)I")
	public int method7435() {
		return this.field4593 & 7;
	}

	@ObfInfo(name = "aj", desc = "(I)I", opaque = "498731775")
	public int method7436() {
		return 8 == (this.field4593 & 8) ? 1 : 0;
	}

	@ObfInfo(name = "az", desc = "(IS)V")
	public void method7438(int var1) {
		this.field4593 &= -8;
		this.field4593 = (byte)(this.field4593 | var1 & 7);
	}

	@ObfInfo(name = "af", desc = "(II)V", opaque = "1022938249")
	public void method7443(int var1) {
		this.field4593 &= -9;
		if (var1 == 1) {
			this.field4593 = (byte)(this.field4593 | 8);
		}

	}
}
