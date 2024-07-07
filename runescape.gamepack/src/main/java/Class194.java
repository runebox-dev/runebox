import io.runebox.ObfInfo;

@ObfInfo(name = "hl")
public class Class194 extends Class507 {
	@ObfInfo(name = "aj", desc = "Llm;")
	public static Class299 field1992;
	@ObfInfo(name = "az", desc = "Llm;")
	public static Class299 field1993;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -100178739)
	public int field1990;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1179892719)
	public int field1991;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1523218731)
	public int field1994;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -163670565)
	public int field1996;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -210082955)
	public int field1999;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -56080381)
	public int field2000;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 188716697)
	public int field2002;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1523585491)
	public int field2003;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1200593249)
	public int field2004;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1512758997)
	public int field2005;

	static {
		field1992 = new Class299(64);
		field1993 = new Class299(64);
	}

	public Class194() {
		this.field1994 = 255;
		this.field1996 = 255;
		this.field1999 = -1;
		this.field2003 = 1;
		this.field1991 = 70;
		this.field2002 = -1;
		this.field1990 = -1;
		this.field2004 = 30;
		this.field2005 = 0;
	}

	@ObfInfo(name = "ak", desc = "(Lua;B)V", opaque = "0")
	public void method3825(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method3828(var1, var3);
		}
	}

	@ObfInfo(name = "al", desc = "(Lua;II)V", opaque = "-971106859")
	public void method3828(Class521 var1, int var2) {
		if (var2 == 1) {
			var1.method9407();
		} else if (var2 == 2) {
			this.field1994 = var1.method9405();
		} else if (var2 == 3) {
			this.field1996 = var1.method9405();
		} else if (var2 == 4) {
			this.field1999 = 0;
		} else if (var2 == 5) {
			this.field1991 = var1.method9407();
		} else if (var2 == 6) {
			var1.method9405();
		} else if (var2 == 7) {
			this.field2002 = var1.method9423();
		} else if (var2 == 8) {
			this.field1990 = var1.method9423();
		} else if (var2 == 11) {
			this.field1999 = var1.method9407();
		} else if (var2 == 14) {
			this.field2004 = var1.method9405();
		} else if (var2 == 15) {
			this.field2005 = var1.method9405();
		}

	}

	@ObfInfo(name = "aj", desc = "(I)Lvc;", opaque = "-2115292612")
	public Class549 method3816() {
		if (this.field2002 < 0) {
			return null;
		} else {
			Class549 var2 = (Class549)field1993.method5993((long)this.field2002);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Class554.method9868(Client.field1998, this.field2002, 0);
				if (var2 != null) {
					field1993.method5987(var2, (long)this.field2002);
				}

				return var2;
			}
		}
	}

	@ObfInfo(name = "az", desc = "(B)Lvc;", opaque = "0")
	public Class549 method3817() {
		if (this.field1990 < 0) {
			return null;
		} else {
			Class549 var2 = (Class549)field1993.method5993((long)this.field1990);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Class554.method9868(Client.field1998, this.field1990, 0);
				if (var2 != null) {
					field1993.method5987(var2, (long)this.field1990);
				}

				return var2;
			}
		}
	}
}
