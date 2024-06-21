import io.runebox.ObfInfo;

public class Class38 {
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1592180729)
	public int field268;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 2000861833)
	public int field269;

	public Class38(int var1, int var2) {
		this.field268 = var1;
		this.field269 = var2;
	}

	@ObfInfo(name = "ak", desc = "(Lbi;B)Z", opaque = "2")
	public boolean method784(Class35 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field268) {
			case 1:
				return var1.method734(this.field269);
			case 2:
				return var1.method736(this.field269);
			case 3:
				return var1.method723((char)this.field269);
			case 4:
				return var1.method737(1 == this.field269);
			default:
				return false;
			}
		}
	}
}
