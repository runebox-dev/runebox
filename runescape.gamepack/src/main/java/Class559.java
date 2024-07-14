import io.runebox.ObfInfo;

@ObfInfo(name = "vm")
public class Class559 {
	@ObfInfo(name = "aq", desc = "[I")
	public int[] field5450;

	public Class559(int[] var1) {
		int var2;
		for (var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) {
		}

		this.field5450 = new int[var2 + var2];

		int var3;
		for (var3 = 0; var3 < var2 + var2; ++var3) {
			this.field5450[var3] = -1;
		}

		int var4;
		for (var3 = 0; var3 < var1.length; this.field5450[var4 + var4 + 1] = var3++) {
			for (var4 = var1[var3] & var2 - 1; this.field5450[var4 + var4 + 1] != -1; var4 = var4 + 1 & var2 - 1) {
			}

			this.field5450[var4 + var4] = var1[var3];
		}

	}

	@ObfInfo(name = "aq", desc = "(IB)I", opaque = "32")
	public int method9771(int var1) {
		int var3 = (this.field5450.length >> 1) - 1;
		int var4 = var1 & var3;

		while (true) {
			int var5 = this.field5450[var4 + var4 + 1];
			if (var5 == -1) {
				return -1;
			}

			if (this.field5450[var4 + var4] == var1) {
				return var5;
			}

			var4 = var4 + 1 & var3;
		}
	}
}
