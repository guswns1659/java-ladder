package nextstep.ladder.exception;

public enum LadderExceptionCode {
    INVAILD_NAME_LENGTH("이름은 0~5글자 사이어야 합니다."),
    INVAILD_LADDER_HEIGHT("사다리 높이는 1이상이어야 합니다."),
    FAIL_LADDER_INITIALIZATION("사다리는 라인과 높이가 1이상이어야 합니다.");
    
    private final String message;

    LadderExceptionCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
