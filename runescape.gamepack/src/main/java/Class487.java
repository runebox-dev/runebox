import io.runebox.ObfInfo;

public class Class487 {
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1446419837)
	public int field4976;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -553814125)
	public int field4977;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1995625871)
	public int field4978;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1308576767)
	public int field4979;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1147860825)
	public int field4980;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -896320569)
	public int field4981;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 245838707)
	public int field4982;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -587298351)
	public int field4983;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 321067199)
	public int field4984;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -934384653)
	public int field4985;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1843887941)
	public int field4986;

	public Class487() {
		this.field4985 = -1;
		this.field4977 = -1;
		this.field4976 = -1;
		this.field4978 = -1;
		this.field4980 = -1;
		this.field4981 = -1;
		this.field4982 = -1;
		this.field4979 = -1;
		this.field4984 = -1;
		this.field4983 = -1;
		this.field4986 = -1;
	}

	@ObfInfo(name = "ak", desc = "(Lor;I)V", opaque = "1369747904")
	public void method8905(Class382 var1) {
		byte[] var3 = var1.method7221(Class491.field5003.field5001);
		Class521 var4 = new Class521(var3);

		while (true) {
			int var5 = var4.method9405();
			if (var5 == 0) {
				return;
			}

			switch(var5) {
			case 1:
				var4.method9399();
				break;
			case 2:
				this.field4985 = var4.method9423();
				this.field4977 = var4.method9423();
				this.field4976 = var4.method9423();
				this.field4978 = var4.method9423();
				this.field4980 = var4.method9423();
				this.field4981 = var4.method9423();
				this.field4982 = var4.method9423();
				this.field4979 = var4.method9423();
				this.field4984 = var4.method9423();
				this.field4983 = var4.method9423();
				this.field4986 = var4.method9423();
			}
		}
	}
}
