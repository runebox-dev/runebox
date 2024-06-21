package com.jagex.oldscape.pub;

import io.runebox.ObfInfo;

public interface OtlTokenResponse {
	@ObfInfo(name = "isSuccess", desc = "()Z")
	boolean isSuccess();

	@ObfInfo(name = "getToken", desc = "()Ljava/lang/String;")
	String getToken();
}
