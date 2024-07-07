import io.runebox.ObfInfo;

@ObfInfo(name = "uc")
final class Class523 implements Class529 {
	public Class523() {
	}

	@ObfInfo(name = "ab", desc = "(Ljava/lang/String;Lua;I)V")
	public void method9642(String var1, Class521 var2) {
		var2.method9473(var1);
	}

	@ObfInfo(name = "al", desc = "(Lua;B)Ljava/lang/Object;")
	public Object method9644(Class521 var1) {
		return var1.method9415();
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/Object;Lua;S)V")
	public void method9645(Object var1, Class521 var2) {
		this.method9642((String)var1, var2);
	}
}
