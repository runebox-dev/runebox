public abstract class Class484 implements Class297 {
	public Class545 field4962;

	public Class484(int var1) {
	}

	public abstract void method8873(Class521 var1, int var2);

	public void method8872(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			Class493 var4 = (Class493)Class62.method1112(Class70.method1939(), var3);
			if (var4 != null) {
				switch(var4.field5008) {
				case 0:
					Class62.method1112(Class95.method2485(), var1.method9405());
					break;
				case 1:
					var1.method9577();
					break;
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				case 3:
					int var5 = var1.method9405();
					this.field4962 = Class539.method5727(var5);
					if (this.field4962 == null) {
						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
					}
				}
			} else {
				this.method8873(var1, var3);
			}
		}
	}

	public boolean method8874() {
		return this.field4962 != null;
	}

	public Object method8880() {
		if (Class545.field5333 == this.field4962) {
			return 0;
		} else if (Class545.field5336 == this.field4962) {
			return -1L;
		} else {
			return this.field4962 == Class545.field5337 ? "" : null;
		}
	}
}
