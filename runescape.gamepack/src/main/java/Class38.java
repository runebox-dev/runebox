public class Class38 {
	public int field268;
	public int field269;

	public Class38(int var1, int var2) {
		this.field268 = var1;
		this.field269 = var2;
	}

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
