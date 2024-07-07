import io.runebox.ObfInfo;

@ObfInfo(name = "ja")
public class Class235 implements Class264 {
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1438919263)
	public int field2488;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1445981505)
	public int field2489;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 205314157)
	public int field2490;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 566969525)
	public int field2491;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1210346411)
	public int field2492;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1113536653)
	public int field2493;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1625304123)
	public int field2494;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 1179156949)
	public int field2495;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1224971547)
	public int field2496;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1756336939)
	public int field2497;

	@ObfInfo(name = "aq", desc = "(Ljm;I)V", opaque = "1568670940")
	public void method4458(Class247 var1) {
		if (var1.field2607 > this.field2496) {
			var1.field2607 = this.field2496;
		}

		if (var1.field2603 < this.field2496) {
			var1.field2603 = this.field2496;
		}

		if (var1.field2608 > this.field2493) {
			var1.field2608 = this.field2493;
		}

		if (var1.field2609 < this.field2493) {
			var1.field2609 = this.field2493;
		}

	}

	@ObfInfo(name = "ad", desc = "(IIIB)Z", opaque = "-1")
	public boolean method4459(int var1, int var2, int var3) {
		if (var1 >= this.field2492 && var1 < this.field2489 + this.field2492) {
			return var2 >= (this.field2490 << 6) + (this.field2488 << 3) && var2 <= 7 + (this.field2488 << 3) + (this.field2490 << 6) && var3 >= (this.field2495 << 3) + (this.field2494 << 6) && var3 <= 7 + (this.field2494 << 6) + (this.field2495 << 3);
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ag", desc = "(III)Z", opaque = "-889269986")
	public boolean method4480(int var1, int var2) {
		return var1 >= (this.field2491 << 3) + (this.field2496 << 6) && var1 <= 7 + (this.field2496 << 6) + (this.field2491 << 3) && var2 >= (this.field2497 << 3) + (this.field2493 << 6) && var2 <= 7 + (this.field2493 << 6) + (this.field2497 << 3);
	}

	@ObfInfo(name = "ak", desc = "(IIIB)[I", opaque = "7")
	public int[] method4461(int var1, int var2, int var3) {
		if (!this.method4459(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field2491 * 8 - this.field2488 * 8 + var2 + (this.field2496 * 64 - this.field2490 * 64), this.field2497 * 8 - this.field2495 * 8 + var3 + (this.field2493 * 64 - this.field2494 * 64)};
			return var5;
		}
	}

	@ObfInfo(name = "ap", desc = "(III)Lnl;", opaque = "796740285")
	public Class350 method4462(int var1, int var2) {
		if (!this.method4480(var1, var2)) {
			return null;
		} else {
			int var4 = this.field2490 * 64 - this.field2496 * 64 + var1 + (this.field2488 * 8 - this.field2491 * 8);
			int var5 = this.field2494 * 64 - this.field2493 * 64 + var2 + (this.field2495 * 8 - this.field2497 * 8);
			return new Class350(this.field2492, var4, var5);
		}
	}

	@ObfInfo(name = "an", desc = "(Lvp;I)V")
	public void method4463(Class562 var1) {
		this.field2492 = var1.method9902();
		this.field2489 = var1.method9902();
		this.field2490 = var1.method9997();
		this.field2488 = var1.method9902();
		this.field2494 = var1.method9997();
		this.field2495 = var1.method9902();
		this.field2496 = var1.method9997();
		this.field2491 = var1.method9902();
		this.field2493 = var1.method9997();
		this.field2497 = var1.method9902();
		this.method4481();
	}

	@ObfInfo(name = "aj", desc = "(I)V")
	public void method4481() {
	}
}
