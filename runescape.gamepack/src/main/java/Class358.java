import io.runebox.ObfInfo;

@ObfInfo(name = "nt")
public class Class358 extends Class37 {
	@ObfInfo(name = "aq", desc = "Lmc;")
	public Class315 field3786;
	@ObfInfo(name = "ad", desc = "Lpr;")
	public Class408 field3784;
	@ObfInfo(name = "ag", desc = "Lby;")
	public Class51 field3785;

	public Class358(Class315 var1) {
		this.field3784 = new Class408();
		this.field3785 = new Class51();
		this.field3786 = var1;
	}

	@ObfInfo(name = "an", desc = "()Lbk;")
	public Class37 method546() {
		Class339 var1 = (Class339)this.field3784.method7526();
		if (var1 == null) {
			return null;
		} else {
			return (Class37)(var1.field3687 != null ? var1.field3687 : this.method525());
		}
	}

	@ObfInfo(name = "aj", desc = "()Lbk;")
	public Class37 method525() {
		Class339 var1;
		do {
			var1 = (Class339)this.field3784.method7511();
			if (var1 == null) {
				return null;
			}
		} while(var1.field3687 == null);

		return var1.field3687;
	}

	@ObfInfo(name = "av", desc = "()I")
	public int method529() {
		return 0;
	}

	@ObfInfo(name = "ab", desc = "([III)V")
	public void method531(int[] var1, int var2, int var3) {
		this.field3785.method531(var1, var2, var3);

		for (Class339 var6 = (Class339)this.field3784.method7526(); var6 != null; var6 = (Class339)this.field3784.method7511()) {
			if (!this.field3786.method6160(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3685) {
						this.method6587(var6, var1, var4, var5, var5 + var4);
						var6.field3685 -= var5;
						break;
					}

					this.method6587(var6, var1, var4, var6.field3685, var5 + var4);
					var4 += var6.field3685;
					var5 -= var6.field3685;
				} while(!this.field3786.method6182(var6, var1, var4, var5));
			}
		}

	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public void method542(int var1) {
		this.field3785.method542(var1);

		for (Class339 var3 = (Class339)this.field3784.method7526(); var3 != null; var3 = (Class339)this.field3784.method7511()) {
			if (!this.field3786.method6160(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3685) {
						this.method6579(var3, var2);
						var3.field3685 -= var2;
						break;
					}

					this.method6579(var3, var3.field3685);
					var2 -= var3.field3685;
				} while(!this.field3786.method6182(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfInfo(name = "aq", desc = "(Lna;[IIIII)V", opaque = "-575337720")
	public void method6587(Class339 var1, int[] var2, int var3, int var4, int var5) {
		if (0 != (this.field3786.field3290[var1.field3679] & 4) && var1.field3674 < 0) {
			int var7 = this.field3786.field3295[var1.field3679] / Client.field293;

			while (true) {
				int var8 = (var7 + 1048575 - var1.field3689) / var7;
				if (var8 > var4) {
					var1.field3689 += var7 * var4;
					break;
				}

				var1.field3687.method531(var2, var3, var8);
				var3 += var8;
				var4 -= var8;
				var1.field3689 += var8 * var7 - 1048576;
				int var9 = Client.field293 / 100;
				int var10 = 262144 / var7;
				if (var10 < var9) {
					var9 = var10;
				}

				Class52 var11 = var1.field3687;
				if (this.field3786.field3293[var1.field3679] == 0) {
					var1.field3687 = Class52.method937(var1.field3671, var11.method952(), var11.method943(), var11.method1039());
				} else {
					var1.field3687 = Class52.method937(var1.field3671, var11.method952(), 0, var11.method1039());
					this.field3786.method6109(var1, var1.field3670.field3648[var1.field3669] < 0);
					var1.field3687.method948(var9, var11.method943());
				}

				if (var1.field3670.field3648[var1.field3669] < 0) {
					var1.field3687.method1040(-1);
				}

				var11.method950(var9);
				var11.method531(var2, var3, var5 - var3);
				if (var11.method945()) {
					this.field3785.method892(var11);
				}
			}
		}

		var1.field3687.method531(var2, var3, var4);
	}

	@ObfInfo(name = "ad", desc = "(Lna;II)V", opaque = "-1261127600")
	public void method6579(Class339 var1, int var2) {
		if ((this.field3786.field3290[var1.field3679] & 4) != 0 && var1.field3674 < 0) {
			int var4 = this.field3786.field3295[var1.field3679] / Client.field293;
			int var5 = (var4 + 1048575 - var1.field3689) / var4;
			var1.field3689 = var1.field3689 + var4 * var2 & 1048575;
			if (var5 <= var2) {
				if (this.field3786.field3293[var1.field3679] == 0) {
					var1.field3687 = Class52.method937(var1.field3671, var1.field3687.method952(), var1.field3687.method943(), var1.field3687.method1039());
				} else {
					var1.field3687 = Class52.method937(var1.field3671, var1.field3687.method952(), 0, var1.field3687.method1039());
					this.field3786.method6109(var1, var1.field3670.field3648[var1.field3669] < 0);
				}

				if (var1.field3670.field3648[var1.field3669] < 0) {
					var1.field3687.method1040(-1);
				}

				var2 = var1.field3689 / var4;
			}
		}

		var1.field3687.method542(var2);
	}
}
