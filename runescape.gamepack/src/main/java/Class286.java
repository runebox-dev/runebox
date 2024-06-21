import io.runebox.ObfInfo;
import java.util.Iterator;
import java.util.LinkedList;

@ObfInfo(name = "kz")
public class Class286 {
	@ObfInfo(name = "at", desc = "Lnj;")
	public Class348 field3131;
	@ObfInfo(name = "av", desc = "Z")
	public boolean field3139;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 281281149)
	public int field3128;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 826375877)
	public int field3129;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1898711907)
	public int field3132;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 80945249)
	public int field3133;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 471299443)
	public int field3134;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -2101235529)
	public int field3135;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1275841169)
	public int field3136;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 690063147)
	public int field3137;
	@ObfInfo(name = "aj", desc = "Ljava/lang/String;")
	public String field3130;
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public String field3138;
	@ObfInfo(name = "aq", desc = "Ljava/util/LinkedList;")
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

	@ObfInfo(name = "ak", desc = "(Lua;IB)V", opaque = "0")
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

	@ObfInfo(name = "al", desc = "(Lua;I)Lll;")
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

	@ObfInfo(name = "aj", desc = "(IIII)Z", opaque = "1924775018")
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

	@ObfInfo(name = "az", desc = "(III)Z", opaque = "1271677403")
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

	@ObfInfo(name = "af", desc = "(IIII)[I", opaque = "16711934")
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

	@ObfInfo(name = "aa", desc = "(IIB)Lnj;", opaque = "4")
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

	@ObfInfo(name = "at", desc = "(B)V", opaque = "2")
	public void method5791() {
		Iterator var2 = this.field3140.iterator();

		while (var2.hasNext()) {
			Class298 var3 = (Class298)var2.next();
			var3.method5354(this);
		}

	}

	@ObfInfo(name = "ab", desc = "(B)I")
	public int method5792() {
		return this.field3137;
	}

	@ObfInfo(name = "ac", desc = "(B)Z")
	public boolean method5793() {
		return this.field3139;
	}

	@ObfInfo(name = "ao", desc = "(B)Ljava/lang/String;")
	public String method5794() {
		return this.field3138;
	}

	@ObfInfo(name = "ah", desc = "(I)Ljava/lang/String;")
	public String method5802() {
		return this.field3130;
	}

	@ObfInfo(name = "av", desc = "(I)I")
	public int method5796() {
		return this.field3128;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method5787() {
		return this.field3132;
	}

	@ObfInfo(name = "ap", desc = "(I)I")
	public int method5798() {
		return this.field3133;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method5799() {
		return this.field3135;
	}

	@ObfInfo(name = "ax", desc = "(B)I")
	public int method5800() {
		return this.field3136;
	}

	@ObfInfo(name = "ay", desc = "(I)I")
	public int method5801() {
		return this.field3134;
	}

	@ObfInfo(name = "au", desc = "(B)I")
	public int method5824() {
		return this.field3129;
	}

	@ObfInfo(name = "as", desc = "(B)I")
	public int method5815() {
		return this.field3131.field3869;
	}

	@ObfInfo(name = "aw", desc = "(B)I")
	public int method5804() {
		return this.field3131.field3870;
	}

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method5805() {
		return this.field3131.field3868;
	}

	@ObfInfo(name = "ai", desc = "(I)Lnj;")
	public Class348 method5806() {
		return new Class348(this.field3131);
	}
}
