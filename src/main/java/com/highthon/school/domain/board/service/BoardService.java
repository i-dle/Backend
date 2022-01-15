package com.highthon.school.domain.board.service;

import com.highthon.school.domain.board.Board;
import com.highthon.school.domain.board.dto.CreateBoardRequestDto;
import com.highthon.school.domain.board.repository.BoardRepository;
import com.highthon.school.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardService {

	private final BoardRepository boardRepository;
	private final UserFacade userFacade;

	public void createBoard(CreateBoardRequestDto createBoardRequest) {
		boardRepository.save(new Board(createBoardRequest, userFacade.getCurrentUser()));
	}
}