public class Class497 {
	public static final Class497 field5082;
	public static final Class497 field5084;
	public static final Class497 field5085;
	public static final Class497 field5086;
	public static final Class497 field5087;
	public static final Class497 field5094;
	public String field5088;

	static {
		field5094 = new Class497("p11_full");
		field5084 = new Class497("p12_full");
		field5082 = new Class497("b12_full");
		field5085 = new Class497("verdana_11pt_regular");
		field5086 = new Class497("verdana_13pt_regular");
		field5087 = new Class497("verdana_15pt_regular");
	}

	public Class497(String var1) {
		this.field5088 = var1;
	}

	public static int method9205(int var0, int var1) {
		int var3;
		for (var3 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var3 *= var0;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var3 * var0;
		} else {
			return var3;
		}
	}
}