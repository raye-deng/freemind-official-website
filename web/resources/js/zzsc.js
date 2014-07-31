
var item;
$(function(){
    //商品分类
    $('.all-goods .item').hover(function(){

        $("#"+item).removeClass('active').show();
        $("#"+item).find('.product-wrap').hide();
        item = jQuery(this).attr("id");
        $("#"+item).addClass('active');
        $("#"+item).find('.product-wrap').show();
    },function(){

    });
});

function setActive(itemid)
{
    item = itemid;
    $("#"+item).addClass('active');
    $("#"+item).find('.product-wrap').show();
}
