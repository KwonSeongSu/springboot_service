package com.lopic.boot.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "Test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        // as 이용 시 [Lombok Name Test] expected:<"Test[1]"> but was:<"Test[]"> 와 같은 설명 문구 추가쌕ㄷㅁ
        assertThat(dto.getName()).as("Lombok Name Test").isEqualTo("Test");
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
