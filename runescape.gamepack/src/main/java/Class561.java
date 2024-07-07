import io.runebox.ObfInfo;

@ObfInfo(name = "vo")
public class Class561 implements Comparable {
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public String field5467;
	@ObfInfo(name = "aq", desc = "Ljava/lang/String;")
	public String field5468;

	public Class561(String var1) {
		this.field5468 = var1;
		Class541 var4 = Class541.field5320;
		String var3;
		if (var1 == null) {
			var3 = null;
		} else {
			label155: {
				int var5 = 0;

				int var6;
				boolean var7;
				char var8;
				for (var6 = var1.length(); var5 < var6; ++var5) {
					var8 = var1.charAt(var5);
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
					if (!var7) {
						break;
					}
				}

				while (var6 > var5) {
					var8 = var1.charAt(var6 - 1);
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
					if (!var7) {
						break;
					}

					--var6;
				}

				int var15 = var6 - var5;
				if (var15 >= 1) {
					byte var9;
					if (var4 == null) {
						var9 = 12;
					} else {
						switch(var4.field5316) {
						case 0:
							var9 = 20;
							break;
						default:
							var9 = 12;
						}
					}

					if (var15 <= var9) {
						StringBuilder var16 = new StringBuilder(var15);

						for (int var17 = var5; var17 < var6; ++var17) {
							char var10 = var1.charAt(var17);
							boolean var11;
							if (Character.isISOControl(var10)) {
								var11 = false;
							} else if (Class413.method3588(var10)) {
								var11 = true;
							} else {
								char[] var12 = Class543.field5326;
								int var13 = 0;

								label108:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = Class543.field5325;

										for (var13 = 0; var13 < var12.length; ++var13) {
											var14 = var12[var13];
											if (var14 == var10) {
												var11 = true;
												break label108;
											}
										}

										var11 = false;
										break;
									}

									var14 = var12[var13];
									if (var14 == var10) {
										var11 = true;
										break;
									}

									++var13;
								}
							}

							if (var11) {
								char var18;
								switch(var10) {
								case ' ':
								case '-':
								case '_':
								case '\u00a0':
									var18 = '_';
									break;
								case '#':
								case '[':
								case ']':
									var18 = var10;
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
									var18 = 'a';
									break;
								case '\u00c7':
								case '\u00e7':
									var18 = 'c';
									break;
								case '\u00c8':
								case '\u00c9':
								case '\u00ca':
								case '\u00cb':
								case '\u00e8':
								case '\u00e9':
								case '\u00ea':
								case '\u00eb':
									var18 = 'e';
									break;
								case '\u00cd':
								case '\u00ce':
								case '\u00cf':
								case '\u00ed':
								case '\u00ee':
								case '\u00ef':
									var18 = 'i';
									break;
								case '\u00d1':
								case '\u00f1':
									var18 = 'n';
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
									var18 = 'o';
									break;
								case '\u00d9':
								case '\u00da':
								case '\u00db':
								case '\u00dc':
								case '\u00f9':
								case '\u00fa':
								case '\u00fb':
								case '\u00fc':
									var18 = 'u';
									break;
								case '\u00df':
									var18 = 'b';
									break;
								case '\u00ff':
								case '\u0178':
									var18 = 'y';
									break;
								default:
									var18 = Character.toLowerCase(var10);
								}

								if (var18 != 0) {
									var16.append(var18);
								}
							}
						}

						if (var16.length() == 0) {
							var3 = null;
						} else {
							var3 = var16.toString();
						}
						break label155;
					}
				}

				var3 = null;
			}
		}

		this.field5467 = var3;
	}

	public Class561(String var1, Class541 var2) {
		this.field5468 = var1;
		this.field5467 = Class543.method8952(var1, var2);
	}

	@ObfInfo(name = "aq", desc = "(I)Ljava/lang/String;")
	public String method9789() {
		return this.field5468;
	}

	@ObfInfo(name = "ad", desc = "(I)Ljava/lang/String;")
	public String method9790() {
		return this.field5467;
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "476820634")
	public boolean method9801() {
		return this.field5467 != null;
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Class561) {
			Class561 var2 = (Class561)var1;
			if (this.field5467 == null) {
				return var2.field5467 == null;
			} else if (var2.field5467 == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.field5467.equals(var2.field5467);
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.field5467 == null ? 0 : this.field5467.hashCode();
	}

	public String toString() {
		return this.method9789();
	}

	@ObfInfo(name = "ap", desc = "(Lvo;I)I", opaque = "-1665938384")
	public int method9799(Class561 var1) {
		if (this.field5467 == null) {
			return var1.field5467 == null ? 0 : 1;
		} else {
			return var1.field5467 == null ? -1 : this.field5467.compareTo(var1.field5467);
		}
	}

	public int compareTo(Object var1) {
		return this.method9799((Class561)var1);
	}
}
