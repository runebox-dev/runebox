public abstract class Class86 extends Class255 implements Class78 {
	public Class256[] field1128;
	public Class409 field1100;
	public Class515 field1082;
	public boolean field1058;
	public boolean field1072;
	public boolean field1078;
	public boolean field1091;
	public boolean field1095;
	public byte field1083;
	public byte field1118;
	public byte field1119;
	public byte field1120;
	public byte field1121;
	public int field1055;
	public int field1056;
	public int field1057;
	public int field1059;
	public int field1060;
	public int field1061;
	public int field1063;
	public int field1064;
	public int field1065;
	public int field1066;
	public int field1067;
	public int field1068;
	public int field1069;
	public int field1070;
	public int field1071;
	public int field1073;
	public int field1074;
	public int field1076;
	public int field1077;
	public int field1079;
	public int field1081;
	public int field1089;
	public int field1090;
	public int field1092;
	public int field1093;
	public int field1094;
	public int field1096;
	public int field1098;
	public int field1099;
	public int field1101;
	public int field1102;
	public int field1103;
	public int field1104;
	public int field1106;
	public int field1107;
	public int field1108;
	public int field1109;
	public int field1110;
	public int field1111;
	public int field1112;
	public int field1113;
	public int field1114;
	public int field1115;
	public int field1116;
	public int field1117;
	public int field1122;
	public int field1123;
	public int field1124;
	public int field1125;
	public int field1126;
	public int field1129;
	public int field1130;
	public int field1131;
	public int field1132;
	public int field1133;
	public int[] field1062;
	public int[] field1080;
	public int[] field1084;
	public int[] field1085;
	public int[] field1086;
	public int[] field1087;
	public int[] field1097;
	public int[] field1127;
	public String field1075;

	public Class86() {
		this.field1058 = false;
		this.field1059 = 1;
		this.field1061 = -1;
		this.field1092 = -1;
		this.field1063 = -1;
		this.field1064 = -1;
		this.field1073 = -1;
		this.field1056 = -1;
		this.field1067 = -1;
		this.field1068 = -1;
		this.field1066 = -1;
		this.field1076 = -1;
		this.field1071 = -1;
		this.field1124 = -1;
		this.field1057 = -1;
		this.field1132 = -1;
		this.field1079 = -1;
		this.field1075 = null;
		this.field1078 = false;
		this.field1069 = 100;
		this.field1104 = 0;
		this.field1081 = 0;
		this.field1062 = null;
		this.field1083 = 0;
		this.field1084 = new int[4];
		this.field1085 = new int[4];
		this.field1086 = new int[4];
		this.field1087 = new int[4];
		this.field1097 = new int[4];
		this.field1100 = new Class409();
		this.field1070 = -1;
		this.field1091 = false;
		this.field1055 = -1;
		this.field1093 = -1;
		this.field1094 = -1;
		this.field1096 = -1;
		this.field1122 = 0;
		this.field1098 = 0;
		this.field1099 = 0;
		this.field1074 = -1;
		this.field1101 = 0;
		this.field1102 = 0;
		this.field1103 = 0;
		this.field1090 = 0;
		this.field1082 = new Class515(4);
		this.field1106 = 0;
		this.field1114 = 0;
		this.field1130 = 200;
		this.field1116 = -1;
		this.field1117 = -1;
		this.field1123 = 0;
		this.field1089 = 32;
		this.field1125 = 0;
		this.field1080 = new int[10];
		this.field1127 = new int[10];
		this.field1128 = new Class256[10];
		this.field1129 = 0;
		this.field1077 = 0;
		this.field1131 = -1;
	}

	public final void method2307() {
		this.field1125 = 0;
		this.field1077 = 0;
	}

	public boolean method2264() {
		return false;
	}

	public final void method2309(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var8 = true;
		boolean var9 = true;

		int var10;
		for (var10 = 0; var10 < 4; ++var10) {
			if (this.field1086[var10] > var5) {
				var8 = false;
			} else {
				var9 = false;
			}
		}

		var10 = -1;
		int var11 = -1;
		int var12 = 0;
		if (var1 >= 0) {
			Class218 var13 = Class218.method287(var1);
			var11 = var13.field2209;
			var12 = var13.field2206;
		}

		int var15;
		if (var9) {
			if (var11 == -1) {
				return;
			}

			var10 = 0;
			var15 = 0;
			if (var11 == 0) {
				var15 = this.field1086[0];
			} else if (var11 == 1) {
				var15 = this.field1085[0];
			}

			for (int var14 = 1; var14 < 4; ++var14) {
				if (var11 == 0) {
					if (this.field1086[var14] < var15) {
						var10 = var14;
						var15 = this.field1086[var14];
					}
				} else if (var11 == 1 && this.field1085[var14] < var15) {
					var10 = var14;
					var15 = this.field1085[var14];
				}
			}

			if (var11 == 1 && var15 >= var2) {
				return;
			}
		} else {
			if (var8) {
				this.field1083 = 0;
			}

			for (var15 = 0; var15 < 4; ++var15) {
				byte var16 = this.field1083;
				this.field1083 = (byte)((this.field1083 + 1) % 4);
				if (this.field1086[var16] <= var5) {
					var10 = var16;
					break;
				}
			}
		}

		if (var10 >= 0) {
			this.field1084[var10] = var1;
			this.field1085[var10] = var2;
			this.field1087[var10] = var3;
			this.field1097[var10] = var4;
			this.field1086[var10] = var6 + var12 + var5;
		}
	}

	public final void method2310(int var1, int var2, int var3, int var4, int var5, int var6) {
		Class194 var9 = (Class194)Class194.field1992.method5993((long)var1);
		Class194 var8;
		if (var9 != null) {
			var8 = var9;
		} else {
			byte[] var10 = Client.field1997.method7216(33, var1);
			var9 = new Class194();
			var9.field2000 = var1;
			if (var10 != null) {
				var9.method3825(new Class521(var10));
			}

			Class194.field1992.method5987(var9, (long)var1);
			var8 = var9;
		}

		Class94 var15 = null;
		Class94 var11 = null;
		int var12 = var8.field1996;
		int var13 = 0;

		Class94 var14;
		for (var14 = (Class94)this.field1100.method7600(); var14 != null; var14 = (Class94)this.field1100.method7637()) {
			++var13;
			if (var14.field1253.field2000 == var8.field2000) {
				var14.method2474(var4 + var2, var5, var6, var3);
				return;
			}

			if (var14.field1253.field1994 <= var8.field1994) {
				var15 = var14;
			}

			if (var14.field1253.field1996 > var12) {
				var11 = var14;
				var12 = var14.field1253.field1996;
			}
		}

		if (var11 != null || var13 < 4) {
			var14 = new Class94(var8);
			if (var15 == null) {
				this.field1100.method7609(var14);
			} else {
				Class409.method7599(var14, var15);
			}

			var14.method2474(var4 + var2, var5, var6, var3);
			if (var13 >= 4) {
				var11.method9277();
			}

		}
	}

	public final void method2339(int var1) {
		Class194 var4 = (Class194)Class194.field1992.method5993((long)var1);
		Class194 var3;
		if (var4 != null) {
			var3 = var4;
		} else {
			byte[] var5 = Client.field1997.method7216(33, var1);
			var4 = new Class194();
			var4.field2000 = var1;
			if (var5 != null) {
				var4.method3825(new Class521(var5));
			}

			Class194.field1992.method5987(var4, (long)var1);
			var3 = var4;
		}

		for (Class94 var6 = (Class94)this.field1100.method7600(); var6 != null; var6 = (Class94)this.field1100.method7637()) {
			if (var6.field1253 == var3) {
				var6.method9277();
				return;
			}
		}

	}

	public void method2331(int var1, int var2, int var3, int var4) {
		int var6 = var4 + Client.field778;
		Class485 var7 = (Class485)this.field1082.method9326((long)var1);
		if (var7 != null) {
			var7.method9277();
			--this.field1106;
		}

		if (var2 != 65535 && var2 != -1) {
			byte var8 = 0;
			if (var4 > 0) {
				var8 = -1;
			}

			this.field1082.method9333(new Class485(var2, var3, var6, var8), (long)var1);
			++this.field1106;
		}
	}

	public Class515 method2313() {
		return this.field1082;
	}

	public void method2314() {
		Class495 var2 = new Class495(this.field1082);

		for (Class485 var3 = (Class485)var2.method8982(); var3 != null; var3 = (Class485)var2.next()) {
			var3.method9277();
		}

		this.field1106 = 0;
	}

	public Class262 method2338(Class262 var1) {
		if (0 == this.field1106) {
			return var1;
		} else {
			Class495 var3 = new Class495(this.field1082);
			int var4 = var1.field2849;
			int var5 = var1.field2853;
			int var6 = var1.field2904;
			byte var7 = var1.field2890;

			for (Class485 var8 = (Class485)var3.method8982(); var8 != null; var8 = (Class485)var3.next()) {
				if (var8.field4965 != -1) {
					Class262 var9 = Class224.method4163(var8.field4964).method4228();
					if (var9 != null) {
						var4 += var9.field2849;
						var5 += var9.field2853;
						var6 += var9.field2904;
					}
				}
			}

			Class262 var11 = new Class262(var4, var5, var6, var7);
			var11.method5284(var1);

			for (Class485 var12 = (Class485)var3.method8982(); var12 != null; var12 = (Class485)var3.next()) {
				if (var12.field4965 != -1) {
					Class262 var10 = Class224.method4163(var12.field4964).method4227(var12.field4965);
					if (var10 != null) {
						var10.method5189(0, -var12.field4967, 0);
						var11.method5284(var10);
					}
				}
			}

			return var11;
		}
	}

	public void method2334() {
		this.field1095 = false;
		this.field1055 = -1;
		this.field1093 = -1;
		this.field1094 = -1;
	}

	public int method2199() {
		return this.field1065;
	}

	public int method2191() {
		return this.field1126;
	}

	public int method2193() {
		return Client.field3857.field1300;
	}
}
