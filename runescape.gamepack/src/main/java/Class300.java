import io.runebox.ObfInfo;

public class Class300 {
	@ObfInfo(name = "ak", desc = "Lln;")
	public static final Class300 field3200;
	@ObfInfo(name = "al", desc = "Lln;")
	public static final Class300 field3201;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -938647203)
	public final int field3202;

	static {
		field3200 = new Class300(0);
		field3201 = new Class300(1);
	}

	public Class300(int var1) {
		this.field3202 = var1;
	}

	@ObfInfo(name = "mc", desc = "(I)V", opaque = "-1572203306")
	public static void method5996() {
		boolean var1 = false;

		while (!var1) {
			var1 = true;

			for (int var2 = 0; var2 < Client.field629 - 1; ++var2) {
				if (Client.field632[var2] < 1000 && Client.field632[var2 + 1] > 1000) {
					String var3 = Client.field637[var2];
					Client.field637[var2] = Client.field637[var2 + 1];
					Client.field637[var2 + 1] = var3;
					String var4 = Client.field636[var2];
					Client.field636[var2] = Client.field636[var2 + 1];
					Client.field636[var2 + 1] = var4;
					int var5 = Client.field632[var2];
					Client.field632[var2] = Client.field632[var2 + 1];
					Client.field632[var2 + 1] = var5;
					var5 = Client.field630[var2];
					Client.field630[var2] = Client.field630[var2 + 1];
					Client.field630[var2 + 1] = var5;
					var5 = Client.field631[var2];
					Client.field631[var2] = Client.field631[var2 + 1];
					Client.field631[var2 + 1] = var5;
					var5 = Client.field633[var2];
					Client.field633[var2] = Client.field633[var2 + 1];
					Client.field633[var2 + 1] = var5;
					var5 = Client.field634[var2];
					Client.field634[var2] = Client.field634[var2 + 1];
					Client.field634[var2 + 1] = var5;
					var5 = Client.field635[var2];
					Client.field635[var2] = Client.field635[var2 + 1];
					Client.field635[var2 + 1] = var5;
					boolean var6 = Client.field638[var2];
					Client.field638[var2] = Client.field638[var2 + 1];
					Client.field638[var2 + 1] = var6;
					var1 = false;
				}
			}
		}

	}
}
