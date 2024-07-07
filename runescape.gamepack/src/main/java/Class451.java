import io.runebox.ObfInfo;

@ObfInfo(name = "ri")
public class Class451 {
	@ObfInfo(name = "ag", desc = "Z")
	public boolean field4863;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1169960417)
	public int field4855;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1130866977)
	public int field4857;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 121779419)
	public int field4862;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 366870427)
	public int field4864;
	@ObfInfo(name = "ad", desc = "J", longMultiplier = -7702364636721094597L)
	public long field4856;
	@ObfInfo(name = "aq", desc = "J", longMultiplier = 4967844252508248949L)
	public long field4858;
	@ObfInfo(name = "ap", desc = "J", longMultiplier = 3868601707168331443L)
	public long field4859;
	@ObfInfo(name = "an", desc = "J", longMultiplier = 8299523440899943207L)
	public long field4860;
	@ObfInfo(name = "ak", desc = "J", longMultiplier = 3838602930801498373L)
	public long field4861;

	public Class451() {
		this.field4858 = -1L;
		this.field4856 = -1L;
		this.field4863 = false;
		this.field4861 = 0L;
		this.field4859 = 0L;
		this.field4860 = 0L;
		this.field4857 = 0;
		this.field4862 = 0;
		this.field4855 = 0;
		this.field4864 = 0;
	}

	@ObfInfo(name = "aq", desc = "(I)V")
	public void method8311() {
		this.field4858 = Class329.method4953();
	}

	@ObfInfo(name = "ad", desc = "(I)V", opaque = "-1871405839")
	public void method8321() {
		if (-1L != this.field4858) {
			this.field4859 = Class329.method4953() - this.field4858;
			this.field4858 = -1L;
		}

	}

	@ObfInfo(name = "ag", desc = "(II)V")
	public void method8317(int var1) {
		this.field4856 = Class329.method4953();
		this.field4857 = var1;
	}

	@ObfInfo(name = "ak", desc = "(I)V", opaque = "939540420")
	public void method8314() {
		if (this.field4856 != -1L) {
			this.field4861 = Class329.method4953() - this.field4856;
			this.field4856 = -1L;
		}

		++this.field4855;
		this.field4863 = true;
	}

	@ObfInfo(name = "ap", desc = "(I)V")
	public void method8315() {
		this.field4863 = false;
		this.field4862 = 0;
	}

	@ObfInfo(name = "an", desc = "(B)V")
	public void method8316() {
		this.method8314();
	}

	@ObfInfo(name = "aj", desc = "(Lvp;B)V")
	public void method8319(Class562 var1) {
		method7965(var1, this.field4859);
		method7965(var1, this.field4861);
		method7965(var1, this.field4860);
		var1.method9810(this.field4857);
		var1.method9810(this.field4862);
		var1.method9810(this.field4855);
		var1.method9810(this.field4864);
	}

	@ObfInfo(owner = "ql", name = "av", desc = "(Lvp;J)V")
	public static void method7965(Class562 var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.method9810((int)var1);
	}

	public static Class256 abs(int var0, int var1) {
		Client.field671.field2674 = var0 * -365881490;
		Client.field671.field2671 = var1;
		Client.field671.field2672 = 1;
		Client.field671.field2670 = -1887275890;
		return Client.field671;
	}
}
