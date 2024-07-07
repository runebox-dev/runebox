import io.runebox.ObfInfo;

@ObfInfo(name = "ug")
public class Class527 extends Class562 {
	@ObfInfo(name = "ad", desc = "[I")
	public static final int[] field5267;
	@ObfInfo(name = "aq", desc = "Lvs;")
	public Class565 field5266;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1644561935)
	public int field5268;

	static {
		field5267 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public Class527(int var1) {
		super(var1);
	}

	@ObfInfo(name = "aq", desc = "([IB)V")
	public void method9339(int[] var1) {
		this.field5266 = new Class565(var1);
	}

	@ObfInfo(name = "ad", desc = "(Lvs;B)V")
	public void method9340(Class565 var1) {
		this.field5266 = var1;
	}

	@ObfInfo(name = "ag", desc = "(II)V")
	public void method9368(int var1) {
		super.field5472[++super.field5471 - 1] = (byte)(this.field5266.method10084() + var1);
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method9372() {
		return super.field5472[++super.field5471 - 1] - this.field5266.method10084() & 255;
	}

	@ObfInfo(name = "ap", desc = "(B)Z")
	public boolean method9344() {
		int var2 = super.field5472[super.field5471] - this.field5266.method10085() & 255;
		return var2 >= 128;
	}

	@ObfInfo(name = "an", desc = "(I)I")
	public int method9361() {
		int var2 = super.field5472[++super.field5471 - 1] - this.field5266.method10084() & 255;
		return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field5472[++super.field5471 - 1] - this.field5266.method10084() & 255);
	}

	@ObfInfo(name = "aj", desc = "([BIII)V", opaque = "-221009433")
	public void method9345(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < var3; ++var5) {
			var1[var5 + var2] = (byte)(super.field5472[++super.field5471 - 1] - this.field5266.method10084());
		}

	}

	@ObfInfo(name = "av", desc = "(B)V")
	public void method9346() {
		this.field5268 = super.field5471 * 8;
	}

	@ObfInfo(name = "ab", desc = "(II)I", opaque = "56229275")
	public int method9347(int var1) {
		int var3 = this.field5268 >> 3;
		int var4 = 8 - (this.field5268 & 7);
		int var5 = 0;

		for (this.field5268 += var1; var1 > var4; var4 = 8) {
			var5 += (super.field5472[var3++] & field5267[var4]) << var1 - var4;
			var1 -= var4;
		}

		if (var4 == var1) {
			var5 += super.field5472[var3] & field5267[var4];
		} else {
			var5 += super.field5472[var3] >> var4 - var1 & field5267[var1];
		}

		return var5;
	}

	@ObfInfo(name = "ai", desc = "(I)V")
	public void method9348() {
		super.field5471 = (7 + this.field5268) / 8;
	}

	@ObfInfo(name = "ae", desc = "(II)I")
	public int method9342(int var1) {
		return var1 * 8 - this.field5268;
	}

	@ObfInfo(name = "au", desc = "(II)I")
	public int method9350(int var1) {
		return var1 - super.field5471;
	}
}
