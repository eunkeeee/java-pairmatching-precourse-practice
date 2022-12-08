package pairmatching.util.message;

import javax.xml.validation.Validator;

public enum ExceptionMessage {
    INVALID_NO_APPLICATION_OPTION("올바른 옵션을 선택해 주세요."),
    INVALID_NOT_NUMERIC("자연수만 입력 가능합니다."),
    INVALID_OUT_OF_INT_RANGE("입력 범위를 초과하였습니다.");
    public static final String BASE_MESSAGE = "[ERROR] %s";
    private final String message;

    ExceptionMessage(String message, Object... replaces) {
        this.message = String.format(BASE_MESSAGE, String.format(message, replaces));
    }

    public String getMessage() {
        return message;
    }
}
