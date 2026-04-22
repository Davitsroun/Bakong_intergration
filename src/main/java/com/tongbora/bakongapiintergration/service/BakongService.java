package com.tongbora.bakongapiintergration.service;

import com.tongbora.bakongapiintergration.dto.BakongRequest;
import com.tongbora.bakongapiintergration.dto.BakongResponse;
import com.tongbora.bakongapiintergration.dto.CheckTransactionRequest;
import kh.gov.nbc.bakong_khqr.model.KHQRData;
import kh.gov.nbc.bakong_khqr.model.KHQRResponse;


public interface BakongService {

    KHQRResponse<KHQRData> generateQR(BakongRequest request);
    byte[] getQRImage(KHQRData qr);
    BakongResponse checkTransactionByMD5(CheckTransactionRequest request);
}
