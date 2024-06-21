import io.runebox.ObfInfo;
import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

public class Class191 {
	@ObfInfo(name = "ay", desc = "Lhi;")
	public static final Class191 field1957;
	@ObfInfo(name = "at", desc = "Las;")
	public Class19 field1959;
	@ObfInfo(name = "aa", desc = "Lae;")
	public Class5 field1972;
	@ObfInfo(name = "au", desc = "Z")
	public boolean field1970;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -188287101)
	public int field1963;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1776795307)
	public int field1967;
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public String field1958;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	public String field1960;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field1965;
	@ObfInfo(name = "aj", desc = "Ljava/lang/String;")
	public String field1966;
	@ObfInfo(name = "ax", desc = "Ljava/lang/String;")
	public String field1968;
	@ObfInfo(name = "af", desc = "J", longMultiplier = 1590826231487001329L)
	public long field1961;
	@ObfInfo(name = "ab", desc = "I")
	public final int field1964;
	@ObfInfo(name = "ac", desc = "I")
	public final int field1969;

	static {
		field1957 = new Class191();
	}

	public Class191() {
		this.field1965 = "";
		this.field1958 = "";
		this.field1966 = "";
		this.field1960 = "";
		this.field1961 = -1L;
		this.field1964 = 1;
		this.field1969 = 2;
		this.field1963 = 1;
		this.field1967 = 0;
	}

	@ObfInfo(name = "al", desc = "(ILjava/lang/String;I)V")
	public void method3719(int var1, String var2) {
		this.field1967 = var1;
		this.field1968 = var2;
	}

	@ObfInfo(name = "aj", desc = "(ZB)V")
	public void method3720(boolean var1) {
		this.field1970 = var1;
		this.field1972 = new Class5("crmsession", 1, 1);
	}

	@ObfInfo(name = "az", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", opaque = "863389078")
	public void method3751(String var1, String var2, String var3) {
		if (this.field1963 != 2) {
			this.field1965 = var1;
			this.field1958 = var2;
			this.field1966 = var3;
			if (!this.field1965.endsWith("/")) {
				this.field1965 = this.field1965 + "/";
			}

			if (!this.field1958.equals("")) {
				String var5 = this.field1965;
				var5 = var5 + "session/open/" + this.field1958;
				if (this.field1966.equals("")) {
				}

				var5 = var5 + "?userHash=" + this.field1966;

				try {
					this.field1959 = this.method3728(var5);
					this.field1961 = Class130.method3047();
				} catch (IOException var7) {
					this.field1959 = null;
					this.field1958 = "";
					this.field1966 = "";
				}

			}
		}
	}

	@ObfInfo(name = "af", desc = "(B)V", opaque = "0")
	public void method3722() {
		if (this.field1959 == null) {
			if (!this.field1960.isEmpty() && this.field1963 == 1) {
				long var2 = Class130.method3047();
				long var4 = var2 - this.field1961;
				String var6 = this.field1965;
				var6 = var6 + "session/close/" + this.field1958 + "/" + this.field1960;
				if (this.field1966.isEmpty()) {
					var6 = var6 + "?sessionDuration=" + var4;
				} else {
					var6 = var6 + "?userHash=" + this.field1966 + "&sessionDuration=" + var4;
				}

				try {
					this.field1959 = this.method3728(var6);
				} catch (IOException var8) {
					this.field1963 = 1;
				}
			}

		}
	}

	@ObfInfo(name = "aa", desc = "(B)V", opaque = "10")
	public void method3725() {
		if (this.field1972 != null) {
			this.field1972.method60();
		}

	}

	@ObfInfo(name = "at", desc = "(I)V", opaque = "-307302726")
	public void method3724() {
		if (!this.field1960.isEmpty()) {
			String var2 = "";
			switch(this.field1967) {
			case 1:
				var2 = "events/click";
				break;
			case 2:
				var2 = "events/dismissed";
				break;
			case 3:
				var2 = "events/impression";
			}

			if (!this.field1968.isEmpty()) {
				String var3 = this.field1965;
				var3 = var3 + var2 + "/" + this.field1958 + "/" + this.field1960 + "/" + this.field1968 + "?userHash=" + this.field1966;

				try {
					this.field1959 = this.method3728(var3);
				} catch (IOException var5) {
					this.field1963 = 1;
				}

				this.field1963 = 1;
				this.field1967 = 0;
			}
		}
	}

	@ObfInfo(name = "ab", desc = "(I)V", opaque = "1338108255")
	public void method3731() {
		if (this.field1959 != null && this.field1959.method279()) {
			if (this.field1959.method279() && this.field1959.method285().method46() == 200 && this.field1960.isEmpty()) {
				String var2 = this.field1959.method285().method48();
				if (var2.isEmpty()) {
					return;
				}

				this.field1960 = var2;
			}

			if (0 != this.field1967) {
				this.method3724();
			}

		}
	}

	@ObfInfo(name = "ac", desc = "(Ljava/lang/String;B)Z")
	public boolean method3743(String var1) {
		this.method3719(2, var1);
		return true;
	}

	@ObfInfo(name = "ao", desc = "(Ljava/lang/String;I)Las;")
	public Class19 method3728(String var1) throws IOException {
		URL var3 = new URL(var1);
		Class8 var4 = new Class8(var3, Class15.field72, this.field1970);

		try {
			JSONObject var5 = new JSONObject();
			var4.method125(new Class490(var5));
		} catch (Exception var6) {
		}

		return this.field1972.method57(var4);
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/CharSequence;Lux;I)Ljava/lang/String;", opaque = "1877038198")
	public static String method3754(CharSequence var0, Class544 var1) {
		if (var0 == null) {
			return null;
		} else {
			int var3 = 0;

			int var4;
			boolean var5;
			char var6;
			for (var4 = var0.length(); var3 < var4; ++var3) {
				var6 = var0.charAt(var3);
				var5 = var6 == 160 || var6 == ' ' || var6 == '_' || var6 == '-';
				if (!var5) {
					break;
				}
			}

			while (var4 > var3) {
				var6 = var0.charAt(var4 - 1);
				var5 = var6 == 160 || var6 == ' ' || var6 == '_' || var6 == '-';
				if (!var5) {
					break;
				}

				--var4;
			}

			int var13 = var4 - var3;
			if (var13 >= 1) {
				byte var7;
				if (var1 == null) {
					var7 = 12;
				} else {
					switch(var1.field5323) {
					case 5:
						var7 = 20;
						break;
					default:
						var7 = 12;
					}
				}

				if (var13 <= var7) {
					StringBuilder var14 = new StringBuilder(var13);

					for (int var15 = var3; var15 < var4; ++var15) {
						char var8 = var0.charAt(var15);
						boolean var9;
						if (Character.isISOControl(var8)) {
							var9 = false;
						} else if (Class412.method2605(var8)) {
							var9 = true;
						} else {
							char[] var10 = Class527.field5236;
							int var11 = 0;

							label104:
							while (true) {
								char var12;
								if (var11 >= var10.length) {
									var10 = Class527.field5238;

									for (var11 = 0; var11 < var10.length; ++var11) {
										var12 = var10[var11];
										if (var12 == var8) {
											var9 = true;
											break label104;
										}
									}

									var9 = false;
									break;
								}

								var12 = var10[var11];
								if (var12 == var8) {
									var9 = true;
									break;
								}

								++var11;
							}
						}

						if (var9) {
							char var16;
							switch(var8) {
							case ' ':
							case '-':
							case '_':
							case '\u00a0':
								var16 = '_';
								break;
							case '#':
							case '[':
							case ']':
								var16 = var8;
								break;
							case '\u00c0':
							case '\u00c1':
							case '\u00c2':
							case '\u00c3':
							case '\u00c4':
							case '\u00e0':
							case '\u00e1':
							case '\u00e2':
							case '\u00e3':
							case '\u00e4':
								var16 = 'a';
								break;
							case '\u00c7':
							case '\u00e7':
								var16 = 'c';
								break;
							case '\u00c8':
							case '\u00c9':
							case '\u00ca':
							case '\u00cb':
							case '\u00e8':
							case '\u00e9':
							case '\u00ea':
							case '\u00eb':
								var16 = 'e';
								break;
							case '\u00cd':
							case '\u00ce':
							case '\u00cf':
							case '\u00ed':
							case '\u00ee':
							case '\u00ef':
								var16 = 'i';
								break;
							case '\u00d1':
							case '\u00f1':
								var16 = 'n';
								break;
							case '\u00d2':
							case '\u00d3':
							case '\u00d4':
							case '\u00d5':
							case '\u00d6':
							case '\u00f2':
							case '\u00f3':
							case '\u00f4':
							case '\u00f5':
							case '\u00f6':
								var16 = 'o';
								break;
							case '\u00d9':
							case '\u00da':
							case '\u00db':
							case '\u00dc':
							case '\u00f9':
							case '\u00fa':
							case '\u00fb':
							case '\u00fc':
								var16 = 'u';
								break;
							case '\u00df':
								var16 = 'b';
								break;
							case '\u00ff':
							case '\u0178':
								var16 = 'y';
								break;
							default:
								var16 = Character.toLowerCase(var8);
							}

							if (var16 != 0) {
								var14.append(var16);
							}
						}
					}

					if (var14.length() == 0) {
						return null;
					}

					return var14.toString();
				}
			}

			return null;
		}
	}

	@ObfInfo(owner = "gp", name = "ak", desc = "(I)Lhi;")
	public static Class191 method3562() {
		return field1957;
	}
}
