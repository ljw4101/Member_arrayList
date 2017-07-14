/*package com.hanbit.member.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.hanbit.member.dao.MemberDAO;
import com.hanbit.member.daoImpl.MemberDAOImpl;
import com.hanbit.member.domain.MemberBean;
import com.hanbit.member.service.MemberService;

public class MemberServiceImpl_bak implements MemberService{

	MemberBean member;
	List<MemberBean> list, nameList;
	
	public MemberServiceImpl_bak(){
		member = new MemberBean();
		list = new ArrayList<MemberBean>();
	}
	
	@Override
	public void addMember(MemberBean member) {		
		list.add(member);
	}

	@Override
	public List<MemberBean> getMembers() {
		return list;
	}

	@Override
	public int countMembers() {
		return list.size();
	}

	@Override
	public MemberBean findByID(String id) {
		MemberBean member = new MemberBean();
		MemberDAO dao = new MemberDAOImpl();
		member = dao.selectByID(id);
		
		
		member = new MemberBean();
		
		for(MemberBean m:list){
			if(id.equals(m.getId())){
				member = m;
				break;
			}
		}
		/*
		for(int i=0; i<list.size(); i++){
			if(id.equals(list.get(i).getId())){
				member = list.get(i);
				break;
			}
		}
		return member;
	}

	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> nameRes = new ArrayList<MemberBean>();
		int sameCnt=0;
		//동명이인 개수
		for(int i=0; i<list.size(); i++){
			if(name.equals(list.get(i).getName())){
				sameCnt++;
	        }
		}
		
		for(MemberBean m:list){	//객체가 돌아감
			if(name.equals(m.getName())){
				nameRes.add(m); 
				if(sameCnt == nameRes.size()){ break; }
			}
		}
		
	    for(int i=0; i<list.size(); i++){
	        if(name.equals(list.get(i).getName())){
	        	nameRes.add(list.get(i)); 
	        	if(sameCnt == nameRes.size()){ break; }
	        }  
	    } 
	    
	    return nameRes;
	}

	@Override
	public void modifyPw(MemberBean bean) {
		for(MemberBean m:list){
			if(bean.getId().equals(m.getId())){
				//pw
				if(!bean.getPw().equals(" ")){
					m.setPw(bean.getPw());
				}
				//name
				if(!bean.getName().equals(" ")){
					m.setName(bean.getName());
				}
				//ssn
				if(!bean.getSSN().equals(" ")){
					m.setSSN(bean.getSSN());
				}
				
				break;
			}
		}
	}

	@Override
	public void removeMember(String id) {
		for(MemberBean m:list){
			if(id.equals(m.getId())){
				list.remove(m);
				break;
			}
		}
		
		for(int i=0;i<list.size();i++){
			if(id.equals(list.get(i).getId())){
				list.remove(i);
				break;
			}
		}
	}
}
*/