package org.scoula.board.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.scoula.board.domain.BoardVO;


//xml로 쓰기도 하지만, 여기에 어노테이션 넣고 쓸 수 있음.
public interface BoardMapper {

    public List<BoardVO> getList();

    public BoardVO get(Long no);

    public void create(BoardVO board);

    public int update(BoardVO board);

    public int delete(Long no);

}

