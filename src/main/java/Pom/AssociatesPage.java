package Pom;

import learnAPI.GenericClass;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;

import java.util.List;

public class AssociatesPage extends GenericClass{
	
	GenericClass g=new GenericClass();

	public static String getUid()
	{
	RestAssured.baseURI="https://newpmt.brigosha.com";
	String re=given().queryParam("search","").header("Authorization",auth())
	.when().get("/resource-user/allUsers")
	.then().assertThat().statusCode(200).extract().response().asString();
   	JsonPath js =new JsonPath(re);
    List <Object> a = js.getList("data.uid");
	           String uid = a.get(0).toString();
	           return  uid;
	}
	

	public static String getId()
	{
	RestAssured.baseURI="https://newpmt.brigosha.com";
	String re=given().queryParam("search","").header("Authorization",auth())
	.when().get("/resource-user/allUsers")
	.then().assertThat().statusCode(200).extract().response().asString();
   	JsonPath js =new JsonPath(re);
    List <Object> a = js.getList("data.id");
	           String id = a.get(0).toString();
	           return  id;
	}
	
	public static  String getupdateBody()
	{
	RestAssured.baseURI="https://newpmt.brigosha.com";
	String re=given().queryParam("search","").header("Authorization",auth())
	.when().get("/resource-user/allUsers")
	.then().assertThat().statusCode(200).extract().response().asString();
   	JsonPath js =new JsonPath(re);
      String a = js.getList("data[0]").toString();
      System.out.println(a);
	           //String id = a.get(0).toString();
	           return  a;
	}
	
	public String updateRequestBody() {
		
		return "{\"profile\":{\"associateProfile\":{\"name\":\"Sonu\",\"uid\":\""+getUid()+"\",\"email\":\""+randomName()+"@refined.blog\",\"joined\":\"2023-09-20T12:36:40.153Z\",\"phone\":\"8374348642\",\"designation\":\"Associate software Engineer\",\"photo\":null,\"photo_HRVerified\":false,\"userRoles\":[\"HR\"],\"privilege\":[\"None\"]},\"basicInformation\":{\"personalEmail\":\"sonu@gmail.com\",\"secondaryPhone\":\"8788398542\",\"bloodGroup\":\"AB+\",\"dobActual\":\"2023-10-10T12:42:26.641Z\",\"dob\":\"2023-10-10T12:42:31.574Z\",\"gender\":\"Male\",\"category\":\"General\",\"maritalStatus\":\"Single\",\"personalEmail_HRVerified\":false,\"secondaryPhone_HRVerified\":false,\"bloodGroup_HRVerified\":false,\"dobActual_HRVerified\":false,\"dob_HRVerified\":false,\"gender_HRVerified\":false,\"category_HRVerified\":false,\"maritalStatus_HRVerified\":false,\"children_HRVerified\":false},\"addressInformation\":{\"current\":{\"addressLine1\":\"first cross \",\"addressLine2\":\"second cross\",\"city\":\"Bangalore\",\"state\":\"Karnataka\",\"pincode\":\"574635\",\"addressLine1_HRVerified\":false,\"addressLine2_HRVerified\":false,\"city_HRVerified\":false,\"state_HRVerified\":false,\"pincode_HRVerified\":false},\"permanent\":{\"addressLine1\":\"first cross \",\"addressLine2\":\"second cross\",\"city\":\"Bangalore\",\"state\":\"Karnataka\",\"pincode\":\"574635\",\"addressLine1_HRVerified\":false,\"addressLine2_HRVerified\":false,\"city_HRVerified\":false,\"state_HRVerified\":false,\"pincode_HRVerified\":false},\"sameAsCurrent\":true},\"noticePeriod\":{\"startDate\":\"\",\"endDate\":\"\"},\"emergencyContact\":[{\"name\":\"deepika\",\"contact\":\"8973653472\",\"relation\":\"sister\",\"name_HRVerified\":false,\"contact_HRVerified\":false,\"relation_HRVerified\":false}],\"bankAccountDetails\":{\"name_HRVerified\":false,\"accountNumber_HRVerified\":false,\"IFSC_HRVerified\":false,\"name\":\"Gowri\",\"accountNumber\":\"875647466\",\"IFSC\":\"HDFC6758\"}},\"academics\":{\"academicsData\":[{\"qualification\":\"\",\"yearofPassing\":\"\",\"gradePercentage\":\"\",\"qualification_HRVerified\":false,\"yearofPassing_HRVerified\":false,\"gradePercentage_HRVerified\":false}],\"academicsDocuments\":\"\"},\"workExperience\":{\"experienced\":null,\"type\":\"Fresher\",\"resumeLink\":null,\"resumeLink_HRVerified\":false,\"skills\":\"\",\"skills_HRVerified\":false,\"documents\":null},\"documents\":{\"pan\":{\"panName\":\"\",\"panName_HRVerified\":false,\"panNumber\":\"\",\"panNumber_HRVerified\":false,\"panLink\":\"\",\"panLink_HRVerified\":false},\"aadhar\":{\"aadharName\":\"\",\"aadharName_HRVerified\":false,\"aadharNumber\":\"\",\"aadharNumber_HRVerified\":false,\"aadharLink_HRVerified\":false,\"aadharLink\":\"\"},\"pf\":{\"pfNumber\":\"\",\"pfNumber_HRVerified\":false,\"pfLink\":\"\"},\"uan\":{\"uanNumber\":\"\",\"uanNumber_HRVerified\":false,\"uanLink\":\"\"},\"dl\":{\"dlNumber\":\"\",\"dlNumber_HRVerified\":false,\"dlLink_HRVerified\":false,\"dlLink\":\"\"},\"voterId\":{\"voterIdNumber_HRVerified\":false,\"voterIdNumber\":\"\",\"voterIdLink_HRVerified\":false,\"voterIdLink\":\"\"},\"bloodDoc\":{\"bloodDocLink\":\"\",\"bloodDocLink_HRVerified\":false},\"passport\":{\"passportNumber_HRVerified\":false,\"passportNumber\":\"\",\"passportLink_HRVerified\":false,\"passportLink\":\"\"},\"others\":null}}";
		
	}
}
