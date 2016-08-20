package struts2.file.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class FileAction {
	
	private static String FILE_DIR = "d:/tmp/";
	
	private File file;
	private String fileName;
	private String fileType;
	private String userName;
	private String dateTime;
	private String errorInfo;
	private String successInfo;
	
	public String uploadFile(){
		
		if(file == null&&StringUtils.isBlank(fileName)&&StringUtils.isBlank(fileType)
				&&StringUtils.isBlank(userName)){
			return "page";
		}
		
		if(file != null){
			File target = new File(FILE_DIR+fileName+"."+fileType);
			try {
				FileUtils.copyFile(file, target);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			errorInfo = "上传文件为空";
		}
		
		return "success";
	}
	
	/**	getter && setter  **/
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	public String getSuccessInfo() {
		return successInfo;
	}

	public void setSuccessInfo(String successInfo) {
		this.successInfo = successInfo;
	}
	
	
}
