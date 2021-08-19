package classwork.enums;

import lombok.Data;

@Data
public class HttpService {
    private HttpCode httpCode;

    public void handleHttpCode(int incHttpCode) {
        httpCode = HttpCode.findByCode(incHttpCode);
        HttpLogicApplier.applyLogic(httpCode);
    }

    public static void main(String[] args) {
        HttpService httpService = new HttpService();
        httpService.handleHttpCode(250);
    }
}