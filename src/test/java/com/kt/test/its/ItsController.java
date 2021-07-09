package com.kt.test.its;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.kt.test.its.service.ItsService;

/*@RestController
 *@Api(value="Its 연동", description="ITS")*/
public class ItsController {
	
	private static final Logger logger = Logger.getLogger(ItsController.class.getName());
	
	@Resource(name="itsService")
	private ItsService itsService;
	
	/*@ApiOperation(value="로컬XML파일 ItsDB에 넣기")*/
	@RequestMapping(value="/ospianas/its/its_api_test_its", method= RequestMethod.GET)
	public Map<String,Object> insertXmlToIts(Map<String, Object> map) throws Exception{
		HashMap<String,Object> resultMap = new HashMap<String,Object>();
		String RESULT_CD="";
		String RESULT_MSG="";
		
		/*JSONObject jsonObject = new JSONObject();*/
		
		String apiURL = "http://localhost:8999/ospianas/its/its_api_test_its";
		
		/*byte[] filedata = IOUtils.toByteArray(new FileInputStream("C:/ospianas/ifms/its/its_api_test_its.xml"));
		
		String str = new String(filedata, "UTF-8");
		
		System.out.println("File to byte[] using IOUtils.toByteArray \n" +str);*/
		
		String fullpath = "C:/ospianas/ifms/its/its_api_test_its.xml";
		File file = new File(fullpath);
		file.setExecutable(false);
		file.setReadable(true);
		file.setWritable(false);
		/*if(file.isFile()){
			FileInputStream fis = new FileInputStream(file);
			
			byte[] bytes = IOUtils.toByteArray(fis);
		}*/
		try{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder doc = factory.newDocumentBuilder();
			Document parser = doc.parse(file);
			NodeList list = parser.getElementsByTagName("data");
			List<ItsVO> fList = new ArrayList<>();
			
			for(int i = 0; i<list.getLength(); i++){
				Node result = list.item(i);
				NodeList cList = result.getChildNodes();
				ItsVO itsvo = new ItsVO();
				for(int k = 0; k<cList.getLength(); k++){
					Node item = cList.item(k);
					String value = item.getNodeName();
					Element element = (Element)list.item(0);
					
					if(value.equals("#text"))
						continue;
					if(value.equals("expecteddetourmsg")){
						itsvo.setExpecteddetourmsg(item.getTextContent());
					}
					if(value.equals("eventdirection")){
						itsvo.setEventdirection(item.getTextContent());
					}
					if(value.equals("eventendday")){
						itsvo.setEventendday(item.getTextContent());
					}
					if(value.equals("coordy")){
						itsvo.setCoordy(Double.parseDouble(item.getTextContent()));
					}
					if(value.equals("type")){
						itsvo.setType(item.getTextContent());
					}
					if(value.equals("eventendtime")){
						itsvo.setEventendtime(item.getTextContent());
					}
					if(value.equals("eventid")){
						itsvo.setEventid(item.getTextContent());
					}
					if(value.equals("coordx")){
						itsvo.setCoordx(Double.parseDouble(item.getTextContent()));
					}
					if(value.equals("eventstatusmsg")){
						itsvo.setEventstatusmsg(item.getTextContent());
					}
					if(value.equals("lanesblocktype")){
						itsvo.setLanesblocktype(item.getTextContent());
					}
					if(value.equals("eventstarttime")){
						itsvo.setEventstarttime(item.getTextContent());
					}
					if(value.equals("expectedcnt")){
						itsvo.setExpectedcnt(Integer.parseInt(item.getTextContent()));
					}
					if(value.equals("lanesblocked")){
						itsvo.setLanesblocked(item.getTextContent());
					}
					if(value.equals("eventstartday")){
						itsvo.setEventstartday(item.getTextContent());
					}
					if(value.equals("eventtype")){
						itsvo.setEventtype(item.getTextContent());
					}
				}
				fList.add(itsvo);
			}
			
			try{
				map.put("fList",fList);
				int cnt = itsService.insertXmlToIts(map);
				
				RESULT_CD ="S";
				RESULT_MSG = "정상처리";
			}catch(Exception e){
				e.printStackTrace();
			}
			resultMap.put("RESULT_CD", RESULT_CD);
			resultMap.put("RESULT_MSG", RESULT_MSG);
		}catch(Exception e){
			e.printStackTrace();
		}
		return resultMap;
		
	}
	
}
