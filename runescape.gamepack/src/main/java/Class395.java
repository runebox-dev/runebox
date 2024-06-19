import java.util.HashSet;
import java.util.Set;

public class Class395 implements Class393 {
	public static final Class395 field4567;
	public static final Class395 field4568;
	public static final Class395 field4570;
	public static final Class395 field4571;
	public static final Class395 field4572;
	public static final Class395 field4573;
	public static final Class395 field4574;
	public static final Class395 field4575;
	public static final Class395 field4576;
	public static final Class395 field4577;
	public static final Class395 field4578;
	public static final Class395 field4579;
	public static final Class395 field4584;
	public final int field4580;
	public final Set field4581;

	static {
		field4567 = new Class395("", 0, new Class391[]{Class391.field4556, Class391.field4557});
		field4584 = new Class395("", 1, new Class391[]{Class391.field4553, Class391.field4556, Class391.field4557});
		field4568 = new Class395("", 2, new Class391[]{Class391.field4553, Class391.field4554, Class391.field4556});
		field4570 = new Class395("", 3, new Class391[]{Class391.field4553});
		field4571 = new Class395("", 4);
		field4572 = new Class395("", 5, new Class391[]{Class391.field4553, Class391.field4556});
		field4573 = new Class395("", 6, new Class391[]{Class391.field4556});
		field4574 = new Class395("", 8, new Class391[]{Class391.field4553, Class391.field4556});
		field4575 = new Class395("", 9, new Class391[]{Class391.field4553, Class391.field4554});
		field4576 = new Class395("", 10, new Class391[]{Class391.field4553});
		field4577 = new Class395("", 11, new Class391[]{Class391.field4553});
		field4578 = new Class395("", 12, new Class391[]{Class391.field4553, Class391.field4556});
		field4579 = new Class395("", 13, new Class391[]{Class391.field4553});
		method7414();
	}

	public Class395(String var1, int var2) {
		this.field4581 = new HashSet();
		this.field4580 = var2;
	}

	public Class395(String var1, int var2, Class391[] var3) {
		this.field4581 = new HashSet();
		this.field4580 = var2;

		for (int var5 = 0; var5 < var3.length; ++var5) {
			Class391 var6 = var3[var5];
			this.field4581.add(var6);
		}

	}

	public int method175() {
		return this.field4580;
	}

	public static Class184 method7419() {
		return Class184.field1918;
	}

	public static Class395[] method7414() {
		return new Class395[]{field4579, field4568, field4570, field4573, field4584, field4571, field4574, field4572, field4567, field4577, field4576, field4578, field4575};
	}

	public static void method7418(Class143 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			float var10 = var4 - var1;
			if ((double)var10 != 0.0D) {
				float var11 = var2 - var1;
				float var12 = var3 - var1;
				float[] var13 = new float[]{var11 / var10, var12 / var10};
				var0.field1628 = 0.33333334F == var13[0] && 0.6666667F == var13[1];
				float var14 = var13[0];
				float var15 = var13[1];
				if ((double)var13[0] < 0.0D) {
					var13[0] = 0.0F;
				}

				if ((double)var13[1] > 1.0D) {
					var13[1] = 1.0F;
				}

				float var16;
				float var17;
				float var18;
				float var19;
				float var20;
				if ((double)var13[0] > 1.0D || var13[1] < -1.0F) {
					var13[1] = 1.0F - var13[1];
					if (var13[0] < 0.0F) {
						var13[0] = 0.0F;
					}

					if (var13[1] < 0.0F) {
						var13[1] = 0.0F;
					}

					if (var13[0] > 1.0F || var13[1] > 1.0F) {
						var16 = (float)(1.0D + (double)var13[1] * ((double)var13[1] - 2.0D) + (double)(var13[0] * (var13[0] - 2.0F + var13[1])));
						if (var16 + Class130.field1542 > 0.0F) {
							if (var13[0] + Class130.field1542 < 1.3333334F) {
								var17 = var13[0] - 2.0F;
								var18 = var13[0] - 1.0F;
								var19 = (float)Math.sqrt((double)(var17 * var17 - var18 * 4.0F * var18));
								var20 = (var19 + -var17) * 0.5F;
								if (var13[1] + Class130.field1542 > var20) {
									var13[1] = var20 - Class130.field1542;
								} else {
									var20 = 0.5F * (-var17 - var19);
									if (var13[1] < var20 + Class130.field1542) {
										var13[1] = var20 + Class130.field1542;
									}
								}
							} else {
								var13[0] = 1.3333334F - Class130.field1542;
								var13[1] = 0.33333334F - Class130.field1542;
							}
						}
					}

					var13[1] = 1.0F - var13[1];
				}

				if (var13[0] != var14) {
					var2 = var13[0] * var10 + var1;
					if ((double)var14 != 0.0D) {
						var6 = var5 + (var6 - var5) * var13[0] / var14;
					}
				}

				if (var15 != var13[1]) {
					var3 = var13[1] * var10 + var1;
					if ((double)var15 != 1.0D) {
						var7 = (float)((double)var8 - (1.0D - (double)var13[1]) * (double)(var8 - var7) / (1.0D - (double)var15));
					}
				}

				var0.field1629 = var1;
				var0.field1630 = var4;
				var16 = var13[0];
				var17 = var13[1];
				var18 = var16 - 0.0F;
				var19 = var17 - var16;
				var20 = 1.0F - var17;
				float var21 = var19 - var18;
				var0.field1634 = var20 - var19 - var21;
				var0.field1646 = var21 + var21 + var21;
				var0.field1632 = var18 + var18 + var18;
				var0.field1641 = 0.0F;
				var18 = var6 - var5;
				var19 = var7 - var6;
				var20 = var8 - var7;
				var21 = var19 - var18;
				var0.field1623 = var20 - var19 - var21;
				var0.field1637 = var21 + var21 + var21;
				var0.field1636 = var18 + var18 + var18;
				var0.field1635 = var5;
			}
		}
	}
}
