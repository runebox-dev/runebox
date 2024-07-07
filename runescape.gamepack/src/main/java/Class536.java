import io.runebox.ObfInfo;

@ObfInfo(name = "up")
public final class Class536 {
	@ObfInfo(name = "ag", desc = "Ltz;")
	public Class520 field5296;
	@ObfInfo(name = "ak", desc = "Ltz;")
	public Class520 field5297;
	@ObfInfo(name = "ad", desc = "[Ltz;")
	public Class520[] field5295;
	@ObfInfo(name = "aq", desc = "I")
	public int field5298;
	@ObfInfo(name = "ap", desc = "I")
	public int field5299;

	public Class536(int var1) {
		this.field5299 = 0;
		this.field5298 = var1;
		this.field5295 = new Class520[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			Class520 var3 = this.field5295[var2] = new Class520();
			var3.field5235 = var3;
			var3.field5233 = var3;
		}

	}

	@ObfInfo(name = "aq", desc = "(J)Ltz;")
	public Class520 method9439(long var1) {
		Class520 var3 = this.field5295[(int)(var1 & (long)(this.field5298 - 1))];

		for (this.field5296 = var3.field5235; this.field5296 != var3; this.field5296 = this.field5296.field5235) {
			if (this.field5296.field5234 == var1) {
				Class520 var4 = this.field5296;
				this.field5296 = this.field5296.field5235;
				return var4;
			}
		}

		this.field5296 = null;
		return null;
	}

	@ObfInfo(name = "ad", desc = "()I")
	public int method9440() {
		int var1 = 0;

		for (int var2 = 0; var2 < this.field5298; ++var2) {
			Class520 var3 = this.field5295[var2];

			for (Class520 var4 = var3.field5235; var4 != var3; var4 = var4.field5235) {
				++var1;
			}
		}

		return var1;
	}

	@ObfInfo(name = "ag", desc = "(Ltz;J)V")
	public void method9445(Class520 var1, long var2) {
		if (var1.field5233 != null) {
			var1.method9267();
		}

		Class520 var4 = this.field5295[(int)(var2 & (long)(this.field5298 - 1))];
		var1.field5233 = var4.field5233;
		var1.field5235 = var4;
		var1.field5233.field5235 = var1;
		var1.field5235.field5233 = var1;
		var1.field5234 = var2;
	}

	@ObfInfo(name = "ak", desc = "()Ltz;")
	public Class520 method9442() {
		this.field5299 = 0;
		return this.method9446();
	}

	@ObfInfo(name = "ap", desc = "()Ltz;")
	public Class520 method9446() {
		Class520 var1;
		if (this.field5299 > 0 && this.field5297 != this.field5295[this.field5299 - 1]) {
			var1 = this.field5297;
			this.field5297 = var1.field5235;
			return var1;
		} else {
			do {
				if (this.field5299 >= this.field5298) {
					return null;
				}

				var1 = this.field5295[this.field5299++].field5235;
			} while(var1 == this.field5295[this.field5299 - 1]);

			this.field5297 = var1.field5235;
			return var1;
		}
	}
}
