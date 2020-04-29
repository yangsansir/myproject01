
// Cloud Float...
    var $main = $cloud = mainwidth = null;
    var offset1 = 450;
	var offset2 = 0;
	
	var offsetbg = 0;
    
    $(document).ready(
        function () {
            $main = $("#mainBody");
			$body = $("body");
            $cloud1 = $("#cloud1");
			$cloud2 = $("#cloud2");
			
            mainwidth = $main.outerWidth();
         
        }
    );

    /// 飘动
    setInterval(function flutter() {
        if (offset1 >= mainwidth) {
            offset1 =  -580;
        }

        if (offset2 >= mainwidth) {
			 offset2 =  -580;
        }
		
        offset1 += 1.1;
		offset2 += 1;
        $cloud1.css("background-position", offset1 + "px 100px")
		
		$cloud2.css("background-position", offset2 + "px 460px")
    }, 70);
	
	
	setInterval(function bg() {
        if (offsetbg >= mainwidth) {
            offsetbg =  -580;
        }

        offsetbg += 0.9;
        $body.css("background-position", -offsetbg + "px 0")
    }, 90 );
	function check(){
		var password=document.getElementById("password").valueOf();
		var repassword=document.getElementById("repassword").valueOf();
		 
		}     
		if(repassword!=password){
		alert("两次密码不一致！");
		$("#b").html("两次密码不一致");
		}

		function IsEmail()     
		{     
		        var str = document.getElementById("email").value.trim();    
		        if(str.length!=0){    
		        reg=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;    
		        if(!reg.test(str)){    
		            alert("对不起，您输入的字符串类型格式不正确!");//请将“字符串类型”要换成你要验证的那个属性名称！    
		        }    
		        }    
		}     
		}
	