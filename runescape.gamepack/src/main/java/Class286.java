import java.util.Iterator;
import java.util.LinkedList;

public class Class286 {
	public Class348 field3131;
	public boolean field3139;
	public int field3128;
	public int field3129;
	public int field3132;
	public int field3133;
	public int field3134;
	public int field3135;
	public int field3136;
	public int field3137;
	public String field3130;
	public String field3138;
	public LinkedList field3140;

	public Class286() {
		this.field3137 = -1;
		this.field3128 = -1;
		this.field3132 = -16777216;
		this.field3133 = -1;
		this.field3131 = null;
		this.field3135 = Integer.MAX_VALUE;
		this.field3136 = 0;
		this.field3134 = Integer.MAX_VALUE;
		this.field3129 = 0;
		this.field3139 = false;
	}

	public void method5835(Class521 var1, int var2) {
		this.field3137 = var2;
		this.field3138 = var1.method9415();
		this.field3130 = var1.method9415();
		this.field3131 = new Class348(var1.method9410());
		this.field3128 = var1.method9410();
		this.field3132 = var1.method9410();
		var1.method9405();
		this.field3139 = var1.method9405() == 1;
		this.field3133 = var1.method9405();
		int var4 = var1.method9405();
		this.field3140 = new LinkedList();

		for (int var5 = 0; var5 < var4; ++var5) {
			this.field3140.add(this.method5786(var1));
		}

		this.method5791();
	}

	public Class298 method5786(Class521 var1) {
		int var3 = var1.method9405();
		Class288[] var4 = new Class288[]{Class288.field3147, Class288.field3143, Class288.field3145, Class288.field3144};
		Class288 var5 = (Class288)Class62.method1112(var4, var3);
		Object var6 = null;
		switch(var5.field3142) {
		case 0:
			var6 = new Class301();
			break;
		case 1:
			var6 = new Class295();
			break;
		case 2:
			var6 = new Class268();
			break;
		case 3:
			var6 = new Class285();
			break;
		default:
			throw new IllegalStateException("");
		}

		((Class298)var6).method5349(var1);
		return (Class298)var6;
	}

	public boolean method5843(int var1, int var2, int var3) {
		Iterator var5 = this.field3140.iterator();

		Class298 var6;
		do {
			if (!var5.hasNext()) {
				return false;
			}

			var6 = (Class298)var5.next();
		} while(!var6.method5327(var1, var2, var3));

		return true;
	}

	public boolean method5797(int var1, int var2) {
		int var4 = var1 / 64;
		int var5 = var2 / 64;
		if (var4 >= this.field3135 && var4 <= this.field3136) {
			if (var5 >= this.field3134 && var5 <= this.field3129) {
				Iterator var6 = this.field3140.iterator();

				Class298 var7;
				do {
					if (!var6.hasNext()) {
						return false;
					}

					var7 = (Class298)var6.next();
				} while(!var7.method5348(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public int[] method5789(int var1, int var2, int var3) {
		Iterator var5 = this.field3140.iterator();

		Class298 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}

			var6 = (Class298)var5.next();
		} while(!var6.method5327(var1, var2, var3));

		return var6.method5329(var1, var2, var3);
	}

	public Class348 method5842(int var1, int var2) {
		Iterator var4 = this.field3140.iterator();

		Class298 var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (Class298)var4.next();
		} while(!var5.method5348(var1, var2));

		return var5.method5330(var1, var2);
	}

	public void method5791() {
		Iterator var2 = this.field3140.iterator();

		while (var2.hasNext()) {
			Class298 var3 = (Class298)var2.next();
			var3.method5354(this);
		}

	}

	public int method5792() {
		return this.field3137;
	}

	public boolean method5793() {
		return this.field3139;
	}

	public String method5794() {
		return this.field3138;
	}

	public String method5802() {
		return this.field3130;
	}

	public int method5796() {
		return this.field3128;
	}

	public int method5787() {
		return this.field3132;
	}

	public int method5798() {
		return this.field3133;
	}

	public int method5799() {
		return this.field3135;
	}

	public int method5800() {
		return this.field3136;
	}

	public int method5801() {
		return this.field3134;
	}

	public int method5824() {
		return this.field3129;
	}

	public int method5815() {
		return this.field3131.field3869;
	}

	public int method5804() {
		return this.field3131.field3870;
	}

	public int method5805() {
		return this.field3131.field3868;
	}

	public Class348 method5806() {
		return new Class348(this.field3131);
	}

	public static int method5861(int var0) {
		return var0 + -512;
	}
}
