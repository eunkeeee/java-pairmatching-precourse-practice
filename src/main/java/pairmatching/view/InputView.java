package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.model.option.ApplicationOption;
import pairmatching.util.Util;

public class InputView {

    private enum ConsoleMessage {
        OUTPUT_APPLICATION_OPTION("기능을 선택하세요.\n"
                + "1. 페어 매칭\n"
                + "2. 페어 조회\n"
                + "3. 페어 초기화\n"
                + "Q. 종료");

        private final String message;

        ConsoleMessage(String message) {
            this.message = message;
        }
    }

    public ApplicationOption readApplicationOption() {
        try {
            System.out.println(ConsoleMessage.OUTPUT_APPLICATION_OPTION.message);
            return ApplicationOption.from(Util.removeSpace(Console.readLine()));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return readApplicationOption();
        }
    }
}