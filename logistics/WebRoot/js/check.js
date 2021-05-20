function check(){

    var usern=false;
    var psw=false;
    var psw2=false;
    var tel=false;
    var ema=false;
    //取出input的值
    var username=document.getElementById("inputText3").value;
    var phone=document.getElementById("inputText4").value;
    var password=document.getElementById("inputPassword3").value;
    var password2=document.getElementById("inputPassword4").value;
    var checkis=document.getElementById("checkbox1").checked;
    var regphone=/^1[3578]\d{9}$/;
    var regpassword=/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$/;
    
    if(username)
    {
        document.getElementById("inputText3").innerHTML="<font color=green size=2>用户名可用</font>";
        
        usern=true;
    }
    else{
        document.getElementById("inputText3").innerHTML="<font color=red size=2>用户名不能为空</font>";
        
    }
    if(regphone.test(phone))
    {
        document.getElementById("inputText4").innerHTML="<font color=green size=2>手机号码格式正确</font>";
       
        tel=true;
    }
    else{
        document.getElementById("inputText4").innerHTML="<font color=red size=2>手机号码格式不正确</font>";
        
    }
    if(regpassword.test(password))
    {
        document.getElementById("inputPassword3").innerHTML="<font color=green size=2>密码格式正确</font>";
        psw=true;
        
    }
    else{
        document.getElementById("inputPassword3").innerHTML="<font color=red size=2>密码格式不正确</font>";
    }
    if(password2==password)
    {
        document.getElementById("inputPassword4").innerHTML="<font color=green size=2>密码一致</font>";
        psw2=true;
    }
    else{
        document.getElementById("inputPassword4").innerHTML="<font color=red size=2>密码不一致</font>";
    }
   

    if(!checkis){
        alert("请阅读*****协议后同意并注册");
    }
    if(usern&&psw&&psw2&&tel&&ema&&checkis){
        alert("注册成功");
        window.location.href="#";
    }

}