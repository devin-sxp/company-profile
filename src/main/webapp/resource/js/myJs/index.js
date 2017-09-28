/**
 * Created by Devin on 2017/9/26.
 */

var getIndexNews = function () {
    $.post(getRootPath()+"/indexAction_getIndexById",{id:"1"},function (data,status) {

        var result = eval("("+data.result+")");
        // console.info(result)
        $(".intro").empty();

        var html = 	"<h1>"+ result.indexTitle +"</h1>"+
                   "<p>"+ result.indexDescription +"</p>"+
                    "<a class=\"btn vira-btn\" href=\"#\">Explore us</a>";
        $(".intro").append(html);

        $("#p_about_description").text(result.aboutDescription);

        var html_expertise = "<div class=\"item\">" +
            "<p id=\"p_expertise_description\">" +
            result.expertiseDescription+"</p>" +
            "</div><div class=\"item\">" +
            "<p>"+result.expertiseDescription+"</p></div>";
        $("#expert-slider").append(html_expertise);

        $('#expert-slider').owlCarousel({
            loop:true,
            items: 1
        })
    },"json");
};

var getUsers = function () {
  $.post(getRootPath()+"/userAction_getUsers",{},function (data,status) {
      var result = eval("("+data.result+")");
      $.each(result,function (objIndex,user) {
          var html_div = "<div class=\"col-sm-4\"><div class=\"vira-card\">" +
              "<div class=\"vira-card-header\">" +
              "<img class=\"img-responsive\" src=\"resource/images/8.jpg\">" +
              "</div>" +
              "<div class=\"vira-card-content\">" +
              "<h3>"+user.userName+"</h3>" +
              "<p>"+user.description+"</p>" +
              "<div class=\"social-icons\">" +
              "<ul>" +
              "<a href=\"#\"><li><span class=\"ion-social-facebook\"></span></li></a>" +
              "<a href=\"#\"><li><span class=\"ion-social-twitter\"></span></li></a>" +
              "</ul>" +
              "</div>" +
              "</div>" +
              "</div>" +
              "</div>";
          $("#div_user_list").append(html_div)

      },"json");
     console.log(result)
  });
};

var getWorksAndStation = function () {

    var array = new Array();
    array.push("fa-diamond");
    array.push("fa-cogs");
    array.push("fa-bicycle");
    //获取工作
    $.post(getRootPath()+"/workAction_getWorks",{workstationType:"workstation",workType:"work",limit:0,offset:5},function (data,status) {
        var result = eval("("+data.resultWork+")");

        $.each(result[0].works,function (indexObj,work) {
            var html_div = "<div class=\"col-sm-4\">" +
                "<div class=\"vira-card\">" +
                "<div class=\"vira-card-header\">" +
                "<div class=\"card-icon\">" +
                "<span class=\"fa "+array[parseInt(Math.random()*3)]+"\" aria-hidden=\"true\"></span>" +
                "</div>" +
                "</div>" +
                "<div class=\"vira-card-content\">" +
                "<h3>"+work.title+"</h3>" +
                "<p>"+work.description+"</p>" +
                "</div>" +
                "</div>" +
                "</div>";
            $("#div_work").append(html_div);
        });

        $.each(result[0].workstations,function (indexObj,workstation) {
            var html_div = "<div class=\"item\">" +
                "<div class=\"vira-card\">" +
                "<div class=\"vira-card-header\">" +
                "<img class=\"img-responsive\" src=\"resource/images/4.jpg\">" +
                "</div>" +
                "<div class=\"vira-card-content\">" +
                "<h3>"+ workstation.title +"</h3>" +
                "<p>"+ workstation.description +"</p>" +
                "</div>" +
                "</div>" +
                "</div>";
            $("#workstation-slider").append(html_div);
        });

        $('#workstation-slider').owlCarousel({
            loop:true,
            margin:30,
            responsive:{
                0:{
                    items:1
                },
                600:{
                    items:2
                },
                1000:{
                    items:3
                }
            }
        });
    });
};

var getContacts = function () {
    var array = new Array();
    array.push("fa-map-o");
    array.push("fa-phone");
    array.push("fa-paper-plane");
    $.post(getRootPath()+"/contactAction_getContacts",{},function (data, status) {
        var result = eval("(" + data.result + ")");
        $.each(result,function (indexObj,contact) {
            var div_html = "<div class=\"col-sm-4\">" +
                "<div class=\"vira-card\">" +
                "<div class=\"vira-card-header\">" +
                "<span class=\"fa "+array[parseInt(Math.random()*3)]+"\" aria-hidden=\"true\"></span>" +
                "</div>" +
                "<div class=\"vira-card-content\">" +
                "<h3>"+ contact.name +"</h3>" +
                "<p>"+ contact.content +"</p>" +
                "</div>" +
                "</div>" +
                "</div>";
            $("#div_contacts").append(div_html);
        });
        console.log(result)
    },"json")
};

$("#btn_send").on('click',function () {
    $.post(getRootPath()+"/subscribeAction_saveSubscribe",{'user-email':$('#user-email').val()}, function (data,status) {
        var isSuccess = eval(data.success);
        if(status == 'success' && isSuccess == true){
            alert('发送成功！')
        }else{
            alert("发送失败！")
        }
    })
});

(function () {
    getIndexNews();
    getUsers();
    getWorksAndStation();
    getContacts();
})();