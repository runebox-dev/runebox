import io.runebox.ObfInfo;

@ObfInfo(name = "sm")
public abstract class Class481 implements Class298 {
	@ObfInfo(name = "aq", desc = "Lue;")
	public Class525 field4991;

	public Class481(int var1) {
	}

	@ObfInfo(name = "aq", desc = "(Lvp;II)V")
	public abstract void method8686(Class562 var1, int var2);

	@ObfInfo(name = "ak", desc = "(Lvp;I)V", opaque = "603116658")
	public void method8712(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			Class478[] var4 = new Class478[]{Class478.field4978, Class478.field4974, Class478.field4976, Class478.field4977};
			Class478 var5 = (Class478)Class406.method4071(var4, var3);
			if (var5 != null) {
				switch(var5.field4975) {
				case 0:
					Class383[] var7 = new Class383[]{Class383.field4516, Class383.field4519, Class383.field4517, Class383.field4518};
					Class406.method4071(var7, var1.method9902());
					break;
				case 1:
					var1.method9980();
					break;
				case 2:
					int var6 = var1.method9902();
					this.field4991 = Class522.method2912(var6);
					if (this.field4991 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var5);
				}
			} else {
				this.method8686(var1, var3);
			}
		}
	}

	@ObfInfo(name = "ap", desc = "(I)Z", opaque = "604557157")
	public boolean method8714() {
		return this.field4991 != null;
	}

	@ObfInfo(name = "an", desc = "(B)Ljava/lang/Object;", opaque = "36")
	public Object method8715() {
		if (Class525.field5250 == this.field4991) {
			return 0;
		} else if (Class525.field5244 == this.field4991) {
			return -1L;
		} else {
			return Class525.field5246 == this.field4991 ? "" : null;
		}
	}
}
