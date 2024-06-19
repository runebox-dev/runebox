import java.util.Arrays;

public class Class227 implements Class35 {
	public boolean[] field2383;
	public boolean[] field2387;
	public boolean[] field2390;
	public char field2377;
	public char[] field2379;
	public int field2380;
	public int field2382;
	public int field2384;
	public int field2385;
	public int field2388;
	public int field2389;
	public int[] field2378;
	public int[] field2381;
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

	public boolean method734(int var1) {
		this.method4337(var1);
		this.field2390[var1] = true;
		this.field2387[var1] = true;
		this.field2383[var1] = false;
		this.field2386[++this.field2380 - 1] = var1;
		return true;
	}

	public boolean method736(int var1) {
		this.field2390[var1] = false;
		this.field2387[var1] = false;
		this.field2383[var1] = true;
		this.field2381[++this.field2382 - 1] = var1;
		return true;
	}

	public boolean method723(char var1) {
		int var3 = this.field2384 + 1 & 127;
		if (this.field2388 != var3) {
			this.field2378[this.field2384] = -1;
			this.field2379[this.field2384] = var1;
			this.field2384 = var3;
		}

		return false;
	}

	public void method4337(int var1) {
		int var3 = this.field2384 + 1 & 127;
		if (var3 != this.field2388) {
			this.field2378[this.field2384] = var1;
			this.field2379[this.field2384] = 0;
			this.field2384 = var3;
		}

	}

	public boolean method737(boolean var1) {
		return false;
	}

	public void method4339() {
		this.field2388 = this.field2385;
		this.field2385 = this.field2384;
		this.field2380 = 0;
		this.field2382 = 0;
		Arrays.fill(this.field2387, false);
		Arrays.fill(this.field2383, false);
	}

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

	public boolean method4374(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2387[var1] : false;
	}

	public boolean method4342(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2390[var1] : false;
	}

	public boolean method4343(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2383[var1] : false;
	}

	public int[] method4347() {
		int[] var2 = new int[this.field2380];

		for (int var3 = 0; var3 < this.field2380; ++var3) {
			var2[var3] = this.field2386[var3];
		}

		return var2;
	}

	public int[] method4370() {
		int[] var2 = new int[this.field2382];

		for (int var3 = 0; var3 < this.field2382; ++var3) {
			var2[var3] = this.field2381[var3];
		}

		return var2;
	}
}
