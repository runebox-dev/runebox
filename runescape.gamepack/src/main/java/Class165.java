import io.runebox.ObfInfo;

@ObfInfo(name = "gi")
public class Class165 {
	@ObfInfo(name = "ag", desc = "Lpi;")
	public Class399 field1802;
	@ObfInfo(name = "ad", desc = "J", longMultiplier = 7504978253578014429L)
	public long field1801;
	@ObfInfo(name = "aq", desc = "J", longMultiplier = -2954807226888514321L)
	public long field1804;

	public Class165(Class562 var1) {
		this.field1801 = -1L;
		this.field1802 = new Class399();
		this.method3416(var1);
	}

	@ObfInfo(name = "aq", desc = "(Lvp;I)V", opaque = "1548073121")
	public void method3416(Class562 var1) {
		this.field1804 = var1.method9833();
		this.field1801 = var1.method9833();

		for (int var3 = var1.method9902(); var3 != 0; var3 = var1.method9902()) {
			Object var4;
			if (var3 == 1) {
				var4 = new Class161(this);
			} else if (var3 == 4) {
				var4 = new Class168(this);
			} else if (var3 == 3) {
				var4 = new Class140(this);
			} else if (var3 == 2) {
				var4 = new Class155(this);
			} else {
				if (var3 != 5) {
					throw new RuntimeException("");
				}

				var4 = new Class174(this);
			}

			((Class157)var4).method3152(var1);
			this.field1802.method7449((Class520)var4);
		}

	}

	@ObfInfo(name = "ad", desc = "(Lgj;I)V", opaque = "1710439935")
	public void method3417(Class166 var1) {
		if (this.field1804 == var1.field5234 && this.field1801 == var1.field1810) {
			for (Class157 var3 = (Class157)this.field1802.method7401(); var3 != null; var3 = (Class157)this.field1802.method7403()) {
				var3.method3149(var1);
			}

			++var1.field1810;
		} else {
			throw new RuntimeException("");
		}
	}
}
