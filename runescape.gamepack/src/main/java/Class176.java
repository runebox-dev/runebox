import io.runebox.ObfInfo;

@ObfInfo(name = "gt")
public class Class176 extends Class149 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1279428031)
	public int field1873;
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public String field1871;
	// $FF: synthetic field
	@ObfInfo(desc = "Lfu;")
	public final Class151 this$0;

	public Class176(Class151 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3066(Class521 var1) {
		this.field1873 = var1.method9410();
		this.field1871 = var1.method9415();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.method3351(this.field1873, this.field1871);
	}

	@ObfInfo(name = "oo", desc = "(Lnb;I)V", opaque = "704947035")
	public static void method3589(Class340 var0) {
		int var2 = var0.field3681;
		if (var2 == 324) {
			if (-1 == Client.field772) {
				Client.field772 = var0.field3712;
				Client.field773 = var0.field3713;
			}

			if (Client.field771.field3946 == 1) {
				var0.field3712 = Client.field772;
			} else {
				var0.field3712 = Client.field773;
			}

		} else if (var2 == 325) {
			if (Client.field772 == -1) {
				Client.field772 = var0.field3712;
				Client.field773 = var0.field3713;
			}

			if (Client.field771.field3946 == 1) {
				var0.field3712 = Client.field773;
			} else {
				var0.field3712 = Client.field772;
			}

		} else if (var2 == 327) {
			var0.field3729 = 150;
			var0.field3814 = (int)(Math.sin((double)Client.field778 / 40.0D) * 256.0D) & 2047;
			var0.field3792 = 5;
			var0.field3722 = 0;
		} else if (var2 == 328) {
			var0.field3729 = 150;
			var0.field3814 = (int)(Math.sin((double)Client.field778 / 40.0D) * 256.0D) & 2047;
			var0.field3792 = 5;
			var0.field3722 = 1;
		}
	}
}
