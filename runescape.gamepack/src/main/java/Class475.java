import io.runebox.ObfInfo;

@ObfInfo(name = "sg")
public class Class475 implements Comparable {
	@ObfInfo(name = "az", desc = "Lvv;")
	public Class567 field4940;
	@ObfInfo(name = "aj", desc = "Lvv;")
	public Class567 field4941;

	@ObfInfo(name = "bt", desc = "(B)Lvv;")
	public Class567 method8703() {
		return this.field4941;
	}

	@ObfInfo(name = "bn", desc = "(I)Ljava/lang/String;", opaque = "1506605921")
	public String method8694() {
		return this.field4941 == null ? "" : this.field4941.method10260();
	}

	@ObfInfo(name = "bw", desc = "(B)Ljava/lang/String;", opaque = "0")
	public String method8690() {
		return this.field4940 == null ? "" : this.field4940.method10260();
	}

	@ObfInfo(name = "bl", desc = "(Lvv;Lvv;B)V", opaque = "1")
	public void method8692(Class567 var1, Class567 var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.field4941 = var1;
			this.field4940 = var2;
		}
	}

	@ObfInfo(name = "al", desc = "(Lsg;I)I")
	public int method8409(Class475 var1) {
		return this.field4941.method10275(var1.field4941);
	}

	public int compareTo(Object var1) {
		return this.method8409((Class475)var1);
	}
}
