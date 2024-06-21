import io.runebox.ObfInfo;

final class Class526 implements Class529 {
	public Class526() {
	}

	@ObfInfo(name = "ab", desc = "(Ljava/lang/Integer;Lua;I)V")
	public void method9693(Integer var1, Class521 var2) {
		var2.method9590(var1);
	}

	@ObfInfo(name = "al", desc = "(Lua;B)Ljava/lang/Object;")
	public Object method9644(Class521 var1) {
		return var1.method9410();
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/Object;Lua;S)V")
	public void method9645(Object var1, Class521 var2) {
		this.method9693((Integer)var1, var2);
	}
}
