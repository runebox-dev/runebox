import io.runebox.ObfInfo;

@ObfInfo(name = "co")
public class Class67 extends Class507 {
	@ObfInfo(name = "aa", desc = "Lsi;")
	public Class477 field835;
	@ObfInfo(name = "at", desc = "Lsi;")
	public Class477 field836;
	@ObfInfo(name = "af", desc = "Lvv;")
	public Class567 field834;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1276487465)
	public int field831;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1451705427)
	public int field833;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 808161507)
	public int field839;
	@ObfInfo(name = "ab", desc = "Ljava/lang/String;")
	public String field837;
	@ObfInfo(name = "ac", desc = "Ljava/lang/String;")
	public String field838;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	public String field840;

	public Class67(int var1, String var2, String var3, String var4) {
		this.field835 = Class477.field4944;
		this.field836 = Class477.field4944;
		this.method1825(var1, var2, var3, var4);
	}

	@ObfInfo(name = "ak", desc = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
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

	@ObfInfo(name = "al", desc = "(I)V")
	public void method1826() {
		this.field835 = Class477.field4944;
	}

	@ObfInfo(name = "aj", desc = "(I)Z", opaque = "-637778450")
	public final boolean method1837() {
		if (Class477.field4944 == this.field835) {
			this.method1827();
		}

		return Class477.field4943 == this.field835;
	}

	@ObfInfo(name = "az", desc = "(B)V", opaque = "9")
	public void method1827() {
		this.field835 = Client.field274.field849.method8731(this.field834) ? Class477.field4943 : Class477.field4942;
	}

	@ObfInfo(name = "af", desc = "(I)V")
	public void method1834() {
		this.field836 = Class477.field4944;
	}

	@ObfInfo(name = "aa", desc = "(I)Z", opaque = "-1194566832")
	public final boolean method1829() {
		if (Class477.field4944 == this.field836) {
			this.method1830();
		}

		return Class477.field4943 == this.field836;
	}

	@ObfInfo(name = "at", desc = "(S)V", opaque = "127")
	public void method1830() {
		this.field836 = Client.field274.field850.method8731(this.field834) ? Class477.field4943 : Class477.field4942;
	}

	@ObfInfo(name = "ab", desc = "(B)V", opaque = "0")
	public final void method1842() {
		if (this.field840 != null) {
			this.field834 = new Class567(Client.method3135(this.field840), Client.field2627);
		} else {
			this.field834 = null;
		}

	}
}
