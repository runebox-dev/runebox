public class Class138 {
	public Class138 field1585;
	public Class428 field1575;
	public Class428 field1580;
	public Class428 field1581;
	public Class428[] field1579;
	public Class428[] field1583;
	public boolean field1582;
	public boolean field1591;
	public float[][] field1577;
	public float[][] field1586;
	public float[][] field1587;
	public float[][] field1588;
	public final Class428[] field1578;
	public final int field1584;

	public Class138(int var1, Class521 var2, boolean var3) {
		this.field1581 = new Class428();
		this.field1582 = true;
		this.field1580 = new Class428();
		this.field1591 = true;
		this.field1575 = new Class428();
		this.field1584 = var2.method9535();
		this.field1578 = new Class428[var1];
		this.field1579 = new Class428[this.field1578.length];
		this.field1583 = new Class428[this.field1578.length];
		this.field1577 = new float[this.field1578.length][3];

		for (int var4 = 0; var4 < this.field1578.length; ++var4) {
			this.field1578[var4] = new Class428(var2, var3);
			this.field1577[var4][0] = var2.method9412();
			this.field1577[var4][1] = var2.method9412();
			this.field1577[var4][2] = var2.method9412();
		}

		this.method3100();
	}

	public void method3100() {
		this.field1586 = new float[this.field1578.length][3];
		this.field1587 = new float[this.field1578.length][3];
		this.field1588 = new float[this.field1578.length][3];
		Class428 var2;
		synchronized(Class428.field4696) {
			if (Class428.field5232 == 0) {
				var2 = new Class428();
			} else {
				Class428.field4696[--Class428.field5232].method7921();
				var2 = Class428.field4696[Class428.field5232];
			}
		}

		for (int var4 = 0; var4 < this.field1578.length; ++var4) {
			Class428 var5 = this.method3101(var4);
			var2.method7955(var5);
			var2.method7901();
			this.field1586[var4] = var2.method7883();
			this.field1587[var4][0] = var5.field4699[12];
			this.field1587[var4][1] = var5.field4699[13];
			this.field1587[var4][2] = var5.field4699[14];
			this.field1588[var4] = var5.method7902();
		}

		var2.method7908();
	}

	public Class428 method3101(int var1) {
		return this.field1578[var1];
	}

	public Class428 method3102(int var1) {
		if (this.field1579[var1] == null) {
			this.field1579[var1] = new Class428(this.method3101(var1));
			if (this.field1585 != null) {
				this.field1579[var1].method7935(this.field1585.method3102(var1));
			} else {
				this.field1579[var1].method7935(Class428.field4700);
			}
		}

		return this.field1579[var1];
	}

	public Class428 method3103(int var1) {
		if (null == this.field1583[var1]) {
			this.field1583[var1] = new Class428(this.method3102(var1));
			this.field1583[var1].method7901();
		}

		return this.field1583[var1];
	}

	public void method3120(Class428 var1) {
		this.field1581.method7955(var1);
		this.field1582 = true;
		this.field1591 = true;
	}

	public Class428 method3126() {
		return this.field1581;
	}

	public Class428 method3124() {
		if (this.field1582) {
			this.field1580.method7955(this.method3126());
			if (this.field1585 != null) {
				this.field1580.method7935(this.field1585.method3124());
			}

			this.field1582 = false;
		}

		return this.field1580;
	}

	public Class428 method3107(int var1) {
		if (this.field1591) {
			this.field1575.method7955(this.method3103(var1));
			this.field1575.method7935(this.method3124());
			this.field1591 = false;
		}

		return this.field1575;
	}

	public float[] method3108(int var1) {
		return this.field1586[var1];
	}

	public float[] method3109(int var1) {
		return this.field1587[var1];
	}

	public float[] method3105(int var1) {
		return this.field1588[var1];
	}
}
