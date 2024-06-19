public class Class466 extends Class479 {
	public Class407 field4905;
	public int field4904;
	public final Class544 field4903;

	public Class466(Class544 var1) {
		super(400);
		this.field4904 = 1;
		this.field4905 = new Class407();
		this.field4903 = var1;
	}

	public Class475 method8483() {
		return new Class448();
	}

	public Class475[] method8457(int var1) {
		return new Class448[var1];
	}

	public boolean method8580(Class567 var1, boolean var2) {
		Class448 var4 = (Class448)this.method8734(var1);
		if (var4 == null) {
			return false;
		} else {
			return !var2 || 0 != var4.field4959;
		}
	}

	public void method8565(Class521 var1, int var2) {
		while (true) {
			if (var1.field5219 < var2) {
				boolean var4 = var1.method9405() == 1;
				Class567 var5 = new Class567(var1.method9415(), this.field4903);
				Class567 var6 = new Class567(var1.method9415(), this.field4903);
				int var7 = var1.method9407();
				int var8 = var1.method9405();
				int var9 = var1.method9405();
				boolean var10 = (var9 & 2) != 0;
				boolean var11 = 0 != (var9 & 1);
				if (var7 > 0) {
					var1.method9415();
					var1.method9405();
					var1.method9410();
				}

				var1.method9415();
				if (var5 != null && var5.method10262()) {
					Class448 var12 = (Class448)this.method8735(var5);
					if (var4) {
						Class448 var13 = (Class448)this.method8735(var6);
						if (var13 != null && var13 != var12) {
							if (var12 != null) {
								this.method8801(var13);
							} else {
								var12 = var13;
							}
						}
					}

					if (var12 != null) {
						this.method8743(var12, var5, var6);
						if (var7 != var12.field4959) {
							boolean var15 = true;

							for (Class443 var14 = (Class443)this.field4905.method7568(); var14 != null; var14 = (Class443)this.field4905.method7570()) {
								if (var14.field4792.equals(var5)) {
									if (var7 != 0 && var14.field4794 == 0) {
										var14.method9301();
										var15 = false;
									} else if (var7 == 0 && var14.field4794 != 0) {
										var14.method9301();
										var15 = false;
									}
								}
							}

							if (var15) {
								this.field4905.method7577(new Class443(var5, var7));
							}
						}
					} else {
						if (this.method8761() >= 400) {
							continue;
						}

						var12 = (Class448)this.method8762(var5, var6);
					}

					if (var7 != var12.field4959) {
						var12.field4960 = ++this.field4904 - 1;
						if (var12.field4959 == -1 && var7 == 0) {
							var12.field4960 = -(var12.field4960 * 2057375033) * 1407439113;
						}

						var12.field4959 = var7;
					}

					var12.field4961 = var8;
					var12.field4814 = var10;
					var12.field4813 = var11;
					continue;
				}

				throw new IllegalStateException();
			}

			this.method8742();
			return;
		}
	}
}
