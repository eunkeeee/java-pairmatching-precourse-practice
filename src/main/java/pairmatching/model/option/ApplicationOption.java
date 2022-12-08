package pairmatching.model.option;

import java.util.Arrays;
import pairmatching.util.message.ExceptionMessage;

public enum ApplicationOption {
    PAIR_MATCHING("1"),
    PAIR_SEARCHING("2"),
    PAIR_INITIALIZING("3"),
    QUIT("Q");

    private final String command;

    ApplicationOption(String command) {
        this.command = command;
    }

    public static ApplicationOption from(String command) {
        return Arrays.stream(ApplicationOption.values())
                .filter(element -> element.command.equals(command))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(
                        ExceptionMessage.INVALID_NO_APPLICATION_OPTION.getMessage()));
    }
}
