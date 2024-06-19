public class Class194 extends Class507 {
	public static Class299 field1992;
	public static Class299 field1993;
	public int field1990;
	public int field1991;
	public int field1994;
	public int field1996;
	public int field1999;
	public int field2000;
	public int field2002;
	public int field2003;
	public int field2004;
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

	public void method3825(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method3828(var1, var3);
		}
	}

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
