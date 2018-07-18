<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.google.android.gcm.server.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.net.*" %>
<%
	request.setCharacterEncoding("utf-8");

	String [] token_list = request.getParameterValues("token");
	String msg = request.getParameter("msg");
	
	ArrayList<String> token = new ArrayList<String>();
	for(String str1 : token_list){
		token.add(str1);
	}
	
	Random rnd = new Random();
	String MESSAGE_ID = rnd.nextLong() + "";
	//어플 실행중일때 메세지 받지 않음
	boolean SHOW_ON_IDLE = false;
	
	int LIVE_TIME = 1;
	//메세지 전달 실패시 전달 횟수
	int RETRY = 2;
	
	msg = URLEncoder.encode(msg, "EUC-KR");
	
String key="AAAAlD23M6E:APA91bFNAQVk4-E98aiNLWoK66Uv6yETSSWxGy3j52-Xgw5GS2vWOF6ewq5-JwmYxY3oubZF431YvUJYGzhi7W6g-0ql6C2DrjMLU8cPMe5NWexusZDj0whQOaf39yUhUdVB7Rtj766zZX8eSnPa5eg_Ff9RPrCnWg";

	Sender sender = new Sender(key);
	Message.Builder builder = new Message.Builder();
	builder.collapseKey(MESSAGE_ID);
	builder.delayWhileIdle(SHOW_ON_IDLE);
	builder.timeToLive(LIVE_TIME);
	builder.addData("msg", msg);
	Message message = builder.build();
	
	MulticastResult result1 = sender.send(message, token, RETRY);
	
	if( result1 != null){
		List<Result> result_list = result1.getResults();
		for(Result result : result_list){
			System.out.println(result.getErrorCodeName());
		}
	}
%>
전송완료










