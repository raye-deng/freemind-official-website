/**
 * Created by Administrator on 2014/8/7 0007.
 */
function PreviewImage(id,imgFile,widthT,heightT)
{
    var pattern = /(\.*.jpg$)|(\.*.png$)|(\.*.jpeg$)|(\.*.gif$)|(\.*.bmp$)/;
    if(!pattern.test(imgFile.value))
    {
        alert("系统仅支持jpg/jpeg/png/gif/bmp格式的照片！");
        imgFile.focus();
    }
    else
    {
        var path;
        if(document.all)//IE
        {
            imgFile.select();
            path = document.selection.createRange().text;
            document.getElementById(id).innerHTML="";
            document.getElementById(id).style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(enabled='true',sizingMethod='scale',src=\"" + path + "\")";//使用滤镜效果
        }
        else//FF
        {
            path = URL.createObjectURL(imgFile.files[0]);
            document.getElementById(id).innerHTML = "<img style='width:"+widthT+"px; height:"+heightT+"px;' src='"+path+"'/>";

        }
    }
}