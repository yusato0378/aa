// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush;

import android.content.Context;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.growthpush.handler.DefaultReceiveHandler;
import com.growthpush.handler.ReceiveHandler;
import com.growthpush.model.Client;
import com.growthpush.model.Environment;
import com.growthpush.model.Event;
import com.growthpush.model.Tag;
import com.growthpush.utils.DeviceUtils;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.growthpush:
//            Logger, Preference, GrowthPushException, Thread

public class GrowthPush
{

    private GrowthPush()
    {
        logger = new Logger();
        client = null;
        semaphore = new Semaphore(1);
        latch = new CountDownLatch(1);
        receiveHandler = new DefaultReceiveHandler();
        context = null;
        environment = null;
    }

    private void clearClient()
    {
        client = null;
        Preference.getInstance().deleteClient();
        Preference.getInstance().deleteTags();
    }

    private void createClient(String s)
    {
        try
        {
            logger.info(String.format("Registering client... (applicationId: %d, environment: %s)", new Object[] {
                Integer.valueOf(applicationId), environment
            }));
            client = (new Client(s, environment)).save(this);
            logger.info(String.format("Registering client success (clientId: %d)", new Object[] {
                Long.valueOf(client.getId())
            }));
            logger.info(String.format("See https://growthpush.com/applications/%d/clients to check the client registration.", new Object[] {
                Integer.valueOf(applicationId)
            }));
            Preference.getInstance().saveClient(client);
            latch.countDown();
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            logger.error(String.format("Registering client fail. %s", new Object[] {
                s.getMessage()
            }));
        }
    }

    public static GrowthPush getInstance()
    {
        return instance;
    }

    private void updateClient(String s)
    {
        try
        {
            logger.info(String.format("Updating client... (applicationId: %d, token: %s, environment: %s)", new Object[] {
                Integer.valueOf(applicationId), s, environment
            }));
            client.setToken(s);
            client.setEnvironment(environment);
            client = client.update();
            logger.info(String.format("Update client success (clientId: %d)", new Object[] {
                Long.valueOf(client.getId())
            }));
            Preference.getInstance().saveClient(client);
            latch.countDown();
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            logger.error(String.format("Updating client fail. %s", new Object[] {
                s.getMessage()
            }));
        }
    }

    private void waitClientRegistration()
    {
        if(client != null)
            break MISSING_BLOCK_LABEL_14;
        latch.await();
        return;
        InterruptedException interruptedexception;
        interruptedexception;
    }

    public int getApplicationId()
    {
        return applicationId;
    }

    public Client getClient()
    {
        return client;
    }

    public Logger getLogger()
    {
        return logger;
    }

    public ReceiveHandler getReceiveHandler()
    {
        return receiveHandler;
    }

    public String getSecret()
    {
        return secret;
    }

    public GrowthPush initialize(Context context1, int i, String s)
    {
        return initialize(context1, i, s, Environment.production, false);
    }

    public GrowthPush initialize(Context context1, int i, String s, Environment environment1)
    {
        return initialize(context1, i, s, environment1, false);
    }

    public GrowthPush initialize(Context context1, int i, String s, Environment environment1, boolean flag)
    {
        if(context == null)
        {
            context = context1;
            applicationId = i;
            secret = s;
            environment = environment1;
            logger.setDebug(flag);
            Preference.getInstance().setContext(context1);
            client = Preference.getInstance().fetchClient();
            if(client != null && client.getApplicationId() != i)
            {
                clearClient();
                return this;
            }
        }
        return this;
    }

    public GrowthPush register(final String senderId)
    {
        (new Thread(new Runnable() {

            public void run()
            {
                if(context == null)
                    throw new IllegalStateException("GrowthPush is not initialized.");
                Object obj = GoogleCloudMessaging.getInstance(context);
                try
                {
                    obj = ((GoogleCloudMessaging) (obj)).register(new String[] {
                        senderId
                    });
                    registerClient(((String) (obj)));
                    return;
                }
                catch(IOException ioexception)
                {
                    return;
                }
            }

            final GrowthPush this$0;
            private final String val$senderId;

            
            {
                this$0 = GrowthPush.this;
                senderId = s;
                super();
            }
        }
)).start();
        return this;
    }

    public void registerClient(final String registrationId)
    {
        (new Thread(new Runnable() {

            public void run()
            {
                semaphore.acquire();
                client = Preference.getInstance().fetchClient();
                if(client != null && client.getApplicationId() == applicationId)
                    break MISSING_BLOCK_LABEL_75;
                createClient(registrationId);
                semaphore.release();
                return;
                if((registrationId == null || registrationId.equals(client.getToken())) && environment == client.getEnvironment())
                    break MISSING_BLOCK_LABEL_144;
                updateClient(registrationId);
                semaphore.release();
                return;
                try
                {
                    logger.info("Client already registered.");
                    latch.countDown();
                }
                catch(InterruptedException interruptedexception)
                {
                    semaphore.release();
                    return;
                }
                semaphore.release();
                return;
                Exception exception;
                exception;
                semaphore.release();
                throw exception;
            }

            final GrowthPush this$0;
            private final String val$registrationId;

            
            {
                this$0 = GrowthPush.this;
                registrationId = s;
                super();
            }
        }
)).start();
    }

    public void setDeviceTags()
    {
        (new Thread(new Runnable() {

            public void run()
            {
                if(context == null)
                {
                    throw new IllegalStateException("GrowthPush is not initialized.");
                } else
                {
                    setTag("Device", DeviceUtils.getDevice());
                    setTag("OS", DeviceUtils.getOs());
                    setTag("Language", DeviceUtils.getLanguage());
                    setTag("Time Zone", DeviceUtils.getTimeZone());
                    setTag("Version", DeviceUtils.getVersion(context));
                    setTag("Build", DeviceUtils.getBuild(context));
                    return;
                }
            }

            final GrowthPush this$0;

            
            {
                this$0 = GrowthPush.this;
                super();
            }
        }
)).start();
    }

    public void setReceiveHandler(ReceiveHandler receivehandler)
    {
        receiveHandler = receivehandler;
    }

    public void setTag(String s)
    {
        setTag(s, null);
    }

    public void setTag(final String name, final String value)
    {
        (new Thread(new Runnable() {

            public void run()
            {
                if(name == null)
                {
                    logger.warning("Tag name cannot be null.");
                } else
                {
                    Tag tag = Preference.getInstance().fetchTag(name);
                    if(tag == null || !value.equalsIgnoreCase(tag.getValue()))
                    {
                        waitClientRegistration();
                        logger.info(String.format("Sending tag... (key: %s, value: %s)", new Object[] {
                            name, value
                        }));
                        try
                        {
                            Tag tag1 = (new Tag(name, value)).save(GrowthPush.this);
                            logger.info(String.format("Sending tag success", new Object[0]));
                            Preference.getInstance().saveTag(tag1);
                            return;
                        }
                        catch(GrowthPushException growthpushexception)
                        {
                            logger.error(String.format("Sending tag fail. %s", new Object[] {
                                growthpushexception.getMessage()
                            }));
                        }
                        return;
                    }
                }
            }

            final GrowthPush this$0;
            private final String val$name;
            private final String val$value;

            
            {
                this$0 = GrowthPush.this;
                name = s;
                value = s1;
                super();
            }
        }
)).start();
    }

    public void trackEvent(String s)
    {
        trackEvent(s, null);
    }

    public void trackEvent(final String name, final String value)
    {
        (new Thread(new Runnable() {

            public void run()
            {
                if(name == null)
                {
                    logger.warning("Event name cannot be null.");
                    return;
                }
                waitClientRegistration();
                logger.info(String.format("Sending event ... (name: %s)", new Object[] {
                    name
                }));
                try
                {
                    Event event = (new Event(name, value)).save(GrowthPush.this);
                    logger.info(String.format("Sending event success. (timestamp: %s)", new Object[] {
                        Long.valueOf(event.getTimeStamp())
                    }));
                    return;
                }
                catch(GrowthPushException growthpushexception)
                {
                    logger.error(String.format("Sending event fail. %s", new Object[] {
                        growthpushexception.getMessage()
                    }));
                }
            }

            final GrowthPush this$0;
            private final String val$name;
            private final String val$value;

            
            {
                this$0 = GrowthPush.this;
                name = s;
                value = s1;
                super();
            }
        }
)).start();
    }

    public static final String BASE_URL = "https://api.growthpush.com/";
    private static final GrowthPush instance = new GrowthPush();
    private int applicationId;
    private Client client;
    private Context context;
    private Environment environment;
    private CountDownLatch latch;
    private Logger logger;
    private ReceiveHandler receiveHandler;
    private String secret;
    private Semaphore semaphore;












}
