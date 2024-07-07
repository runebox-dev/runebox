import io.runebox.ObfInfo;

@ObfInfo(name = "uo")
final class Class535 implements Class529 {
	public Class535() {
	}

	@ObfInfo(name = "ab", desc = "(Ljava/lang/Long;Lua;S)V")
	public void method9827(Long var1, Class521 var2) {
		var2.method9393(var1);
	}

	@ObfInfo(name = "al", desc = "(Lua;B)Ljava/lang/Object;")
	public Object method9644(Class521 var1) {
		return var1.method9411();
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/Object;Lua;S)V")
	public void method9645(Object var1, Class521 var2) {
		this.method9827((Long)var1, var2);
	}
}
