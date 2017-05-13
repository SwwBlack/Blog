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
	private File myfile;//�ļ�
	private String myfileContentType;//�ļ�����
	private String myfileFileName;//�ļ���
	@SuppressWarnings("rawtypes")
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");//��ȡ�û���
		//System.out.println("�û�����"+username);
		//System.out.println("�ļ���"+myfile);
		//System.out.println("�ļ�����"+this.getMyfileContentType());
		//System.out.println("�ļ�����"+myfileFileName);
		InputStream inputStream = new FileInputStream(myfile);//����������
		//�����ļ�����Ŀ¼
		String photoPath = ServletActionContext.getServletContext().getRealPath("/user/photo/"+username);
		//System.out.println("�ļ�Ŀ¼��"+photoPath);
		File filePhotoPath = new File(photoPath);//�����ļ�Ŀ¼����
		if(!filePhotoPath.isDirectory())
			filePhotoPath.mkdirs();
		/**
		 * ��������ļ�������
		 */
		String extension = FilenameUtils.getExtension(this.getMyfileFileName());//��ȡ��չ��
		String filename = UUID.randomUUID().toString()+"."+extension;
		//System.out.println("���ļ�����"+filename);
		File out = new File(photoPath,filename);//����Ŀ���ļ�
		OutputStream outputStream = new FileOutputStream(out);//���������
		byte[] buffer = new byte[1024];//����������
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
