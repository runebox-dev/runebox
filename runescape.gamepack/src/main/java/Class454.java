import io.runebox.ObfInfo;

@ObfInfo(name = "rl")
public class Class454 extends Class471 {
	@ObfInfo(name = "ap", desc = "Luu;")
	public final Class541 field4875;

	public Class454(Class541 var1) {
		super(400);
		this.field4875 = var1;
	}

	@ObfInfo(name = "aq", desc = "(B)Lsk;")
	public Class479 method8342() {
		return new Class482();
	}

	@ObfInfo(name = "ad", desc = "(II)[Lsk;")
	public Class479[] method8343(int var1) {
		return new Class482[var1];
	}

	@ObfInfo(name = "ag", desc = "(Lvp;II)V", opaque = "-1925258720")
	public void method8344(Class562 var1, int var2) {
		while (var1.field5471 < var2) {
			int var4 = var1.method9902();
			if (var4 == 4) {
				Class561 var10 = new Class561(var1.method9837(), this.field4875);
				if (!var10.method9801()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				Client.field1585.method1215(var10.method9789(), var11);
			} else {
				boolean var5 = (var4 & 1) != 0;
				Class561 var6 = new Class561(var1.method9837(), this.field4875);
				Class561 var7 = new Class561(var1.method9837(), this.field4875);
				var1.method9837();
				if (!var6.method9801()) {
					throw new IllegalStateException();
				}

				Class482 var8 = (Class482)this.method8578(var6);
				if (var5) {
					Class482 var9 = (Class482)this.method8578(var7);
					if (var9 != null && var9 != var8) {
						if (var8 != null) {
							this.method8560(var9);
						} else {
							var8 = var9;
						}
					}
				}

				if (var8 != null) {
					this.method8565(var8, var6, var7);
				} else if (this.method8582() < 400) {
					int var12 = this.method8582();
					var8 = (Class482)this.method8562(var6, var7);
					var8.field4992 = var12;
				}
			}
		}

	}
}
