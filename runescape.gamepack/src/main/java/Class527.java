import io.runebox.ObfInfo;

@ObfInfo(name = "ug")
public class Class527 {
	@ObfInfo(name = "aj", desc = "[C")
	public static final char[] field5236;
	@ObfInfo(name = "az", desc = "[C")
	public static final char[] field5238;

	static {
		field5236 = new char[]{' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df'};
		field5238 = new char[]{'[', ']', '#'};
	}

	@ObfInfo(desc = "(Ljava/lang/CharSequence;LClass544;)Ljava/lang/String;")
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
							char[] var10 = field5236;
							int var11 = 0;

							label105:
							while (true) {
								char var12;
								if (var11 >= var10.length) {
									var10 = field5238;

									for (var11 = 0; var11 < var10.length; ++var11) {
										var12 = var10[var11];
										if (var12 == var8) {
											var9 = true;
											break label105;
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

	@ObfInfo(desc = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String method3137(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}
}
