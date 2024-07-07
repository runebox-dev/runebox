import io.runebox.ObfInfo;

@ObfInfo(name = "jo")
public class Class249 implements Class264 {
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 634985527)
	public int field2615;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 304812967)
	public int field2616;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 807455785)
	public int field2617;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1488767803)
	public int field2619;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -763316353)
	public int field2620;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 2121716295)
	public int field2621;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1895852113)
	public int field2622;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1095618859)
	public int field2623;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1912317275)
	public int field2624;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 706012301)
	public int field2626;

	@ObfInfo(name = "aq", desc = "(Ljm;I)V", opaque = "1568670940")
	public void method4458(Class247 var1) {
		if (var1.field2607 > this.field2621) {
			var1.field2607 = this.field2621;
		}

		if (var1.field2603 < this.field2620) {
			var1.field2603 = this.field2620;
		}

		if (var1.field2608 > this.field2622) {
			var1.field2608 = this.field2622;
		}

		if (var1.field2609 < this.field2624) {
			var1.field2609 = this.field2624;
		}

	}

	@ObfInfo(name = "ad", desc = "(IIIB)Z", opaque = "-1")
	public boolean method4459(int var1, int var2, int var3) {
		if (var1 >= this.field2626 && var1 < this.field2616 + this.field2626) {
			return var2 >> 6 >= this.field2615 && var2 >> 6 <= this.field2619 && var3 >> 6 >= this.field2623 && var3 >> 6 <= this.field2617;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ag", desc = "(III)Z", opaque = "-889269986")
	public boolean method4480(int var1, int var2) {
		return var1 >> 6 >= this.field2621 && var1 >> 6 <= this.field2620 && var2 >> 6 >= this.field2622 && var2 >> 6 <= this.field2624;
	}

	@ObfInfo(name = "ak", desc = "(IIIB)[I", opaque = "7")
	public int[] method4461(int var1, int var2, int var3) {
		if (!this.method4459(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{var2 + (this.field2621 * 64 - this.field2615 * 64), this.field2622 * 64 - this.field2623 * 64 + var3};
			return var5;
		}
	}

	@ObfInfo(name = "ap", desc = "(III)Lnl;")
	public Class350 method4462(int var1, int var2) {
		if (!this.method4480(var1, var2)) {
			return null;
		} else {
			int var4 = var1 + (this.field2615 * 64 - this.field2621 * 64);
			int var5 = this.field2623 * 64 - this.field2622 * 64 + var2;
			return new Class350(this.field2626, var4, var5);
		}
	}

	@ObfInfo(name = "an", desc = "(Lvp;I)V")
	public void method4463(Class562 var1) {
		this.field2626 = var1.method9902();
		this.field2616 = var1.method9902();
		this.field2615 = var1.method9997();
		this.field2623 = var1.method9997();
		this.field2619 = var1.method9997();
		this.field2617 = var1.method9997();
		this.field2621 = var1.method9997();
		this.field2622 = var1.method9997();
		this.field2620 = var1.method9997();
		this.field2624 = var1.method9997();
		this.method4853();
	}

	@ObfInfo(name = "aj", desc = "(I)V")
	public void method4853() {
	}
}
