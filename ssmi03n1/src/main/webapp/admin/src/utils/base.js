const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmi03n1/",
            name: "ssmi03n1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmi03n1/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "网上报名系统"
        } 
    }
}
export default base
