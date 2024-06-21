import io.runebox.ObfInfo;
import java.util.Iterator;

public class Class468 extends Class447 {
	@ObfInfo(name = "al", desc = "Lor;")
	public Class382 field4913;
	@ObfInfo(name = "ak", desc = "Lor;")
	public Class382 field4914;
	@ObfInfo(name = "ab", desc = "Lor;")
	public Class382 field4915;

	public Class468(Class447 var1, Class382 var2, Class382 var3, Class382 var4) {
		super(var1);
		this.field4914 = var2;
		this.field4913 = var3;
		this.field4915 = var4;
		super.field4807 = "LoadSongTask";
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "709593494")
	public boolean method7832() {
		int var2 = 0;
		Iterator var3 = Class332.field3455.iterator();

		while (true) {
			while (var3.hasNext()) {
				Class357 var4 = (Class357)var3.next();
				if (var4 != null && var4.field3940.field3509 > 1 && var4.field3940.method6321()) {
					this.method8379("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var4 != null && !var4.field3934) {
					try {
						if (var4.field3938 != null && var4.field3937 != -1 && -1 != var4.field3933) {
							if (var4.field3932 == null) {
								var4.field3932 = Class353.method6747(var4.field3938, var4.field3937, var4.field3933);
								if (var4.field3932 == null) {
									continue;
								}
							}

							if (var4.field3942 == null) {
								var4.field3942 = new Class43(this.field4915, this.field4913);
							}

							if (var4.field3940.method6422(var4.field3932, this.field4914, var4.field3942)) {
								++var2;
								var4.field3934 = true;
								var4.field3940.method6324();
							}
						} else {
							++var2;
						}
					} catch (Exception var6) {
						Class548.method8904((String)null, var6);
						this.method8379(var6.getMessage());
						return true;
					}
				} else {
					++var2;
				}
			}

			if (Class332.field3455.size() == var2) {
				return true;
			}

			return false;
		}
	}
}
