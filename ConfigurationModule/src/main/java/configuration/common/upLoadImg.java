package configuration.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2014/8/5 0005.
 */
@Controller
public class upLoadImg   {

    private static final int MAX_UPLOAD_SIZE = 10 * 1024 * 1024;
    private static final String SAVE_PATH = "upLoadfiles";
    String uploadPath;

    @RequestMapping(value="/common/upLoadImg.do")
    @ResponseBody
    public String  fileUpload(HttpServletRequest request, HttpServletResponse response, Model modelMap){
        response.setContentType("text/html;charset=UTF-8");
        Map params = new HashMap();
        FileItem fileItem = null;
        String fileUrl = null;
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
                upload.setFileSizeMax(MAX_UPLOAD_SIZE);
                List<FileItem> items = upload.parseRequest(request);
                for(FileItem item : items){
                    if(item.isFormField()){
                        params.put(item.getFieldName(), item.getString());
                    }else{
                        fileItem = item;
                    }
                }

            if(fileItem==null){
                System.out.println("上传文件有误.");

            }
            String originalName = fileItem.getName();
            String fileName = getSaveFileName(originalName);
            String savePath = SAVE_PATH + "/";
            String realPath = getFolder(request, savePath);
            fileUrl = request.getContextPath() + "/" + SAVE_PATH + "/" + fileName;
            fileItem.write(new File(realPath + "/" + fileName));
            modelMap.addAllAttributes(params);
            modelMap.addAttribute("fileUrl", fileUrl);
        }catch (FileUploadException e) {
            e.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return fileUrl;
    }




    /**
     * 依据原始文件名生成新文件名
     *
     * @return
     */
    private String getSaveFileName(String fileName) {

        return System.currentTimeMillis() + this.getFileExt(fileName);
    }

    /**
     * 根据字符串创建本地目录 并建立子目录返回
     * @param path
     * @return
     */
    private String getFolder(HttpServletRequest request, String path) {
        File dir = new File(this.getPhysicalPath(request, path));
        if (!dir.exists()) {
            try {
                dir.mkdirs();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dir.getAbsolutePath();
    }

    /**
     * 根据传入的虚拟路径获取物理路径
     *
     * @param path
     * @return
     */
    private String getPhysicalPath(HttpServletRequest request, String path) {
        String realPath = this.uploadPath;
        if(this.uploadPath==null || this.uploadPath.startsWith("/"))
            realPath = request.getSession().getServletContext().getRealPath(this.uploadPath);
        return realPath + "/" + path;
    }

    /**
     * 获取文件扩展名
     *
     * @return string
     */
    private String getFileExt(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }
}
