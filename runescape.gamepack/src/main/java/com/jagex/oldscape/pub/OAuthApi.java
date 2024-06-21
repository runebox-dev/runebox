package com.jagex.oldscape.pub;

import io.runebox.ObfInfo;

public interface OAuthApi {
	@ObfInfo(name = "isOnLoginScreen", desc = "()Z")
	boolean isOnLoginScreen();

	@ObfInfo(name = "getAccountHash", desc = "()J")
	long getAccountHash();

	@ObfInfo(name = "setClient", desc = "(I)V")
	void setClient(int var1);

	@ObfInfo(name = "setOtlTokenRequester", desc = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V")
	void setOtlTokenRequester(OtlTokenRequester var1);

	@ObfInfo(name = "setRefreshTokenRequester", desc = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V")
	void setRefreshTokenRequester(RefreshAccessTokenRequester var1);
}
