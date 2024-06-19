public class Class449 {
	public int field4815;
	public int field4816;
	public int field4817;
	public int field4818;

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
