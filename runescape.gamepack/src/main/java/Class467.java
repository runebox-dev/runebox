import io.runebox.ObfInfo;

@ObfInfo(name = "ry")
public class Class467 extends Class471 {
	@ObfInfo(name = "ap", desc = "Lpd;")
	public Class394 field4929;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1688107139)
	public int field4928;
	@ObfInfo(name = "ag", desc = "Luu;")
	public final Class541 field4927;

	public Class467(Class541 var1) {
		super(400);
		this.field4928 = 1;
		this.field4929 = new Class394();
		this.field4927 = var1;
	}

	@ObfInfo(name = "aq", desc = "(B)Lsk;")
	public Class479 method8342() {
		return new Class456();
	}

	@ObfInfo(name = "ad", desc = "(II)[Lsk;")
	public Class479[] method8343(int var1) {
		return new Class456[var1];
	}

	@ObfInfo(name = "ag", desc = "(Lvo;ZI)Z", opaque = "238889639")
	public boolean method8526(Class561 var1, boolean var2) {
		Class456 var4 = (Class456)this.method8556(var1);
		if (var4 == null) {
			return false;
		} else {
			return !var2 || var4.field4971 != 0;
		}
	}

	@ObfInfo(name = "ab", desc = "(Lvp;II)V", opaque = "-1830072719")
	public void method8522(Class562 var1, int var2) {
		while (true) {
			if (var1.field5471 < var2) {
				boolean var4 = var1.method9902() == 1;
				Class561 var5 = new Class561(var1.method9837(), this.field4927);
				Class561 var6 = new Class561(var1.method9837(), this.field4927);
				int var7 = var1.method9997();
				int var8 = var1.method9902();
				int var9 = var1.method9902();
				boolean var10 = (var9 & 2) != 0;
				boolean var11 = (var9 & 1) != 0;
				if (var7 > 0) {
					var1.method9837();
					var1.method9902();
					var1.method9832();
				}

				var1.method9837();
				if (var5 != null && var5.method9801()) {
					Class456 var12 = (Class456)this.method8578(var5);
					if (var4) {
						Class456 var13 = (Class456)this.method8578(var6);
						if (var13 != null && var12 != var13) {
							if (var12 != null) {
								this.method8560(var13);
							} else {
								var12 = var13;
							}
						}
					}

					if (var12 != null) {
						this.method8565(var12, var5, var6);
						if (var12.field4971 != var7) {
							boolean var15 = true;

							for (Class492 var14 = (Class492)this.field4929.method7351(); var14 != null; var14 = (Class492)this.field4929.method7359()) {
								if (var14.field5023.equals(var5)) {
									if (var7 != 0 && var14.field5022 == 0) {
										var14.method8885();
										var15 = false;
									} else if (var7 == 0 && var14.field5022 != 0) {
										var14.method8885();
										var15 = false;
									}
								}
							}

							if (var15) {
								this.field4929.method7350(new Class492(var5, var7));
							}
						}
					} else {
						if (this.method8582() >= 400) {
							continue;
						}

						var12 = (Class456)this.method8562(var5, var6);
					}

					if (var12.field4971 != var7) {
						var12.field4970 = ++this.field4928 - 1;
						if (var12.field4971 == -1 && var7 == 0) {
							var12.field4970 = -(var12.field4970 * 415892275) * 1329967099;
						}

						var12.field4971 = var7;
					}

					var12.field4969 = var8;
					var12.field4886 = var10;
					var12.field4887 = var11;
					continue;
				}

				throw new IllegalStateException();
			}

			this.method8564();
			return;
		}
	}
}
