import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.Iterator;

@ObfInfo(name = "qt")
public class Class436 extends Class457 {
	@ObfInfo(name = "aq", desc = "Ljava/util/ArrayList;")
	public ArrayList field4758;

	public Class436(Class457 var1, ArrayList var2) {
		super(var1);
		super.field4890 = "ClearRequestTask";
		this.field4758 = var2;
	}

	@ObfInfo(name = "aq", desc = "(S)Z", opaque = "254")
	public boolean method7710() {
		if (this.field4758.isEmpty()) {
			return true;
		} else {
			Iterator var2 = this.field4758.iterator();

			while (var2.hasNext()) {
				Class351 var3 = (Class351)var2.next();

				try {
					if (Class323.field3464.contains(var3)) {
						if (var3 == null) {
							Class323.field3464.remove(var3);
						} else {
							if (var3.field3761.field3309 > 0) {
								--var3.field3761.field3309;
							}

							if (var3.field3761.field3309 == 0) {
								var3.field3761.method6129();
								var3.field3761.method6094();
								var3.field3761.method6090(0);
							}

							int var4 = var3.field3764;
							int var5 = var3.field3753;
							Iterator var6 = Class323.field3468.iterator();

							while (var6.hasNext()) {
								Class333 var7 = (Class333)var6.next();
								var7.method1324(var4, var5);
							}

							Class323.field3464.remove(var3);
						}
					}
				} catch (Exception var8) {
					Class552.method8390((String)null, var8);
					this.method8406(var8.getMessage());
					Class323.field3464.clear();
					return true;
				}
			}

			return true;
		}
	}
}
