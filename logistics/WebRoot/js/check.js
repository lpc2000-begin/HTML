function check(){

    var usern=false;
    var psw=false;
    var psw2=false;
    var tel=false;
    var ema=false;
    //ȡ��input��ֵ
    var username=document.getElementById("inputText3").value;
    var phone=document.getElementById("inputText4").value;
    var password=document.getElementById("inputPassword3").value;
    var password2=document.getElementById("inputPassword4").value;
    var checkis=document.getElementById("checkbox1").checked;
    var regphone=/^1[3578]\d{9}$/;
    var regpassword=/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$/;
    
    if(username)
    {
        document.getElementById("inputText3").innerHTML="<font color=green size=2>�û�������</font>";
        
        usern=true;
    }
    else{
        document.getElementById("inputText3").innerHTML="<font color=red size=2>�û�������Ϊ��</font>";
        
    }
    if(regphone.test(phone))
    {
        document.getElementById("inputText4").innerHTML="<font color=green size=2>�ֻ������ʽ��ȷ</font>";
       
        tel=true;
    }
    else{
        document.getElementById("inputText4").innerHTML="<font color=red size=2>�ֻ������ʽ����ȷ</font>";
        
    }
    if(regpassword.test(password))
    {
        document.getElementById("inputPassword3").innerHTML="<font color=green size=2>�����ʽ��ȷ</font>";
        psw=true;
        
    }
    else{
        document.getElementById("inputPassword3").innerHTML="<font color=red size=2>�����ʽ����ȷ</font>";
    }
    if(password2==password)
    {
        document.getElementById("inputPassword4").innerHTML="<font color=green size=2>����һ��</font>";
        psw2=true;
    }
    else{
        document.getElementById("inputPassword4").innerHTML="<font color=red size=2>���벻һ��</font>";
    }
   

    if(!checkis){
        alert("���Ķ�*****Э���ͬ�Ⲣע��");
    }
    if(usern&&psw&&psw2&&tel&&ema&&checkis){
        alert("ע��ɹ�");
        window.location.href="#";
    }

}