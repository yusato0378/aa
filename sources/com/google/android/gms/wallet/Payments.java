// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, MaskedWalletRequest, NotifyTransactionStatusRequest

public interface Payments
{

    public abstract void changeMaskedWallet(GoogleApiClient googleapiclient, String s, String s1, int i);

    public abstract void checkForPreAuthorization(GoogleApiClient googleapiclient, int i);

    public abstract void isNewUser(GoogleApiClient googleapiclient, int i);

    public abstract void loadFullWallet(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i);

    public abstract void loadMaskedWallet(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i);

    public abstract void notifyTransactionStatus(GoogleApiClient googleapiclient, NotifyTransactionStatusRequest notifytransactionstatusrequest);
}
