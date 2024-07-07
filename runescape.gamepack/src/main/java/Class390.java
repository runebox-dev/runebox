import io.runebox.ObfInfo;
import java.util.zip.CRC32;

@ObfInfo(name = "oz")
public class Class390 extends Class375 {
	@ObfInfo(owner = "kg", name = "an", desc = "Ljava/lang/Thread;")
	public static Thread field2747;
	@ObfInfo(name = "au", desc = "Ljava/util/zip/CRC32;")
	public static CRC32 field4575;
	@ObfInfo(name = "ay", desc = "Loe;")
	public Class369 field4576;
	@ObfInfo(name = "aj", desc = "Lsq;")
	public Class485 field4570;
	@ObfInfo(name = "an", desc = "Lsq;")
	public Class485 field4578;
	@ObfInfo(name = "ai", desc = "Z")
	public boolean field4568;
	@ObfInfo(name = "al", desc = "Z")
	public boolean field4572;
	@ObfInfo(name = "ac", desc = "Z")
	public boolean field4574;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1545053861)
	public int field4561;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -2143589993)
	public int field4566;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 979037821)
	public int field4571;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -1527771595)
	public int field4573;
	@ObfInfo(name = "ae", desc = "[Z")
	public volatile boolean[] field4569;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1659451215)
	public volatile int field4567;

	static {
		field4575 = new CRC32();
	}

	public Class390(Class485 var1, Class485 var2, Class369 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4567 = 0;
		this.field4568 = false;
		this.field4573 = -1;
		this.field4574 = false;
		this.field4572 = false;
		this.field4578 = var1;
		this.field4570 = var2;
		this.field4566 = var4;
		this.field4568 = var7;
		this.field4574 = var8;
		this.field4572 = var9;
		this.field4576 = var3;
		this.field4576.method7070(this, this.field4566);
	}

	@ObfInfo(name = "aq", desc = "(I)Z")
	public boolean method7275() {
		return this.field4567 == 1;
	}

	@ObfInfo(name = "ad", desc = "(I)I", opaque = "-1464451928")
	public int method7276() {
		if (this.field4567 != 1 && (!this.field4574 || 2 != this.field4567)) {
			if (super.field4451 != null) {
				return 99;
			} else {
				int var2 = this.field4576.method7082(Class376.field4480.field4485, this.field4566);
				if (var2 >= 100) {
					var2 = 99;
				}

				return var2;
			}
		} else {
			return 100;
		}
	}

	@ObfInfo(name = "ag", desc = "(IB)V")
	public void method7131(int var1) {
		this.field4576.method7076(this.field4566, var1);
	}

	@ObfInfo(name = "ak", desc = "(II)V", opaque = "1323657806")
	public void method7142(int var1) {
		if (this.field4578 != null && this.field4569 != null && this.field4569[var1]) {
			Class385.method6487(var1, this.field4578, this);
		} else {
			this.field4576.method7072(this, this.field4566, var1, super.field4453[var1], (byte)2, true);
		}

	}

	@ObfInfo(name = "ap", desc = "(I)V")
	public void method7279() {
		this.field4567 = 2;
		super.field4446 = new int[0];
		super.field4453 = new int[0];
		super.field4450 = new int[0];
		super.field4459 = new int[0];
		super.field4452 = new int[0][];
		super.field4451 = new Object[0];
		super.field4456 = new Object[0][];
	}

	@ObfInfo(name = "an", desc = "(III)V", opaque = "207795263")
	public void method7280(int var1, int var2) {
		this.field4571 = var1;
		this.field4561 = var2;
		if (this.field4570 != null) {
			Class385.method6487(this.field4566, this.field4570, this);
		} else {
			this.field4576.method7072(this, Class376.field4480.field4485, this.field4566, this.field4571, (byte)0, true);
		}

	}

	@ObfInfo(name = "aj", desc = "(I[BZZI)V", opaque = "-27519350")
	public void method7302(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4567 == 1) {
				throw new RuntimeException();
			}

			if (this.field4570 != null) {
				int var6 = this.field4566;
				Class485 var7 = this.field4570;
				Class387 var8 = new Class387();
				var8.field4547 = 0;
				var8.field5234 = (long)var6;
				var8.field4546 = var2;
				var8.field4548 = var7;
				synchronized(Class385.field4533) {
					Class385.field4533.method7506(var8);
				}

				synchronized(Class385.field4531) {
					if (0 == Class385.field4527) {
						field2747 = new Thread(new Class385());
						field2747.setDaemon(true);
						field2747.start();
						field2747.setPriority(5);
					}

					Class385.field4527 = 600;
					Class385.field4529 = false;
				}
			}

			this.method7130(var2);
			this.method7283();
		} else {
			var2[var2.length - 2] = (byte)(super.field4450[var1] >> 8);
			var2[var2.length - 1] = (byte)super.field4450[var1];
			if (this.field4578 != null) {
				Class485 var18 = this.field4578;
				Class387 var19 = new Class387();
				var19.field4547 = 0;
				var19.field5234 = (long)var1;
				var19.field4546 = var2;
				var19.field4548 = var18;
				synchronized(Class385.field4533) {
					Class385.field4533.method7506(var19);
				}

				synchronized(Class385.field4531) {
					if (0 == Class385.field4527) {
						field2747 = new Thread(new Class385());
						field2747.setDaemon(true);
						field2747.start();
						field2747.setPriority(5);
					}

					Class385.field4527 = 600;
					Class385.field4529 = false;
				}

				this.field4569[var1] = true;
			}

			if (var4) {
				super.field4451[var1] = Class354.method6322(var2, false);
			}
		}

	}

	@ObfInfo(name = "av", desc = "(Lsq;I[BZS)V", opaque = "139")
	public void method7313(Class485 var1, int var2, byte[] var3, boolean var4) {
		int var6;
		if (this.field4570 == var1) {
			if (1 == this.field4567) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				this.field4576.method7072(this, Class376.field4480.field4485, this.field4566, this.field4571, (byte)0, true);
				return;
			}

			field4575.reset();
			field4575.update(var3, 0, var3.length);
			var6 = (int)field4575.getValue();
			if (var6 != this.field4571) {
				this.field4576.method7072(this, Class376.field4480.field4485, this.field4566, this.field4571, (byte)0, true);
				return;
			}

			Class562 var10 = new Class562(Class220.method4249(var3));
			int var8 = var10.method9902();
			if (var8 != 5 && var8 != 6) {
				throw new RuntimeException(var8 + "," + this.field4566 + "," + var2);
			}

			int var9 = 0;
			if (var8 >= 6) {
				var9 = var10.method9832();
			}

			if (var9 != this.field4561) {
				this.field4576.method7072(this, Class376.field4480.field4485, this.field4566, this.field4571, (byte)0, true);
				return;
			}

			this.method7130(var3);
			this.method7283();
		} else {
			if (!var4 && var2 == this.field4573) {
				this.field4567 = 1;
			}

			if (var3 == null || var3.length <= 2) {
				this.field4569[var2] = false;
				if (this.field4568 || var4) {
					this.field4576.method7072(this, this.field4566, var2, super.field4453[var2], (byte)2, var4);
				}

				return;
			}

			field4575.reset();
			field4575.update(var3, 0, var3.length - 2);
			var6 = (int)field4575.getValue();
			int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (super.field4453[var2] != var6 || super.field4450[var2] != var7) {
				this.field4569[var2] = false;
				if (this.field4568 || var4) {
					this.field4576.method7072(this, this.field4566, var2, super.field4453[var2], (byte)2, var4);
				}

				return;
			}

			this.field4569[var2] = true;
			if (var4) {
				super.field4451[var2] = Class354.method6322(var3, false);
			}
		}

	}

	@ObfInfo(name = "ab", desc = "(B)V", opaque = "0")
	public void method7283() {
		this.field4569 = new boolean[super.field4451.length];

		int var2;
		for (var2 = 0; var2 < this.field4569.length; ++var2) {
			this.field4569[var2] = false;
		}

		if (this.field4578 == null) {
			this.field4567 = 1;
		} else {
			this.field4573 = -1;

			for (var2 = 0; var2 < this.field4569.length; ++var2) {
				if (super.field4459[var2] > 0) {
					Class385.method4977(var2, this.field4578, this);
					this.field4573 = var2;
				}
			}

			if (this.field4573 == -1) {
				this.field4567 = 1;
			}

		}
	}

	@ObfInfo(name = "ai", desc = "(II)I", opaque = "1114547636")
	public int method7138(int var1) {
		if (super.field4451[var1] != null) {
			return 100;
		} else {
			return this.field4569[var1] ? 100 : this.field4576.method7082(this.field4566, var1);
		}
	}

	@ObfInfo(name = "ae", desc = "(II)Z")
	public boolean method7285(int var1) {
		return this.field4569[var1];
	}

	@ObfInfo(name = "au", desc = "(II)Z", opaque = "-983032856")
	public boolean method7295(int var1) {
		return this.method7143(var1) != null;
	}

	@ObfInfo(name = "ah", desc = "(I)I", opaque = "-849373962")
	public int method7286() {
		int var2 = 0;
		int var3 = 0;

		int var4;
		for (var4 = 0; var4 < super.field4451.length; ++var4) {
			if (super.field4459[var4] > 0) {
				var2 += 100;
				var3 += this.method7138(var4);
			}
		}

		if (var2 == 0) {
			return 100;
		} else {
			var4 = var3 * 100 / var2;
			return var4;
		}
	}
}
