import java.util.LinkedList;

public abstract class Class303 {
	public Class291[][][][] field3222;
	public boolean field3220;
	public boolean field3224;
	public byte[][][] field3210;
	public byte[][][] field3221;
	public int field3211;
	public int field3212;
	public int field3213;
	public int field3214;
	public int field3215;
	public int field3216;
	public int field3217;
	public int field3223;
	public short[][][] field3218;
	public short[][][] field3219;

	public Class303() {
		this.field3217 = -1;
		this.field3216 = -1;
		new LinkedList();
		this.field3220 = false;
		this.field3224 = false;
	}

	public abstract void method5697(Class521 var1);

	public boolean method6036() {
		return this.field3220 && this.field3224;
	}

	public void method6037(Class382 var1) {
		if (!this.method6036()) {
			byte[] var3 = var1.method7216(this.field3217, this.field3216);
			if (var3 != null) {
				this.method5697(new Class521(var3));
				this.field3220 = true;
				this.field3224 = true;
			}

		}
	}

	public void method6055() {
		this.field3218 = (short[][][])null;
		this.field3219 = (short[][][])null;
		this.field3210 = (byte[][][])null;
		this.field3221 = (byte[][][])null;
		this.field3222 = (Class291[][][][])null;
		this.field3220 = false;
		this.field3224 = false;
	}

	public void method6051(int var1, int var2, Class521 var3) {
		int var5 = var3.method9405();
		if (var5 != 0) {
			if ((var5 & 1) != 0) {
				this.method6045(var1, var2, var3, var5);
			} else {
				this.method6041(var1, var2, var3, var5);
			}

		}
	}

	public void method6045(int var1, int var2, Class521 var3, int var4) {
		boolean var6 = 0 != (var4 & 2);
		if (var6) {
			this.field3219[0][var1][var2] = (short)var3.method9407();
		}

		this.field3218[0][var1][var2] = (short)var3.method9407();
	}

	public void method6041(int var1, int var2, Class521 var3, int var4) {
		int var6 = 1 + ((var4 & 24) >> 3);
		boolean var7 = (var4 & 2) != 0;
		boolean var8 = (var4 & 4) != 0;
		this.field3218[0][var1][var2] = (short)var3.method9407();
		int var9;
		int var10;
		int var12;
		if (var7) {
			var9 = var3.method9405();

			for (var10 = 0; var10 < var9; ++var10) {
				int var11 = var3.method9407();
				if (var11 != 0) {
					this.field3219[var10][var1][var2] = (short)var11;
					var12 = var3.method9405();
					this.field3210[var10][var1][var2] = (byte)(var12 >> 2);
					this.field3221[var10][var1][var2] = (byte)(var12 & 3);
				}
			}
		}

		if (var8) {
			for (var9 = 0; var9 < var6; ++var9) {
				var10 = var3.method9405();
				if (var10 != 0) {
					Class291[] var15 = this.field3222[var9][var1][var2] = new Class291[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						int var13 = var3.method9423();
						int var14 = var3.method9405();
						var15[var12] = new Class291(var13, var14 >> 2, var14 & 3);
					}
				}
			}
		}

	}

	public int method6035() {
		return this.field3223;
	}

	public int method6039() {
		return this.field3213;
	}
}
