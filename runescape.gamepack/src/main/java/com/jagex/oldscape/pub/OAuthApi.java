package com.jagex.oldscape.pub;

import io.runebox.ObfInfo;

public interface OAuthApi {
	@ObfInfo(desc = "()Z")
	boolean isOnLoginScreen();

	@ObfInfo(desc = "()J")
	long getAccountHash();

	@ObfInfo(desc = "(I)V")
	void setClient(int var1);

	@ObfInfo(desc = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V")
	void setOtlTokenRequester(OtlTokenRequester var1);

	@ObfInfo(desc = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V")
	void setRefreshTokenRequester(RefreshAccessTokenRequester var1);
}
