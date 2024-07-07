import io.runebox.ObfInfo;

@ObfInfo(name = "co")
public class Class67 {
	@ObfInfo(name = "aq", desc = "[B")
	public byte[] field852;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1939909553)
	public int field849;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1005414431)
	public int field851;

	public Class67() {
		this.field852 = null;
		this.field849 = 0;
		this.field851 = 0;
	}

	@ObfInfo(name = "aq", desc = "(IB)I", opaque = "9")
	public int method1942(int var1) {
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = 0; var1 >= 8 - this.field851; var1 -= var5) {
			var5 = 8 - this.field851;
			int var6 = (1 << var5) - 1;
			var3 += (this.field852[this.field849] >> this.field851 & var6) << var4;
			this.field851 = 0;
			++this.field849;
			var4 += var5;
		}

		if (var1 > 0) {
			var5 = (1 << var1) - 1;
			var3 += (this.field852[this.field849] >> this.field851 & var5) << var4;
			this.field851 += var1;
		}

		return var3;
	}

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method1930() {
		int var2 = this.field852[this.field849] >> this.field851 & 1;
		++this.field851;
		this.field849 += this.field851 >> 3;
		this.field851 &= 7;
		return var2;
	}

	@ObfInfo(name = "ag", desc = "([BII)V")
	public void method1932(byte[] var1, int var2) {
		this.field852 = var1;
		this.field849 = var2;
		this.field851 = 0;
	}
}
