import io.runebox.ObfInfo;

@ObfInfo(name = "bk")
public class Class37 extends Class27 {
	@ObfInfo(name = "al", desc = "Lpk;")
	public Class401 field261;
	@ObfInfo(name = "ak", desc = "Lpk;")
	public Class401 field263;
	@ObfInfo(name = "aj", desc = "I")
	public int field260;
	@ObfInfo(name = "az", desc = "I")
	public int field262;

	public Class37() {
		this.field263 = new Class401();
		this.field261 = new Class401();
		this.field260 = 0;
		this.field262 = -1;
	}

	@ObfInfo(name = "ak", desc = "(Lba;)V")
	public final synchronized void method743(Class27 var1) {
		this.field263.method7478(var1);
	}

	@ObfInfo(name = "al", desc = "(Lba;)V")
	public final synchronized void method755(Class27 var1) {
		var1.method9277();
	}

	@ObfInfo(name = "aj", desc = "()V")
	public void method745() {
		if (this.field260 > 0) {
			for (Class68 var1 = (Class68)this.field261.method7482(); var1 != null; var1 = (Class68)this.field261.method7490()) {
				var1.field844 -= this.field260;
			}

			this.field262 -= this.field260;
			this.field260 = 0;
		}

	}

	@ObfInfo(name = "az", desc = "(Ltl;Lcp;)V")
	public void method778(Class506 var1, Class68 var2) {
		while (this.field261.field4605 != var1 && ((Class68)var1).field844 <= var2.field844) {
			var1 = var1.field5169;
		}

		Class401.method7479(var2, var1);
		this.field262 = ((Class68)this.field261.field4605.field5169).field844;
	}

	@ObfInfo(name = "af", desc = "(Lcp;)V")
	public void method758(Class68 var1) {
		var1.method9277();
		var1.method1866();
		Class506 var2 = this.field261.field4605.field5169;
		if (this.field261.field4605 == var2) {
			this.field262 = -1;
		} else {
			this.field262 = ((Class68)var2).field844;
		}

	}

	@ObfInfo(name = "aa", desc = "()Lba;")
	public Class27 method384() {
		return (Class27)this.field263.method7482();
	}

	@ObfInfo(name = "at", desc = "()Lba;")
	public Class27 method379() {
		return (Class27)this.field263.method7490();
	}

	@ObfInfo(name = "ab", desc = "()I")
	public int method380() {
		return 0;
	}

	@ObfInfo(name = "ac", desc = "([III)V")
	public final synchronized void method381(int[] var1, int var2, int var3) {
		do {
			if (this.field262 < 0) {
				this.method752(var1, var2, var3);
				return;
			}

			if (this.field260 + var3 < this.field262) {
				this.field260 += var3;
				this.method752(var1, var2, var3);
				return;
			}

			int var4 = this.field262 - this.field260;
			this.method752(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field260 += var4;
			this.method745();
			Class68 var5 = (Class68)this.field261.method7482();
			synchronized(var5) {
				int var7 = var5.method1868(this);
				if (var7 < 0) {
					var5.field844 = 0;
					this.method758(var5);
				} else {
					var5.field844 = var7;
					this.method778(var5.field5169, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfInfo(name = "ao", desc = "([III)V")
	public void method752(int[] var1, int var2, int var3) {
		for (Class27 var4 = (Class27)this.field263.method7482(); var4 != null; var4 = (Class27)this.field263.method7490()) {
			var4.method392(var1, var2, var3);
		}

	}

	@ObfInfo(name = "ah", desc = "(I)V")
	public final synchronized void method395(int var1) {
		do {
			if (this.field262 < 0) {
				this.method770(var1);
				return;
			}

			if (this.field260 + var1 < this.field262) {
				this.field260 += var1;
				this.method770(var1);
				return;
			}

			int var2 = this.field262 - this.field260;
			this.method770(var2);
			var1 -= var2;
			this.field260 += var2;
			this.method745();
			Class68 var3 = (Class68)this.field261.method7482();
			synchronized(var3) {
				int var5 = var3.method1868(this);
				if (var5 < 0) {
					var3.field844 = 0;
					this.method758(var3);
				} else {
					var3.field844 = var5;
					this.method778(var3.field5169, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfInfo(name = "av", desc = "(I)V")
	public void method770(int var1) {
		for (Class27 var2 = (Class27)this.field263.method7482(); var2 != null; var2 = (Class27)this.field263.method7490()) {
			var2.method395(var1);
		}

	}
}
