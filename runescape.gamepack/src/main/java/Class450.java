import io.runebox.ObfInfo;

@ObfInfo(name = "rh")
public class Class450 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1086262149)
	public int field4849;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1581170185)
	public int field4850;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -994741757)
	public int field4851;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1046301915)
	public int field4852;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4852).length();
		int var3 = 10 - Integer.toString(this.field4851).length();
		int var4 = 10 - Integer.toString(this.field4850).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4852 + var5 + "Created: " + this.field4850 + var7 + "Total used: " + this.field4851 + var6 + "Max-In-Use: " + this.field4849;
	}
}
