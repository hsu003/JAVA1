package file;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileUploadController {

	@RequestMapping("/")
	public String start(){
		return "testFileUpload";
	}
	
	@RequestMapping("/testFileUpload_ok")
	public void testFileUpload_ok(HttpServletRequest req) throws IOException{
		MultipartHttpServletRequest mr = (MultipartHttpServletRequest)req;
		MultipartFile mf = mr.getFile("filename");
		String filename = mf.getOriginalFilename();
		
		//System.out.println(filename);
		if (filename==null || filename.trim().equals("")) return ;
		
		HttpSession session = req.getSession();
		String upPath = session.getServletContext().getRealPath("files");
		
		System.out.println(upPath);
		File file = new File(upPath, filename);
		mf.transferTo(file);
		
	}
}














