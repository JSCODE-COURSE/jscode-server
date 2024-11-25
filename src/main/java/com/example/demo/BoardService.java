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
    return boardRepository.findAll(pageable).getContent();
  }

  public Board writeBoard(Board board) {
    return boardRepository.save(board);
  }
}

