public class Class142 extends Class149 {
	public boolean field1621;
	public int field1618;
	// $FF: synthetic field
	public final Class151 this$0;

	public Class142(Class151 var1) {
		this.this$0 = var1;
		this.field1618 = -1;
	}

	public void method3066(Class521 var1) {
		this.field1618 = var1.method9407();
		this.field1621 = var1.method9405() == 1;
	}

	public void method3067(Class159 var1) {
		var1.method3337(this.field1618, this.field1621);
	}

	public static void method3145(Class340 var0, int var1, int var2, int var3) {
		Class361 var5 = var0.method6512(Client.field25, false);
		if (var5 != null) {
			if (Client.field736 < 3) {
				Client.field4958.method9961(var1, var2, var5.field3970, var5.field3968, 25, 25, Client.field572, 256, var5.field3967, var5.field3969);
			} else {
				Class561.method10164(var1, var2, 0, var5.field3967, var5.field3969);
			}

		}
	}
}
