import io.runebox.ObfInfo;
import java.util.LinkedList;

@ObfInfo(name = "jk")
public abstract class Class245 {
	@ObfInfo(name = "al", desc = "[[[[Ljy;")
	public Class259[][][][] field2566;
	@ObfInfo(name = "ao", desc = "Z")
	public boolean field2567;
	@ObfInfo(name = "ay", desc = "Z")
	public boolean field2579;
	@ObfInfo(name = "ax", desc = "[[[B")
	public byte[][][] field2576;
	@ObfInfo(name = "ac", desc = "[[[B")
	public byte[][][] field2577;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 16710153)
	public int field2568;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1713331065)
	public int field2569;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -46933731)
	public int field2570;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1272828819)
	public int field2572;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -578244271)
	public int field2573;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -2070049431)
	public int field2578;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1716919149)
	public int field2580;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -799210067)
	public int field2581;
	@ObfInfo(name = "ah", desc = "[[[S")
	public short[][][] field2571;
	@ObfInfo(name = "az", desc = "[[[S")
	public short[][][] field2575;

	public Class245() {
		this.field2581 = -1;
		this.field2573 = -1;
		new LinkedList();
		this.field2579 = false;
		this.field2567 = false;
	}

	@ObfInfo(name = "ad", desc = "(Lvp;B)V")
	public abstract void method4699(Class562 var1);

	@ObfInfo(name = "aw", desc = "(B)Z", opaque = "47")
	public boolean method4711() {
		return this.field2579 && this.field2567;
	}

	@ObfInfo(name = "at", desc = "(Lok;I)V", opaque = "211106613")
	public void method4695(Class375 var1) {
		if (!this.method4711()) {
			byte[] var3 = var1.method7132(this.field2581, this.field2573);
			if (var3 != null) {
				this.method4699(new Class562(var3));
				this.field2579 = true;
				this.field2567 = true;
			}

		}
	}

	@ObfInfo(name = "af", desc = "(I)V")
	public void method4702() {
		this.field2571 = (short[][][])null;
		this.field2575 = (short[][][])null;
		this.field2576 = (byte[][][])null;
		this.field2577 = (byte[][][])null;
		this.field2566 = (Class259[][][][])null;
		this.field2579 = false;
		this.field2567 = false;
	}

	@ObfInfo(name = "am", desc = "(IILvp;B)V", opaque = "1")
	public void method4696(int var1, int var2, Class562 var3) {
		int var5 = var3.method9902();
		if (var5 != 0) {
			if (0 != (var5 & 1)) {
				this.method4697(var1, var2, var3, var5);
			} else {
				this.method4698(var1, var2, var3, var5);
			}

		}
	}

	@ObfInfo(name = "ar", desc = "(IILvp;II)V", opaque = "854663399")
	public void method4697(int var1, int var2, Class562 var3, int var4) {
		boolean var6 = (var4 & 2) != 0;
		if (var6) {
			this.field2575[0][var1][var2] = (short)var3.method9997();
		}

		this.field2571[0][var1][var2] = (short)var3.method9997();
	}

	@ObfInfo(name = "bt", desc = "(IILvp;IB)V", opaque = "0")
	public void method4698(int var1, int var2, Class562 var3, int var4) {
		int var6 = 1 + ((var4 & 24) >> 3);
		boolean var7 = 0 != (var4 & 2);
		boolean var8 = (var4 & 4) != 0;
		this.field2571[0][var1][var2] = (short)var3.method9997();
		int var9;
		int var10;
		int var12;
		if (var7) {
			var9 = var3.method9902();

			for (var10 = 0; var10 < var9; ++var10) {
				int var11 = var3.method9997();
				if (var11 != 0) {
					this.field2575[var10][var1][var2] = (short)var11;
					var12 = var3.method9902();
					this.field2576[var10][var1][var2] = (byte)(var12 >> 2);
					this.field2577[var10][var1][var2] = (byte)(var12 & 3);
				}
			}
		}

		if (var8) {
			for (var9 = 0; var9 < var6; ++var9) {
				var10 = var3.method9902();
				if (var10 != 0) {
					Class259[] var15 = this.field2566[var9][var1][var2] = new Class259[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						int var13 = var3.method9871();
						int var14 = var3.method9902();
						var15[var12] = new Class259(var13, var14 >> 2, var14 & 3);
					}
				}
			}
		}

	}

	@ObfInfo(name = "bj", desc = "(B)I")
	public int method4722() {
		return this.field2568;
	}

	@ObfInfo(name = "be", desc = "(I)I")
	public int method4701() {
		return this.field2569;
	}

	@ObfInfo(name = "ag", desc = "([Lcw;II[I[II)V", opaque = "-799642230")
	public static void method4724(Class75[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var6 = var1 - 1;
			int var7 = var2 + 1;
			int var8 = (var2 + var1) / 2;
			Class75 var9 = var0[var8];
			var0[var8] = var0[var1];
			var0[var1] = var9;

			while (var6 < var7) {
				boolean var10 = true;

				int var11;
				int var12;
				int var13;
				do {
					--var7;

					for (var11 = 0; var11 < 4; ++var11) {
						if (var3[var11] == 2) {
							var12 = var0[var7].field908;
							var13 = var9.field908;
						} else if (1 == var3[var11]) {
							var12 = var0[var7].field904;
							var13 = var9.field904;
							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}

							if (var13 == -1 && var4[var11] == 1) {
								var13 = 2001;
							}
						} else if (var3[var11] == 3) {
							var12 = var0[var7].method2157() ? 1 : 0;
							var13 = var9.method2157() ? 1 : 0;
						} else {
							var12 = var0[var7].field902;
							var13 = var9.field902;
						}

						if (var13 != var12) {
							if ((1 != var4[var11] || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				var10 = true;

				do {
					++var6;

					for (var11 = 0; var11 < 4; ++var11) {
						if (2 == var3[var11]) {
							var12 = var0[var6].field908;
							var13 = var9.field908;
						} else if (var3[var11] == 1) {
							var12 = var0[var6].field904;
							var13 = var9.field904;
							if (var12 == -1 && 1 == var4[var11]) {
								var12 = 2001;
							}

							if (var13 == -1 && 1 == var4[var11]) {
								var13 = 2001;
							}
						} else if (3 == var3[var11]) {
							var12 = var0[var6].method2157() ? 1 : 0;
							var13 = var9.method2157() ? 1 : 0;
						} else {
							var12 = var0[var6].field902;
							var13 = var9.field902;
						}

						if (var13 != var12) {
							if ((1 != var4[var11] || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				if (var6 < var7) {
					Class75 var14 = var0[var6];
					var0[var6] = var0[var7];
					var0[var7] = var14;
				}
			}

			method4724(var0, var1, var7, var3, var4);
			method4724(var0, var7 + 1, var2, var3, var4);
		}

	}
}
