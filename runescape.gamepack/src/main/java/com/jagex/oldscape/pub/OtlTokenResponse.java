package com.jagex.oldscape.pub;

import io.runebox.ObfInfo;

public interface OtlTokenResponse {
	@ObfInfo(desc = "()Z")
	boolean isSuccess();

	@ObfInfo(desc = "()Ljava/lang/String;")
	String getToken();
}
