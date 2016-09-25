package com.example.nilays.chatwithall.gcm;

import com.example.nilays.chatwithall.utils.Consts;
import com.quickblox.sample.core.gcm.CoreGcmPushInstanceIDService;

public class GcmPushInstanceIDService extends CoreGcmPushInstanceIDService {
    @Override
    protected String getSenderId() {
        return Consts.GCM_SENDER_ID;
    }
}
