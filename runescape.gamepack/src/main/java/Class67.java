import java.util.Arrays;

public class Class67 extends Class507 {
	public Class477 field835;
	public Class477 field836;
	public Class567 field834;
	public int field831;
	public int field833;
	public int field839;
	public String field837;
	public String field838;
	public String field840;

	public Class67(int var1, String var2, String var3, String var4) {
		this.field835 = Class477.field4944;
		this.field836 = Class477.field4944;
		this.method1825(var1, var2, var3, var4);
	}

	public void method1825(int var1, String var2, String var3, String var4) {
		int var6 = ++Class128.field1531 - 1;
		this.field833 = var6;
		this.field839 = Client.field778;
		this.field831 = var1;
		this.field840 = var2;
		this.method1842();
		this.field837 = var3;
		this.field838 = var4;
		this.method1826();
		this.method1834();
	}

	public void method1826() {
		this.field835 = Class477.field4944;
	}

	public final boolean method1837() {
		if (this.field835 == Class477.field4944) {
			this.method1827();
		}

		return this.field835 == Class477.field4943;
	}

	public void method1827() {
		this.field835 = Client.field274.field849.method8731(this.field834) ? Class477.field4943 : Class477.field4942;
	}

	public void method1834() {
		this.field836 = Class477.field4944;
	}

	public final boolean method1829() {
		if (Class477.field4944 == this.field836) {
			this.method1830();
		}

		return this.field836 == Class477.field4943;
	}

	public void method1830() {
		this.field836 = Client.field274.field850.method8731(this.field834) ? Class477.field4943 : Class477.field4942;
	}

	public final void method1842() {
		if (this.field840 != null) {
			this.field834 = new Class567(Client.method3135(this.field840), Client.field2627);
		} else {
			this.field834 = null;
		}

	}

	public static void method1841(Class340 var0, Class358 var1, boolean var2) {
		var0.field3792 = 7;
		var0.field3764 = new Class358(var1);
		if (!var2) {
			var0.field3764.field3950 = Arrays.copyOf(var0.field3764.field3953, var0.field3764.field3953.length);
			var0.field3764.method7055();
		}

	}
}
