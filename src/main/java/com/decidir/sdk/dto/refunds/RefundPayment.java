package com.decidir.sdk.dto.refunds;

import com.decidir.sdk.dto.payments.pci.CardTrackInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * Created by biandra on 05/10/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RefundPayment implements Serializable {

    private Long amount;
    private List<RefundSubPayment> sub_payments;
    private CardTrackInfo card_track_info;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public List<RefundSubPayment> getSub_payments() {
        return sub_payments;
    }

    public void setSub_payments(List<RefundSubPayment> sub_payments) {
        this.sub_payments = sub_payments;
    }

    public CardTrackInfo getCard_track_info() {
        return card_track_info;
    }

    public void setCard_track_info(CardTrackInfo card_track_info) {
        this.card_track_info = card_track_info;
    }
}
