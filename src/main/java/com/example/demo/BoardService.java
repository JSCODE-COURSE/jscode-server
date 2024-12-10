package com.example.demo;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
  private BoardRepository boardRepository;

  public BoardService(BoardRepository boardRepository) {
    this.boardRepository = boardRepository;
  }

  public List<Board> getBoards(Pageable pageable) {
    // 복잡한 로직이라고 가정
    int sum = 0;
    for (int i = 0; i < 100000; i++) {
      for (int j = 0; j < 10000; j++) {
        sum += i + j; // 의미없는 계산
      }
    }
    return boardRepository.findAll(pageable).getContent();
  }

  public Board writeBoard(Board board) {
    return boardRepository.save(board);
  }
}

