import io.runebox.ObfInfo;

@ObfInfo(name = "uk")
public class Class531 extends Class521 {
	@ObfInfo(name = "al", desc = "[I")
	public static final int[] field5255;
	@ObfInfo(name = "ak", desc = "Lvr;")
	public Class563 field5257;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1421853647)
	public int field5256;

	static {
		field5255 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public Class531(int var1) {
		super(var1);
	}

	@ObfInfo(name = "ak", desc = "([II)V")
	public void method9766(int[] var1) {
		this.field5257 = new Class563(var1);
	}

	@ObfInfo(name = "al", desc = "(Lvr;I)V")
	public void method9777(Class563 var1) {
		this.field5257 = var1;
	}

	@ObfInfo(name = "aj", desc = "(II)V")
	public void method9760(int var1) {
		super.field5221[++super.field5219 - 1] = (byte)(this.field5257.method10239() + var1);
	}

	@ObfInfo(name = "az", desc = "(I)I")
	public int method9761() {
		return super.field5221[++super.field5219 - 1] - this.field5257.method10239() & 255;
	}

	@ObfInfo(name = "af", desc = "(I)Z")
	public boolean method9767() {
		int var2 = super.field5221[super.field5219] - this.field5257.method10236() & 255;
		return var2 >= 128;
	}

	@ObfInfo(name = "aa", desc = "(I)I", opaque = "1768993382")
	public int method9791() {
		int var2 = super.field5221[++super.field5219 - 1] - this.field5257.method10239() & 255;
		return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field5221[++super.field5219 - 1] - this.field5257.method10239() & 255);
	}

	@ObfInfo(name = "at", desc = "([BIIB)V", opaque = "12")
	public void method9759(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < var3; ++var5) {
			var1[var5 + var2] = (byte)(super.field5221[++super.field5219 - 1] - this.field5257.method10239());
		}

	}

	@ObfInfo(name = "ab", desc = "(B)V")
	public void method9765() {
		this.field5256 = super.field5219 * 8;
	}

	@ObfInfo(name = "ac", desc = "(II)I", opaque = "1771299820")
	public int method9770(int var1) {
		int var3 = this.field5256 >> 3;
		int var4 = 8 - (this.field5256 & 7);
		int var5 = 0;

		for (this.field5256 += var1; var1 > var4; var4 = 8) {
			var5 += (super.field5221[var3++] & field5255[var4]) << var1 - var4;
			var1 -= var4;
		}

		if (var4 == var1) {
			var5 += super.field5221[var3] & field5255[var4];
		} else {
			var5 += super.field5221[var3] >> var4 - var1 & field5255[var1];
		}

		return var5;
	}

	@ObfInfo(name = "ao", desc = "(S)V")
	public void method9799() {
		super.field5219 = (this.field5256 + 7) / 8;
	}

	@ObfInfo(name = "ah", desc = "(II)I")
	public int method9768(int var1) {
		return var1 * 8 - this.field5256;
	}

	@ObfInfo(name = "av", desc = "(IB)I")
	public int method9769(int var1) {
		return var1 - super.field5219;
	}
}
