import io.runebox.ObfInfo;

@ObfInfo(name = "jl")
public class Class246 implements Class264 {
	@ObfInfo(name = "az", desc = "I", intMultiplier = 2104035971)
	public int field2582;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -218939471)
	public int field2583;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -650038491)
	public int field2584;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -329528349)
	public int field2585;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -998317303)
	public int field2586;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 374574747)
	public int field2587;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1200076691)
	public int field2589;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1340854329)
	public int field2590;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -422996183)
	public int field2591;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -663064165)
	public int field2592;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1256569709)
	public int field2593;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 760931579)
	public int field2594;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1186226363)
	public int field2595;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 40711577)
	public int field2596;

	@ObfInfo(name = "aq", desc = "(Ljm;I)V", opaque = "1568670940")
	public void method4458(Class247 var1) {
		if (var1.field2607 > this.field2586) {
			var1.field2607 = this.field2586;
		}

		if (var1.field2603 < this.field2586) {
			var1.field2603 = this.field2586;
		}

		if (var1.field2608 > this.field2596) {
			var1.field2608 = this.field2596;
		}

		if (var1.field2609 < this.field2596) {
			var1.field2609 = this.field2596;
		}

	}

	@ObfInfo(name = "ad", desc = "(IIIB)Z", opaque = "-1")
	public boolean method4459(int var1, int var2, int var3) {
		if (var1 >= this.field2589 && var1 < this.field2589 + this.field2583) {
			return var2 >= (this.field2595 << 3) + (this.field2594 << 6) && var2 <= (this.field2594 << 6) + (this.field2590 << 3) + 7 && var3 >= (this.field2585 << 6) + (this.field2584 << 3) && var3 <= (this.field2591 << 3) + (this.field2585 << 6) + 7;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ag", desc = "(III)Z", opaque = "-889269986")
	public boolean method4480(int var1, int var2) {
		return var1 >= (this.field2592 << 3) + (this.field2586 << 6) && var1 <= (this.field2587 << 3) + (this.field2586 << 6) + 7 && var2 >= (this.field2596 << 6) + (this.field2593 << 3) && var2 <= (this.field2596 << 6) + (this.field2582 << 3) + 7;
	}

	@ObfInfo(name = "ak", desc = "(IIIB)[I", opaque = "7")
	public int[] method4461(int var1, int var2, int var3) {
		if (!this.method4459(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field2592 * 8 - this.field2595 * 8 + this.field2586 * 64 - this.field2594 * 64 + var2, this.field2593 * 8 - this.field2584 * 8 + this.field2596 * 64 - this.field2585 * 64 + var3};
			return var5;
		}
	}

	@ObfInfo(name = "ap", desc = "(III)Lnl;", opaque = "796740285")
	public Class350 method4462(int var1, int var2) {
		if (!this.method4480(var1, var2)) {
			return null;
		} else {
			int var4 = this.field2595 * 8 - this.field2592 * 8 + this.field2594 * 64 - this.field2586 * 64 + var1;
			int var5 = this.field2584 * 8 - this.field2593 * 8 + this.field2585 * 64 - this.field2596 * 64 + var2;
			return new Class350(this.field2589, var4, var5);
		}
	}

	@ObfInfo(name = "an", desc = "(Lvp;I)V")
	public void method4463(Class562 var1) {
		this.field2589 = var1.method9902();
		this.field2583 = var1.method9902();
		this.field2594 = var1.method9997();
		this.field2595 = var1.method9902();
		this.field2590 = var1.method9902();
		this.field2585 = var1.method9997();
		this.field2584 = var1.method9902();
		this.field2591 = var1.method9902();
		this.field2586 = var1.method9997();
		this.field2592 = var1.method9902();
		this.field2587 = var1.method9902();
		this.field2596 = var1.method9997();
		this.field2593 = var1.method9902();
		this.field2582 = var1.method9902();
		this.method4731();
	}

	@ObfInfo(name = "aj", desc = "(I)V")
	public void method4731() {
	}
}
