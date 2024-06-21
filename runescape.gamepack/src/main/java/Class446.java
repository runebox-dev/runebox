import io.runebox.ObfInfo;

@ObfInfo(name = "rd")
public class Class446 {
	@ObfInfo(name = "aj", desc = "Z")
	public boolean field4799;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -797746207)
	public int field4801;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1273921)
	public int field4803;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1014599563)
	public int field4804;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1118243023)
	public int field4805;
	@ObfInfo(name = "al", desc = "J", longMultiplier = -3812748211047258135L)
	public long field4797;
	@ObfInfo(name = "ak", desc = "J", longMultiplier = -1432285200756225385L)
	public long field4798;
	@ObfInfo(name = "az", desc = "J", longMultiplier = -2834928832477283745L)
	public long field4800;
	@ObfInfo(name = "aa", desc = "J", longMultiplier = 4819439958652967L)
	public long field4802;
	@ObfInfo(name = "af", desc = "J", longMultiplier = -4358401982993948489L)
	public long field4806;

	public Class446() {
		this.field4798 = -1L;
		this.field4797 = -1L;
		this.field4799 = false;
		this.field4800 = 0L;
		this.field4806 = 0L;
		this.field4802 = 0L;
		this.field4803 = 0;
		this.field4804 = 0;
		this.field4805 = 0;
		this.field4801 = 0;
	}

	@ObfInfo(name = "ak", desc = "(S)V")
	public void method8354() {
		this.field4798 = Class130.method3047();
	}

	@ObfInfo(name = "al", desc = "(I)V", opaque = "1241117452")
	public void method8353() {
		if (this.field4798 != -1L) {
			this.field4806 = Class130.method3047() - this.field4798;
			this.field4798 = -1L;
		}

	}

	@ObfInfo(name = "aj", desc = "(IB)V")
	public void method8355(int var1) {
		this.field4797 = Class130.method3047();
		this.field4803 = var1;
	}

	@ObfInfo(name = "az", desc = "(S)V")
	public void method8357() {
		if (this.field4797 != -1L) {
			this.field4800 = Class130.method3047() - this.field4797;
			this.field4797 = -1L;
		}

		++this.field4805;
		this.field4799 = true;
	}

	@ObfInfo(name = "af", desc = "(I)V")
	public void method8358() {
		this.field4799 = false;
		this.field4804 = 0;
	}

	@ObfInfo(name = "aa", desc = "(I)V")
	public void method8359() {
		this.method8357();
	}

	@ObfInfo(name = "at", desc = "(Lua;I)V", opaque = "-1730209907")
	public void method8365(Class521 var1) {
		long var3 = this.field4806;
		var3 /= 10L;
		if (var3 < 0L) {
			var3 = 0L;
		} else if (var3 > 65535L) {
			var3 = 65535L;
		}

		var1.method9389((int)var3);
		long var5 = this.field4800;
		var5 /= 10L;
		if (var5 < 0L) {
			var5 = 0L;
		} else if (var5 > 65535L) {
			var5 = 65535L;
		}

		var1.method9389((int)var5);
		long var7 = this.field4802;
		var7 /= 10L;
		if (var7 < 0L) {
			var7 = 0L;
		} else if (var7 > 65535L) {
			var7 = 65535L;
		}

		var1.method9389((int)var7);
		var1.method9389(this.field4803);
		var1.method9389(this.field4804);
		var1.method9389(this.field4805);
		var1.method9389(this.field4801);
	}
}
