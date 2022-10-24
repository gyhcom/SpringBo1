package com.springboot.b01.repository.search;

import com.springboot.b01.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardSearch{
    Page<Board> search1(Pageable pageable);

    Page<Board> searchAll(String[] types, String keword, Pageable pageable);
}
