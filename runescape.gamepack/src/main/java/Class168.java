import io.runebox.ObfInfo;

@ObfInfo(name = "gl")
public class Class168 extends Class157 {
	@ObfInfo(name = "ag", desc = "B")
	public byte field1846;
	@ObfInfo(name = "ad", desc = "B")
	public byte field1848;
	@ObfInfo(name = "aq", desc = "Ljava/lang/String;")
	public String field1845;
	// $FF: synthetic field
	public final Class165 this$0;

	public Class168(Class165 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;I)V", opaque = "36173477")
	public void method3152(Class562 var1) {
		this.field1845 = var1.method9836();
		if (this.field1845 != null) {
			var1.method9902();
			this.field1848 = var1.method9955();
			this.field1846 = var1.method9955();
		}

	}

	@ObfInfo(name = "ad", desc = "(Lgj;I)V", opaque = "-82813141")
	public void method3149(Class166 var1) {
		var1.field1813 = this.field1845;
		if (this.field1845 != null) {
			var1.field1812 = this.field1848;
			var1.field1806 = this.field1846;
		}

	}

	@ObfInfo(name = "ad", desc = "(Lmi;Lvs;S)Lmb;", opaque = "3054")
	public static Class314 method3523(Class321 var0, Class565 var1) {
		Class314 var3 = Class314.method6078();
		var3.field3272 = var0;
		var3.field3269 = var0.field3452;
		if (var3.field3269 == -1) {
			var3.field3270 = new Class527(260);
		} else if (var3.field3269 == -2) {
			var3.field3270 = new Class527(10000);
		} else if (var3.field3269 <= 18) {
			var3.field3270 = new Class527(20);
		} else if (var3.field3269 <= 98) {
			var3.field3270 = new Class527(100);
		} else {
			var3.field3270 = new Class527(260);
		}

		var3.field3270.method9340(var1);
		var3.field3270.method9368(var3.field3272.field3443);
		var3.field3271 = 0;
		return var3;
	}
}
