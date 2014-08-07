
var item;
$(function(){
    //商品分类
    $('.all-goods .item').hover(function(){

        $("#"+item).removeClass('active').show();
        $("#"+item).find('.product-wrap').hide();
        item = jQuery(this).attr("id");

        $("#"+item).addClass('active');
        $("#"+item).find('.product-wrap').show();
        if($("#"+item).find('.product-wrap').height()+45 > $("#listbox").height())
        {
            $("#listbox").height($("#"+item).find('.product-wrap').height()+45);
        }
    },function(){

    });
});

function setActive(itemid)
{
    item = itemid;
    $("#"+item).addClass('active');
    $("#"+item).find('.product-wrap').show();
    if($("#"+item).find('.product-wrap').height()+45 > $("#listbox").height())
    {
        $("#listbox").height($("#"+item).find('.product-wrap').height()+45);
    }
}
