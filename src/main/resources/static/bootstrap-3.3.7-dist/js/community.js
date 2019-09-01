function post() {
    var questionId = $("#question_id").val();
    var content = $("#comment_content").val();
    $.ajax({
        type:"POST",
        url:url,
        data:{
         "parentId":questionId,
            "content":content,
            "type":1
        },
        success:function (response) {
            console.log(response);
            
        },
        dataType:"json"
    });
    console.log(questionId);
    console.log(content);
}
