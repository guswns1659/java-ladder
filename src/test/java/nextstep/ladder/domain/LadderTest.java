package nextstep.ladder.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    @Test
    void init() {
        Ladder ladder = Ladder.init(3, Height.of(3));
        assertThat(ladder.lines()).hasSize(3);
    }
}
