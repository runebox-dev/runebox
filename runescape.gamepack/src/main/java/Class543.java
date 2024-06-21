import io.runebox.ObfInfo;

@ObfInfo(name = "uw")
public class Class543 extends Class507 {
	@ObfInfo(name = "al", desc = "Llm;")
	public static Class299 field5318;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1661552683)
	public int field5321;
	@ObfInfo(name = "az", desc = "[[I")
	public int[][] field5317;
	@ObfInfo(name = "aj", desc = "[[Ljava/lang/Object;")
	public Object[][] field5320;

	static {
		field5318 = new Class299(64);
	}

	public Class543() {
		this.field5321 = -1;
	}

	@ObfInfo(name = "al", desc = "(Lua;B)V", opaque = "3")
	public void method9875(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method9877(var1, var3);
		}
	}

	@ObfInfo(name = "aj", desc = "(II)[Ljava/lang/Object;")
	public Object[] method9876(int var1) {
		return this.field5320 == null ? null : this.field5320[var1];
	}

	@ObfInfo(name = "az", desc = "(Lua;IB)V", opaque = "-2")
	public void method9877(Class521 var1, int var2) {
		if (var2 == 3) {
			int var4 = var1.method9405();
			if (this.field5320 == null) {
				this.field5320 = new Object[var4][];
				this.field5317 = new int[var4][];
			}

			for (int var5 = var1.method9405(); var5 != 255; var5 = var1.method9405()) {
				int var6 = var1.method9405();
				int[] var7 = new int[var6];

				for (int var8 = 0; var8 < var6; ++var8) {
					var7[var8] = var1.method9419();
				}

				Object[][] var17 = this.field5320;
				int var11 = var1.method9419();
				Object[] var12 = new Object[var7.length * var11];

				for (int var13 = 0; var13 < var11; ++var13) {
					for (int var14 = 0; var14 < var7.length; ++var14) {
						int var15 = var14 + var7.length * var13;
						Class545 var16 = Class283.method5727(var7[var14]);
						var12[var15] = var16.method9893(var1);
					}
				}

				var17[var5] = var12;
				this.field5317[var5] = var7;
			}
		} else if (var2 == 4) {
			this.field5321 = var1.method9425();
		}

	}

	@ObfInfo(name = "af", desc = "(I)V")
	public void method9878() {
	}

	@ObfInfo(owner = "qk", name = "ak", desc = "(II)Luw;")
	public static Class543 method7879(int var0) {
		Class543 var2 = (Class543)field5318.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field5319.method7216(38, var0);
			var2 = new Class543();
			if (var3 != null) {
				var2.method9875(new Class521(var3));
			}

			var2.method9878();
			field5318.method5987(var2, (long)var0);
			return var2;
		}
	}
}
