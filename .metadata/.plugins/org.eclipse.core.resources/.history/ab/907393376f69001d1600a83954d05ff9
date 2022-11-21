<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%
	request.setCharacterEncoding("UTF-8");
%> 
<!DOCTYPE html>

<head>
<meta charset="UTF-8">
	<title>header</title>
	<link rel="stylesheet" href="/project01/main/css/header.css"/>
		<script>
	//로그인 카운트다운
	var tid;
	var cnt = parseInt(5);//초기값(초단위)
	function counter_init() {
		tid = setInterval("counter_run()", 1000);
	}

	function counter_reset() {
		clearInterval(tid);
		cnt = parseInt(60);
		counter_init();
	}

	function counter_run() {
		document.getElementById("counter").innerText = time_format(cnt);
		cnt--;
		if(cnt < 0) {
			clearInterval(tid);
			self.location = "sub02/login01.jsp"; //로그인 경로 넣기
		}
	}
	function time_format(s) {
		var nHour=0;
		var nMin=0;
		var nSec=0;
		if(s>0) {
			nMin = parseInt(s/60);
			nSec = s%60;

			if(nMin>60) {
				nHour = parseInt(nMin/60);
				nMin = nMin%60;
			}
		} 
		if(nSec<10) nSec = "0"+nSec;
		if(nMin<10) nMin = "0"+nMin;

		return ""+nHour+":"+nMin+":"+nSec;
	}	

	counter_init();
	</script>    
</head>    
	<header>
	<fmt:setLocale value="${param.lo}" />
	<fmt:bundle basename="resource.member">
		<div id="header" class="cf">
			<div id="gnb">
				<div class="gnbWrap">
					<div class="gnb1 fl">
						<form name="searchForm" id="searchForm" method="get">
							<select name="managedc" id="manage_dc" title="도서관 선택">
								<option value="op" selected="selected"><fmt:message key="menu.nav01" /></option>
								<option value="op" >석수도서관</option>
								<option value="op" >만안도서관</option>
								<option value="op" >삼덕도서관</option>
								<option value="op" >박달도서관</option>
								<option value="op" >평촌도서관</option>
								<option value="op" >관양도서관</option>
								<option value="op" >비산도서관</option>
								<option value="op" >호계도서관</option>
								<option value="op" >어린이도서관</option>
								<option value="op" >벌말도서관</option>
							</select>
						</form>
					</div>
					<div class="gnb2 fr">
						<div class="timeControl fl">	
							<span id="counter"></span>
							<span>후 자동으로 로그인페이지로 이동합니다.</span>
							<input class="timeBtn fl" type="button" value="연장" onclick="counter_reset()">	
						</div>					
						<ul class="gmenu fl">
							<li><a href="/project01/sub02/login01.jsp" tabindex="1"><fmt:message key="menu.nav02" /></a></li>
							<li><a href="/project01/sub02/login02.jsp" tabindex="2"><fmt:message key="menu.nav03" /></a></li>
							<li><a href="#" tabindex="3"><fmt:message key="menu.nav04" /></a></li>
						</ul>
						<ul class="gtrans fl">
							<li class="gfirst fl"><a href="index.jsp?lo=ko"><fmt:message key="menu.nav47" /></a></li>
							<li class="fl"><a href="index.jsp?lo=en"><fmt:message key="menu.nav48" /></a></li>
						</ul>
						<div class="gsns fl">
							<a href="https://pf.kakao.com/_MxfxkLT" tabindex="4"><img src="/project01/index/images/top_snsKakao.png" alt="카카오"/></a>
							<a href="https://www.instagram.com/anyanglib/" tabindex="5"><img src="/project01/index/images/top_snsInsta.png" alt="인스타"/></a>
							<a href="https://twitter.com/anyanglib" tabindex="6"><img src="/project01/index/images/top_snsTwitter.png" alt="트위터"/></a>
							<a href="https://www.youtube.com/channel/UCOTyiNx6Di5A_Yn4SrzNMzg" tabindex="7"><img src="/project01/index/images/top_snsYoutube.png" alt="유튜브"/></a>
						</div>
					</div>
				</div>
			</div>
			<nav class="nav1 cf">
				<div class="sub1Wrap">
					<h1 class="logo fl"><a href="/project01/index.html" tabindex="8"><img src="/project01/index/images/logo.png" alt="로고"/></a></h1>
					<ul class="sub1 cf">
						<li class="sub1_1 fl"><a href="/project01/sub02/login01.jsp" tabindex="9"><fmt:message key="menu.nav1" /></a></li>
						<li class="sub1_1 fl"><a href="/project01/sub02/login02.jsp" tabindex="9"><fmt:message key="menu.nav2" /></a></li>
						<li class="sub1_1 fl"><a href="/project01/sub03/sub03.jsp" tabindex="9"><fmt:message key="menu.nav3" /></a></li>
						<li class="sub1_1 fl"><a href="/project01/sub04/sub04.jsp" tabindex="9"><fmt:message key="menu.nav4" /></a></li>
						<li class="sub1_1 fl"><a href="/project01/board/listArticles.do" tabindex="9"><fmt:message key="menu.nav5" /></a></li>
						<li class="sub1_1 fl"><a href="/project01/board/listArticles.do" tabindex="9"><fmt:message key="menu.nav6" /></a></li>
						<li class="searchbtn fl"><a href="#" tabindex="54"><img src="/project01/index/images/btn_search.png" width="30" height="30" alt="돋보기"/></a></li>
					</ul>
				</div>		
			</nav>
			<nav class="nav2 cf">
				<div class="sub2Wrap">
					<div class="sub2Inner">
						<div class="sub2">
							<ul class="sub2_1 fl">
								<li class="sub2_2"><a href="/project01/sub02/login01.jsp" tabindex="10"><fmt:message key="menu.nav7" /></a></li>
								<li class="sub2_2"><a href="/project01/sub02/login01.jsp" tabindex="11"><fmt:message key="menu.nav8" /></a></li>
								<li class="sub2_2"><a href="/project01/sub02/login01.jsp" tabindex="12"><fmt:message key="menu.nav9" /></a></li>
								<li class="sub2_2"><a href="/project01/sub02/login01.jsp" tabindex="13"><fmt:message key="menu.nav10" /></a></li>
								<li class="sub2_2"><a href="/project01/sub02/login01.jsp" tabindex="14"><fmt:message key="menu.nav11" /></a></li>
							</ul>
						</div>
						<div class="sub2">
							<ul class="sub2_1 fl">
								<li class="sub2_2"><a href="/project01/sub02/login02.jsp" tabindex="16"><fmt:message key="menu.nav12" /></a></li>
								<li class="sub2_2"><a href="/project01/sub02/login02.jsp" tabindex="17"><fmt:message key="menu.nav13" /></a></li>
								<li class="sub2_2"><a href="/project01/sub02/login02.jsp" tabindex="18"><fmt:message key="menu.nav14" /></a></li>
								<li class="sub2_2"><a href="/project01/sub02/login02.jsp" tabindex="19"><fmt:message key="menu.nav15" /></a></li>
								<li class="sub2_2"><a href="/project01/sub02/login02.jsp" tabindex="20"><fmt:message key="menu.nav16" /></a></li>
								<li class="sub2_2"><a href="/project01/sub02/login02.jsp" tabindex="21"><fmt:message key="menu.nav17" /></a></li>
							</ul>
						</div>
						<div class="sub2">
							<ul class="sub2_1 fl">
								<li class="sub2_2"><a href="/project01/sub03/sub03.jsp" tabindex="23"><fmt:message key="menu.nav18" /></a></li>
								<li class="sub2_2"><a href="/project01/sub03/sub03.jsp" tabindex="24"><fmt:message key="menu.nav19" /></a></li>
								<li class="sub2_2"><a href="/project01/sub03/sub03.jsp" tabindex="25"><fmt:message key="menu.nav20" /></a></li>
								<li class="sub2_2"><a href="/project01/sub03/sub03.jsp" tabindex="26"><fmt:message key="menu.nav21" /></a></li>
								<li class="sub2_2"><a href="/project01/sub03/sub03.jsp" tabindex="27"><fmt:message key="menu.nav22" /></a></li>
								<li class="sub2_2"><a href="/project01/sub03/sub03.jsp" tabindex="28"><fmt:message key="menu.nav23" /></a></li>
								<li class="sub2_2"><a href="/project01/sub03/sub03.jsp" tabindex="29"><fmt:message key="menu.nav24" /></a></li>
							</ul>
						</div>
						<div class="sub2">
							<ul class="sub2_1 fl">
								<li class="sub2_2"><a href="/project01/sub04/sub04.jsp" tabindex="31"><fmt:message key="menu.nav25" /></a></li>
								<li class="sub2_2"><a href="/project01/sub04/sub04.jsp" tabindex="32"><fmt:message key="menu.nav26" /></a></li>
								<li class="sub2_2"><a href="/project01/sub04/sub04.jsp" tabindex="33"><fmt:message key="menu.nav27" /></a></li>
								<li class="sub2_2"><a href="/project01/sub04/sub04.jsp" tabindex="34"><fmt:message key="menu.nav28" /></a></li>
								<li class="sub2_2"><a href="/project01/sub04/sub04.jsp" tabindex="35"><fmt:message key="menu.nav29" /></a></li>
								<li class="sub2_2"><a href="/project01/sub04/sub04.jsp" tabindex="36"><fmt:message key="menu.nav30" /></a></li>
								<li class="sub2_2"><a href="/project01/sub04/sub04.jsp" tabindex="37"><fmt:message key="menu.nav31" /></a></li>
								<li class="sub2_2"><a href="/project01/sub04/sub04.jsp" tabindex="38"><fmt:message key="menu.nav32" /></a></li>
							</ul>
						</div>
						<div class="sub2">
							<ul class="sub2_1 fl">
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="40"><fmt:message key="menu.nav33" /></a></li>
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="41"><fmt:message key="menu.nav34" /></a></li>
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="42"><fmt:message key="menu.nav35" /></a></li>
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="43"><fmt:message key="menu.nav36" /></a></li>
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="44"><fmt:message key="menu.nav37" /></a></li>
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="45"><fmt:message key="menu.nav38" /></a></li>
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="45"><fmt:message key="menu.nav39" /></a></li>
							</ul>
						</div>
						<div class="sub2 last">
							<ul class="sub2_1 fl ">
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="47"><fmt:message key="menu.nav40" /></a></li>
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="48"><fmt:message key="menu.nav41" /></a></li>
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="49"><fmt:message key="menu.nav42" /></a></li>
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="50"><fmt:message key="menu.nav43" /></a></li>
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="51"><fmt:message key="menu.nav44" /></a></li>
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="52"><fmt:message key="menu.nav45" /></a></li>
								<li class="sub2_2"><a href="/project01/board/listArticles.do" tabindex="53"><fmt:message key="menu.nav46" /></a></li>
							</ul>
						</div>
					</div>
				</div>
			</nav>
		</div>
	</fmt:bundle>
	</header>