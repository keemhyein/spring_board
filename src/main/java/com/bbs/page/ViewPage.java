package com.bbs.page;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString // @Data는 생성자까지 잡아주기때문에 여기선 안쓴다.
public class ViewPage {
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	private int total;
	private Criteria cri;
	
	public ViewPage(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;
		this.endPage = (int)(Math.ceil(cri.getPageNum()/10.0))*10;
		this.startPage = this.endPage - 9;
		
		int realEnd = (int)(Math.ceil(total * 1.0/cri.getAmount()));
		
		// 전체 마지막 페이지가 화면에 보이는 마지막 페이지보다 작은 경우
		if(realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		
		this.prev = this.startPage > 1; // 시작 페이지 값이 1보다 큰 경우 true
		this.next = this.endPage < realEnd;
		
	}
	
}
