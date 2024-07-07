import io.runebox.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "is")
public class Class227 implements Class35 {
	@ObfInfo(name = "av", desc = "[Z")
	public boolean[] field2383;
	@ObfInfo(name = "ah", desc = "[Z")
	public boolean[] field2387;
	@ObfInfo(name = "ao", desc = "[Z")
	public boolean[] field2390;
	@ObfInfo(name = "aq", desc = "C")
	public char field2377;
	@ObfInfo(name = "ak", desc = "[C")
	public char[] field2379;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 127227895)
	public int field2380;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 397936417)
	public int field2382;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -137072547)
	public int field2384;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1100015875)
	public int field2385;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1257217165)
	public int field2388;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1450055511)
	public int field2389;
	@ObfInfo(name = "al", desc = "[I")
	public int[] field2378;
	@ObfInfo(name = "af", desc = "[I")
	public int[] field2381;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field2386;

	public Class227() {
		this.field2379 = new char[128];
		this.field2378 = new int[128];
		this.field2386 = new int[128];
		this.field2380 = 0;
		this.field2381 = new int[128];
		this.field2382 = 0;
		this.field2388 = 0;
		this.field2384 = 0;
		this.field2385 = 0;
		this.field2390 = new boolean[112];
		this.field2387 = new boolean[112];
		this.field2383 = new boolean[112];
	}

	@ObfInfo(name = "ak", desc = "(II)Z")
	public boolean method734(int var1) {
		this.method4337(var1);
		this.field2390[var1] = true;
		this.field2387[var1] = true;
		this.field2383[var1] = false;
		this.field2386[++this.field2380 - 1] = var1;
		return true;
	}

	@ObfInfo(name = "al", desc = "(II)Z")
	public boolean method736(int var1) {
		this.field2390[var1] = false;
		this.field2387[var1] = false;
		this.field2383[var1] = true;
		this.field2381[++this.field2382 - 1] = var1;
		return true;
	}

	@ObfInfo(name = "aj", desc = "(CI)Z", opaque = "206788056")
	public boolean method723(char var1) {
		int var3 = this.field2384 + 1 & 127;
		if (this.field2388 != var3) {
			this.field2378[this.field2384] = -1;
			this.field2379[this.field2384] = var1;
			this.field2384 = var3;
		}

		return false;
	}

	@ObfInfo(name = "as", desc = "(IB)V", opaque = "1")
	public void method4337(int var1) {
		int var3 = this.field2384 + 1 & 127;
		if (var3 != this.field2388) {
			this.field2378[this.field2384] = var1;
			this.field2379[this.field2384] = 0;
			this.field2384 = var3;
		}

	}

	@ObfInfo(name = "az", desc = "(ZS)Z")
	public boolean method737(boolean var1) {
		return false;
	}

	@ObfInfo(name = "aw", desc = "(I)V")
	public void method4339() {
		this.field2388 = this.field2385;
		this.field2385 = this.field2384;
		this.field2380 = 0;
		this.field2382 = 0;
		Arrays.fill(this.field2387, false);
		Arrays.fill(this.field2383, false);
	}

	@ObfInfo(name = "ad", desc = "(I)Z", opaque = "1661190134")
	public final boolean method4363() {
		if (this.field2385 == this.field2388) {
			return false;
		} else {
			this.field2389 = this.field2378[this.field2388];
			this.field2377 = this.field2379[this.field2388];
			this.field2388 = this.field2388 + 1 & 127;
			return true;
		}
	}

	@ObfInfo(name = "ai", desc = "(II)Z", opaque = "270086768")
	public boolean method4374(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2387[var1] : false;
	}

	@ObfInfo(name = "an", desc = "(II)Z", opaque = "254870631")
	public boolean method4342(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2390[var1] : false;
	}

	@ObfInfo(name = "am", desc = "(II)Z", opaque = "-1690083624")
	public boolean method4343(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2383[var1] : false;
	}

	@ObfInfo(name = "ar", desc = "(I)[I", opaque = "-1194566833")
	public int[] method4347() {
		int[] var2 = new int[this.field2380];

		for (int var3 = 0; var3 < this.field2380; ++var3) {
			var2[var3] = this.field2386[var3];
		}

		return var2;
	}

	@ObfInfo(name = "ag", desc = "(I)[I", opaque = "1122138314")
	public int[] method4370() {
		int[] var2 = new int[this.field2382];

		for (int var3 = 0; var3 < this.field2382; ++var3) {
			var2[var3] = this.field2381[var3];
		}

		return var2;
	}
}
