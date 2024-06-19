public class Class276 {
	public Class263 field3043;
	public boolean field3039;
	public boolean field3044;
	public int field3037;
	public int field3042;
	public int field3048;
	public int field3049;
	public int field3050;
	public int field3051;
	public int field3052;
	public int field3054;
	public int field3055;
	public int field3056;
	public int[] field3057;

	public Class276() {
		this.field3039 = false;
		this.field3044 = true;
		this.field3049 = 0;
		this.field3042 = 512;
		this.field3057 = new int[1024];
	}

	public void method5550() {
		this.field3048 = this.field3051 / 2;
		this.field3050 = this.field3052 / 2;
		this.field3037 = -this.field3048;
		this.field3054 = this.field3051 - this.field3048;
		this.field3055 = -this.field3050;
		this.field3056 = this.field3052 - this.field3050;
	}

	public void method5549(int var1, int var2, int var3, int var4) {
		this.field3048 = var1 - var2;
		this.field3050 = var3 - var4;
		this.field3037 = -this.field3048;
		this.field3054 = this.field3051 - this.field3048;
		this.field3055 = -this.field3050;
		this.field3056 = this.field3052 - this.field3050;
	}

	public void method5552(int var1, int var2, int var3) {
		this.field3039 = var1 < 0 || var1 > this.field3051 || var2 < 0 || var2 > this.field3051 || var3 < 0 || var3 > this.field3051;
	}
}
