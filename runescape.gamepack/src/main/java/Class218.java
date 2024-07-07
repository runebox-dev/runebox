import io.runebox.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "ij")
public class Class218 implements Class39 {
	@ObfInfo(name = "ai", desc = "[Z")
	public boolean[] field2373;
	@ObfInfo(name = "ae", desc = "[Z")
	public boolean[] field2378;
	@ObfInfo(name = "au", desc = "[Z")
	public boolean[] field2382;
	@ObfInfo(name = "ah", desc = "C")
	public char field2383;
	@ObfInfo(name = "aq", desc = "[C")
	public char[] field2385;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -625491541)
	public int field2374;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1718960357)
	public int field2376;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -413767025)
	public int field2377;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1889891679)
	public int field2379;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1980467025)
	public int field2380;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -243119895)
	public int field2384;
	@ObfInfo(name = "ad", desc = "[I")
	public int[] field2372;
	@ObfInfo(name = "ap", desc = "[I")
	public int[] field2375;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field2381;

	public Class218() {
		this.field2385 = new char[128];
		this.field2372 = new int[128];
		this.field2381 = new int[128];
		this.field2374 = 0;
		this.field2375 = new int[128];
		this.field2376 = 0;
		this.field2377 = 0;
		this.field2380 = 0;
		this.field2379 = 0;
		this.field2373 = new boolean[112];
		this.field2378 = new boolean[112];
		this.field2382 = new boolean[112];
	}

	@ObfInfo(name = "aq", desc = "(II)Z")
	public boolean method562(int var1) {
		this.method4186(var1);
		this.field2373[var1] = true;
		this.field2378[var1] = true;
		this.field2382[var1] = false;
		this.field2381[++this.field2374 - 1] = var1;
		return true;
	}

	@ObfInfo(name = "ad", desc = "(IB)Z")
	public boolean method564(int var1) {
		this.field2373[var1] = false;
		this.field2378[var1] = false;
		this.field2382[var1] = true;
		this.field2375[++this.field2376 - 1] = var1;
		return true;
	}

	@ObfInfo(name = "ag", desc = "(CI)Z", opaque = "-327979221")
	public boolean method556(char var1) {
		int var3 = 1 + this.field2380 & 127;
		if (this.field2377 != var3) {
			this.field2372[this.field2380] = -1;
			this.field2385[this.field2380] = var1;
			this.field2380 = var3;
		}

		return false;
	}

	@ObfInfo(name = "au", desc = "(II)V", opaque = "-1195175196")
	public void method4186(int var1) {
		int var3 = this.field2380 + 1 & 127;
		if (var3 != this.field2377) {
			this.field2372[this.field2380] = var1;
			this.field2385[this.field2380] = 0;
			this.field2380 = var3;
		}

	}

	@ObfInfo(name = "ak", desc = "(ZS)Z")
	public boolean method557(boolean var1) {
		return false;
	}

	@ObfInfo(name = "ah", desc = "(B)V")
	public void method4213() {
		this.field2377 = this.field2379;
		this.field2379 = this.field2380;
		this.field2374 = 0;
		this.field2376 = 0;
		Arrays.fill(this.field2378, false);
		Arrays.fill(this.field2382, false);
	}

	@ObfInfo(name = "az", desc = "(B)Z", opaque = "32")
	public final boolean method4189() {
		if (this.field2377 == this.field2379) {
			return false;
		} else {
			this.field2384 = this.field2372[this.field2377];
			this.field2383 = this.field2385[this.field2377];
			this.field2377 = this.field2377 + 1 & 127;
			return true;
		}
	}

	@ObfInfo(name = "ax", desc = "(II)Z", opaque = "-1609263617")
	public boolean method4190(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2378[var1] : false;
	}

	@ObfInfo(name = "ac", desc = "(II)Z", opaque = "-95509134")
	public boolean method4191(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2373[var1] : false;
	}

	@ObfInfo(name = "al", desc = "(II)Z", opaque = "-2035020706")
	public boolean method4192(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2382[var1] : false;
	}

	@ObfInfo(name = "ay", desc = "(I)[I", opaque = "1567772506")
	public int[] method4193() {
		int[] var2 = new int[this.field2374];

		for (int var3 = 0; var3 < this.field2374; ++var3) {
			var2[var3] = this.field2381[var3];
		}

		return var2;
	}

	@ObfInfo(name = "ao", desc = "(B)[I")
	public int[] method4194() {
		int[] var2 = new int[this.field2376];

		for (int var3 = 0; var3 < this.field2376; ++var3) {
			var2[var3] = this.field2375[var3];
		}

		return var2;
	}

	@ObfInfo(name = "ay", desc = "(III)I", opaque = "-56252533")
	public static int method4199(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}
}
