$(function(){
	$('#btn').click(function(){
		
		$("¥����ţ�<input type='text' name='middleFloor.BuildNUmber'/><br/>").insertBefore($("#save"));
	});
/*$("#district").change(function(){
		
		var id=$(this).val();
		alert(id);
		
		$.ajax({
			url:"residernt/findByDistrictId.action",
			type:"post",
			data:"id="+id,//���ݵĲ���
			dataType:"json",
			success:function(data){
				
			  alert(data[0].id);
			  alert(data[0].BuildNUmber);
			  alert(data[0]._2);
			  
			  for(var aa in data){
				  alert(aa);
			  }
			  //��¥�������б��������Ϣ  dom����
			 // $("#middleFloor").children().remove();
			  for(var i=0;i<data.length;i++){
				  $("#middleFloor").append("<option value='"+data[i].id+"'>"+data[i].BuildNUmber+"</option>");
			  }
			},
		error:function(){
			alert('ERROR change data document');
		}
		});
		
	});*/
});