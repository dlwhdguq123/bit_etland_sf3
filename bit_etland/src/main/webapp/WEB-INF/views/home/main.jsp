<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${css}/home/main.css" />
    <div class="grid-item" id="left">
    	고객 전용${time}<br /><br />
    	<a href="#" id="cust_join">회원가입</a><br />
    	<a href="#" id="cust_login">로 그 인</a>
    </div>
    <div class="grid-item" id="right">
    	직원 전용<br /><br />
    	<a href="#" id="emp_register">사원등록</a><br />
    	<a href="#" id="emp_access">접속승인</a>
    </div>
       <div class="grid-item" id="left">
    	고객 전용<br /><br />
    	<a href="#" id="cust_join">알고리즘</a><br />
    	<a href="#" id="algo_access">접속하기</a>
    </div>
    <div class="grid-item" id="right">
    	직원 전용<br /><br />
    	<a href="#" id="emp_register">객체지향</a><br />
    	<a href="#" id="oop_access">접속하기</a>
    </div>
    
<script src="${js}oop.js"> </script>
<script>
$('#cust_join').click(function(){
	location.assign('customer.do?cmd=move&page=signup');
});
$('#cust_login').click(function(){
	location.assign('${ctx}/move/customer/signin');
});
$('#emp_register').click(function(){
	location.assign('employee.do?cmd=move&page=register');
});
$('#emp_access').click(function(){
	location.assign('employee.do?cmd=move&page=access');
});
$('#oop_access').click(function(){
	test2.main();
});
</script>
