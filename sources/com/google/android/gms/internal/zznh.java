// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzni

public class zznh
    implements Payments
{

    public zznh()
    {
    }

    public void changeMaskedWallet(GoogleApiClient googleapiclient, String s, String s1, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, s, s1, i) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzni)zza1);
            }

            protected void zza(zzni zzni1)
            {
                zzni1.zze(zzaKd, zzaKe, zzapk);
                setResult(Status.zzQU);
            }

            final zznh zzaKa;
            final String zzaKd;
            final String zzaKe;
            final int zzapk;

            
            {
                zzaKa = zznh.this;
                zzaKd = s;
                zzaKe = s1;
                zzapk = i;
                super(googleapiclient);
            }
        }
);
    }

    public void checkForPreAuthorization(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, i) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzni)zza1);
            }

            protected void zza(zzni zzni1)
            {
                zzni1.zzim(zzapk);
                setResult(Status.zzQU);
            }

            final zznh zzaKa;
            final int zzapk;

            
            {
                zzaKa = zznh.this;
                zzapk = i;
                super(googleapiclient);
            }
        }
);
    }

    public void isNewUser(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, i) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzni)zza1);
            }

            protected void zza(zzni zzni1)
            {
                zzni1.zzin(zzapk);
                setResult(Status.zzQU);
            }

            final zznh zzaKa;
            final int zzapk;

            
            {
                zzaKa = zznh.this;
                zzapk = i;
                super(googleapiclient);
            }
        }
);
    }

    public void loadFullWallet(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, fullwalletrequest, i) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzni)zza1);
            }

            protected void zza(zzni zzni1)
            {
                zzni1.zza(zzaKc, zzapk);
                setResult(Status.zzQU);
            }

            final zznh zzaKa;
            final FullWalletRequest zzaKc;
            final int zzapk;

            
            {
                zzaKa = zznh.this;
                zzaKc = fullwalletrequest;
                zzapk = i;
                super(googleapiclient);
            }
        }
);
    }

    public void loadMaskedWallet(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, maskedwalletrequest, i) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzni)zza1);
            }

            protected void zza(zzni zzni1)
            {
                zzni1.zza(zzaKb, zzapk);
                setResult(Status.zzQU);
            }

            final zznh zzaKa;
            final MaskedWalletRequest zzaKb;
            final int zzapk;

            
            {
                zzaKa = zznh.this;
                zzaKb = maskedwalletrequest;
                zzapk = i;
                super(googleapiclient);
            }
        }
);
    }

    public void notifyTransactionStatus(GoogleApiClient googleapiclient, NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, notifytransactionstatusrequest) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzni)zza1);
            }

            protected void zza(zzni zzni1)
            {
                zzni1.zza(zzaKf);
                setResult(Status.zzQU);
            }

            final zznh zzaKa;
            final NotifyTransactionStatusRequest zzaKf;

            
            {
                zzaKa = zznh.this;
                zzaKf = notifytransactionstatusrequest;
                super(googleapiclient);
            }
        }
);
    }
}
