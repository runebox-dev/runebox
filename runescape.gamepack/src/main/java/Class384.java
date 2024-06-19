import java.util.zip.CRC32;

public class Class384 extends Class382 {
	public static Class382 field2508;
	public static Thread field4139;
	public static CRC32 field4504;
	public Class374 field4507;
	public Class474 field4496;
	public Class474 field4502;
	public boolean field4499;
	public boolean field4500;
	public boolean field4506;
	public int field4495;
	public int field4497;
	public int field4503;
	public int field4505;
	public volatile boolean[] field4491;
	public volatile int field4498;

	static {
		field4504 = new CRC32();
	}

	public Class384(Class474 var1, Class474 var2, Class374 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4498 = 0;
		this.field4499 = false;
		this.field4495 = -1;
		this.field4500 = false;
		this.field4506 = false;
		this.field4502 = var1;
		this.field4496 = var2;
		this.field4505 = var4;
		this.field4499 = var7;
		this.field4500 = var8;
		this.field4506 = var9;
		this.field4507 = var3;
		this.field4507.method7155(this, this.field4505);
	}

	public boolean method7319() {
		return 1 == this.field4498;
	}

	public int method7320() {
		if (1 != this.field4498 && (!this.field4500 || this.field4498 != 2)) {
			if (super.field4483 != null) {
				return 99;
			} else {
				int var2 = this.field4507.method7159(Class375.field4101.field4121, this.field4505);
				if (var2 >= 100) {
					var2 = 99;
				}

				return var2;
			}
		} else {
			return 100;
		}
	}

	public void method7215(int var1) {
		this.field4507.method7165(this.field4505, var1);
	}

	public void method7227(int var1) {
		if (this.field4502 != null && this.field4491 != null && this.field4491[var1]) {
			Class377.method6694(var1, this.field4502, this);
		} else {
			this.field4507.method7157(this, this.field4505, var1, super.field4487[var1], (byte)2, true);
		}

	}

	public void method7323() {
		this.field4498 = 2;
		super.field4488 = new int[0];
		super.field4487 = new int[0];
		super.field4478 = new int[0];
		super.field4479 = new int[0];
		super.field4476 = new int[0][];
		super.field4483 = new Object[0];
		super.field4484 = new Object[0][];
	}

	public void method7346(int var1, int var2) {
		this.field4497 = var1;
		this.field4503 = var2;
		if (this.field4496 != null) {
			Class377.method6694(this.field4505, this.field4496, this);
		} else {
			this.field4507.method7157(this, Class375.field4101.field4121, this.field4505, this.field4497, (byte)0, true);
		}

	}

	public void method7363(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4498 == 1) {
				throw new RuntimeException();
			}

			if (this.field4496 != null) {
				int var6 = this.field4505;
				Class474 var7 = this.field4496;
				Class386 var8 = new Class386();
				var8.field4519 = 0;
				var8.field5170 = (long)var6;
				var8.field4514 = var2;
				var8.field4515 = var7;
				synchronized(Class377.field4138) {
					Class377.field4138.method7477(var8);
				}

				synchronized(Class377.field4136) {
					if (0 == Class377.field4134) {
						field4139 = new Thread(new Class377());
						field4139.setDaemon(true);
						field4139.start();
						field4139.setPriority(5);
					}

					Class377.field4134 = 600;
					Class377.field4137 = false;
				}
			}

			this.method7240(var2);
			this.method7326();
		} else {
			var2[var2.length - 2] = (byte)(super.field4478[var1] >> 8);
			var2[var2.length - 1] = (byte)super.field4478[var1];
			if (this.field4502 != null) {
				Class474 var18 = this.field4502;
				Class386 var20 = new Class386();
				var20.field4519 = 0;
				var20.field5170 = (long)var1;
				var20.field4514 = var2;
				var20.field4515 = var18;
				synchronized(Class377.field4138) {
					Class377.field4138.method7477(var20);
				}

				synchronized(Class377.field4136) {
					if (0 == Class377.field4134) {
						field4139 = new Thread(new Class377());
						field4139.setDaemon(true);
						field4139.start();
						field4139.setPriority(5);
					}

					Class377.field4134 = 600;
					Class377.field4137 = false;
				}

				this.field4491[var1] = true;
			}

			if (var4) {
				Object[] var19 = super.field4483;
				Object var21;
				if (var2 == null) {
					var21 = null;
				} else if (var2.length > 136) {
					Class341 var9 = new Class341();
					var9.method6652(var2);
					var21 = var9;
				} else {
					var21 = var2;
				}

				var19[var1] = var21;
			}
		}

	}

	public void method7337(Class474 var1, int var2, byte[] var3, boolean var4) {
		int var6;
		if (this.field4496 == var1) {
			if (1 == this.field4498) {
				throw new RuntimeException();
			} else if (var3 == null) {
				this.field4507.method7157(this, Class375.field4101.field4121, this.field4505, this.field4497, (byte)0, true);
			} else {
				field4504.reset();
				field4504.update(var3, 0, var3.length);
				var6 = (int)field4504.getValue();
				if (var6 != this.field4497) {
					this.field4507.method7157(this, Class375.field4101.field4121, this.field4505, this.field4497, (byte)0, true);
				} else {
					Class521 var12 = new Class521(Class382.method3623(var3));
					int var13 = var12.method9405();
					if (var13 != 5 && var13 != 6) {
						throw new RuntimeException(var13 + "," + this.field4505 + "," + var2);
					} else {
						int var9 = 0;
						if (var13 >= 6) {
							var9 = var12.method9410();
						}

						if (this.field4503 != var9) {
							this.field4507.method7157(this, Class375.field4101.field4121, this.field4505, this.field4497, (byte)0, true);
						} else {
							this.method7240(var3);
							this.method7326();
						}
					}
				}
			}
		} else {
			if (!var4 && this.field4495 == var2) {
				this.field4498 = 1;
			}

			if (var3 != null && var3.length > 2) {
				field4504.reset();
				field4504.update(var3, 0, var3.length - 2);
				var6 = (int)field4504.getValue();
				int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
				if (super.field4487[var2] == var6 && var7 == super.field4478[var2]) {
					this.field4491[var2] = true;
					if (var4) {
						Object[] var8 = super.field4483;
						Object var10;
						if (var3 == null) {
							var10 = null;
						} else if (var3.length > 136) {
							Class341 var11 = new Class341();
							var11.method6652(var3);
							var10 = var11;
						} else {
							var10 = var3;
						}

						var8[var2] = var10;
					}

				} else {
					this.field4491[var2] = false;
					if (this.field4499 || var4) {
						this.field4507.method7157(this, this.field4505, var2, super.field4487[var2], (byte)2, var4);
					}

				}
			} else {
				this.field4491[var2] = false;
				if (this.field4499 || var4) {
					this.field4507.method7157(this, this.field4505, var2, super.field4487[var2], (byte)2, var4);
				}

			}
		}
	}

	public void method7326() {
		this.field4491 = new boolean[super.field4483.length];

		int var2;
		for (var2 = 0; var2 < this.field4491.length; ++var2) {
			this.field4491[var2] = false;
		}

		if (this.field4502 == null) {
			this.field4498 = 1;
		} else {
			this.field4495 = -1;

			for (var2 = 0; var2 < this.field4491.length; ++var2) {
				if (super.field4479[var2] > 0) {
					Class474 var3 = this.field4502;
					Class386 var5 = new Class386();
					var5.field4519 = 1;
					var5.field5170 = (long)var2;
					var5.field4515 = var3;
					var5.field4516 = this;
					synchronized(Class377.field4138) {
						Class377.field4138.method7477(var5);
					}

					synchronized(Class377.field4136) {
						if (Class377.field4134 == 0) {
							field4139 = new Thread(new Class377());
							field4139.setDaemon(true);
							field4139.start();
							field4139.setPriority(5);
						}

						Class377.field4134 = 600;
						Class377.field4137 = false;
					}

					this.field4495 = var2;
				}
			}

			if (-1 == this.field4495) {
				this.field4498 = 1;
			}

		}
	}

	public int method7222(int var1) {
		if (null != super.field4483[var1]) {
			return 100;
		} else {
			return this.field4491[var1] ? 100 : this.field4507.method7159(this.field4505, var1);
		}
	}

	public boolean method7329(int var1) {
		return this.field4491[var1];
	}

	public boolean method7318(int var1) {
		return this.method7226(var1) != null;
	}

	public int method7331() {
		int var2 = 0;
		int var3 = 0;

		int var4;
		for (var4 = 0; var4 < super.field4483.length; ++var4) {
			if (super.field4479[var4] > 0) {
				var2 += 100;
				var3 += this.method7222(var4);
			}
		}

		if (var2 == 0) {
			return 100;
		} else {
			var4 = var3 * 100 / var2;
			return var4;
		}
	}

	public static void method7366(Class382 var0) {
		field2508 = var0;
	}
}
