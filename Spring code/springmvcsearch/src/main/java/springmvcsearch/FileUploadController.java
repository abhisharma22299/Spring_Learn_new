package springmvcsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException.NotFound;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@ControllerAdvice
public class FileUploadController {
	@RequestMapping("/user/{userId}/{name}")
	public String userId(@PathVariable("userId")int id,@PathVariable("name")String name) {
System.out.println(id);
Integer.parseInt(name);
		return "home";
	}	
	
	
	
	@RequestMapping("/file")
	public String upload() {

		return "fileform";
	}

	@RequestMapping(path="/uploadimage",method = RequestMethod.POST)
	public String uploadFile(@RequestParam("profile")CommonsMultipartFile file,HttpSession s,Model m) throws FileNotFoundException {
		System.out.println("upload file ");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		
		System.out.println(file.getStorageDescription());
		byte data[]=file.getBytes();
		
		////
		
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+
		File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
	

			try {
				FileOutputStream fos = new FileOutputStream(path);
				fos.write(data);
			fos.close();
			System.out.println("File Uploaded");
			s.setAttribute("er", file.getOriginalFilename());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "filesuccess";
	}
	
	@ExceptionHandler({NullPointerException.class,NumberFormatException.class,ClassNotFoundException.class,FileNotFoundException.class,NotFound.class})
//	@ExceptionHandler
	public String exceptionHandlerNull() {

		
		
		return"null_page";
	}
		@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerNullas(Model m) {
m.addAttribute("error",Exception.class.getClass().toString());
		
		
		return"null_page";
	}
}
