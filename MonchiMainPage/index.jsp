<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="monchimainpage.*"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta name="description" content="ここにサイト説明を入れます" />
<meta name="keywords" content="キーワード１,キーワード２,キーワード３,キーワード４,キーワード５" />
<meta name="robots" content="ALL" />
<meta name="copyright" content="Copyright (C) blue-green. All rights reserved." />
<title>monchi</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
function check(chkform){
	var s = chkform.Apps.value;
	if(s == null){
		alert("起動するアプリをチェックしてください。");
		return false;
	}
}
</script>
</head>
<body>
<a name="top" id="top"></a>
<div id="container"><img src="img/waku_top.gif" width="900" height="30" alt="" />
  <!--ヘッダー-->
  <div id="header">
    <div id="rogo"><a href="index.jsp">TOP PAGE</a></div>
	<h1>Javaのお勉強用に作ったページ</h1>
  </div>
  <!--ナビゲーション-->
  <!--コンテンツここから-->
  <div id="content">
    <!--サブメニュー-->
    <div id="sidebar">
    <div id="submenu">
      <h2>SUBMENU</h2>
      <ul>
        <li><a href="">ここは</a></li>
        <li><a href="">押しても</a></li>
        <li><a href="">何も</a></li>
        <li><a href="">起きないよ</a></li>
        <li><a href="">実装して</a></li>
        <li><a href="">ないからね</a></li>
        </ul>
    </div>
    <div id="side_txbox">
    <p>■言語</br>
		java, javascript, html</br></br>
		■環境</br>
		jdk[1.8.0_66]</br>
		tomcat8</br>
		</br>
		■作成日</br>
		2015/6/30</br>
		2016/6/5(更新)
		</br>
	</p>
    </div>
  </div>
  <!--メイン-->
<div id="main">
  <h2>■機能を選択してください</h2>
<div class="main_box">
<form method="post" action="/MonchiMainPage/FrontControllerServlet" onSubmit="return check(this)">
<table border="2" width="100%" align="left">
	<tr height="210">

		<td width="40%" bgcolor="skyblue" align="center">
			<font size="4"><b>Favorite Pages</b></font>
		</td>
		<td width="30%">
			<font size="2"><b>
				<input type="checkbox" name="pages" value="page0">FaceBook</br>
				<input type="checkbox" name="pages" value="page1">Twitter</br>
				<input type="checkbox" name="pages" value="page2">tumblr</br>
				<input type="checkbox" name="pages" value="page3">Soccer(EU)</br>
				<input type="checkbox" name="pages" value="page4">Soccer(JP)</br>
				<input type="checkbox" name="pages" value="page5">ChelseaFC Official</br>
				<input type="checkbox" name="pages" value="page6">hule</br>
				<input type="checkbox" name="pages" value="page7">NicoNico</br>
				<input type="checkbox" name="pages" value="page8">Amazon</br>
			</b></font>
		</td>
		<td width="30%" align="center">
			<font size="6">
				<input type="submit" name ="Pages"  value="実行" />
			</font>
		</td>
	</tr>
	<tr height="140">
		<td bgcolor="skyblue" align="center">
			<font size="4"><b>Favorite Applications</b></font>
		</td>
		<td width="">
			<font size="2"><b>
				<input type="checkbox" name="apps" value="app0">Skype</br>
				<input type="checkbox" name="apps" value="app1">eclipse</br>
				<input type="checkbox" name="apps" value="app2">Ｘアプリ</br>
				<input type="checkbox" name="apps" value="app3">gimp-2.8
			</b></font>
		</td>
		<td width="" align="center">
			<font size="6">
				<input type="submit" name ="Apps"  value="実行" />
				<input type = "hidden" name = "flag" value = "2">
			</font>
		</td>
	</tr>
	<tr height="100">
		<td bgcolor="skyblue" align="center">
			<font size="4"><b>"じゃんけんプログラム"</b></font>
		</td>
		<td colspan="2" align="center">
			<font size="4"><a href ="http://localhost:8080/WebJanken/"  target="_blank">実行画面に遷移</a></font>
		</td>
	</tr>
</table>
<table border="2" width="100%" align="left">
	<tr height="400">
		<td colspan="2" align="center">
			<font size="4">ここに画像が表示されます</font>
		</td>
	</tr>
	<tr height="50">
		<td colspan="2" align="center">
			<font size="6">
				<input type="submit" name ="Images"  value="実行" />
				<input type = "hidden" name = "image" value = "image">
				<input type = "hidden" name = "image" value = "image2">
				<input type = "hidden" name = "flag" value = "2">
			</font>
		</td>
	</tr>
</table>
</form>
</div>
</div>
<!--ページトップへ-->
<div id="pagetop"><a href="#top"><img src="img/pagetop.gif" width="70" height="22" alt="このページのトップへ" /></a></div>
</div>
<img src="img/waku_bottom.gif" width="900" height="20" alt="" />


<!--フッター-->

</div>

</body>
</html>
