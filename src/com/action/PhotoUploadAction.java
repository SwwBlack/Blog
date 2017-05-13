package com.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
@Controller
public class PhotoUploadAction extends ActionSupport{
    //
	private File myfile;//文件
	private String myfileContentType;//文件类型
	private String myfileFileName;//文件名
	@SuppressWarnings("rawtypes")
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");//获取用户名
		//System.out.println("用户名："+username);
		//System.out.println("文件："+myfile);
		//System.out.println("文件类型"+this.getMyfileContentType());
		//System.out.println("文件名："+myfileFileName);
		InputStream inputStream = new FileInputStream(myfile);//创建输入流
		//创建文件保存目录
		String photoPath = ServletActionContext.getServletContext().getRealPath("/user/photo/"+username);
		//System.out.println("文件目录："+photoPath);
		File filePhotoPath = new File(photoPath);//创建文件目录对象
		if(!filePhotoPath.isDirectory())
			filePhotoPath.mkdirs();
		/**
		 * 解决中文文件名问题
		 */
		String extension = FilenameUtils.getExtension(this.getMyfileFileName());//获取扩展名
		String filename = UUID.randomUUID().toString()+"."+extension;
		//System.out.println("后文件名："+filename);
		File out = new File(photoPath,filename);//设置目标文件
		OutputStream outputStream = new FileOutputStream(out);//创建输出流
		byte[] buffer = new byte[1024];//创建缓冲区
		int length = 0;
		while((length=inputStream.read(buffer))>0){
			outputStream.write(buffer, 0, length);
		}
		inputStream.close();
		outputStream.close();
		return SUCCESS;
	}
    //
	
	public File getMyfile() {
		return myfile;
	}

	public void setMyfile(File myfile) {
		this.myfile = myfile;
	}

	public String getMyfileContentType() {
		return myfileContentType;
	}

	public void setMyfileContentType(String myfileContentType) {
		this.myfileContentType = myfileContentType;
	}

	public String getMyfileFileName() {
		return myfileFileName;
	}

	public void setMyfileFileName(String myfileFileName) {
		this.myfileFileName = myfileFileName;
	}
	
}
