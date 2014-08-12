
var item;
$(function(){
    //商品分类
    $('.all-goods .item').hover(function(){
        $("#"+item).removeClass('active').show();
        $("#warp"+item).hide();
        item = jQuery(this).attr("id");

        $("#"+item).addClass('active');
        $("#warp"+item).show();
        if($("#warp"+item).height()+45 > $("#listbox").height())
        {
            $("#listbox").height($("#warp"+item).height()+45);
        }
    },function(){

    });
});

function setActive(itemid)
{
    item = itemid;
    $("#"+item).addClass('active');
    $("#warp"+item).show();
    if($("#warp"+item).height()+45 > $("#listbox").height())
    {
        $("#listbox").height($("#warp"+item).height()+45);
    }
}


