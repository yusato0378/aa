// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal.purchase;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class zzl
{

    public static PublicKey zzW(String s)
    {
        try
        {
            s = Base64.decode(s, 0);
            s = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(s));
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zzb.zzak("Invalid key specification.");
            throw new IllegalArgumentException(s);
        }
        return s;
    }

    public static boolean zza(PublicKey publickey, String s, String s1)
    {
label0:
        {
            try
            {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publickey);
                signature.update(s.getBytes());
                if(signature.verify(Base64.decode(s1, 0)))
                    break label0;
                zzb.zzak("Signature verification failed.");
            }
            // Misplaced declaration of an exception variable
            catch(PublicKey publickey)
            {
                zzb.zzak("NoSuchAlgorithmException.");
                return false;
            }
            // Misplaced declaration of an exception variable
            catch(PublicKey publickey)
            {
                zzb.zzak("Invalid key specification.");
                return false;
            }
            // Misplaced declaration of an exception variable
            catch(PublicKey publickey)
            {
                zzb.zzak("Signature exception.");
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean zzc(String s, String s1, String s2)
    {
        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || TextUtils.isEmpty(s2))
        {
            zzb.zzak("Purchase verification failed: missing data.");
            return false;
        } else
        {
            return zza(zzW(s), s1, s2);
        }
    }
}
