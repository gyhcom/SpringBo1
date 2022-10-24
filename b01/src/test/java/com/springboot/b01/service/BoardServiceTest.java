package com.springboot.b01.service;

import com.springboot.b01.dto.BoardDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class BoardServiceTest {

    @Autowired
    private BoardService boardService;


    @Test
    public void testRegister(){
        log.info(boardService.getClass().getName());
        BoardDTO boardDTO = BoardDTO.builder()
                .title("Sample Title....")
                .content("Sample Content...")
                .writer("user00")
                .build();

        Long bno = boardService.register(boardDTO);
        log.info("bno:" + bno);
    }

    @Test
    public void testModify() {
        log.info(boardService.getClass().getName());
        BoardDTO boardDTO = BoardDTO.builder()
                .bno(101L)
                .title("수정 했습니다.")
                .content("수정 내용입니다.")
                .build();

        boardService.modify(boardDTO);
    }
}