package com.hanbit.member.dao;

import java.util.List;

import com.hanbit.member.domain.MemberBean;

public interface MemberDAO {
	//setter void -> int 이유 : setter후 성공여부 반환: 오라클에서 숫자값으로 return함
	public int insert(MemberBean member);
	public int upadte(MemberBean member);	//pw
	public int delete(String id);			//id
	//getter
	public List<MemberBean> selectAll();
	public int count();
	public MemberBean selectByID(String id);
	public List<MemberBean> selectByName(String name);
}
