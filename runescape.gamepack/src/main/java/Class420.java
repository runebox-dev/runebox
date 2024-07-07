import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "qd")
public class Class420 extends Class457 {
	public Class420(Class457 var1) {
		super(var1);
		super.field4890 = "AddRequestTask";
	}

	@ObfInfo(name = "aq", desc = "(S)Z")
	public boolean method7710() {
		while (!Class323.field3467.isEmpty()) {
			Class351 var2 = (Class351)Class323.field3467.peek();
			if (var2 == null) {
				Class323.field3467.pop();
			} else {
				var2.field3761 = this.method7711();
				Class323.field3464.add(var2);
				Class323.field3467.pop();
			}
		}

		return true;
	}

	@ObfInfo(name = "ad", desc = "(B)Lmc;", opaque = "-1")
	public Class315 method7711() {
		Class315 var2 = null;
		Iterator var3 = Class323.field3462.iterator();

		while (true) {
			Class315 var4;
			do {
				do {
					if (!var3.hasNext()) {
						if (var2 != null) {
							++var2.field3309;
							if (var2.method6091() == 0 && var2.method6097()) {
								var2.method6129();
								var2.method6094();
								var2.method6090(0);
							}
						}

						return var2;
					}

					var4 = (Class315)var3.next();
				} while(var4 == null);
			} while(var2 != null && var2.field3309 <= var4.field3309 && (var4.method6091() != 0 || !var4.method6097()));

			var2 = var4;
		}
	}
}
