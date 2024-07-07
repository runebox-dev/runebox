import io.runebox.ObfInfo;

@ObfInfo(name = "by")
public class Class51 extends Class37 {
	@ObfInfo(name = "aq", desc = "Lpr;")
	public Class408 field321;
	@ObfInfo(name = "ad", desc = "Lpr;")
	public Class408 field323;
	@ObfInfo(name = "ak", desc = "I")
	public int field320;
	@ObfInfo(name = "ag", desc = "I")
	public int field322;

	public Class51() {
		this.field321 = new Class408();
		this.field323 = new Class408();
		this.field322 = 0;
		this.field320 = -1;
	}

	@ObfInfo(name = "aq", desc = "(Lbk;)V")
	public final synchronized void method892(Class37 var1) {
		this.field321.method7505(var1);
	}

	@ObfInfo(name = "ad", desc = "(Lbk;)V")
	public final synchronized void method925(Class37 var1) {
		var1.method9267();
	}

	@ObfInfo(name = "ag", desc = "()V")
	public void method894() {
		if (this.field322 > 0) {
			for (Class65 var1 = (Class65)this.field323.method7526(); var1 != null; var1 = (Class65)this.field323.method7511()) {
				var1.field836 -= this.field322;
			}

			this.field320 -= this.field322;
			this.field322 = 0;
		}

	}

	@ObfInfo(name = "ak", desc = "(Ltz;Lcm;)V")
	public void method918(Class520 var1, Class65 var2) {
		while (this.field323.field4659 != var1 && ((Class65)var1).field836 <= var2.field836) {
			var1 = var1.field5235;
		}

		Class408.method7503(var2, var1);
		this.field320 = ((Class65)this.field323.field4659.field5235).field836;
	}

	@ObfInfo(name = "ap", desc = "(Lcm;)V")
	public void method896(Class65 var1) {
		var1.method9267();
		var1.method1916();
		Class520 var2 = this.field323.field4659.field5235;
		if (this.field323.field4659 == var2) {
			this.field320 = -1;
		} else {
			this.field320 = ((Class65)var2).field836;
		}

	}

	@ObfInfo(name = "an", desc = "()Lbk;")
	public Class37 method546() {
		return (Class37)this.field321.method7526();
	}

	@ObfInfo(name = "aj", desc = "()Lbk;")
	public Class37 method525() {
		return (Class37)this.field321.method7511();
	}

	@ObfInfo(name = "av", desc = "()I")
	public int method529() {
		return 0;
	}

	@ObfInfo(name = "ab", desc = "([III)V")
	public final synchronized void method531(int[] var1, int var2, int var3) {
		do {
			if (this.field320 < 0) {
				this.method901(var1, var2, var3);
				return;
			}

			if (this.field322 + var3 < this.field320) {
				this.field322 += var3;
				this.method901(var1, var2, var3);
				return;
			}

			int var4 = this.field320 - this.field322;
			this.method901(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field322 += var4;
			this.method894();
			Class65 var5 = (Class65)this.field323.method7526();
			synchronized(var5) {
				int var7 = var5.method1912(this);
				if (var7 < 0) {
					var5.field836 = 0;
					this.method896(var5);
				} else {
					var5.field836 = var7;
					this.method918(var5.field5235, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfInfo(name = "ai", desc = "([III)V")
	public void method901(int[] var1, int var2, int var3) {
		for (Class37 var4 = (Class37)this.field321.method7526(); var4 != null; var4 = (Class37)this.field321.method7511()) {
			var4.method530(var1, var2, var3);
		}

	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public final synchronized void method542(int var1) {
		do {
			if (this.field320 < 0) {
				this.method903(var1);
				return;
			}

			if (this.field322 + var1 < this.field320) {
				this.field322 += var1;
				this.method903(var1);
				return;
			}

			int var2 = this.field320 - this.field322;
			this.method903(var2);
			var1 -= var2;
			this.field322 += var2;
			this.method894();
			Class65 var3 = (Class65)this.field323.method7526();
			synchronized(var3) {
				int var5 = var3.method1912(this);
				if (var5 < 0) {
					var3.field836 = 0;
					this.method896(var3);
				} else {
					var3.field836 = var5;
					this.method918(var3.field5235, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfInfo(name = "au", desc = "(I)V")
	public void method903(int var1) {
		for (Class37 var2 = (Class37)this.field321.method7526(); var2 != null; var2 = (Class37)this.field321.method7511()) {
			var2.method542(var1);
		}

	}
}
