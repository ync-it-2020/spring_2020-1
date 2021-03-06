package kr.ync.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ync.domain.BoardVO2;
import kr.ync.domain.Criteria;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// Java Config
// @ContextConfiguration(classes = {org.zerock.config.RootConfig.class} )
@Log4j
public class BoardServiceTests {

	@Setter(onMethod_ = { @Autowired })
	private BoardService service;
//	@Test
//	public void testView() {
//		int idx=1;
//		log.info(service.view(idx));
//	}
//	@Test
//	public void testDel() {
//		int idx=2;
//		service.del(idx);
//	}
	@Test
	public void testModify() {
		BoardVO2 board=new BoardVO2();
		board.setIdx(6);
		board.setContent("다시바뀐내용1");
		board.setTitle("다시바뀐제목1");
		service.modify(board);
	}
//	@Test
//	public void testCreate() {
//		BoardVO2 board=new BoardVO2();
//		board.setContent("test2");
//		board.setTitle("test2");
//		board.setWriter("temp1");
//		log.info(board);
//		service.create(board);
//	}
//	@Test
//	public void testList() {
//		service.List().forEach(board -> log.info(board));
//	}
//	@Test
//	public void testExist() {
//		
//		log.info("=====================");
//		log.info(service);
//		assertNotNull(service);
//		log.info("=====================");
//	}
//
//	@Test
//	public void testRegister() {
//
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글");
//		board.setContent("새로 작성하는 내용");
//		board.setWriter("newbie");
//
//		service.register(board);
//
//		log.info("생성된 게시물의 번호: " + board.getBno());
//	}

//	@Test
//	public void testGetList() {
//
//		service.getList().forEach(board -> log.info(board));
////		service.getList(new Criteria(2, 10)).forEach(board -> log.info(board));
//	}

//	@Test
//	public void testGet() {
//
//		log.info(service.get(1L));
//	}
//
//	@Test
//	public void testDelete() {
//
//		// 게시물 번호의 존재 여부를 확인하고 테스트할 것
//		log.info("REMOVE RESULT: " + service.remove(2L));
//
//	}
//
//	@Test
//	public void testUpdate() {
//
//		BoardVO board = service.get(1L);
//
//		if (board == null) {
//			return;
//		}
//
//		board.setTitle("제목 수정합니다.");
//		log.info("MODIFY RESULT: " + service.modify(board));
//	}
	
//	@Test
//	public void testGetListWithPaging() {
//
//		service.getListWithPaging(new Criteria(1, 10)).forEach(board -> log.info(board));
//	}
	
//	@Test
//	public void testGetTotal() {
//		
//		Criteria cri = new Criteria();
//
//		log.info("totoalCnt : " + service.getTotal(cri));
//
//	}

}
