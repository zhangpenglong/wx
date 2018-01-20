<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" language="java"  pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>跟我走</title>
    <link rel="stylesheet" href="${request.getContextPath()}/wx/layui/css/layui.css"  media="all">
<link rel="stylesheet" type="text/css" href="${request.getContextPath()}/wx/css/shopping/style.css">
<link rel="stylesheet" type="text/css" href="${request.getContextPath()}/wx/css/shopping/index.css">
<script type="text/javascript" src="${request.getContextPath()}/wx/js/shopping/Adaptive.js"></script>
</head>

<body>

<header>
	<i class="logo"></i>
    <a href="#">
    <div class="sch">
    	<p><img src="${request.getContextPath()}/wx/images/shopping/icon/sch.png">搜索目的地、帖子、景点</p>
    </div>
    </a>
</header>

<div id="_contain">

<div class="banner">
	<%--<img id="roll" src="">--%>
        <div class="layui-carousel" id="roll">
            <div carousel-item="">
                <div><img src="http://static.huixiangfu.cn/shopping/roll/banner.png"></div>
                <div><img src="http://static.huixiangfu.cn/shopping/roll/banner.png"></div>
                <div><img src="http://static.huixiangfu.cn/shopping/roll/banner.png"></div>
            </div>
        </div>
    <%-- <div class="logo-dbs">
    	<div class="dbs-img">
        	<img src="${request.getContextPath()}/wx/images/shopping/icon/logo.png">
        </div>
        <p>全球低价游，满足你世界梦！</p>
    </div>--%>
</div>

<div class="menu">
	<div class="nav">
    	<img src="${request.getContextPath()}/wx/images/shopping/menu/nav_1.png">
        <p>看攻略</p>
    </div>
	<div class="nav">
    	<img src="${request.getContextPath()}/wx/images/shopping/menu/nav_2.png">
        <p>抢折扣</p>
    </div>
	<div class="nav">
    	<img src="${request.getContextPath()}/wx/images/shopping/menu/nav_3.png">
        <p>定酒店</p>
    </div>
	<div class="nav">
    	<img src="${request.getContextPath()}/wx/images/shopping/menu/nav_4.png">
        <p>找附近</p>
    </div>
</div>

<%--<div class="name">
	<p>旅游推荐</p>
</div>

<div class="contain">
	<div class="ad">
    	<img src="${request.getContextPath()}/wx/images/shopping/index/rcd_1.png">
    </div>
    <div class="ad-left">
    	<img src="${request.getContextPath()}/wx/images/shopping/scenics/scenic_1.png">
    </div>
    <div class="add-right">
    	<img src="${request.getContextPath()}/wx/images/shopping/scenics/scenic_2.png">
    </div>
</div>--%>

<div class="name">
	<p>折扣游</p>
</div>
  <div class="favorable">
<%--
    <div class="fb">
        <div class="fb-lt">
            <img src="${request.getContextPath()}/wx/images/shopping/scenics/scenic_3.png">
            <p class="fb-name">塞班岛5-6天（欢乐自由 行）</p>
            <p class="price">
                <span class="discount">4.7折</span>
                <span class="num"><big>5699</big>元起</span>
            </p>
        </div>
    </div>
    <div class="fb">
        <div class="fb-lt">
            <img src="${request.getContextPath()}/wx/images/shopping/scenics/scenic_4.png">
            <p class="fb-name">夏威夷7天6晚 （三天跟团三天自由行）</p>
            <p class="price">
                <span class="discount">8.7折</span>
                <span class="num"><big>11799</big>元起</span>
            </p>
        </div>
    </div>
    <div class="fb">
        <div class="fb-lt">
            <img src="${request.getContextPath()}/wx/images/shopping/scenics/scenic_5.png">
            <p class="fb-name">体验全球最长的过山车15天超爽旅游</p>
            <p class="price">
                <span class="discount">6.2折</span>
                <span class="num"><big>21099</big>元起</span>
            </p>
        </div>
    </div>
    <div class="fb">
        <div class="fb-lt">
            <img src="${request.getContextPath()}/wx/images/shopping/scenics/scenic_6.png">
            <p class="fb-name">美国纽约曼哈顿5天游（体验不一样的风情）</p>
            <p class="price">
                <span class="discount">2.8折</span>
                <span class="num"><big>2889</big>元起</span>
            </p>
        </div>
    </div>--%>

</div>
 
<div class="more">
	<p>查看更多<img src="${request.getContextPath()}/wx/images/shopping/icon/arr-right.png"></p>
</div>    

</div>

<%--<footer>
	<div class="foot act">
    	<img src="${request.getContextPath()}/wx/images/shopping/foot/ft_1_1.png">
        <p>推荐</p>
    </div>
	<div class="foot">
    	<img src="${request.getContextPath()}/wx/images/shopping/foot/ft_2.png">
        <p>目的地</p>
    </div>
	<div class="foot">
    	<img src="${request.getContextPath()}/wx/images/shopping/foot/ft_3.png">
        <p>帖子</p>
    </div>
	<a href="${request.getContextPath()}/wx/WEB-INF/view/modules/shopping/person/person.html"><div class="foot">
    	<img src="${request.getContextPath()}/wx/images/shopping/foot/ft_4.png">
        <p>我的</p>
    </div></a>
</footer>   --%>

<script src="${request.getContextPath()}/wx/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="${request.getContextPath()}/wx/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
    layui.use('carousel', function(){
        var carousel = layui.carousel;
        //建造实例
        carousel.render({
            elem: '#roll'
            ,width: '100%' //设置容器宽度
            ,height: '100%' //设置容器宽度
            ,arrow: 'always' //始终显示箭头
            //,anim: 'updown' //切换动画方式
        });
    });
	$(".more").click(function(){
		for(i=0;i<4;i++){
			$(".favorable").append('<div class="fb">'
									+'<div class="fb-lt">'
									+'<img src="'+ '${request.getContextPath()}/wx/images/shopping/scenics/scenic_5.png'+'"/>'
									+'<p class="fb-name">体验全球最长的过山车15天超爽旅游</p>'
									+'<p class="price">'+'<span class="discount">2.8折</span>'
									+'<span class="num"><big>2889</big>元起</span>'
									+'</p></div></div>');
		}
    })

    $(function() {
        $.ajax({
            type: 'GET',
            url: '${request.getContextPath()}/wx/shopping/index/index',
            async : false,
            dataType : 'json',
            data: { },
            success: function(data1){
                var data = JSON.parse(data1);
                if(data.code == 0){
                    alert(data.msg);
                }else {
                    var tab = $(".favorable"),_list =[];
                    var divList = "";
                    $.each(data.routeList,function (i,n) {
                         divList += " <div class='fb'>\
                    <div class='fb-lt'>\
                <img src='"+n.routeImage+"'>\
                <p class='fb-name'>"+n.routeName+"</p>\
            <p class='price'>\
                <span class='discount'>"+n.discount+"</span>\
            <span class='num'><big>"+n.price+"</big>元起</span>\
                </p>\
                </div>\
                </div>";
                    });
                    tab.html(divList);
                }
            },
            error:function () {
            }

        })


    });
</script>
</body>
</html>
