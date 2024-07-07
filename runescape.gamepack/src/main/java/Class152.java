import io.runebox.ObfInfo;

@ObfInfo(name = "fv")
public class Class152 {
	@ObfInfo(name = "ad", desc = "Lfv;")
	public Class152 field1714;
	@ObfInfo(name = "ae", desc = "Lqg;")
	public Class423 field1705;
	@ObfInfo(name = "aj", desc = "Lqg;")
	public Class423 field1711;
	@ObfInfo(name = "ab", desc = "Lqg;")
	public Class423 field1715;
	@ObfInfo(name = "ap", desc = "[Lqg;")
	public Class423[] field1709;
	@ObfInfo(name = "an", desc = "[Lqg;")
	public Class423[] field1710;
	@ObfInfo(name = "av", desc = "Z")
	public boolean field1712;
	@ObfInfo(name = "ai", desc = "Z")
	public boolean field1719;
	@ObfInfo(name = "ag", desc = "[[F")
	public float[][] field1707;
	@ObfInfo(name = "au", desc = "[[F")
	public float[][] field1708;
	@ObfInfo(name = "ah", desc = "[[F")
	public float[][] field1717;
	@ObfInfo(name = "az", desc = "[[F")
	public float[][] field1718;
	@ObfInfo(name = "ak", desc = "[Lqg;")
	public final Class423[] field1716;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1437500881)
	public final int field1706;

	public Class152(int var1, Class562 var2, boolean var3) {
		this.field1711 = new Class423();
		this.field1712 = true;
		this.field1715 = new Class423();
		this.field1719 = true;
		this.field1705 = new Class423();
		this.field1706 = var2.method9829();
		this.field1716 = new Class423[var1];
		this.field1709 = new Class423[this.field1716.length];
		this.field1710 = new Class423[this.field1716.length];
		this.field1707 = new float[this.field1716.length][3];

		for (int var4 = 0; var4 < this.field1716.length; ++var4) {
			this.field1716[var4] = new Class423(var2, var3);
			this.field1707[var4][0] = var2.method9834();
			this.field1707[var4][1] = var2.method9834();
			this.field1707[var4][2] = var2.method9834();
		}

		this.method3255();
	}

	@ObfInfo(name = "aq", desc = "(I)V", opaque = "-1375071120")
	public void method3255() {
		this.field1708 = new float[this.field1716.length][3];
		this.field1717 = new float[this.field1716.length][3];
		this.field1718 = new float[this.field1716.length][3];
		Class423 var2;
		synchronized(Class423.field4698) {
			if (0 == Class423.field4700) {
				var2 = new Class423();
			} else {
				Class423.field4698[--Class423.field4700].method7740();
				var2 = Class423.field4698[Class423.field4700];
			}
		}

		for (int var4 = 0; var4 < this.field1716.length; ++var4) {
			Class423 var5 = this.method3256(var4);
			var2.method7760(var5);
			var2.method7741();
			this.field1708[var4] = var2.method7730();
			this.field1717[var4][0] = var5.field4703[12];
			this.field1717[var4][1] = var5.field4703[13];
			this.field1717[var4][2] = var5.field4703[14];
			this.field1718[var4] = var5.method7749();
		}

		var2.method7752();
	}

	@ObfInfo(name = "ad", desc = "(IB)Lqg;")
	public Class423 method3256(int var1) {
		return this.field1716[var1];
	}

	@ObfInfo(name = "ag", desc = "(II)Lqg;", opaque = "829200770")
	public Class423 method3297(int var1) {
		if (null == this.field1709[var1]) {
			this.field1709[var1] = new Class423(this.method3256(var1));
			if (this.field1714 != null) {
				this.field1709[var1].method7736(this.field1714.method3297(var1));
			} else {
				this.field1709[var1].method7736(Class423.field4701);
			}
		}

		return this.field1709[var1];
	}

	@ObfInfo(name = "ak", desc = "(IB)Lqg;", opaque = "0")
	public Class423 method3260(int var1) {
		if (null == this.field1710[var1]) {
			this.field1710[var1] = new Class423(this.method3297(var1));
			this.field1710[var1].method7741();
		}

		return this.field1710[var1];
	}

	@ObfInfo(name = "ap", desc = "(Lqg;B)V")
	public void method3259(Class423 var1) {
		this.field1711.method7760(var1);
		this.field1712 = true;
		this.field1719 = true;
	}

	@ObfInfo(name = "an", desc = "(B)Lqg;")
	public Class423 method3276() {
		return this.field1711;
	}

	@ObfInfo(name = "aj", desc = "(I)Lqg;", opaque = "-1140539117")
	public Class423 method3298() {
		if (this.field1712) {
			this.field1715.method7760(this.method3276());
			if (this.field1714 != null) {
				this.field1715.method7736(this.field1714.method3298());
			}

			this.field1712 = false;
		}

		return this.field1715;
	}

	@ObfInfo(name = "av", desc = "(II)Lqg;", opaque = "786536479")
	public Class423 method3274(int var1) {
		if (this.field1719) {
			this.field1705.method7760(this.method3260(var1));
			this.field1705.method7736(this.method3298());
			this.field1719 = false;
		}

		return this.field1705;
	}

	@ObfInfo(name = "ab", desc = "(II)[F")
	public float[] method3263(int var1) {
		return this.field1708[var1];
	}

	@ObfInfo(name = "ai", desc = "(II)[F")
	public float[] method3261(int var1) {
		return this.field1717[var1];
	}

	@ObfInfo(name = "ae", desc = "(IB)[F")
	public float[] method3301(int var1) {
		return this.field1718[var1];
	}
}
