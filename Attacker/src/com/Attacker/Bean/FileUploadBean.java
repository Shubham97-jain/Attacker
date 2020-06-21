package com.Attacker.Bean;


import com.Attacker.DAO.FileUploadDao;
import com.mysql.jdbc.Blob;

public class FileUploadBean {

	
	private String id,filename,filetype;
	private String enterlink;
	private Blob file;
	private int id1;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFiletype() {
		return filetype;
	}
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
	public String getEnterlink() {
		return enterlink;
	}
	public void setEnterlink(String enterlink) {
		this.enterlink = enterlink;
	}
	public Blob getFile() {
		return file;
	}
	public void setFile(Blob file) {
		this.file = file;
	}
	public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	
	
	public int deleteRecord()
	{
		String query="delete from fileupload where id="+getId1()+"";
		
		FileUploadDao dao=new FileUploadDao();
		dao.makeConnection();
		int i=dao.deleteRecord(query,this);
		return i;
		
	}
}
