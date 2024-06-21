import io.runebox.ObfInfo;

@ObfInfo(name = "rg")
public class Class449 {
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 424096415)
	public int field4815;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1351754127)
	public int field4816;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -2079157027)
	public int field4817;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -791721597)
	public int field4818;

	@ObfInfo(desc = "()Ljava/lang/String;")
	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4817).length();
		int var3 = 10 - Integer.toString(this.field4815).length();
		int var4 = 10 - Integer.toString(this.field4816).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4817 + var5 + "Created: " + this.field4816 + var7 + "Total used: " + this.field4815 + var6 + "Max-In-Use: " + this.field4818;
	}
}
