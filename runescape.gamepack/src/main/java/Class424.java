import io.runebox.ObfInfo;
import java.util.Iterator;

public class Class424 extends Class447 {
	public Class424(Class447 var1) {
		super(var1);
		super.field4807 = "AddRequestTask";
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "709593494")
	public boolean method7832() {
		while (!Class332.field3453.isEmpty()) {
			Class357 var2 = (Class357)Class332.field3453.peek();
			if (var2 == null) {
				Class332.field3453.pop();
			} else {
				var2.field3940 = this.method7833();
				Class332.field3455.add(var2);
				Class332.field3453.pop();
			}
		}

		return true;
	}

	@ObfInfo(name = "al", desc = "(I)Lmw;", opaque = "-1043214319")
	public Class335 method7833() {
		Class335 var2 = null;
		Iterator var3 = Class332.field3454.iterator();

		while (true) {
			Class335 var4;
			do {
				do {
					if (!var3.hasNext()) {
						if (var2 != null) {
							++var2.field3509;
							if (var2.method6431() == 0 && var2.method6320()) {
								var2.method6319();
								var2.method6313();
								var2.method6400(0);
							}
						}

						return var2;
					}

					var4 = (Class335)var3.next();
				} while(var4 == null);
			} while(var2 != null && var2.field3509 <= var4.field3509 && (var4.method6431() != 0 || !var4.method6320()));

			var2 = var4;
		}
	}
}
