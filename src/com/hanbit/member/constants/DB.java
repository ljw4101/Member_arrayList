package com.hanbit.member.constants;

public class DB {
	public static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	public static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USERID="hanbit";
	public static final String PASSWORD="hanbit";
	
	//테이블명 및 컬럼명 수정시 여기만 바꾸면 된다.
	//코딩시 상수풀을 검색할 필요가 없으니 빨라짐.
	//오타, 실수 예방
	public static final String TABLE_MEMBER="member";
	public static final String MEM_ID="id";
	public static final String MEM_NAME="name";
	public static final String MEM_PW="pw";
	public static final String MEM_SSN="ssn";
	public static final String MEM_REGDATE="regdate";

}
