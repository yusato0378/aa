// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.util;

import android.text.TextUtils;
import android.util.Log;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

// Referenced classes of package jp.co.cyberagent.gn.plugin.util:
//            Base64DecoderException, Base64

public class Security
{

    public Security()
    {
    }

    public static PublicKey generatePublicKey(String s)
    {
        try
        {
            s = Base64.decode(s);
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
            Log.e("Plugin/Util/Security", "Invalid key specification.");
            throw new IllegalArgumentException(s);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            Log.e("Plugin/Util/Security", "Base64 decoding failed.");
            throw new IllegalArgumentException(s);
        }
        return s;
    }

    public static boolean verify(PublicKey publickey, String s, String s1)
    {
label0:
        {
            try
            {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publickey);
                signature.update(s.getBytes());
                if(signature.verify(Base64.decode(s1)))
                    break label0;
                Log.e("Plugin/Util/Security", "Signature verification failed.");
            }
            // Misplaced declaration of an exception variable
            catch(PublicKey publickey)
            {
                Log.e("Plugin/Util/Security", "NoSuchAlgorithmException.");
                return false;
            }
            // Misplaced declaration of an exception variable
            catch(PublicKey publickey)
            {
                Log.e("Plugin/Util/Security", "Invalid key specification.");
                return false;
            }
            // Misplaced declaration of an exception variable
            catch(PublicKey publickey)
            {
                Log.e("Plugin/Util/Security", "Signature exception.");
                return false;
            }
            // Misplaced declaration of an exception variable
            catch(PublicKey publickey)
            {
                Log.e("Plugin/Util/Security", "Base64 decoding failed.");
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean verifyWithBase64Key(String s, String s1, String s2)
    {
        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || TextUtils.isEmpty(s2))
        {
            Log.e("Plugin/Util/Security", "Purchase verification failed: missing data.");
            return false;
        } else
        {
            return verify(generatePublicKey(s), s1, s2);
        }
    }

    private static final String KEY_FACTORY_ALGORITHM = "RSA";
    private static final String SIGNATURE_ALGORITHM = "SHA1withRSA";
    private static final String TAG = "Plugin/Util/Security";
}
