package sungjuk;

import java.io.IOException;

public interface SungPro {
	public void insert();
	public void delete();
	public void edit();
	public void view();
	public void save() throws IOException;
	public void load() throws IOException;
	public void exit(); 
}
