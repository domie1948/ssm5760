
var projectName = '网上报名系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '级别专业',
	url: './pages/jibiezhuanye/list.html'
}, 

{
	name: '系统论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '系统公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmi03n1/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"考生","menuJump":"列表","tableName":"kaosheng"}],"menu":"考生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"级别专业","menuJump":"列表","tableName":"jibiezhuanye"}],"menu":"级别专业管理"},{"child":[{"buttons":["查看","删除","审核","报表","打印","导出","成绩"],"menu":"报名信息","menuJump":"列表","tableName":"baomingxinxi"}],"menu":"报名信息管理"},{"child":[{"buttons":["查看","修改","删除","打印","导出"],"menu":"考生成绩","menuJump":"列表","tableName":"kaoshengchengji"}],"menu":"考生成绩管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"系统论坛","tableName":"forum"}],"menu":"系统论坛"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"系统公告","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"在线客服","tableName":"chat"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","报名"],"menu":"级别专业列表","menuJump":"列表","tableName":"jibiezhuanye"}],"menu":"级别专业模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除","支付","打印","导出"],"menu":"报名信息","menuJump":"列表","tableName":"baomingxinxi"}],"menu":"报名信息管理"},{"child":[{"buttons":["查看","打印","导出"],"menu":"考生成绩","menuJump":"列表","tableName":"kaoshengchengji"}],"menu":"考生成绩管理"}],"frontMenu":[{"child":[{"buttons":["查看","报名"],"menu":"级别专业列表","menuJump":"列表","tableName":"jibiezhuanye"}],"menu":"级别专业模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"考生","tableName":"kaosheng"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
