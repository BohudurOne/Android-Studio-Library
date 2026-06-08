package bohudur.payment.sdk;

import org.json.JSONObject;

public class SuccessResponse {
    private final JSONObject responseData;

    public SuccessResponse(JSONObject responseData) {
        this.responseData = responseData;
    }

    public String getFullName() {
        try {
            return responseData.getString("full_name");
        } catch (Exception e) {
            return "Unknown Name";
        }
    }

    public String getEmail() {
        try {
            return responseData.getString("email");
        } catch (Exception e) {
            return "Unknown Email";
        }
    }

    public double getAmount() {
        try {
            return responseData.getDouble("amount");
        } catch (Exception e) {
            return 0.0;
        }
    }

    public double getConvertedAmount() {
        try {
            return responseData.getDouble("converted_amount");
        } catch (Exception e) {
            return 0.0;
        }
    }

    public double getTotalAmount() {
        try {
            return responseData.getDouble("total_amount");
        } catch (Exception e) {
            return 0.0;
        }
    }

    public String getTransactionFee() {
        try {
            return responseData.getString("transaction_fee");
        } catch (Exception e) {
            return "Unknown Transaction Fee";
        }
    }

    public String getDefaultCurrency() {
        try {
            return responseData.getString("default_currency");
        } catch (Exception e) {
            return "Unknown Default Currency";
        }
    }
    
    public double getCurrencyValue() {
        try {
            return responseData.getDouble("currency_value");
        } catch (Exception e) {
            return 0.0;
        }
    }
    
    public String getPaymentCurrency() {
        try {
            return responseData.getString("payment_currency");
        } catch (Exception e) {
            return "Unknown Payment Currency";
        }
    }

    public String getRedirectUrl() {
        try {
            return responseData.getString("redirect_url");
        } catch (Exception e) {
            return "Unknown Redirect URL";
        }
    }

    public String getCancelUrl() {
        try {
            return responseData.getString("cancel_url");
        } catch (Exception e) {
            return "Unknown Cancelled URL";
        }
    }
    
    public String getPaymentTime() {
    	try {
            return responseData.getString("payment_time");
        } catch (Exception e) {
            return "Unknown Payment Time";
        }
    }
    
    public String getCreatedTime() {
    	try {
            return responseData.getString("payment_time");
        } catch (Exception e) {
            return "Unknown Created Time";
        }
    }

    public String getReceipt() {
    	try {
            return responseData.getString("receipt");
        } catch (Exception e) {
            return "Unknown Receipt URL";
        }
    }

    public JSONObject getPaymentInfo() {
        try {
            return responseData.getJSONObject("payment_info");
        } catch (Exception e) {
            return new JSONObject();
        }
    }

    public String getStatus() {
        try {
            return responseData.getString("status");
        } catch (Exception e) {
            return "Unknown Status";
        }
    }

    public JSONObject getMetadata() {
        try {
            return responseData.getJSONObject("metadata");
        } catch (Exception e) {
            return null;
        }
    }
}
