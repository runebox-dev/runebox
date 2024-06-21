import io.runebox.ObfInfo;

public class Class568 {
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field5479;

	public Class568(int[] var1) {
		int var2;
		for (var2 = 1; var2 <= var1.length + (var1.length >> 1); var2 <<= 1) {
		}

		this.field5479 = new int[var2 + var2];

		int var3;
		for (var3 = 0; var3 < var2 + var2; ++var3) {
			this.field5479[var3] = -1;
		}

		int var4;
		for (var3 = 0; var3 < var1.length; this.field5479[1 + var4 + var4] = var3++) {
			for (var4 = var1[var3] & var2 - 1; -1 != this.field5479[var4 + var4 + 1]; var4 = var4 + 1 & var2 - 1) {
			}

			this.field5479[var4 + var4] = var1[var3];
		}

	}

	@ObfInfo(name = "ak", desc = "(II)I", opaque = "-1595267691")
	public int method10283(int var1) {
		int var3 = (this.field5479.length >> 1) - 1;
		int var4 = var1 & var3;

		while (true) {
			int var5 = this.field5479[var4 + var4 + 1];
			if (var5 == -1) {
				return -1;
			}

			if (var1 == this.field5479[var4 + var4]) {
				return var5;
			}

			var4 = var4 + 1 & var3;
		}
	}
}
