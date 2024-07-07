import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "rk")
public class Class453 extends Class457 {
	@ObfInfo(name = "aq", desc = "Lok;")
	public Class375 field4868;
	@ObfInfo(name = "ad", desc = "Lok;")
	public Class375 field4869;
	@ObfInfo(name = "av", desc = "Lok;")
	public Class375 field4870;

	public Class453(Class457 var1, Class375 var2, Class375 var3, Class375 var4) {
		super(var1);
		this.field4868 = var2;
		this.field4869 = var3;
		this.field4870 = var4;
		super.field4890 = "LoadSongTask";
	}

	@ObfInfo(name = "aq", desc = "(S)Z", opaque = "254")
	public boolean method7710() {
		int var2 = 0;
		Iterator var3 = Class323.field3464.iterator();

		while (true) {
			while (var3.hasNext()) {
				Class351 var4 = (Class351)var3.next();
				if (var4 != null && var4.field3761.field3309 > 1 && var4.field3761.method6098()) {
					this.method8406("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var4 != null && !var4.field3757) {
					try {
						if (var4.field3756 != null && var4.field3764 != -1 && -1 != var4.field3753) {
							if (var4.field3751 == null) {
								var4.field3751 = Class364.method7045(var4.field3756, var4.field3764, var4.field3753);
								if (var4.field3751 == null) {
									continue;
								}
							}

							if (var4.field3762 == null) {
								var4.field3762 = new Class34(this.field4870, this.field4869);
							}

							if (var4.field3761.method6092(var4.field3751, this.field4868, var4.field3762)) {
								++var2;
								var4.field3757 = true;
								var4.field3761.method6093();
							}
						} else {
							++var2;
						}
					} catch (Exception var6) {
						Class552.method8390((String)null, var6);
						this.method8406(var6.getMessage());
						return true;
					}
				} else {
					++var2;
				}
			}

			if (Class323.field3464.size() == var2) {
				return true;
			}

			return false;
		}
	}
}
